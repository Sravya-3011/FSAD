package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalciService;
//request parameter:
//gmail->user name and password are given to the database and the values are passing with the path as a parameter in the request form
//syntax:?variable=some value(request param)
@RestController
@RequestMapping("/calculator")
public class CalciController {
	@Autowired
		private CalciService service;
	//ADDITION-RequestParm
	//URL:http://localhost:8080/calculator/add?a=10&b=5
	@RequestMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		return service.add(a,b);
}
//Subtraction-pathvariable
//URL:http://localhost:8080/caluculator/subtract/20/5
@RequestMapping("/subtract/{a}/{b}")
public int subtract(@PathVariable int a,@PathVariable int b) {
	return service.subtract(a,b);
}
//MULTIPLICTION-PathVariable
	//URL:http://localhost:8080/calculator/multiply/10/5
	@RequestMapping("/multiply/{a}/{b}")
	public int multiply(@PathVariable int a,@PathVariable int b) {
		return service.multiply(a,b);
	}
//DIVISION-RequestParam
//URL:http:localhost:8080/calculator/division?a=50&b=10
@RequestMapping("/division")
public double division(@RequestParam int a,@RequestParam int b) {
	return service.division(a,b);
}
//MODULO-PathVariable
//URL:https:localhost:8080/calculator/modulo/10/2
@RequestMapping("/modulo/{a}/{b}")
public int modulo(@PathVariable int a,@PathVariable int b) {
	return service.modulo(a,b);
}
}
