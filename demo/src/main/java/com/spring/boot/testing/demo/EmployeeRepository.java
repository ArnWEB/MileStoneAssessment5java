package com.spring.boot.testing.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Customer, Long> {

}
