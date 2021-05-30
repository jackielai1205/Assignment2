/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author jacki
 */
public class AllShowTimePageView extends Page {

    /**
     * Creates new form AllShowTimePageView
     */
    public AllShowTimePageView(Page parent) {
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

        showTimeInterface = new javax.swing.JPanel();
        movieText = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTimeList = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        movieText.setText("jLabel1");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        showTimeList.setLayout(new javax.swing.BoxLayout(showTimeList, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(showTimeList);

        javax.swing.GroupLayout showTimeInterfaceLayout = new javax.swing.GroupLayout(showTimeInterface);
        showTimeInterface.setLayout(showTimeInterfaceLayout);
        showTimeInterfaceLayout.setHorizontalGroup(
            showTimeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showTimeInterfaceLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(showTimeInterfaceLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(movieText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(showTimeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showTimeInterfaceLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        showTimeInterfaceLayout.setVerticalGroup(
            showTimeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showTimeInterfaceLayout.createSequentialGroup()
                .addComponent(movieText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addComponent(back))
            .addGroup(showTimeInterfaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showTimeInterfaceLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showTimeInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showTimeInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel movieText;
    private javax.swing.JPanel showTimeInterface;
    private javax.swing.JPanel showTimeList;
    // End of variables declaration//GEN-END:variables
    private javax.swing.BoxLayout boxLayout;

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getMovieText() {
        return movieText;
    }

    public void setMovieText(JLabel movieText) {
        this.movieText = movieText;
    }

    public JPanel getShowTimeInterface() {
        return showTimeInterface;
    }

    public void setShowTimeInterface(JPanel showTimeInterface) {
        this.showTimeInterface = showTimeInterface;
    }

    public JPanel getShowTimeList() {
        return showTimeList;
    }

    public void setShowTimeList(JPanel showTimeList) {
        this.showTimeList = showTimeList;
    }

    public BoxLayout getBoxLayout() {
        return boxLayout;
    }

    public void setBoxLayout(BoxLayout boxLayout) {
        this.boxLayout = boxLayout;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        printAllShowTime(((AllShowTimePageModel)o));
    }
    
    public void printAllShowTime(AllShowTimePageModel model){
        this.movieText.setText(model.movie.getName());
        System.out.println(model.movie.getShowTimes());
        for(ShowTime showtime: model.showtime){
            AllShowTimePageController allShowTimePageController = new AllShowTimePageController(showtime);
            ShowTimeList component = new ShowTimeList(allShowTimePageController.getAllShowTimePageModel(),allShowTimePageController.getAllShowTimePageView(),showtime);
            this.showTimeList.add(component);
            component.addController(allShowTimePageController);

        }
    }
}