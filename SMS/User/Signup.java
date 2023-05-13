/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import dao.UserDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alpha
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    UserDao user = new UserDao();
    Color notEdit = new Color(204,204,204);
    int xx,xy;
    public Signup() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jPasswordField7 = new javax.swing.JPasswordField();
        jLabel82 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        btnSave6 = new javax.swing.JButton();
        btnBack6 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(490, 794));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Sign Up");
        jPanel7.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 51, 108, -1));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("UserID");
        jPanel7.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 62, 24));

        jTextField43.setEditable(false);
        jTextField43.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, 345, 34));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Username");
        jPanel7.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 161, 71, 22));

        jTextField44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField44KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, 345, 31));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Email");
        jPanel7.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 226, 58, 22));
        jPanel7.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 254, 345, 32));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Password");
        jPanel7.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 292, 71, 22));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Phone");
        jPanel7.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 362, 92, 28));

        jTextField46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField46KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 396, 340, 34));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Security Question");
        jPanel7.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 436, 137, 26));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Answer");
        jPanel7.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 512, 161, -1));
        jPanel7.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 538, 340, 30));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Address Line(District & Area)");
        jPanel7.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 574, 229, 28));
        jPanel7.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 340, 31));
        jPanel7.add(jPasswordField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 320, 340, 31));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-hide-30.png"))); // NOI18N
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 43, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favorite color", "What is your middle name", "What is the name of your dog", "What is your nickname", " " }));
        jComboBox7.setSelectedIndex(-1);
        jPanel7.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 472, 340, 34));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Address Line(Country)");
        jPanel7.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 645, 190, 29));
        jPanel7.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 680, 340, 30));

        btnSave6.setBackground(new java.awt.Color(204, 204, 255));
        btnSave6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSave6.setForeground(new java.awt.Color(0, 153, 204));
        btnSave6.setText("SAVE");
        btnSave6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave6ActionPerformed(evt);
            }
        });
        jPanel7.add(btnSave6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 728, 145, 45));

        btnBack6.setBackground(new java.awt.Color(204, 204, 255));
        btnBack6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnBack6.setForeground(new java.awt.Color(0, 153, 204));
        btnBack6.setText("BACK");
        btnBack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel7.add(btnBack6, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 728, 123, 45));

        jLabel84.setBackground(new java.awt.Color(255, 255, 255));
        jLabel84.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("X");
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 8, 24, 31));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eye-30 (1).png"))); // NOI18N
        jPanel7.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 43, -1));

        jScrollPane2.setViewportView(jPanel7);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 794));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init(){
         jTextField43.setBackground(notEdit);
         jTextField43.setText(String.valueOf(user.getMaxRow()+1));
    }
    
    public boolean isEmpty(){
        if(jTextField44.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Username is required","Warning",2);
            return false;
        }
         if(jTextField45.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email address is required","Warning",2);
            return false;
        }
        if(!jTextField45.getText().matches("^.+@.+\\..+$")){
            JOptionPane.showMessageDialog(this, "Invalid email address", "Warning",2);
            return false;
        }
        if(String.valueOf(jPasswordField7.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(this,"Password is required","Warning",2);
            return false;
        }
        if(jTextField46.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Phone Number is required","Warning",2);
            return false;
        }
        if(jTextField46.getText().length() > 10){
            JOptionPane.showMessageDialog(this,"Phone Number is too long","Warning",2);
            return false;
        }
        if(jTextField46.getText().length() < 5){
            JOptionPane.showMessageDialog(this,"Phone Number is too short","Warning",2);
            return false;
        }
          if(jComboBox7.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"Security Question is required","Warning",2);
            return false;
        }
         if(jTextField47.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Security answer is required","Warning",2);
            return false;
        }
        if(jTextField48.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Address 1 is required","Warning",2);
            return false;
        }
        if(jTextField49.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Address 2 is required","Warning",2);
            return false;
        }
        
        
        return true;
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         for(double i = 0;i<=1.0;i+=0.1){
            String s = ""+i;
                float f  = Float.parseFloat(s);
                this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       xx = evt.getX();
         xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTextField44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField44KeyTyped
        char input = evt.getKeyChar();
        if(!(input < '0' || input > '9') && input != '\b'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Username doesn't contain any number","Warning",2);
        }
    }//GEN-LAST:event_jTextField44KeyTyped

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
        // TODO add your handling code here:
                jPasswordField7.setEchoChar((char) 0);
        jLabel82.setVisible(false);
        jLabel61.setVisible(true);
    }//GEN-LAST:event_jLabel82MouseClicked

    private void btnSave6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave6ActionPerformed
        // TODO add your handling code here:
        if(isEmpty()){
            int id = Integer.parseInt(jTextField43.getText());
            String username = jTextField44.getText();
            String email = jTextField45.getText();
            String password = String.valueOf(jPasswordField7.getPassword()).toString();
            String phone = jTextField46.getText();
            String seq = jComboBox7.getSelectedItem().toString();
            String ans = jTextField47.getText();
            String address1 = jTextField48.getText();
            String address2 = jTextField49.getText();
            if(!user.isEmailExist(email)){
                if(!user.isPhoneExist(phone)){
                    user.insert(id, username, email, password, phone, seq, ans, address1, address2);
                    new login().setVisible(true);
                    this.dispose();
                }else{
                JOptionPane.showMessageDialog(this,"This phone number already exists","Warning",2);
                
            }
            }else{
                JOptionPane.showMessageDialog(this,"This email address already exists","Warning",2);
                
            }
        }
    }//GEN-LAST:event_btnSave6ActionPerformed

    private void jTextField46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField46KeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField46KeyTyped

    /**
     * @param args the command line arguments
    //     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //
    //        /* Create and display the form */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                new Signup().setVisible(true);
    //            }
    //        });
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack6;
    private javax.swing.JButton btnSave6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    // End of variables declaration//GEN-END:variables
}
