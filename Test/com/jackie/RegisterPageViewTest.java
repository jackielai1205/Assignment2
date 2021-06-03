/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import javax.swing.JTextField;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Test;

/**
 *
 * @author jacki
 */
public class RegisterPageViewTest {
    
    public RegisterPageViewTest() {
    }

    /**
     * Test of getInputPassword method, of class RegisterPageView.
     */
    @Test
    public void testGetInputPassword() {
        RegisterPageView view = new RegisterPageView(new MenuPageView(null));
        view.setInputPassword(new JTextField("123"));
        String expected = "123";
        assertEquals(view.getInputPassword(), expected);
    }

    /**
     * Test of getInputConfirm method, of class RegisterPageView.
     * If password is not equal to confirm
     */
    @Test
    public void testGetInputConfirm() {
        RegisterPageView view = new RegisterPageView(new MenuPageView(null));
        view.setInputConfirm(new JTextField("123"));
        String expected = "123";
        assertNotSame(view.getInputConfirm(), expected);
    }

    /**
     * Test of getInputName method, of class RegisterPageView.
     */
    @Test
    public void testGetInputName() {
        RegisterPageView view = new RegisterPageView(new MenuPageView(null));
        JTextField jf = new JTextField();
        jf.setText("123");
        view.setInputName(jf);
        String expected = "123";
        assertEqual(view.getInputName(),expected);
    }


    private boolean assertEqual(String inputString, String expected) {
       return inputString.equals(expected); //To change body of generated methods, choose Tools | Templates.
    }
    
}
