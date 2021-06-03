/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author jacki
 */
public class ShowTimeList extends javax.swing.JPanel {
    
    AllShowTimePageModel model;
    AllShowTimePageView view;

    /**
     * Creates new form ShowTimeList
     * @param showtime
     */
    public ShowTimeList(AllShowTimePageModel model, AllShowTimePageView view, ShowTime showtime) {
        this.view = view;
        this.model = model;
        initComponents();
        this.data.setText(showtime.getDate());
        this.time.setText(showtime.getTime());
        this.price.setText("$ " + String.valueOf(showtime.getPrice()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        data = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        enterShowTime = new javax.swing.JButton();
        price = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 45));

        data.setText("jLabel1");

        time.setText("jLabel2");

        enterShowTime.setText("Enter");

        price.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterShowTime))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(enterShowTime, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JButton enterShowTime;
    private javax.swing.JLabel price;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    public JLabel getData() {
        return data;
    }

    public void setData(JLabel data) {
        this.data = data;
    }

    public JButton getEnterShowTime() {
        return enterShowTime;
    }

    public void setEnterShowTime(JButton enterShowTime) {
        this.enterShowTime = enterShowTime;
    }

    public JLabel getPrice() {
        return price;
    }

    public void setPrice(JLabel price) {
        this.price = price;
    }

    public JLabel getTime() {
        return time;
    }

    public void setTime(JLabel time) {
        this.time = time;
    }

    public void addController(AllShowTimePageController controller){
        this.getEnterShowTime().addActionListener(controller);
    }

}
