package com.mambu.aha.service;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.GenericType;

import com.mambu.aha.model.Feature;
import com.mambu.aha.model.FeatureWrapper;
import com.mambu.aha.model.Features;

/**
 * Aha! Features API:
 * https://www.aha.io/api/resources#Find%20features%20modified%20since%20a%20certain%20timestamp%20(in%20UTC)
 */
public class FeaturesService extends AbstractService {

	/**
	 * Gets the first 1000 features filtered by a tag and release, for details see
	 * https://www.aha.io/api/resources#Find%20features%20matching%20a%20tag and
	 * https://www.aha.io/api/resources#Get%20a%20list%20of%20features%20for%20a%20release
	 *
	 * @param tag
	 *            a tag to filter features by
	 * @param release
	 *            Numeric ID, or key of the release to retrieve features for
	 * @param fields
	 *            a comma separated list of fields that are required in the response, use "*" for all fields
	 * @return list of features with requested fields and sub-resources
	 */
	public List<Feature> getFeaturesByTagAndRelease(String tag, String release, String fields) {

		GenericType<Features> genericType = new GenericType<Features>() {};

		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("tag", tag);
		requestParams.put("fields", fields);
		requestParams.put("per_page", "1000"); // default 30

		return getEntity(genericType, "releases/" + release + "/features", requestParams).getFeatures();

	}

	/**
	 * Gets the first 1000 features filtered by a tag, for details see
	 * https://www.aha.io/api/resources#Find%20features%20matching%20a%20tag
	 *
	 * @param tag
	 *            a tag to filter features by
	 * @param fields
	 *            a comma separated list of fields that are required in the response, use "*" for all fields
	 * @return list of features with requested fields and sub-resources
	 */
	public List<Feature> getFeaturesByTag(String tag, String fields) {

		GenericType<Features> genericType = new GenericType<Features>() {};

		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("tag", tag);
		requestParams.put("fields", fields);
		requestParams.put("per_page", "1000"); // default 30

		return getEntity(genericType, "features", requestParams).getFeatures();

	}


	/**
	 * Gets the feature by id
	 *
	 * @param featureId
	 *            aha feature id
	 * @param fields
	 *            a comma separated list of fields that are required in the response, use "*" for all fields
	 * @return features of given ID with requested fields and sub-resources
	 */
	public Feature getFeatureById(String featureId, String fields) {

		GenericType<FeatureWrapper> genericType = new GenericType<FeatureWrapper>() {};

		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("fields", fields);

		return getEntity(genericType, "features/" + featureId, requestParams).getFeature();

	}
}
