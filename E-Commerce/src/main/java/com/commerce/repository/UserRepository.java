package com.commerce.repository;

import com.commerce.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String QUERY_INSERT_USER_DETAILS = "INSERT INTO users (username, email, password ) VALUES (?,?,?)";
    private static final String QUERY_INSERT_ID_TO_USERS_TO_ROLES = "INSERT INTO users_to_roles (role_id, user_id) VALUES (?,?)";
    private static final String QUERY_GET_FROM_ROLES = "SELECT role_name, role_id FROM roles";

    public int setUserDetails(UserModel userModel) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(QUERY_INSERT_USER_DETAILS, new String[]{"user_id"});
            ps.setString(1, userModel.getUsername());
            ps.setString(2, userModel.getEmail());
            ps.setString(3, userModel.getPassword());
            return ps;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }

    public void setUserRole(int roleId, int userId) {
        jdbcTemplate.update(QUERY_INSERT_ID_TO_USERS_TO_ROLES, ps -> {
            ps.setInt(1, roleId);
            ps.setInt(2, userId);
        });
    }

    public Map<String, Integer> getAllRoles() {
        Map<String, Integer> result = new HashMap<>();
        jdbcTemplate.query(QUERY_GET_FROM_ROLES, resultSet -> {
            while (resultSet.next()) {
                String roleName = resultSet.getString(1);
                int roleId = resultSet.getInt(2);
                result.put(roleName, roleId);
            }
            return null;
        });
        return result;
    }
}