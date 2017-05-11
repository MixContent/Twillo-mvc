package com.spring.twillo.sms.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.twillo.sms.api.model.User;
import com.spring.twillo.sms.api.util.NotificationUtils;

@Service
public class RegisterService {
	@Autowired
	private NotificationUtils utils;

	private static List<User> users;

	static {
		users = new ArrayList<>();
	}

	public String Register(User user) {
		users.add(user);
		return utils.sendSMS(user);
	}
}
