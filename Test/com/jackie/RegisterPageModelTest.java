/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author typis
 */
public class RegisterPageModelTest {
    
    public RegisterPageModelTest() {
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

//    /**
//     * Test of getResult method, of class RegisterPageModel.
//     */
//    @Test
//    public void testGetResult() {
//        System.out.println("getResult");
//        RegisterPageModel instance = null;
//        String expResult = "";
//        String result = instance.getResult();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of setResult method, of class RegisterPageModel.
//     */
//    @Test
//    public void testSetResult() {
//        System.out.println("setResult");
//        String result_2 = "";
//        RegisterPageModel instance = null;
//        instance.setResult(result_2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

/**
 * Test of compareData method, of class RegisterPageModel.
 * Test if the user input password is equal to user input confirm password
 * If two string equal, then test pass.
 * If two string not equal, then test fail.
 */
@Test
public void testCompareData() {
    System.out.println("compareData");
    User currentUser = new User("123@123.com", "test", "test");
    String confirmPassword = "test";
    RegisterPageModel model = new RegisterPageModel(new DatabaseOperation());
    String result = model.compareData(currentUser, confirmPassword);
    System.out.println(result);
    assertTrue(assertEqual(result, "equal"));
    // TODO review the generated test code and remove the default call to fail.
}

 private boolean assertEqual(String inputPassword, String string) {
       return inputPassword.equals(string); //To change body of generated methods, choose Tools | Templates.
    }
    
}
