package com.java.Spend;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/hello")

public class SpendResource {
	
	private Map<String, SpendDTO> summary = new TreeMap<String, SpendDTO>();
	@GET

	@Produces(MediaType.APPLICATION_JSON)
		public Map<String, SpendDTO> getProducts() {
			SpendDTO sDTO=new SpendDTO("Raja","10%");
			summary.put("1", sDTO);
			
			sDTO=new SpendDTO("Ganesh","30%");
			summary.put("2", sDTO);
			
			sDTO=new SpendDTO("Harish","25%");
			summary.put("3", sDTO);
			
			sDTO=new SpendDTO("Krish","35%");
			summary.put("4", sDTO);
			
			return summary;
		}
	}

