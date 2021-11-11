package edu.augustana.csc305.labs;


import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testCaesarCipherSimple() {
		assertEquals("BCD", StringUtils.caesarCipher("ABC", 1));
		assertEquals("CDE", StringUtils.caesarCipher("ABC", 2));
		assertEquals("GOW", StringUtils.caesarCipher("EMU", 2)); 
	}
	
	@Test
	public void testCaesarCipherSimpleBackward() {
		assertEquals("ABC", StringUtils.caesarCipher("BCD", -1));
		assertEquals("EMU", StringUtils.caesarCipher("GOW", -2));
	}

	@Test
	public void testCaesarCipherWithSpaces() {
		assertEquals("UIF IBQQZ NPPTF", StringUtils.caesarCipher("THE HAPPY MOOSE", 1));
	}
	
	@Test
	public void testCaesarCipherMore() {
		assertEquals("", StringUtils.caesarCipher("", 10)); // always test the corner cases! 
		assertEquals("BOW", StringUtils.caesarCipher("ZMU", 2));
	}
	
	@Test
	public void testCipherMoreandSpace() {
		assertEquals("KLM", StringUtils.caesarCipher("ABC", 10));
	}



}
