/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author waltersiu
 */
public class BookingDetailPageView extends Page {
        
    public BookingDetailPageView(Page parent){
        super(parent);
        initComponents();
        this.setVisible(true);
    }

    /**
     * Creates new form BookingDetailPageView
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cancelBookingButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        movieName = new javax.swing.JLabel();
        movieDate = new javax.swing.JLabel();
        movieTime = new javax.swing.JLabel();
        seatNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Booking System");

        cancelBookingButton.setText("Cancel Booking");
        cancelBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        movieName.setText("Name:");

        movieDate.setText("Date:");

        movieTime.setText("Time:");

        seatNumber.setText("Seat:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelBookingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(backButton))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatNumber)
                    .addComponent(movieTime)
                    .addComponent(movieDate)
                    .addComponent(movieName))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(movieName)
                .addGap(27, 27, 27)
                .addComponent(movieDate)
                .addGap(26, 26, 26)
                .addComponent(movieTime)
                .addGap(31, 31, 31)
                .addComponent(seatNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBookingButton)
                    .addComponent(backButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBookingButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.back();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookingDetailPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingDetailPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingDetailPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingDetailPageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingDetailPageView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelBookingButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel movieDate;
    private javax.swing.JLabel movieName;
    private javax.swing.JLabel movieTime;
    private javax.swing.JLabel seatNumber;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable model, Object arg) {
        BookingDetailPageModel bookingDetailModel = (BookingDetailPageModel)model;
        this.movieName.setText("Name: " + bookingDetailModel.getCurrentMoiveName());
        this.movieDate.setText("Date: " + bookingDetailModel.getCurrentUserShowTime().getDate());
        this.movieTime.setText("Time: " + bookingDetailModel.getCurrentUserShowTime().getTime());
        this.seatNumber.setText("Seat Number: " + String.valueOf(bookingDetailModel.getCurrentBooking().getSeat_id()));
        this.cancelBookingButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent al){
                String[] options = {"Yes", "No"};
                int result = JOptionPane.showOptionDialog(null, "Confirm to cancel this booking?",
                "Confirm Cancelling", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(result == 0){
                    bookingDetailModel.dbm.cancelBooking(bookingDetailModel.getCurrentBooking().getBooking_id());
                    bookingDetailModel.dbm.updateSeatAfterCancelBooking(bookingDetailModel.getCurrentBooking().getSeat_id());
                    JOptionPane.showMessageDialog(null, "Your Booking have been cancelled. Thank you!");                    
                }
                BookingDetailPageView.this.setVisible(false);
                BookingDetailPageView.this.closeView();
            }
        });
    }
}
