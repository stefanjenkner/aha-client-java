package com.mambu.aha.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.mambu.aha.model.Idea;

/**
 * Integration tests for Aha! ideas
 */
public class IdeasServiceTest extends BaseTest {

	private IdeasService ideasService = new IdeasService();

	@Test
	public void testGetIdeasByTag() {

		// method under test
		List<Idea> ideas = ideasService.getIdeasByTag(properties.getProperty("tag"),
				"name,reference_num,workflow_status,feature,description");

		// assertions
		assertTrue(ideas.size() > 2);
		assertNotNull(ideas.get(1).getId());
		assertNotNull(ideas.get(1).getName());
		assertNotNull(ideas.get(1).getReferenceNum());
		assertNotNull(ideas.get(1).getFeature()); // idea with index 1 has a associated feature
		assertNotNull(ideas.get(1).getFeature().getId());
		assertNotNull(ideas.get(1).getFeature().getName());
		assertNotNull(ideas.get(1).getFeature().getReferenceNum());
		assertNotNull(ideas.get(1).getWorkflowStatus());
		assertNotNull(ideas.get(1).getWorkflowStatus().getId());
		assertNotNull(ideas.get(1).getWorkflowStatus().getName());
		assertNotNull(ideas.get(1).getDescription());
		assertNotNull(ideas.get(1).getDescription().getId());
		assertNotNull(ideas.get(1).getDescription().getBody());

	}

	@Test
	public void testGetIdeaById() {

		// method under test
		Idea idea = ideasService.getIdeaById(properties.getProperty("ideaId"),
				"name,reference_num,workflow_status,feature,description");

		// assertions
		assertNotNull(idea);
		assertEquals(properties.getProperty("ideaId"), idea.getId());
		assertNotNull(idea.getName());
		assertNotNull(idea.getReferenceNum());
		assertNotNull(idea.getFeature());
		assertNotNull(idea.getFeature().getId());
		assertNotNull(idea.getFeature().getName());
		assertNotNull(idea.getFeature().getReferenceNum());
		assertNotNull(idea.getWorkflowStatus());
		assertNotNull(idea.getWorkflowStatus().getId());
		assertNotNull(idea.getWorkflowStatus().getName());
		assertNotNull(idea.getDescription());
		assertNotNull(idea.getDescription().getId());
		assertNotNull(idea.getDescription().getBody());

	}
}
