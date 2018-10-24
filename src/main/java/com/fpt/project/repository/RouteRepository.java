package com.fpt.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fpt.project.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Integer>{
	@Query("SELECT r FROM Route r GROUP BY r.src")
	List<Route> findDistinct();
	@Query("SELECT r FROM Route r WHERE LOWER(r.src) LIKE LOWER(:src)")
	List<Route> findDest(@Param("src") String src);
}
