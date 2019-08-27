package com.sgic.test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import com.sgic.Maths;

public class MathAddTestWithOutMock {
	Maths mathObj;
	
	@Before
	public void create() {
		mathObj=new Maths();
	}
	
	@Test
	public void test() {
		assertSame(3,mathObj.add(2, 1));
	}
}
