package com.melelee.springboot.bean.mybatis;

import lombok.Data;

@Data
public class User {
	private Long id;

	private String email;

	private String nickName;

	private String passWord;

	private String regTime;

	private String userName;
}