/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;

/**
 *
 * @author waltersiu
 */
public class HomePageView extends Page implements Observer {

    /**
     * Creates new form HomePageView
     */
    public HomePageView(Page parent) {
        super(parent);
        this.setVisible(true);
        initComponents();
        parent.setVisible(false);
    }
    
    public void viewMovieButtonAddOnClickListener(ActionListener al){
        viewMovieButton.addActionListener(al);
    }
    
    public void viewBookingButtonAddOnClickListener(ActionListener al){
        viewBookingButton.addActionListener(al);
    }
    
    public void logoutButtonAddOnClickListener(ActionListener al){
        logoutButton.addActionListener(al);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePagePanel = new javax.swing.JPanel();
        chooseMessage = new javax.swing.JLabel();
        viewMovieButton = new javax.swing.JButton();
        viewBookingButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        welcomeMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Booking System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chooseMessage.setFont(new java.awt.Font("新細明體", 1, 12)); // NOI18N
        chooseMessage.setText("Please choose an option:");
        homePagePanel.add(chooseMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        viewMovieButton.setText("View Movie");
        homePagePanel.add(viewMovieButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 25));

        viewBookingButton.setText("View Booking");
        homePagePanel.add(viewBookingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 120, 25));

        logoutButton.setText("Logout");
        homePagePanel.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 120, 25));

        welcomeMessage.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        welcomeMessage.setText("Welcome! ");
        homePagePanel.add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 156, 32));

        getContentPane().add(homePagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseMessage;
    private javax.swing.JPanel homePagePanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton viewBookingButton;
    private javax.swing.JButton viewMovieButton;
    private javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void update(Observable model, Object arg) {
        HomePageModel homePageModel = (HomePageModel)model;
        System.out.println(homePageModel.getUserName());
        this.welcomeMessage.setText("Welcome! " + homePageModel.getUserName());
    }
}
