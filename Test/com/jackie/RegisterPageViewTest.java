/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import javax.swing.JTextField;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        RegisterPageView view = new RegisterPageView(null);
        view.setInputPassword(new JTextField(123));
        int expected = 123;
        assertEquals(view.getInputPassword(), expected);
    }

    /**
     * Test of getInputConfirm method, of class RegisterPageView.
     */
    @Test
    public void testGetInputConfirm() {
    }

    /**
     * Test of getInputName method, of class RegisterPageView.
     */
    @Test
    public void testGetInputName() {
        RegisterPageView view = new RegisterPageView(null);
        view.setInputName(new JTextField("123"));
        String expected = "123";
        assertEqual(view.getInputName(), expected);
    }


    private void assertEqual(String inputName, String expected) {
       inputName.equals(expected); //To change body of generated methods, choose Tools | Templates.
    }
    
}
