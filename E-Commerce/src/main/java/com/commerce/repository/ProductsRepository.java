package com.commerce.repository;

import com.commerce.models.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class ProductsRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String QUERY_GET_ALL_PRODUCTS = "SELECT product_id, product_area, product_price, product_year,product_rooms_number, product_location, product_description FROM products";
    private static final String QUERY_GET_ALL_PRODUCTS_BY_CATEGORY_ID = "SELECT product_id, product_area, product_price, product_year,product_rooms_number, product_location, product_description FROM products WHERE category_id=?";
    private static final String QUERY_INSERT_NEW_PRODUCT = "INSERT INTO products (product_area, product_price, product_year, product_rooms_number, product_location, product_description, category_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String QUERY_GET_INFO_FOR_FILE = "SELECT product_location, product_price, product_description FROM products WHERE category_id=?;";

    public List<ProductsModel> getListOfAllProducts() {
        return jdbcTemplate.query(QUERY_GET_ALL_PRODUCTS, (resultSet, i) -> new ProductsModel(
                resultSet.getInt("product_id"),
                resultSet.getInt("product_area"),
                resultSet.getInt("product_price"),
                resultSet.getInt("product_year"),
                resultSet.getInt("product_rooms_number"),
                resultSet.getString("product_location"),
                resultSet.getString("product_description")
        ));
    }

    public List<ProductsModel> getListOfAllProductsByCategoryId(int categoryId) {
        return jdbcTemplate.query(QUERY_GET_ALL_PRODUCTS_BY_CATEGORY_ID, preparedStatement -> preparedStatement.setInt(1, categoryId),
                (resultSet, i) -> new ProductsModel(
                        resultSet.getInt("product_id"),
                        resultSet.getInt("product_area"),
                        resultSet.getInt("product_price"),
                        resultSet.getInt("product_year"),
                        resultSet.getInt("product_rooms_number"),
                        resultSet.getString("product_location"),
                        resultSet.getString("product_description")
                ));
    }

    public void addProduct(ProductsModel productsModel) {
        jdbcTemplate.update(QUERY_INSERT_NEW_PRODUCT, ps -> {
            ps.setInt(1, productsModel.getProductArea());
            ps.setInt(2, productsModel.getProductPrice());
            ps.setInt(3, productsModel.getProductYear());
            ps.setInt(4, productsModel.getProductRoomsNumber());
            ps.setString(5, productsModel.getProductLocation());
            ps.setString(6, productsModel.getProductDescription());
            ps.setInt(7, productsModel.getCategoryId());
        });
    }

    public List<ProductsModel> getProductsByCategoryIdForFile(int categoryIdForFile) {
        return jdbcTemplate.query(QUERY_GET_INFO_FOR_FILE, preparedStatement -> preparedStatement.setInt(1, categoryIdForFile),
                ((resultSet, i) -> new ProductsModel(
                        resultSet.getString("product_location"),
                        resultSet.getInt("product_price"),
                        resultSet.getString("product_description")
                ))
        );
    }

}
