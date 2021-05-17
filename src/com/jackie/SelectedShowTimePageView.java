/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author jacki
 */
public class SelectedShowTimePageView extends View {

    /**
     * Creates new form SelectedShowTimePageView
     *
     * @param parent
     */
    public SelectedShowTimePageView(View parent) {
        super(parent);
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        showTimePanel = new javax.swing.JPanel();
        showTime = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        screenPanel = new javax.swing.JPanel();
        screen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        showTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showTime.setText("jLabel1");

        javax.swing.GroupLayout showTimePanelLayout = new javax.swing.GroupLayout(showTimePanel);
        showTimePanel.setLayout(showTimePanelLayout);
        showTimePanelLayout.setHorizontalGroup(
            showTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        showTimePanelLayout.setVerticalGroup(
            showTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showTime, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(0, 0, 0));
        content.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        content.setLayout(new java.awt.GridLayout(4, 4, 20, 20));

        screen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screen.setText("=============Screen============");

        javax.swing.GroupLayout screenPanelLayout = new javax.swing.GroupLayout(screenPanel);
        screenPanel.setLayout(screenPanelLayout);
        screenPanelLayout.setHorizontalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screenPanelLayout.createSequentialGroup()
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        screenPanelLayout.setVerticalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(backPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(screenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(showTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.back();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        printShowTime(((SelectedShowTimePageModel) o));
    }

    public void printShowTime(SelectedShowTimePageModel model) {
        this.showTime.setText(model.showtime.getDate() + " " + model.showtime.getTime());
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                Seat currentSeat = model.showtime.getSeats()[x][y];
                String showText = "";
                JButton seatButton = new JButton("");
                if (currentSeat.isAvailable()) {
                    seatButton.setText("O");
                    seatButton.setBackground(Color.black);
                    seatButton.setForeground(Color.green);
                } else {
                    seatButton.setText("X");
                    seatButton.setBackground(Color.black);
                    seatButton.setForeground(Color.red);
                    seatButton.setEnabled(false);
                }
                
                seatButton.setSize(20, 20);
                seatButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       if(JOptionPane.showConfirmDialog(SelectedShowTimePageView.this,"Do you want to book this seat?","Confirm booking", JOptionPane.YES_NO_OPTION)==0){
                           currentSeat.setAvailable(false);
                           JOptionPane.showMessageDialog(SelectedShowTimePageView.this, "Booking Confirmed", "Message", 1);
                           SelectedShowTimePageView.this.back();
                       }
                    }
                });
                this.content.add(seatButton);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel content;
    private javax.swing.JLabel screen;
    private javax.swing.JPanel screenPanel;
    private javax.swing.JLabel showTime;
    private javax.swing.JPanel showTimePanel;
    // End of variables declaration//GEN-END:variables
}
