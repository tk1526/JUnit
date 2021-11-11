package edu.augustana.csc305.labs;


import static org.junit.Assert.*;

import org.junit.Test;

public class HannaldousTest {
	@Test
	public void testHannaldous() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals( 4, Hannaldous.lengthRequirement(8, passwords));
	}
	@Test
	public void test2Hannaldous() {
		String[] passwords = new String[] { "bigmoose$", "123goodbye", "ok&y", "17", "cat" };
		assertEquals( 3, Hannaldous.lengthRequirement(6, passwords));
	}
	@Test
	public void test3Hannaldous() {
		String[] passwords = new String[] { "hihowareyou!", "finlad", "skrrrrrrr", "imacow", "cat" };
		assertEquals( 5, Hannaldous.lengthRequirement(6, passwords));
	}
}
