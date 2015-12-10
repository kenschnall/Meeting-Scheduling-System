/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author kensch
 */
public class Room extends javax.swing.JPanel implements Serializable {
    
    private int roomNumber; // roomnumber for this room
    private ArrayList<Meeting> meetings = new ArrayList<>(); // meetings that will be held in this room
    // ************* cannot hold more than one meeting in one time slot

    Room(int roomNumber) {
        initComponents();
        this.roomNumber = roomNumber;        
        roomLabel.setText("Room");   // automatically set the label text to the roomnumber
        roomNumberLabel.setText("" + getRoomNumber());
        this.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder())); // fancy panel design
    }
    
    @Override
    public String toString() {
        return "Room " + getRoomNumber();
    }

    /**
     * @return the number
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param number the number to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return the meetings
     */
    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    /**
     * @param meetings the meetings to set
     */
    public void setMeetings(ArrayList<Meeting> meetings) {
        this.meetings = meetings;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        roomLabel = new javax.swing.JLabel();
        roomNumberLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        roomLabel.setText("Room");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(roomLabel, gridBagConstraints);

        roomNumberLabel.setText("Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        add(roomNumberLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel roomLabel;
    private javax.swing.JLabel roomNumberLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the roomLabel
     */
    public javax.swing.JLabel getRoomLabel() {
        return roomLabel;
    }

    /**
     * @param roomLabel the roomLabel to set
     */
    public void setRoomLabel(javax.swing.JLabel roomLabel) {
        this.roomLabel = roomLabel;
    }
}
