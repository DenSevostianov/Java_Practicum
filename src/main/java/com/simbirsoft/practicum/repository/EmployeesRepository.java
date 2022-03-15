package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeesRepository extends JpaRepository<Employees, Long> {


}
