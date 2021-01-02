package com.dsi.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.entities.AKey;
import com.dsi.service.KeyService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class KeysRESTController {
	@Autowired
	KeyService keyservice;
	@RequestMapping(method = RequestMethod.GET)
	public List<AKey> getAllKeys() {
		return keyservice.GetAllKeys();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public AKey getKeyById(@PathVariable("id") Long id) { 
		return keyservice.GetKey(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public AKey createKey(@RequestBody AKey key) {
		return keyservice.SaveKey(key);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public AKey updateKey(@RequestBody AKey key) {
		return keyservice.UpdateKey(key);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteKey(@PathVariable("id") Long id){
		keyservice.DeleteKeyById(id);
	}
	
	@RequestMapping(value="/keyscat/{idCat}",method = RequestMethod.GET)
	public List<AKey> getKeyssByCatId(@PathVariable("idCat") Long idCat) {
		return keyservice.findByCategorieIdCat(idCat);
	}
}
