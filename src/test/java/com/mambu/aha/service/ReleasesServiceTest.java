package com.mambu.aha.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.mambu.aha.model.Release;

/**
 * Integration test for Aha! releases
 */
public class ReleasesServiceTest extends BaseTest {

	private ReleasesService releasesService = new ReleasesService();

	@Test
	public void testGetReleasesByProduct() {

		// method under test
		List<Release> releases = releasesService.getReleasesByProduct(properties.getProperty("product"),
				"name,release_date,released,parking_lot,workflow_status");

		// assertions
		assertTrue(releases.size() > 1);
		assertNotNull(releases.get(0).getId());
		assertNotNull(releases.get(0).getName());
		assertNotNull(releases.get(0).getParkingLot());
		assertNotNull(releases.get(0).getProductId());
		assertNotNull(releases.get(0).getReferenceNum());
		assertNotNull(releases.get(0).getReleased());
		assertNotNull(releases.get(0).getReleaseDate());
		assertNotNull(releases.get(0).getStartDate());
		assertNotNull(releases.get(0).getWorkflowStatus());
		assertNotNull(releases.get(0).getWorkflowStatus().getId());
		assertNotNull(releases.get(0).getWorkflowStatus().getName());

	}
}
