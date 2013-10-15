package org.banque.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import banque.Main;
import junit.framework.TestCase;

public class TestMain extends TestCase {

	protected Main main;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	protected void setUp() throws Exception {
		
		main = new Main();
	}

	@After
	protected void tearDown() throws Exception {
		main = null;
	}

	@Test
	public void test() {
		assertEquals(4, main.addition(3, 1));
	}

}
