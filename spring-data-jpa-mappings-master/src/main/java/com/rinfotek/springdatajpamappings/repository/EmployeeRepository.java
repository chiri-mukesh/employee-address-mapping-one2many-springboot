package com.rinfotek.springdatajpamappings.repository;

import com.rinfotek.springdatajpamappings.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
