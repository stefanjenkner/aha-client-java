package com.mambu.aha.service;

import java.util.Map;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import com.mambu.aha.util.PropertiesUtil;

/**
 * Common implementations used by all services to e.g. retrieve responses and parse them into POJOs
 */
public abstract class AbstractService {

	private static final String PER_PAGE_PARAMETER = "per_page";

	private static final String MAX_NUM_ITEMS_PER_PAGE = "200";

	// holds Aha! account and authentication settings
	private static final String PROPERTIES_FILE_NAME = "aha.properties";

	private static final MediaType MEDIA_TYPE_JSON_UTF8 = new MediaType("application", "json", "utf-8");

	private Client client = ClientBuilder.newClient(new ClientConfig());

	Properties properties = PropertiesUtil.getProperties(PROPERTIES_FILE_NAME);

	/**
	 * Performs a GET request to Aha's REST API using the given relative path and request parameters
	 * 
	 * @param responseType
	 *            the expected response class wrapped in a {@link GenericType}
	 * @param relativePath
	 *            the relative path that follows the base path, e.g. "ideas" or "releases/123/features"
	 * @param requestParams
	 *            additional request parameters with key being the parameter key and value the parameter value, e.g.
	 *            ["tag"="api", "fields"="id,reference_num,description"]
	 * @return parsed response
	 */
	protected <T> T getEntity(GenericType<T> responseType, String relativePath, Map<String, String> requestParams) {

		WebTarget target = getTarget(relativePath, requestParams);

		Builder builder = getBuilder(target);

		T response = builder.get(responseType);

		return response;
	}

	private Builder getBuilder(WebTarget target) {

		String authToken = properties.getProperty("authToken");

		Builder builder = target.request(MEDIA_TYPE_JSON_UTF8).header("Authorization", "Bearer " + authToken);

		return builder;

	}

	private WebTarget getTarget(String path, Map<String, String> requestParams) {

		String baseUrl = getBaseUrl();

		WebTarget target = client.target(baseUrl).path(path);

		for (String key : requestParams.keySet()) {
			target = target.queryParam(key, requestParams.get(key));
		}

		target.queryParam(PER_PAGE_PARAMETER, MAX_NUM_ITEMS_PER_PAGE);

		return target;

	}

	private String getBaseUrl() {

		String protocol = properties.getProperty("protocol");
		String subdomain = properties.getProperty("subdomain");
		String baseDomain = properties.getProperty("baseDomain");
		String basePath = properties.getProperty("basePath");

		String baseUrl = protocol + "://" + subdomain + "." + baseDomain + basePath;

		return baseUrl;

	}
}
