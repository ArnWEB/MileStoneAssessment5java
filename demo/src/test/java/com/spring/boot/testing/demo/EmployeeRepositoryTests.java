package com.spring.boot.testing.demo;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest

public class EmployeeRepositoryTests {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Test
	public void saveEmployeeTest()
	{
		Customer customer=Customer.builder().firstname("aranb").lastname("kundu").email("arnab@gmail.com").gender("MALE").age(23).food("nonveg").build();
		employeeRepository.save(customer);
		Customer customer2=Customer.builder().firstname("amitava").lastname("kundu").email("amitavab@gmail.com").gender("MALE").age(50).food("veg").build();
		employeeRepository.save(customer2);
		Assertions.assertThat(customer.getId()).isGreaterThan(0);
	}
	@Test
	public void getEmployeeTest()
	{
		Customer customer=employeeRepository.findById(1L).get();
		Assertions.assertThat(customer.getId()).isEqualTo(1L);
		
	}
	@Test
	public void getListOFEmployeeTest()
	{
		List<Customer> employee=employeeRepository.findAll();
		Assertions.assertThat(employee.size()).isEqualTo(1);
		
	}
	
	
	
	

}
