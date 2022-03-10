package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
