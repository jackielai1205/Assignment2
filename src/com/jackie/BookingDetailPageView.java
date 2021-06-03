/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JOptionPane;

/**
 *
 * @author waltersiu
 */
public class BookingDetailPageView extends Page {
        
    public BookingDetailPageView(Page parent){
        super(parent);
        initComponents();
        this.setVisible(true);
        parent.setVisible(false);
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

        BookingDetailPagePanel = new javax.swing.JPanel();
        cancelBookingButton = new javax.swing.JButton();
        movieTime = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        movieName = new javax.swing.JLabel();
        seatNumber = new javax.swing.JLabel();
        movieDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Booking System");

        BookingDetailPagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancelBookingButton.setText("Cancel Booking");
        BookingDetailPagePanel.add(cancelBookingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        movieTime.setText("Time:");
        BookingDetailPagePanel.add(movieTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        BookingDetailPagePanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        movieName.setText("Name:");
        BookingDetailPagePanel.add(movieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        seatNumber.setText("Seat:");
        BookingDetailPagePanel.add(seatNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 25));

        movieDate.setText("Date:");
        BookingDetailPagePanel.add(movieDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 109, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BookingDetailPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(BookingDetailPagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel BookingDetailPagePanel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelBookingButton;
    private javax.swing.JLabel movieDate;
    private javax.swing.JLabel movieName;
    private javax.swing.JLabel movieTime;
    private javax.swing.JLabel seatNumber;
    // End of variables declaration//GEN-END:variables

    // Received Customer's current Booking info and update to panel
    @Override
    public void update(Observable model, Object arg) {
        BookingDetailPageModel bookingDetailModel = (BookingDetailPageModel)model;
        this.movieName.setText("Name: " + bookingDetailModel.getCurrentMoiveName());
        this.movieDate.setText("Date: " + bookingDetailModel.getCurrentUserShowTime().getDate());
        this.movieTime.setText("Time: " + bookingDetailModel.getCurrentUserShowTime().getTime());
        this.seatNumber.setText("Seat Number: " + bookingDetailModel.dbm.getSeatNumber(bookingDetailModel.getCurrentBooking().getSeat_id()));
        // Function that ask customer if need to cancel booking or not
        // Process SQL command after received answer
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
                BookingDetailPageView.this.getParent().setVisible(false);
                BookingDetailPageView.this.getParent().getParent().setVisible(true);
            }
        });
    }
}
