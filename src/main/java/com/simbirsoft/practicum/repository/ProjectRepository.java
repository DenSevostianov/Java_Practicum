package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Project, Long> {

}
