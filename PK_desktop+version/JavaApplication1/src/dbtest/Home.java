/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author benek
 */
public class Home extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Timestamp timeResult;    
    
    public Home() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1980, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 700));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start DB connection");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textField1.setEditable(false);
        textField1.setText("1");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setText("Selected item id");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setText("Turn ON/OFF (Id from above)");

        button1.setBackground(new java.awt.Color(255, 255, 255));
        button1.setLabel("ON");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 255, 255));
        button2.setLabel("OFF");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Light point Id", "Name", "Description", "Light status", "room Id", "Light Id", "Bulb Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session Id", "Room Id", "Light point Id", "Session start", "Session end", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Start DB button clicked
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        loadLightPointData();
        loadSessionData();
        System.out.print("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        textField1.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    
    //ON button clicked
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();      
        int selectedRowIndex = jTable1.getSelectedRow();
        
        //int lightPointId = (Integer) model.getValueAt(selectedRowIndex, 0);
        int lightPointStatus = (Integer) model.getValueAt(selectedRowIndex, 3);
        int roomId = (Integer) model.getValueAt(selectedRowIndex, 4);
        int lightPointId = Integer.parseInt( textField1.getText());
        
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp sqlCurrentTime = new java.sql.Timestamp(date.getTime());
        String stringDate = date.toString();
          
        
        System.out.println("ON btn lightpoint = " + lightPointId);
        System.out.println("ON btn lightPointStatus = " + lightPointStatus);
        System.out.println("ON btn roomId = " + roomId);
        System.out.println("ON btn current time = " + sqlCurrentTime);
        
        if(lightPointStatus == 0){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/light_management?autoReconnect=true&useSSL=false", "root", "");
                String sqlStatus = "UPDATE lightpoints SET lightPointStatus=" + true + " WHERE lightPointId=" + lightPointId;

                PreparedStatement pst = con.prepareStatement(sqlStatus);
                pst.executeUpdate();

                String sqlSession = "UPDATE sessionlogs SET sessionLogDateStart='" + sqlCurrentTime + "', sessionLogDateEnd=" + null + " WHERE lightPointId=" + lightPointId;

                PreparedStatement pst2 = con.prepareStatement(sqlSession);
                pst2.executeUpdate();

                System.out.println("Updated"); 
                con.close();
            } catch (Exception ex) {
            }

            loadLightPointData();
            loadSessionData();      
        }
    }//GEN-LAST:event_button1MouseClicked

    
    //OFF button clicked
    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();      
        int selectedRowIndex = jTable1.getSelectedRow();
        
        //int lightPointId = (Integer) model.getValueAt(selectedRowIndex, 0);
        int lightPointStatus = (Integer) model.getValueAt(selectedRowIndex, 3);
        int roomId = (Integer) model.getValueAt(selectedRowIndex, 4);
        int lightPointId = Integer.parseInt( textField1.getText());
      
        java.util.Date date = new java.util.Date();
        java.sql.Timestamp sqlCurrentTime = new java.sql.Timestamp(date.getTime());
        
        
        System.out.println("OFF btn lightpointId = " + lightPointId);
        System.out.println("ON btn lightPointStatus = " + lightPointStatus);
        System.out.println("OFF btn roomId = " + roomId);
        System.out.println("OFF btn current time = " + sqlCurrentTime);
        
        if(lightPointStatus == 1){         
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/light_management?autoReconnect=true&useSSL=false", "root", "");

                String sqlStatus = "UPDATE lightpoints SET lightPointStatus=" + false + " WHERE lightPointId=" + lightPointId;         
                PreparedStatement pst = con.prepareStatement(sqlStatus);
                pst.executeUpdate();

                String sqlSession = "UPDATE sessionlogs SET sessionLogDateEnd='" + sqlCurrentTime  + "' WHERE lightPointId=" + lightPointId;       
                PreparedStatement pst2 = con.prepareStatement(sqlSession);
                pst2.executeUpdate();


                String sqlDate = "SELECT * FROM sessionlogs WHERE lightPointId=" + lightPointId;
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sqlDate);

                while(rs.next()) {
                     timeResult = rs.getTimestamp("sessionLogDateStart");
                }            

                System.out.println("Date : " + timeResult);

                long sessionDurationLong = sqlCurrentTime.getTime() - timeResult.getTime();
                int sessionDuration = (int) sessionDurationLong / 1000;

                System.out.println("session duration in seconds : " + sessionDuration/1000);


                String sqlSessionDuration = "UPDATE sessionlogs SET sessionLogDuration=" + sessionDuration + " WHERE lightPointId=" + lightPointId;         
                PreparedStatement pst3 = con.prepareStatement(sqlSessionDuration);
                pst3.executeUpdate();


                System.out.println("Updated and saved"); 
                con.close();
                st.close();
                rs.close();
            } catch (Exception ex) {
            }

            loadLightPointData();
            loadSessionData();      
        }
        
    }//GEN-LAST:event_button2MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int coordX = evt.getXOnScreen();
        int coordY = evt.getYOnScreen();
        this.setLocation(coordX - mousepX, coordY - mousepY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         mousepX = evt.getX();
         mousepY = evt.getY();
    }//GEN-LAST:event_formMousePressed
 
    void loadLightPointData(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/light_management?autoReconnect=true&useSSL=false", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lightpoints");
            
            while(jTable1.getRowCount() > 0){
                ((DefaultTableModel)jTable1.getModel()).removeRow(0);
        
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i <= col; i++){
                    rows[i-1] = rs.getObject(i);
                }
            ((DefaultTableModel)jTable1.getModel()).insertRow(rs.getRow() - 1, rows);

            }
            rs.close();
            st.close();
            
        } catch (Exception ex) {
        }
        
    }
    
       void loadSessionData(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/light_management?autoReconnect=true&useSSL=false", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM sessionlogs");
            
            while(jTable2.getRowCount() > 0){
                ((DefaultTableModel)jTable2.getModel()).removeRow(0);
        
            }
            int col = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] rows = new Object[col];
                for(int i = 1; i <= col; i++){
                    rows[i-1] = rs.getObject(i);
                }
            ((DefaultTableModel)jTable2.getModel()).insertRow(rs.getRow() - 1, rows);

            }
            rs.close();
            st.close();
            
        } catch (Exception ex) {
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
