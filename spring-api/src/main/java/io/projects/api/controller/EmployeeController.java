package io.projects.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.projects.api.entity.Employee;
@RestController
@ResponseBody
@RequestMapping(value="/employees")
public class EmployeeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Employee> findAll()
	{
	return null;	
	}
	@RequestMapping(method=RequestMethod.GET, value="{id}")
	public Employee findOne(@PathVariable("id") String empId)
	{
		return null;
	}
	@RequestMapping(method=RequestMethod.POST)
	public Employee create(@RequestBody Employee emp)
	{
		return null;
	}

	@RequestMapping(method=RequestMethod.PUT, value="{id}")
	public Employee update(String id, Employee emp)
	{
		return null;
	}
	@RequestMapping(method=RequestMethod.DELETE, value="{id}")
	public void delete()
	{
		
	}
}
