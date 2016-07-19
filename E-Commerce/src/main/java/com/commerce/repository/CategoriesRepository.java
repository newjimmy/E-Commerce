package com.commerce.repository;

import com.commerce.models.CategoriesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CategoriesRepository {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String QUERY_GET_ALL_CATEGORIES = "SELECT category_id, category_name FROM categories";

    public List<CategoriesModel> getListOfAllCategories() {
        return jdbcTemplate.query(QUERY_GET_ALL_CATEGORIES, (resultSet, i) -> new CategoriesModel(
                resultSet.getInt("category_id"),
                resultSet.getString("category_name")
        ));
    }
}
