package com.simbirsoft.practicum;

import com.simbirsoft.practicum.controller.ProjectController;
import com.simbirsoft.practicum.dto.ProjectDto;
import com.simbirsoft.practicum.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrcApplication {


	public static void main(String[] args) {

		SpringApplication.run(PrcApplication.class, args);



	}

}
