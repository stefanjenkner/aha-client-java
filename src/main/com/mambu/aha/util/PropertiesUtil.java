package com.mambu.aha.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.mambu.aha.service.AbstractService;

/**
 * Util class to deal with properties files
 */
public class PropertiesUtil {

	/**
	 * Returns properties of given properties file, which needs to be on the class path
	 * 
	 * @param propertiesFileName
	 * 
	 * @return
	 */
	public static Properties getProperties(String propertiesFileName) {

		InputStream propertiesStream = AbstractService.class.getClassLoader().getResourceAsStream(propertiesFileName);

		Properties properties = new Properties();

		try {
			properties.load(propertiesStream);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(propertiesFileName + " file not found in classpath.");
		}

		return properties;

	}

}
