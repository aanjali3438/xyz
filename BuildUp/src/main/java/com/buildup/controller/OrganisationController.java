package com.buildup.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.buildup.dao.OrganisationDao;
import com.buildup.model.Organisation;
import com.buildup.model.OrganisationCredentials;

@Controller
public class OrganisationController {
	
	@Autowired
	private OrganisationDao orgdao;
	public OrganisationController()
	{}
	
	@RequestMapping(value ="/orgsignup",method=RequestMethod.GET)
	public ModelAndView showUserdetails() 
	{	
		
		ModelAndView mvc=new ModelAndView("orgreg","org",new Organisation());
		return mvc;
	}

	@RequestMapping(value="/InsertOrganisation", method=RequestMethod.POST)
	public ModelAndView addUser(Organisation org) 
	{
		OrganisationCredentials orgCreden= new OrganisationCredentials();
		ModelAndView m1=new ModelAndView("orgreg","org",new Organisation());
		
		
		orgCreden.setPassword(org.getPassword());
		
		orgCreden.setUsername(org.getUsername());
		
		orgdao.insert(org);
		orgdao.insertcreden(orgCreden);
		return m1;
	}
}
	
	 

