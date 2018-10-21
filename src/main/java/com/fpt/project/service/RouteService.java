package com.fpt.project.service;

import java.util.List;

import com.fpt.project.entity.Route;

public interface RouteService{
	List<Route> findAll();
	List<Route> findDistinct();
	List<Route> findDest(String id);
}
