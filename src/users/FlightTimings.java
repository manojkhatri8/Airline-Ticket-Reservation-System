/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaProject.DB_Connectivity;
import javaProject.LogIn;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class FlightTimings extends javax.swing.JFrame {

    ResultSet rs;
    public FlightTimings() {
        try {
            initComponents();
            DB_Connectivity db = new DB_Connectivity();
            rs = db.getFlightDetails();
            DefaultTableModel tb =(DefaultTableModel)flightTimingsTable.getModel();
            
            while(rs.next()){
            String row[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
            tb.addRow(row); 
            }
        }catch (SQLException ex) {
          System.out.println(ex);
        }
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
        welcomeLabel = new javax.swing.JLabel();
        dashboardPanel = new javax.swing.JPanel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTimingsTable = new rojeru_san.complementos.RSTableMetro();
        refreshButton = new javax.swing.JButton();
        SideBarPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        ticketBookingPanel = new javax.swing.JPanel();
        TicketBooking = new javax.swing.JLabel();
        flightTimingsPanel = new javax.swing.JPanel();
        flightTimings = new javax.swing.JLabel();
        ticketPricesPanel = new javax.swing.JPanel();
        ticketPrices = new javax.swing.JLabel();
        LogoutPanel = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        detailsLabel = new javax.swing.JLabel();
        sidebarIconLabel = new javax.swing.JLabel();
        passengerPanel = new javax.swing.JPanel();
        passengerDetails = new javax.swing.JLabel();

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

        welcomeLabel.setBackground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/User_Icon.png"))); // NOI18N
        welcomeLabel.setText("Welcome");
        TitleBarPanel.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, -1, -1));

        getContentPane().add(TitleBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 1540, 90));

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N

        searchButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 21)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        flightTimingsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Source", "Destination", "Departure", "Arrival", "Day"
            }
        ));
        flightTimingsTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        flightTimingsTable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        flightTimingsTable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        flightTimingsTable.setColorSelBackgound(new java.awt.Color(204, 204, 204));
        flightTimingsTable.setColorSelForeground(new java.awt.Color(0, 0, 0));
        flightTimingsTable.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        flightTimingsTable.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        flightTimingsTable.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        flightTimingsTable.setRowHeight(36);
        jScrollPane1.setViewportView(flightTimingsTable);

        refreshButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refreshButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(refreshButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 1540, 990));

        SideBarPanel.setBackground(new java.awt.Color(51, 51, 51));
        SideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePanel.setBackground(new java.awt.Color(51, 51, 51));
        homePanel.setForeground(new java.awt.Color(255, 255, 255));
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
        });

        home.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Home_Icon.png"))); // NOI18N
        home.setText("  Home");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(home)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 80));

        ticketBookingPanel.setBackground(new java.awt.Color(51, 51, 51));
        ticketBookingPanel.setForeground(new java.awt.Color(255, 255, 255));
        ticketBookingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketBookingPanelMouseClicked(evt);
            }
        });

        TicketBooking.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        TicketBooking.setForeground(new java.awt.Color(255, 255, 255));
        TicketBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Ticket_Icon.png"))); // NOI18N
        TicketBooking.setText("  Ticket Booking");

        javax.swing.GroupLayout ticketBookingPanelLayout = new javax.swing.GroupLayout(ticketBookingPanel);
        ticketBookingPanel.setLayout(ticketBookingPanelLayout);
        ticketBookingPanelLayout.setHorizontalGroup(
            ticketBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketBookingPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TicketBooking)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        ticketBookingPanelLayout.setVerticalGroup(
            ticketBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketBookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TicketBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel.add(ticketBookingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 380, 80));

        flightTimingsPanel.setBackground(new java.awt.Color(255, 51, 51));
        flightTimingsPanel.setForeground(new java.awt.Color(255, 255, 255));

        flightTimings.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        flightTimings.setForeground(new java.awt.Color(255, 255, 255));
        flightTimings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Flight_Timing_Icon.png"))); // NOI18N
        flightTimings.setText("  Flight Timings");

        javax.swing.GroupLayout flightTimingsPanelLayout = new javax.swing.GroupLayout(flightTimingsPanel);
        flightTimingsPanel.setLayout(flightTimingsPanelLayout);
        flightTimingsPanelLayout.setHorizontalGroup(
            flightTimingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightTimingsPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(flightTimings)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        flightTimingsPanelLayout.setVerticalGroup(
            flightTimingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightTimingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightTimings, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel.add(flightTimingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 380, 80));

        ticketPricesPanel.setBackground(new java.awt.Color(51, 51, 51));
        ticketPricesPanel.setForeground(new java.awt.Color(255, 255, 255));
        ticketPricesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketPricesPanelMouseClicked(evt);
            }
        });

        ticketPrices.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        ticketPrices.setForeground(new java.awt.Color(255, 255, 255));
        ticketPrices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Ticket_Price_Icon.png"))); // NOI18N
        ticketPrices.setText("Ticket Prices");

        javax.swing.GroupLayout ticketPricesPanelLayout = new javax.swing.GroupLayout(ticketPricesPanel);
        ticketPricesPanel.setLayout(ticketPricesPanelLayout);
        ticketPricesPanelLayout.setHorizontalGroup(
            ticketPricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPricesPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ticketPrices)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        ticketPricesPanelLayout.setVerticalGroup(
            ticketPricesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketPricesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ticketPrices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel.add(ticketPricesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 380, 80));

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

        SideBarPanel.add(LogoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 380, 80));

        detailsLabel.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        detailsLabel.setForeground(new java.awt.Color(204, 204, 204));
        detailsLabel.setText("Details");
        SideBarPanel.add(detailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 20));

        sidebarIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Menu_Icon.png"))); // NOI18N
        SideBarPanel.add(sidebarIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        passengerPanel.setBackground(new java.awt.Color(51, 51, 51));
        passengerPanel.setForeground(new java.awt.Color(255, 255, 255));
        passengerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passengerPanelMouseClicked(evt);
            }
        });

        passengerDetails.setFont(new java.awt.Font("Segoe UI Semilight", 1, 19)); // NOI18N
        passengerDetails.setForeground(new java.awt.Color(255, 255, 255));
        passengerDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project_Images/Passenger_Icon.png"))); // NOI18N
        passengerDetails.setText("  Passenger");

        javax.swing.GroupLayout passengerPanelLayout = new javax.swing.GroupLayout(passengerPanel);
        passengerPanel.setLayout(passengerPanelLayout);
        passengerPanelLayout.setHorizontalGroup(
            passengerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(passengerDetails)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        passengerPanelLayout.setVerticalGroup(
            passengerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passengerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SideBarPanel.add(passengerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 380, 80));

        getContentPane().add(SideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 1080));

        setSize(new java.awt.Dimension(1920, 1080));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeLabelMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
         DB_Connectivity db=new DB_Connectivity();
         
         ResultSet rs;
         rs=db.findFlight(searchField.getText());
         DefaultTableModel tb=(DefaultTableModel)flightTimingsTable.getModel();
         tb.setRowCount(0);
        try {
            while(rs.next()){
                String vector[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                        tb.addRow(vector);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FlightTimings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        FlightTimings obj = new FlightTimings();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseClicked
        // TODO add your handling code here:
        HomePage obj = new HomePage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_homePanelMouseClicked

    private void ticketBookingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketBookingPanelMouseClicked
        // TODO add your handling code here:
        TicketBooking obj = new TicketBooking();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ticketBookingPanelMouseClicked

    private void ticketPricesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketPricesPanelMouseClicked
        // TODO add your handling code here:
        TicketPrices obj = new TicketPrices();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ticketPricesPanelMouseClicked

    private void LogoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseClicked
        // TODO add your handling code here:
        LogIn obj = new LogIn();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutPanelMouseClicked

    private void passengerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passengerPanelMouseClicked
        // TODO add your handling code here:
        Passenger obj = new Passenger();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_passengerPanelMouseClicked

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
            java.util.logging.Logger.getLogger(FlightTimings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightTimings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightTimings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightTimings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FlightTimings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JLabel TicketBooking;
    private javax.swing.JPanel TitleBarPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JLabel flightTimings;
    private javax.swing.JPanel flightTimingsPanel;
    private rojeru_san.complementos.RSTableMetro flightTimingsTable;
    private javax.swing.JLabel home;
    private javax.swing.JPanel homePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel passengerDetails;
    private javax.swing.JPanel passengerPanel;
    private javax.swing.JLabel projectTitleLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel sidebarIconLabel;
    private javax.swing.JPanel ticketBookingPanel;
    private javax.swing.JLabel ticketPrices;
    private javax.swing.JPanel ticketPricesPanel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}