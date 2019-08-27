package com.sgic.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sgic.Calculator;
import com.sgic.Rectangle;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Rectangle.class)
public class CalculatorTestWithMockitoAndSpring {
//	@Rule
//	public MockitoRule rule=MockitoJUnit.rule();
	
	@Mock
	Rectangle rectangle;
	
	@InjectMocks
	//@Autowired
	Calculator calculator;
	
	@Before
	public void create() {
		initMocks(this);
		when(rectangle.getLength()).thenReturn(20);
		when(rectangle.getWidth()).thenReturn(10);
	}
	
	@Test
	public void test() {
		assertEquals(calculator.getArea(),200);
	}
}
