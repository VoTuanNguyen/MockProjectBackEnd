package com.fpt.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fpt.project.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Integer>{
	@Query("SELECT r FROM Route r GROUP BY r.src")
	Iterable<Route> findDistinct();
	@Query("SELECT r FROM Route r WHERE r.src = (:src)")
	Iterable<Route> findDest(@Param("src") String src);
}
