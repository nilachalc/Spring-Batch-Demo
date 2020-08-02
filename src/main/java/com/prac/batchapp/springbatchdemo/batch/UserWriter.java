package com.prac.batchapp.springbatchdemo.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prac.batchapp.springbatchdemo.model.User;
import com.prac.batchapp.springbatchdemo.repo.UserRepository;

@Component
public class UserWriter implements ItemWriter<User> {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> items) throws Exception {
		System.out.println("Writing User Data");
		for(User user : items) {
			userRepository.save(user);
		}
	}
}
