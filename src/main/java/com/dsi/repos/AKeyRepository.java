package com.dsi.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dsi.entities.AKey;
import com.dsi.entities.Categorie;

@RepositoryRestResource(path = "rest")

public interface AKeyRepository extends JpaRepository<AKey, Long> {
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
