package com.max.config;

import com.max.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * describe:
 *
 * @author chuliang@lianchuang.com
 * @date 2021/04/26
 */

@Configuration
public class MyConfig {

	@Bean("user")
	public User getUser() {
		User user = new User();
		user.setName("chuliang");
		user.setAge(12);
		return user;
	}
}
