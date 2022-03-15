package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<Release, Long> {
}
