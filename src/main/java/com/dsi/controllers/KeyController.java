package com.dsi.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dsi.entities.AKey;
import com.dsi.service.KeyService;

@Controller
public class KeyController {
	
	@Autowired
	KeyService keyService;
	
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/showCreate")
	public String showCreate(){
		return "createKey";
	}
	
	@RequestMapping("/SaveKey")
	public String SaveKey(@ModelAttribute("Akey") AKey key, @RequestParam("date") String date, ModelMap modelMap) throws ParseException {
		//conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		key.setCreatinDate(dateCreation);
		
		AKey saveKey = keyService.SaveKey(key);
		String msg ="a new key for  "+ saveKey.getAppName() + "is saved with id [" + saveKey.getIdkey()+"] successfully !";
		modelMap.addAttribute("msg", msg);
		return "createKey";
	}
	
	@RequestMapping("/KeysList")
	public String listKeys(ModelMap modelMap,@RequestParam (name="page",defaultValue = "0") int page, @RequestParam (name="size", defaultValue = "4") int size){
		Page<AKey> keys = keyService.getAllKeysParPage(page, size);
		modelMap.addAttribute("keys", keys);
		modelMap.addAttribute("pages", new int[keys.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		
		return "KeysList";
	}
	
	@RequestMapping("/DeleteKey")
	public String supprimerProduit(@RequestParam("id") Long id, ModelMap modelMap,@RequestParam (name="page",defaultValue = "0") int page,
			@RequestParam (name="size", defaultValue = "4") int size){
		keyService.DeleteKeyById(id);
		Page<AKey> keys = keyService.getAllKeysParPage(page, size);
		modelMap.addAttribute("keys", keys);
		modelMap.addAttribute("pages", new int[keys.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		modelMap.addAttribute("size", size);
		return "KeysList";
	}
	
	@RequestMapping("/EditKey")
	public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap){
		AKey key = keyService.GetKey(id);
		modelMap.addAttribute("key", key);
		return "EditKey";
	}
	@RequestMapping("/updateKey")
	public String updateProduit(@ModelAttribute("Akey") AKey key,@RequestParam("date") String date,ModelMap modelMap) throws ParseException{
	//conversion de la date
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		key.setCreatinDate(dateCreation);
		keyService.UpdateKey(key);
		List<AKey> keys = keyService.GetAllKeys();
		modelMap.addAttribute("keys", keys);
		return "KeysList";
	}
}
