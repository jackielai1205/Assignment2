package com.jackie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacki
 */
class Seat {
    private int column;
    private int row;
    private boolean available;

    public Seat(boolean available, int column, int row) {
        this.available = available;
        this.column = column;
        this.row = row;
    }

    public Seat(int column, int row){
        this.column = column;
        this.row = row;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public String toString(){
        String result = "[";
        if(this.available){
            result+="O";
        }else{
            result+="X";
        }
        result+="]";
        return result;
    }
}
