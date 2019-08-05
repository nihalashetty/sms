package com.sms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.sms.model.Login;
import com.sms.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {
		String sql = "insert into Customers (username,password,email,address,phone,bankname,accountnumber) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getEmail(),
				user.getAddress(), user.getPhone(), user.getBankname(), user.getAccountnumber() });
	}

	public User validateUser(Login login) {
		if (login.getUsername().contains("admin-")) {
			String sql = "select * from admin where username='" + login.getUsername() + "' and password='"
					+ login.getPassword() + "'";
			List<User> users = jdbcTemplate.query(sql, new UserMapper());
			return users.size() > 0 ? users.get(0) : null;
		} else {
			String sql = "select * from Customers where username='" + login.getUsername() + "' and password='"
					+ login.getPassword() + "'";
			List<User> users = jdbcTemplate.query(sql, new UserMapper());
			return users.size() > 0 ? users.get(0) : null;
		}
	}

}

class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
//		user.setEmail(rs.getString("email"));
//		user.setAddress(rs.getString("address"));
//		user.setPhone(rs.getInt("phone"));
//		user.setBankname(rs.getString("bankname"));
//		user.setAccountnumber(rs.getInt("accountnumber"));
		return user;
	}
}