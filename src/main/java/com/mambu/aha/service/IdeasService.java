package com.mambu.aha.service;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.core.GenericType;

import com.mambu.aha.model.Idea;
import com.mambu.aha.model.IdeaWrapper;
import com.mambu.aha.model.Ideas;

/**
 * Aha! Ideas API: https://www.aha.io/api/resources#Search%20for%20ideas%20by%20name,%20description%20or%20ID
 *
 */
public class IdeasService extends AbstractService {

	/**
	 * Gets the first 200 ideas filtered by a tag, for details see
	 * https://www.aha.io/api/resources#Find%20ideas%20matching%20a%20tag
	 * 
	 * @param tag
	 *            a tag to filter ideas by
	 * @param fields
	 *            a comma separated list of fields that are required in the response, use "*" for all fields
	 * @return list of ideas with requested fields and sub-resources
	 */
	public List<Idea> getIdeasByTag(String tag, String fields) {
		GenericType<Ideas> genericType = new GenericType<Ideas>() {};
		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("tag", tag);
		requestParams.put("fields", fields);
		return getEntity(genericType, "ideas", requestParams).getIdeas();
	}

	/**
	 * Gets idea by id
	 * 
	 * @param ideaId
	 *            the idea ID
	 * @param fields
	 *            a comma separated list of fields that are required in the response, use "*" for all fields
	 * @return idea of given ID with requested fields and sub-resources
	 */
	public Idea getIdeaById(String ideaId, String fields) {
		GenericType<IdeaWrapper> genericType = new GenericType<IdeaWrapper>() {};
		HashMap<String, String> requestParams = new HashMap<String, String>();
		requestParams.put("fields", fields);
		return getEntity(genericType, "ideas/" + ideaId, requestParams).getIdea();
	}
}
