package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
