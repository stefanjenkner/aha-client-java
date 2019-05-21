package com.mambu.aha.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.mambu.aha.model.Feature;

/**
 * Integration test for Aha! features
 */
public class FeaturesServiceTest extends BaseTest {

    private FeaturesService featuresService = new FeaturesService();

    @Test
    public void givenTagWhenGetFeaturesByTagThenReturnFeatures() {

        // setup
        String tag = properties.getProperty("tag");

        // execute
        List<Feature> features = featuresService.getFeaturesByTag(tag, "name,reference_num,workflow_status,ideas,description");

        // verify
        assertTrue(features.size() > 1);
        assertNotNull(features.get(0).getId());
        assertNotNull(features.get(0).getName());
        assertNotNull(features.get(0).getReferenceNum());
        assertNotNull(features.get(0).getWorkflowStatus());
        assertNotNull(features.get(0).getWorkflowStatus().getId());
        assertNotNull(features.get(0).getWorkflowStatus().getName());
        assertNotNull(features.get(0).getDescription());
        assertNotNull(features.get(0).getDescription().getId());
        assertNotNull(features.get(0).getDescription().getBody());
    }

    @Test
    public void testGetFeaturesByTagAndRelease() {

        // method under test
        List<Feature> features = featuresService.getFeaturesByTagAndRelease(properties.getProperty("tag"),
                properties.getProperty("release"), "name,reference_num,workflow_status,ideas,description");

        // assertions
        assertTrue(features.size() > 1);
        assertNotNull(features.get(0).getId());
        assertNotNull(features.get(0).getName());
        assertNotNull(features.get(0).getReferenceNum());
        assertNotNull(features.get(0).getWorkflowStatus());
        assertNotNull(features.get(0).getWorkflowStatus().getId());
        assertNotNull(features.get(0).getWorkflowStatus().getName());
        assertNotNull(features.get(0).getDescription());
        assertNotNull(features.get(0).getDescription().getId());
        assertNotNull(features.get(0).getDescription().getBody());
        for (int featureIndex = 0; featureIndex < features.size(); featureIndex++) {
            if (features.get(featureIndex).getReferenceNum().equals(properties.get("featureWithIdeas"))) {
                assertNotNull(features.get(featureIndex).getIdeas());
                assertNotNull(features.get(featureIndex).getIdeas()[0]);
                assertNotNull(features.get(featureIndex).getIdeas()[0].getId());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getReferenceNum());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getName());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getWorkflowStatus());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getWorkflowStatus().getId());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getWorkflowStatus().getName());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getDescription());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getDescription().getId());
                assertNotNull(features.get(featureIndex).getIdeas()[0].getDescription().getBody());
            }
        }

    }

    @Test
    public void testGetFeatureById() {

        // method under test
        Feature feature = featuresService.getFeatureById(properties.getProperty("featureWithIdeas"),
                "name,reference_num,workflow_status,ideas,description,release");

        // assertions
        assertNotNull(feature);
        assertNotNull(feature.getId());
        assertNotNull(feature.getName());
        assertEquals(properties.getProperty("featureWithIdeas"), feature.getReferenceNum());
        assertNotNull(feature.getWorkflowStatus());
        assertNotNull(feature.getWorkflowStatus().getId());
        assertNotNull(feature.getWorkflowStatus().getName());
        assertNotNull(feature.getDescription());
        assertNotNull(feature.getDescription().getId());
        assertNotNull(feature.getDescription().getBody());
        assertNotNull(feature.getRelease());
        assertNotNull(feature.getRelease().getId());
        assertNotNull(feature.getRelease().getName());
        assertNotNull(feature.getRelease().getReferenceNum());
        assertNotNull(feature.getRelease().getReleaseDate());
        assertNotNull(feature.getRelease().getStartDate());
        assertNotNull(feature.getIdeas());
        assertNotNull(feature.getIdeas()[0]);
        assertNotNull(feature.getIdeas()[0].getId());
        assertNotNull(feature.getIdeas()[0].getReferenceNum());
        assertNotNull(feature.getIdeas()[0].getName());
        assertNotNull(feature.getIdeas()[0].getWorkflowStatus());
        assertNotNull(feature.getIdeas()[0].getWorkflowStatus().getId());
        assertNotNull(feature.getIdeas()[0].getWorkflowStatus().getName());
        assertNotNull(feature.getIdeas()[0].getDescription());
        assertNotNull(feature.getIdeas()[0].getDescription().getId());
        assertNotNull(feature.getIdeas()[0].getDescription().getBody());

    }

}
