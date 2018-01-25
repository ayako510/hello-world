package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jdbcTest")
public class UserController {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUser(){
		return jdbcTemplate.query("SELECT  社員名 FROM M001_USER", (rs,i) -> {
			User u = new User();
			u.setEmp_name(rs.getString("社員名"));
			return u;
		});
	}


}
