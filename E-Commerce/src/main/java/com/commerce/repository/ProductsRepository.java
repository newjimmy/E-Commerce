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

    private static final String QUERY_GET_ALL_PRODUCTS = "SELECT product_id, product_area, product_price, product_year,product_rooms_number, product_location FROM products";

    public List<ProductsModel> getListOfAllProducts() {
        return jdbcTemplate.query(QUERY_GET_ALL_PRODUCTS, (resultSet, i) -> new ProductsModel(
                resultSet.getInt("product_id"),
                resultSet.getInt("product_area"),
                resultSet.getInt("product_price"),
                resultSet.getInt("product_year"),
                resultSet.getInt("product_rooms_number"),
                resultSet.getString("product_location")
        ));
    }

}
