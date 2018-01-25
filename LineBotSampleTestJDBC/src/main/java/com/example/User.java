package com.example;

import java.io.Serializable;

public class User implements Serializable{

	private String emp_num;
	private String emp_name;
	private String line_id;

	public String getEmp_num() {
		return emp_num;
	}
	public String setEmp_num(String emp_num) {
		return this.emp_num = emp_num;
	}

	public String getEmp_name() {
		return emp_name;
	}
	public String setEmp_name(String emp_name) {
		return this.emp_name = emp_name;
	}

	public String getLine_id() {
		return line_id;
	}
	public String setLine_id(String line_id) {
		return this.line_id = line_id;
	}

}
