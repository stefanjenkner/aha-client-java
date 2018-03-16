package com.mambu.aha.service;

import java.util.Properties;

import com.mambu.aha.util.PropertiesUtil;

/**
 * Base test class that provides access to configuration parameters required for integration testing.
 */
public class BaseTest {

	public static final String AHA_PROPERTIES_FILE = "aha.properties";

	protected Properties properties = PropertiesUtil.getProperties(AHA_PROPERTIES_FILE);

}
