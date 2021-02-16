package org.launchcode.techjobs_oo.TESTS;

import org.junit.Before;
import org.launchcode.techjobs_oo.*;

public class JobTest {

    Job job1;
    Job job2;

    @Before
    public void before() {
        job1 = new Job();
        job2 = new Job();
    }

    @org.junit.Test
    @Test
    public void testSettingJobId() {
        org.junit.Assert.assertEquals(1, job2.getId(), job1.getId());
    }

    @org.junit.Test
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        org.junit.Assert.assertEquals("Product tester", job.getName());
        org.junit.Assert.assertTrue(job instanceof Job);
        org.junit.Assert.assertEquals("ACME", job.getEmployer().getValue());
        org.junit.Assert.assertTrue(job.getEmployer() instanceof Employer);
        org.junit.Assert.assertEquals("Desert", job.getLocation().getValue());
        org.junit.Assert.assertTrue(job.getLocation() instanceof Location);
        org.junit.Assert.assertEquals("Quality Control", job.getPositionType().getValue());
        org.junit.Assert.assertTrue(job.getPositionType() instanceof PositionType);
        org.junit.Assert.assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @org.junit.Test
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        org.junit.Assert.assertEquals(job1.getId(), job2.getId());
    }

    @org.junit.Test
    @Test
    public void testToString() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Boolean beginning = job.toString().startsWith("\n");
        Boolean end = job.toString().endsWith("\n");
        Boolean compare = end == beginning;
        org.junit.Assert.assertEquals(true, compare);
    }

    @org.junit.Test
    @Test
    public void testFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + job.getId() + "\nName: " + job.getName() + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency();
        org.junit.Assert.assertEquals(expected, job.toString());
    }

    @org.junit.Test
    @Test
    public void testEmptyFields() {
        Job job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + job.getId() + "\nName: " + "Data not available" + "\nEmployer: " + job.getEmployer() + "\nLocation: " + job.getLocation() + "\nPosition Type: " + job.getPositionType() + "\nCore Competency: " + job.getCoreCompetency() + "\n";
        org.junit.Assert.assertEquals(expected, job.toString());
    }

    @org.junit.Test
    @Test
    public void testIDField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String expected = "OOPS! This job does not seem to exist.";
        org.junit.Assert.assertEquals(expected, job.toString());
    }


}
