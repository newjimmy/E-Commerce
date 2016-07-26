package com.commerce.repository;

import com.commerce.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserRepository {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private final static String QUERY_INSERT_USER_DETAILS = "INSERT INTO users (username, email, password ) VALUES (?,?,?)";

    public void setUserDetails(UserModel userModel) {
        jdbcTemplate.update(QUERY_INSERT_USER_DETAILS, preparedStatement -> {
            preparedStatement.setString(1, userModel.getUsername());
            preparedStatement.setString(2, userModel.getEmail());
            preparedStatement.setString(3, userModel.getPassword());
        });
    }

}
