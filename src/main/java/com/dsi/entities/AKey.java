package com.dsi.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AKey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idkey;
	private String appType; // type d'application : jeux , antivirus ...
	private String appName; // nom 'application : Avast , GTA V
	private String Ackey; // le clé d'activation 
	private int maxUsers; // nombre maximale possible des utilisateurs pour cette clé 
	private int activationDays; // durée d'activation du clé
	private Date creatinDate; // date creation 
	
	@ManyToOne
	private Categorie categorie;
	
	public AKey() {
		super();
	}
	
	public AKey(String appType,String appName, String Ackey, int maxUsers, int activationDays, Date creatinDate) {
		super();
		this.appType = appType;
		this.appName = appName;
		this.Ackey = Ackey;
		this.maxUsers = maxUsers;
		this.activationDays = activationDays;
		this.creatinDate = creatinDate;
	}
	
	public Long getIdkey() {
		return idkey;
	}
	public void setIdkey(Long idkey) {
		this.idkey = idkey;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAckey() {
		return Ackey;
	}
	public void setAckey(String ackey) {
		Ackey = ackey;
	}

	public int getMaxUsers() {
		return maxUsers;
	}
	public void setMaxUsers(int maxUsers) {
		this.maxUsers = maxUsers;
	}
	public int getActivationDays() {
		return activationDays;
	}
	public void setActivationDays(int activationDays) {
		this.activationDays = activationDays;
	}
	public Date getCreatinDate() {
		return creatinDate;
	}
	public void setCreatinDate(Date creatinDate) {
		this.creatinDate = creatinDate;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "AKey [idkey=" + idkey + ", appType=" + appType + ", appName=" + appName + ", Ackey=" + Ackey
				+ ", maxUsers=" + maxUsers + ", activationDays=" + activationDays + ", creatinDate=" + creatinDate
				+ ", categorie=" + categorie + "]";
	}
	

	

}
