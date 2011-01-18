package com.deloitte.utils.configregistry;

import play.Play;

/**
 * Implementation of @{link {@link ConfigurationRegistry} that is backed
 * by Play's configuration file, i.e. conf/application.conf.
 * 
 * @author optilude
 */
public class PlayConfigurationRegistry implements ConfigurationRegistry {
	
	@Override
	public String getValue(String key) {
		return Play.configuration.getProperty(key);
	}
	
	@Override
	public String getValue(String key, String defaultValue) {
		return Play.configuration.getProperty(key, defaultValue);
	}
	
}
