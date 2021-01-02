package com.dsi.entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "appName", types = { AKey.class })
public interface KeyProjection {

	public String getAppName();

}
