/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProject;
import users.*;
import admin.*;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author HP
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        systemTitleLabel = new javax.swing.JLabel();
        airlineTitleLabel = new javax.swing.JLabel();
        reservationTitleLabel = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        projectLogoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        closeSystemLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        loginTitleLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        userLogoLabel = new javax.swing.JLabel();
        passwordLogoLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signupPageButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        systemTitleLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        systemTitleLabel.setForeground(new java.awt.Color(255, 51, 51));
        systemTitleLabel.setText("SYSTEM");

        airlineTitleLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        airlineTitleLabel.setForeground(new java.awt.Color(255, 51, 51));
        airlineTitleLabel.setText("AIRLINE");

        reservationTitleLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        reservationTitleLabel.setForeground(new java.awt.Color(102, 102, 255));
        reservationTitleLabel.setText("RESERVATION");

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Undraw_Login_Image.png"))); // NOI18N

        projectLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Airplane_Icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(airlineTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reservationTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectLogoLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(imgLabel)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectLogoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(systemTitleLabel)
                        .addComponent(reservationTitleLabel)
                        .addComponent(airlineTitleLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgLabel)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 830));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        closeSystemLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        closeSystemLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeSystemLabel.setText("X");
        closeSystemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeSystemLabelMouseClicked(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Welcome !");

        userLabel.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Username :");

        loginTitleLabel.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        loginTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginTitleLabel.setText("Login Into Your Account");

        userTextField.setBackground(new java.awt.Color(102, 102, 255));
        userTextField.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        userTextField.setForeground(new java.awt.Color(255, 255, 255));
        userTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password :");

        userLogoLabel.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        userLogoLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Account_Icon.png"))); // NOI18N

        passwordLogoLabel.setFont(new java.awt.Font("Verdana", 0, 17)); // NOI18N
        passwordLogoLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Secure_Icon.png"))); // NOI18N

        loginButton.setBackground(new java.awt.Color(255, 51, 51));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        signupPageButton.setBackground(new java.awt.Color(153, 153, 255));
        signupPageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupPageButton.setForeground(new java.awt.Color(255, 255, 255));
        signupPageButton.setText("SIGNUP");
        signupPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupPageButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(102, 102, 255));
        passwordField.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        showPassword.setBackground(new java.awt.Color(102, 102, 255));
        showPassword.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        showPassword.setForeground(new java.awt.Color(255, 255, 255));
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeSystemLabel)
                .addGap(101, 101, 101))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userLogoLabel)
                            .addComponent(passwordLogoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userLabel)
                            .addComponent(userTextField)
                            .addComponent(passwordLabel)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(showPassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(signupPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(welcomeLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(loginTitleLabel)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(closeSystemLabel)
                .addGap(64, 64, 64)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLogoLabel)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userLogoLabel)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPassword))))
                .addGap(60, 60, 60)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(signupPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 213, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 620, 860));

        setSize(new java.awt.Dimension(1528, 828));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeSystemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeSystemLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeSystemLabelMouseClicked

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
         DB_Connectivity db=new DB_Connectivity();//object
             ResultSet rs;
             rs = db.matchDetails(userTextField.getText(), passwordField.getText());
            try{
             if(rs.next()){
               //page
                JOptionPane.showMessageDialog(this, "Login", "Login Successfully",1);
                HomePage jf=new HomePage();
                new empty().setVisible(true);
                jf.setVisible(true);
                dispose();
            }else if(userTextField.getText().matches("admin") && passwordField.getText().matches("admin")){
                Admin_Dashboard jf=new Admin_Dashboard();
                new empty().setVisible(true);
                jf.setVisible(true);
                dispose();
            }
            
            
            else{
                JOptionPane.showMessageDialog(this, "Wrong details", "Login Alert",1);
                
             }
            
            }catch(Exception e){
            
              System.out.println(e);
            }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signupPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupPageButtonActionPerformed
        // TODO add your handling code here:
        SignUp obj = new SignUp();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupPageButtonActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
        if(showPassword.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlineTitleLabel;
    private javax.swing.JLabel closeSystemLabel;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLogoLabel;
    private javax.swing.JLabel projectLogoLabel;
    private javax.swing.JLabel reservationTitleLabel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton signupPageButton;
    private javax.swing.JLabel systemTitleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLogoLabel;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}