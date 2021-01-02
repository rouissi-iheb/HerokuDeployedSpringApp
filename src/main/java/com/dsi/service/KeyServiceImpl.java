package com.dsi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.dsi.entities.AKey;
import com.dsi.entities.Categorie;
import com.dsi.repos.AKeyRepository;

@Service
public class KeyServiceImpl implements KeyService{
	
	@Autowired
	private AKeyRepository KeyRepository;
	
	
	@Override
	public AKey SaveKey(AKey key) {
		return KeyRepository.save(key);
	}

	@Override
	public AKey UpdateKey(AKey key) {
		return KeyRepository.save(key);
	}

	@Override
	public void DeleteKey(AKey key) {
		KeyRepository.delete(key);
	}

	@Override
	public void DeleteKeyById(Long id) {
		KeyRepository.deleteById(id);
	}

	@Override
	public AKey GetKey(Long id) {
		return KeyRepository.findById(id).get();
	}

	@Override
	public List<AKey> GetAllKeys() {
		return KeyRepository.findAll();
	}
	@Override
	public Page<AKey> getAllKeysParPage(int page, int size) {
		return KeyRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<AKey> findByAppName(String nom) {
		return KeyRepository.findByAppName(nom);
	}

	@Override
	public List<AKey> findByAppNameContains(String nom) {
		return KeyRepository.findByAppNameContains(nom);
	}

	@Override
	public List<AKey> findByAppNameAppType(String name, String type) {
		return KeyRepository.findByAppNameAppType(name, type);
	}

	@Override
	public List<AKey> findByCategorie(Categorie categorie) {
		return KeyRepository.findByCategorie(categorie);
	}

	@Override
	public List<AKey> findByCategorieIdCat(Long id) {
		return KeyRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<AKey> findByOrderByAppNameAsc() {
		return KeyRepository.findByOrderByAppNameAsc();
	}

	@Override
	public List<AKey> sortAppNameAppType() {
		return KeyRepository.sortAppNameAppType();
	}
}
