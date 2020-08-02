package com.prac.batchapp.springbatchdemo.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.prac.batchapp.springbatchdemo.model.User;

@Component
public class UserProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User item) throws Exception {
		switch (item.getDepartment()) {
			case "dept1" :	item.setDepartment("Electronics");
							break;
			case "dept2" :	item.setDepartment("Computer Science");
							break;
			case "dept3" :	item.setDepartment("Mechanical");
							break;
			default :		item.setDepartment("First Year");
		}
		return item;
	}
}
