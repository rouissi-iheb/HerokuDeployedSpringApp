package com.dsi.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import com.dsi.entities.AKey;
import com.dsi.entities.Categorie;

public interface KeyService {
	AKey SaveKey(AKey key);
	AKey UpdateKey(AKey key);
	void DeleteKey(AKey key);
	void DeleteKeyById(Long id);
	AKey GetKey(Long id);
	List<AKey> GetAllKeys();
	Page<AKey> getAllKeysParPage(int page, int size);
	List<AKey> findByAppName(String nom);
	List<AKey> findByAppNameContains(String nom);
	@Query("select k from AKey k where k.appName like %?1 and k.appType like %?2") 
	List<AKey> findByAppNameAppType(String name, String type);
	@Query("select k from AKey k where k.categorie = ?1")
	List<AKey> findByCategorie(Categorie categorie);
	List<AKey> findByCategorieIdCat(Long id);
	List<AKey> findByOrderByAppNameAsc();
	@Query("select k from AKey k order by k.appName ASC, k.appType DESC")
	List<AKey> sortAppNameAppType ();
}
