/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import users.*;
import javaProject.*;
/**
 *
 * @author HP
 */
public class Admin_Dashboard extends javax.swing.JFrame {

    public Admin_Dashboard() {
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

        TitleBarPanel = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        projectTitleLabel = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        SideBarPanel2 = new javax.swing.JPanel();
        Dashboard2 = new javax.swing.JPanel();
        dashbaord = new javax.swing.JLabel();
        passengerDetailsPanel = new javax.swing.JPanel();
        passengerDetails = new javax.swing.JLabel();
        flighDetailstPanel = new javax.swing.JPanel();
        flightDetails = new javax.swing.JLabel();
        ticketBookingPanel = new javax.swing.JPanel();
        ticketBooking = new javax.swing.JLabel();
        ticketCancellationPanel = new javax.swing.JPanel();
        ticketCancellation = new javax.swing.JLabel();
        LogoutPanel = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        sidebarIconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleBarPanel.setBackground(new java.awt.Color(102, 102, 255));
        TitleBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeLabel.setBackground(new java.awt.Color(255, 255, 255));
        closeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.setText("X");
        closeLabel.setToolTipText("");
        closeLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        TitleBarPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 20, 50, 50));

        projectTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        projectTitleLabel.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        projectTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        projectTitleLabel.setText("AIRLINE TICKET BOOKING SYSTEM");
        TitleBarPanel.add(projectTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 15, 970, -1));

        adminLabel.setBackground(new java.awt.Color(255, 255, 255));
        adminLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/User_Icon.png"))); // NOI18N
        adminLabel.setText(" Admin");
        TitleBarPanel.add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, -1, -1));

        getContentPane().add(TitleBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 1540, 90));

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 1540, 990));

        SideBarPanel2.setBackground(new java.awt.Color(51, 51, 51));
        SideBarPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard2.setBackground(new java.awt.Color(255, 51, 51));
        Dashboard2.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dashboard2MouseClicked(evt);
            }
        });

        dashbaord.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        dashbaord.setForeground(new java.awt.Color(255, 255, 255));
        dashbaord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Home_Icon.png"))); // NOI18N
        dashbaord.setText("  Dashboard");

        javax.swing.GroupLayout Dashboard2Layout = new javax.swing.GroupLayout(Dashboard2);
        Dashboard2.setLayout(Dashboard2Layout);
        Dashboard2Layout.setHorizontalGroup(
            Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dashboard2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(dashbaord)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        Dashboard2Layout.setVerticalGroup(
            Dashboard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dashboard2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashbaord, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel2.add(Dashboard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 80));

        passengerDetailsPanel.setBackground(new java.awt.Color(51, 51, 51));
        passengerDetailsPanel.setForeground(new java.awt.Color(255, 255, 255));
        passengerDetailsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerDetailsPanelMouseClicked(evt);
            }
        });

        passengerDetails.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        passengerDetails.setForeground(new java.awt.Color(255, 255, 255));
        passengerDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Passenger_Icon.png"))); // NOI18N
        passengerDetails.setText("  Passenger Details");

        javax.swing.GroupLayout passengerDetailsPanelLayout = new javax.swing.GroupLayout(passengerDetailsPanel);
        passengerDetailsPanel.setLayout(passengerDetailsPanelLayout);
        passengerDetailsPanelLayout.setHorizontalGroup(
            passengerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailsPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(passengerDetails)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        passengerDetailsPanelLayout.setVerticalGroup(
            passengerDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passengerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel2.add(passengerDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 380, 80));

        flighDetailstPanel.setBackground(new java.awt.Color(51, 51, 51));
        flighDetailstPanel.setForeground(new java.awt.Color(255, 255, 255));
        flighDetailstPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flighDetailstPanelMouseClicked(evt);
            }
        });

        flightDetails.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        flightDetails.setForeground(new java.awt.Color(255, 255, 255));
        flightDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Flight_Icon.png"))); // NOI18N
        flightDetails.setText("  Flight Details");

        javax.swing.GroupLayout flighDetailstPanelLayout = new javax.swing.GroupLayout(flighDetailstPanel);
        flighDetailstPanel.setLayout(flighDetailstPanelLayout);
        flighDetailstPanelLayout.setHorizontalGroup(
            flighDetailstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flighDetailstPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(flightDetails)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        flighDetailstPanelLayout.setVerticalGroup(
            flighDetailstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flighDetailstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel2.add(flighDetailstPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 380, 80));

        ticketBookingPanel.setBackground(new java.awt.Color(51, 51, 51));
        ticketBookingPanel.setForeground(new java.awt.Color(255, 255, 255));
        ticketBookingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketBookingPanelMouseClicked(evt);
            }
        });

        ticketBooking.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        ticketBooking.setForeground(new java.awt.Color(255, 255, 255));
        ticketBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Ticket_Icon.png"))); // NOI18N
        ticketBooking.setText("  Ticket Booking");

        javax.swing.GroupLayout ticketBookingPanelLayout = new javax.swing.GroupLayout(ticketBookingPanel);
        ticketBookingPanel.setLayout(ticketBookingPanelLayout);
        ticketBookingPanelLayout.setHorizontalGroup(
            ticketBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketBookingPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ticketBooking)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        ticketBookingPanelLayout.setVerticalGroup(
            ticketBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketBookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ticketBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel2.add(ticketBookingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 80));

        ticketCancellationPanel.setBackground(new java.awt.Color(51, 51, 51));
        ticketCancellationPanel.setForeground(new java.awt.Color(255, 255, 255));
        ticketCancellationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketCancellationPanelMouseClicked(evt);
            }
        });

        ticketCancellation.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        ticketCancellation.setForeground(new java.awt.Color(255, 255, 255));
        ticketCancellation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Cancel_Ticket_Icon.png"))); // NOI18N
        ticketCancellation.setText("  Ticket Cancellation");

        javax.swing.GroupLayout ticketCancellationPanelLayout = new javax.swing.GroupLayout(ticketCancellationPanel);
        ticketCancellationPanel.setLayout(ticketCancellationPanelLayout);
        ticketCancellationPanelLayout.setHorizontalGroup(
            ticketCancellationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketCancellationPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ticketCancellation)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        ticketCancellationPanelLayout.setVerticalGroup(
            ticketCancellationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketCancellationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ticketCancellation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel2.add(ticketCancellationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 380, 80));

        LogoutPanel.setBackground(new java.awt.Color(51, 51, 51));
        LogoutPanel.setForeground(new java.awt.Color(255, 255, 255));
        LogoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Logout_Exit_Icon.png"))); // NOI18N
        logout.setText("  Logout");

        javax.swing.GroupLayout LogoutPanelLayout = new javax.swing.GroupLayout(LogoutPanel);
        LogoutPanel.setLayout(LogoutPanelLayout);
        LogoutPanelLayout.setHorizontalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(logout)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        LogoutPanelLayout.setVerticalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel2.add(LogoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 380, 80));

        sidebarIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Menu_Icon.png"))); // NOI18N
        SideBarPanel2.add(sidebarIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        getContentPane().add(SideBarPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 1080));

        setSize(new java.awt.Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void Dashboard2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard2MouseClicked
        // TODO add your handling code here:
        Admin_Dashboard obj = new Admin_Dashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_Dashboard2MouseClicked

    private void passengerDetailsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerDetailsPanelMouseClicked
        // TODO add your handling code here:
        Admin_PassengerDetails obj = new Admin_PassengerDetails();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_passengerDetailsPanelMouseClicked

    private void flighDetailstPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flighDetailstPanelMouseClicked
        // TODO add your handling code here:
        Admin_FlightDetails obj = new Admin_FlightDetails();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_flighDetailstPanelMouseClicked

    private void ticketBookingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketBookingPanelMouseClicked
        // TODO add your handling code here:
        Admin_TicketBooking obj = new Admin_TicketBooking();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ticketBookingPanelMouseClicked

    private void ticketCancellationPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketCancellationPanelMouseClicked
        // TODO add your handling code here:
        Admin_TicketCancellation obj = new Admin_TicketCancellation();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ticketCancellationPanelMouseClicked

    private void LogoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseClicked
        // TODO add your handling code here:
        LogIn obj = new LogIn();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dashboard2;
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JPanel SideBarPanel2;
    private javax.swing.JPanel TitleBarPanel;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel dashbaord;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel flighDetailstPanel;
    private javax.swing.JLabel flightDetails;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel passengerDetails;
    private javax.swing.JPanel passengerDetailsPanel;
    private javax.swing.JLabel projectTitleLabel;
    private javax.swing.JLabel sidebarIconLabel;
    private javax.swing.JLabel ticketBooking;
    private javax.swing.JPanel ticketBookingPanel;
    private javax.swing.JLabel ticketCancellation;
    private javax.swing.JPanel ticketCancellationPanel;
    // End of variables declaration//GEN-END:variables
}
