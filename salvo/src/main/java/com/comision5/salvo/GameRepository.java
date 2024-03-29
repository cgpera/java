package com.comision5.salvo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findByCreationDate(Date creationDate);
}
