/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.noor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class AddGuestGUI extends javax.swing.JFrame {

 
    public AddGuestGUI() {
       
 initComponents();
     
    }
  
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        nationalityTextField = new javax.swing.JTextField();
        depositTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        roomTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane6 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("ID");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Gender");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nationality");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 20));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("room_ocuupied");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("deposit");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("Phone");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 20));
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, -1));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 140, -1));
        getContentPane().add(nationalityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 140, -1));
        getContentPane().add(depositTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, -1));
        getContentPane().add(phoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, -1));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("Add Guest");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));
        getContentPane().add(roomTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dream4net\\OneDrive\\سطح المكتب\\sm_blog_guest_demands.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 360));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));

        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        jScrollPane4.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        jScrollPane5.setViewportView(jTextPane5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jScrollPane6.setViewportView(jTextPane6);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jScrollPane7.setViewportView(jTextPane7);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int GuestID = Integer.parseInt(idTextField.getText());
    String name = nameTextField.getText();
    String gender = (String) genderComboBox.getSelectedItem();
    String nationality = nationalityTextField.getText();
    int roomOccupied = Integer.parseInt(roomTextField.getText());
    int deposit = Integer.parseInt(depositTextField.getText());
    String phone = phoneTextField.getText();

   
    java.sql.Date checkInSqlDate = new java.sql.Date(System.currentTimeMillis());

    try {
              DriverManager.registerDriver(new org.postgresql.Driver ());
       Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DB", "postgres", "123");

      
        if (isRoomOccupied(connection, roomOccupied)) {
    
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Room is already occupied.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; 
        }

       
        String insertGuestSql = "INSERT INTO Guest (GuestID, name, gender, nationality, room_occupied, deposit, phone, check_in, check_out) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (java.sql.PreparedStatement insertGuestStatement = connection.prepareStatement(insertGuestSql)) {
            insertGuestStatement.setInt(1, GuestID);
            insertGuestStatement.setString(2, name);
            insertGuestStatement.setString(3, gender);
            insertGuestStatement.setString(4, nationality);
            insertGuestStatement.setInt(5, roomOccupied);
            insertGuestStatement.setInt(6, deposit);
            insertGuestStatement.setString(7, phone);
            insertGuestStatement.setDate(8, checkInSqlDate);
            insertGuestStatement.setNull(9, java.sql.Types.DATE); 

            
            insertGuestStatement.executeUpdate();

           
            updateRoomAvailability(connection, roomOccupied, "occupied");

            
            javax.swing.JOptionPane.showMessageDialog(this, "Guest added successfully", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

        
        connection.close();
    } catch (java.sql.SQLException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         this.dispose();

   
  
    }//GEN-LAST:event_jButton2ActionPerformed

  public boolean isRoomOccupied(Connection connection, int roomNumber) throws SQLException {
    String sql = "SELECT avalbility FROM Room WHERE roomnum = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setInt(1, roomNumber);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                String availability = resultSet.getString("avalbility");
                return "occupied".equals(availability);
            } else {
              
                return false;
            }
        }
    }
}


public void updateRoomAvailability(Connection connection, int roomNumber, String newAvailability) throws SQLException {
    String sql = "UPDATE Room SET avalbility = ? WHERE roomnum = ?";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, newAvailability);
        statement.setInt(2, roomNumber);
        statement.executeUpdate();
    }
}      

  
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
            java.util.logging.Logger.getLogger(AddGuestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGuestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGuestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGuestGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddGuestGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField depositTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JTextPane jTextPane6;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nationalityTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField roomTextField;
    // End of variables declaration//GEN-END:variables
}
