package com.sapient.week8;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.sapient.week8.number;

/**
 * Unit test for simple App.
 */
public class numberTest 
{
    /**
     * Rigorous Test :-)
     */
	 numberinterface numberobj=new number();
	
    @Test
    public void shouldcheckifnumberispositiveforcheckingPrime() throws Exception
    {
    	boolean result=numberobj.checkPrime(-10);
    	assertNotNull(result);
   
    }
    @Test
    public void shouldcheckifnumberisprime() throws Exception
    {
    	
    	boolean result=numberobj.checkPrime(17);
    	assertNotNull(result);
    	assertEquals(true,result);
    }
    @Test
    public void shouldcheckifnumberispositiveforcheckingArmstrong() throws Exception
    {
    	boolean result=numberobj.checkArmstrong(-10);
    	assertNotNull(result);
   
    }
    @Test
    public void shouldcheckifnumberisarmstrong() throws Exception
    {
    	
    	boolean result=numberobj.checkArmstrong(153);
    	assertNotNull(result);
    	assertEquals(true,result);
    }
    @Test
    public void shouldcheckifnumberispositiveforcheckingPalindrome() throws Exception
    {
    	boolean result=numberobj.checkPalindrome(-10);
    	assertNotNull(result);
   
    }
    @Test
    public void shouldcheckifnumberisPalindrome() throws Exception
    {
    	
    	boolean result=numberobj.checkPalindrome(13431);
    	assertNotNull(result);
    	assertEquals(true,result);
    }
    
}
