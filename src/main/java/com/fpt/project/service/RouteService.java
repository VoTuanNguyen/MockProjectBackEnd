package com.fpt.project.service;

import com.fpt.project.entity.Route;

public interface RouteService{
	Iterable<Route> findAll();
	Iterable<Route> findDistinct();
	Iterable<Route> findDest(String src);
}
