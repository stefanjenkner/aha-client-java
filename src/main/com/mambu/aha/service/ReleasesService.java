package com.mambu.aha.service;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.GenericType;

import com.mambu.aha.model.Release;
import com.mambu.aha.model.Releases;

/**
 * Aha! Releases API: https://www.aha.io/api/resources#Search%20for%20releases%20by%20name%20or%20ID
 */
public class ReleasesService extends AbstractService {

	/**
	 * Gets the first 1000 releases of a product, for details see
	 * https://www.aha.io/api/resources#Get%20a%20list%20of%20all%20of%20the%20releases%20in%20a%20product
	 * 
	 * @param product
	 *            Numeric ID, or key of the product to retrieve releases for
	 * @param fields
	 *            a comma separated list of fields that are required in the response, use "*" for all fields
	 * @return list of releases with requested fields and sub-resources
	 */
	public List<Release> getReleasesByProduct(String product, String fields) {

		GenericType<Releases> genericType = new GenericType<Releases>() {};

		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("fields", fields);
		requestParams.put("per_page", "1000"); // default is 30

		return getEntity(genericType, "products/" + product + "/releases", requestParams)
				.getReleases();

	}
}
