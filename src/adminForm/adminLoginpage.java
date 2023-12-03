/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package adminForm;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class adminLoginpage extends javax.swing.JPanel {
    private final String adminUsername = "admin";
    private final String adminPassword = "1234";
    /**
     * Creates new form java
     */
public adminLoginpage() {
    initComponents();

}

    public adminLoginpage(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        showPasswordLabel = new javax.swing.JCheckBox();
        passwordTextField = new javax.swing.JTextField();

        headingLabel.setText("Admin login ONLY!");

        userNameLabel.setText("UserName:");

        passwordLabel.setText("Password:");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        showPasswordLabel.setText("Show Password");
        showPasswordLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordLabelActionPerformed(evt);
            }
        });

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTextField)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addComponent(showPasswordLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(loginButton)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(headingLabel)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(showPasswordLabel)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
// Get entered username
        String enteredUsername = userTextField.getText().trim();
        
        // Check username and password match the admin credentials
        if (enteredUsername.equals(adminUsername)) {

            if (adminPassword.equals(passwordTextField.getText().trim())) {
                // Password is correct
                System.out.println("Admin Logged In");
                
            } else {
                // Incorrect password
                JOptionPane.showMessageDialog(this, "Incorrect Password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Incorrect username
            JOptionPane.showMessageDialog(this, "Incorrect Username!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void showPasswordLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordLabelActionPerformed

    }//GEN-LAST:event_showPasswordLabelActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JCheckBox showPasswordLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}