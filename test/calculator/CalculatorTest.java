/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rakibul Hasan
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testadd() {
        Calculator calculator=new Calculator();
        int a=5;
        int b=5;
        int result=calculator.add(a, b);
        Assert.assertEquals(10, result);
    }
  @Test
  public void testsub() {
        Calculator calculator=new Calculator();
        int a=10;
        int b=5;
        int result=(int) calculator.sub(a, b);
        Assert.assertEquals(5, result);
  }
  public void testmult() {
        Calculator calculator=new Calculator();
        float a=5;
        float b=5;
        float result=calculator.mult(a, b);
        Assert.assertEquals(25, result);
  }
  public void testdiv() {
        Calculator calculator=new Calculator();
        float a=5;
        float b=5;
        float result=calculator.div(a, b);
        Assert.assertEquals(1, result);
}
}