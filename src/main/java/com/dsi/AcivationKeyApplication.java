package com.dsi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.dsi.entities.AKey;
import com.dsi.service.KeyService;

@SpringBootApplication
public class AcivationKeyApplication implements CommandLineRunner{
	
	//@Autowired
	//KeyService keyService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(AcivationKeyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//keyService.SaveKey(new AKey("Antivirus", "Avast", "XC0VDF-SQ9A8E-DPMELS-QKDLZ6", 10, 365, new Date()));
		//keyService.SaveKey(new AKey("Antivirus", "avira", "XC0VDF-SQ9A8E-DPMELS-QKDLZ6", 10, 365, new Date()));
		//keyService.SaveKey(new AKey("Antivirus", "kaspersky", "XC0VDF-SQ9A8E-DPMELS-QKDLZ6", 10, 365, new Date()));
		//keyService.SaveKey(new AKey("Antivirus", "eset node", "XC0VDF-SQ9A8E-DPMELS-QKDLZ6", 10, 365, new Date()));
		repositoryRestConfiguration.exposeIdsFor(AKey.class);
		
	}

}
