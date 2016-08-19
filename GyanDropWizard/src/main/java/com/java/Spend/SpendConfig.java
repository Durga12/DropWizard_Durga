package com.java.Spend;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.config.Environment;

public class SpendConfig extends Service<Configuration> {

	@Override
	public void initialize(Bootstrap<Configuration> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Configuration arg0, Environment arg1) throws Exception {
		arg1.addResource(SpendResource.class);
	}
	
	public static void main(String args[]) throws Exception{
		  new SpendConfig().run(args);
	}

}
