package com.epsi.mycal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

   @Before
   public void setUp() throws Exception {
   }

   @After
   public void tearDown() throws Exception {
   }

   @Test
   public void testAdd() {
      int a = 1;
      int b = 3;
      Calculator calc = new Calculator();
      int actual = calc.add(a, b);
      assertEquals(4, actual);
   }

   @Test
   public void testSub() {
      int a = 1;
      int b = 3;
      Calculator calc = new Calculator();
      int actual = calc.sub(a, b);
      assertEquals(-2, actual);
   }

   @Test
   public void testSMul() {
      int a = 1;
      int b = 3;
      Calculator calc = new Calculator();
      int actual = calc.mul(a, b);
      assertEquals(3, actual);
   }


}