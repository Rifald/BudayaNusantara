/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uas.bioskopapp.admin;

import com.uas.bioskopapp.admin.connect.Konek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class DaftarFilm extends javax.swing.JFrame {

    private String username, pass;
    private Statement ks;
    private ResultSet Rslogin;
    private String sql="";
    private ResultSet Rs;
        private Connection koneksi;
    private Statement cs;
    private Konek kdb = new Konek();
    /**
     * Creates new form DaftarFilm
     */
    public DaftarFilm() {
        initComponents();

    

    }
     
    void namauser(String nama, String password) {
            
            
            try {
            sql = "select * from admin where username='"+nama+"'"
            + "and password='"+password+"'";
            kdb.bukaKoneksi();
            koneksi = kdb.getConn();
            cs = koneksi.createStatement();
            Rslogin = cs.executeQuery(sql);
            if(Rslogin.next()){
            username = Rslogin.getString("username");
            pass = Rslogin.getString("password");
            }else{
                System.out.println("Tidak ada username");
            }
            } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
                           
    }
    
    void dataTable(DefaultTableModel tabel1, JTable table2){
        tabel1.addColumn("ID");
        tabel1.addColumn("Nama Film");
        tabel1.addColumn("Genre");
        tabel1.addColumn("Durasi"); 
        tabel1.addColumn("Tanggal"); 
        tabel1.addColumn("Jam"); 
        tabel1.addColumn("Nomor Studio"); 
        tabel1.addColumn("Harga"); 
        
       
        
        table2.setModel(tabel1);
 
        
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
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        bioskop2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bioskop1 = new javax.swing.JButton();
        bioskop3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelFilm = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        namaBios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        bioskop2.setText("EMPIRE XXI");
        bioskop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bioskop2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bioskop :");

        bioskop1.setText("AMBARRUKMO XXI");
        bioskop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bioskop1ActionPerformed(evt);
            }
        });

        bioskop3.setText("JOGJA CITY XXI");
        bioskop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bioskop3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bioskop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bioskop1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bioskop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bioskop1)
                .addGap(18, 18, 18)
                .addComponent(bioskop2)
                .addGap(18, 18, 18)
                .addComponent(bioskop3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Daftar Film");

        tabelFilm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"-", "-", "-", "-", "-", "-", "-", null}
            },
            new String [] {
                "ID", "Nama Film", "Genre", "Durasi", "Tanggal", "Jam", "No Studio", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tabelFilm);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Bioskop : ");

        namaBios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaBios.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaBios)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaBios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.namauser(username, pass);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void bioskop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bioskop1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableBioskop1 = new DefaultTableModel();
        dataTable(tableBioskop1,tabelFilm);
        namaBios.setText("AMBARRUKMO XXI");
         try{

            sql="SELECT film.id_film, film.nama_film, film.genre, film.durasi, studio.tanggal, studio.jam_mulai, studio.no_studio,studio.harga FROM bioskop INNER JOIN studio ON bioskop.id_bioskop=studio.id_bioskop INNER JOIN film ON film.id_film=studio.id_film INNER JOIN bangku ON bangku.id_bangku=studio.id_bangku WHERE bioskop.nama_bioskop LIKE 'AMBARRUKMO XXI'";
            kdb.bukaKoneksi();
            koneksi = kdb.getConn();
            cs = koneksi.createStatement();
            Rs = cs.executeQuery(sql);
            
            while (Rs.next())
            {
                tableBioskop1.addRow(new Object[]{
                    Rs.getString(1),
                    Rs.getString(2),
                    Rs.getString(3),
                    Rs.getString(4),
                    Rs.getString(5),
                    Rs.getString(6),
                    Rs.getString(7),
                    Rs.getString(8),

                });
            }
            
        }catch (SQLException e){
        }
         tabelFilm.setModel(tableBioskop1);

    }//GEN-LAST:event_bioskop1ActionPerformed

    private void bioskop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bioskop2ActionPerformed
        // TODO add your handling code here:
                DefaultTableModel tableBioskop1 = new DefaultTableModel();
        dataTable(tableBioskop1,tabelFilm);
        namaBios.setText("EMPIRE XXI");
         try{

            sql="SELECT film.id_film, film.nama_film, film.genre, film.durasi, studio.tanggal, studio.jam_mulai, studio.no_studio,studio.harga FROM bioskop INNER JOIN studio ON bioskop.id_bioskop=studio.id_bioskop INNER JOIN film ON film.id_film=studio.id_film INNER JOIN bangku ON bangku.id_bangku=studio.id_bangku WHERE bioskop.nama_bioskop LIKE 'EMPIRE XXI'";
            kdb.bukaKoneksi();
            koneksi = kdb.getConn();
            cs = koneksi.createStatement();
            Rs = cs.executeQuery(sql);
            
            while (Rs.next())
            {
                tableBioskop1.addRow(new Object[]{
                    Rs.getString(1),
                    Rs.getString(2),
                    Rs.getString(3),
                    Rs.getString(4),
                    Rs.getString(5),
                    Rs.getString(6),
                    Rs.getString(7),
                    Rs.getString(8),

                });
            }
            
        }catch (SQLException e){
        }
         tabelFilm.setModel(tableBioskop1);
    }//GEN-LAST:event_bioskop2ActionPerformed

    private void bioskop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bioskop3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableBioskop1 = new DefaultTableModel();
        dataTable(tableBioskop1,tabelFilm);
        namaBios.setText("JOGJA CITY XXI");
         try{

            sql="SELECT film.id_film, film.nama_film, film.genre, film.durasi, studio.tanggal, studio.jam_mulai, studio.no_studio,studio.harga FROM bioskop INNER JOIN studio ON bioskop.id_bioskop=studio.id_bioskop INNER JOIN film ON film.id_film=studio.id_film INNER JOIN bangku ON bangku.id_bangku=studio.id_bangku WHERE bioskop.nama_bioskop LIKE 'JOGJA CITY XXI'";
            kdb.bukaKoneksi();
            koneksi = kdb.getConn();
            cs = koneksi.createStatement();
            Rs = cs.executeQuery(sql);
            
            while (Rs.next())
            {
                tableBioskop1.addRow(new Object[]{
                    Rs.getString(1),
                    Rs.getString(2),
                    Rs.getString(3),
                    Rs.getString(4),
                    Rs.getString(5),
                    Rs.getString(6),
                    Rs.getString(7),
                    Rs.getString(8),

                });
            }
            
        }catch (SQLException e){
        }
         tabelFilm.setModel(tableBioskop1);
    }//GEN-LAST:event_bioskop3ActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bioskop1;
    private javax.swing.JButton bioskop2;
    private javax.swing.JButton bioskop3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namaBios;
    private javax.swing.JTable tabelFilm;
    // End of variables declaration//GEN-END:variables
}