package com.jackie;

import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackie
 */
public class MovieListItem extends javax.swing.JPanel{

    MoviePageModel model;
    Page view;
    /**
     * Creates new form MovieList
     * @param model save data from model
     * @param view save data from view
     * @param name save movie name
     */
    public MovieListItem(MoviePageModel model, Page view, String name) {
        this.view = view;
        this.model = model;
        initComponents();
        movieName.setText(name);
        enter.setText("View");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieName = new javax.swing.JLabel();
        enter = new javax.swing.JButton();

        movieName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        movieName.setText("jLabel1");

        enter.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(movieName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(enter)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movieName, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(enter))
                .addContainerGap())
        );

        movieName.getAccessibleContext().setAccessibleName("movieName");
        enter.getAccessibleContext().setAccessibleName("enter");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter;
    private javax.swing.JLabel movieName;
    // End of variables declaration//GEN-END:variables


    public JButton getEnter() {
        return enter;
    }

    public void setEnter(JButton jButton1) {
        this.enter = jButton1;
    }

    public JLabel getMovieText() {
        return movieName;
    }

    public void setMovieText(JLabel moiveText) {
        this.movieName = moiveText;
    }
    
    public void addController(MoviePageController controller){
        this.getEnter().addActionListener(controller);
    }
}
