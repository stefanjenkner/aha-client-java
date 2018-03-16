package com.mambu.aha.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
				"name,reference_num,workflow_status,feature,description,visibility");
		
		assertTrue(ideas.size() > 2);
		
		Idea testIdea = null;
		for(int i = 0;i < ideas.size(); i++){
			
			if(ideas.get(i).getFeature() != null){
				testIdea = ideas.get(i);
								
				assertNotNull(testIdea.getId());
				assertNotNull(testIdea.getName());
				assertNotNull(testIdea.getReferenceNum());
				assertNotNull(testIdea.getVisibility());				
				assertNotNull(testIdea.getFeature());
				assertNotNull(testIdea.getFeature().getId());
				assertNotNull(testIdea.getFeature().getName());
				assertNotNull(testIdea.getFeature().getReferenceNum());
				assertNotNull(testIdea.getWorkflowStatus());
				assertNotNull(testIdea.getWorkflowStatus().getId());
				assertNotNull(testIdea.getWorkflowStatus().getName());
				assertNotNull(testIdea.getDescription());
				assertNotNull(testIdea.getDescription().getId());
				assertNotNull(testIdea.getDescription().getBody());
				
				//testing ones is sufficient
				break;
			}		
		}
		
		//acceptance check: at least one idea must have been completely tested
		if(testIdea == null){
			fail("Could not test idea, due to the provided testdata. No feature for an idea found.");
		}
	}

	@Test
	public void testGetIdeaById() {

		// method under test
		Idea idea = ideasService.getIdeaById(properties.getProperty("ideaId"),
				"name,reference_num,workflow_status,feature,description,visibility");
		
		// assertions
		assertNotNull(idea);
		assertEquals(properties.getProperty("ideaId"), idea.getId());
		assertNotNull(idea.getName());
		assertNotNull(idea.getReferenceNum());
		assertNotNull(idea.getVisibility());
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
