/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uas.bioskopapp.admin.kelas;

import com.toedter.calendar.JDateChooser;
import com.uas.bioskopapp.admin.connect.Konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class EditClass {
    private Connection koneksi;
    private PreparedStatement ps;
        private Statement cs;
    private Konek kdb = new Konek();
    private String namaBioskop,studio,film, genre, durasi, jam;
    private JDateChooser tanggal;
    public EditClass() {
    }
    public EditClass(String nama_bioskop, String no_studio, String film, String genre, String durasi, JDateChooser tanggal, String jam) {
        this.namaBioskop = nama_bioskop;
        this.studio = no_studio;
        this.film = film;
        this.genre = genre;
        this.durasi = durasi;
        this.tanggal = tanggal;
        this.jam = jam;

    }
    
     public boolean setConfirm(String namaBioskop, String noStudio)
            throws SQLException {

        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        String updateTableSQL = "UPDATE bioskop INNER JOIN studio ON bioskop.id_bioskop=studio.id_bioskop INNER JOIN film ON film.id_film=studio.id_film"
                + " SET film.nama_film = ?, "
                + " film.genre = ?, film.durasi = ? , studio.tanggal =? , studio.jam_mulai = ?"
                + " WHERE bioskop.nama_bioskop ='"+namaBioskop+"' AND studio.no_studio = '"+noStudio+"' ";
        try {

            kdb.bukaKoneksi();

            dbConnection = kdb.getConn();

            ps = dbConnection.prepareStatement(updateTableSQL);

            ps.setString(1, film);

            ps.setString(2, genre);
            ps.setString(3, durasi);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Date = sdf.format(tanggal.getDate());
            ps.setString(4, Date);
            ps.setString(5, jam);

            

            rowAffect = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            ps.close();
        }

        if (rowAffect > 0) {
            return true;
        } else {
            return false;
        }
    }
     
     public boolean resetBangku(String nama_bioskop, String nomor_studio)
            throws SQLException {

        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        String updateTableSQL = "UPDATE bioskop INNER JOIN studio ON bioskop.id_bioskop=studio.id_bioskop INNER JOIN bangku ON bangku.id_bangku=studio.id_bangku"
                + " SET bangku.a1 = 0, bangku.a2 = 0, bangku.a3 = 0, bangku.a4 = 0,"
                + " bangku.b1 = 0, bangku.b2 = 0, bangku.b3 = 0, bangku.b4 = 0,"
                + " bangku.c1 = 0, bangku.c2 = 0, bangku.c3 = 0, bangku.c4 = 0"
                + " WHERE bioskop.nama_bioskop = ? AND studio.no_studio = ?";
        try {

            kdb.bukaKoneksi();

            dbConnection = kdb.getConn();

            ps = dbConnection.prepareStatement(updateTableSQL);
            ps.setString(1, nama_bioskop);
            ps.setString(2, nomor_studio);
            

            rowAffect = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }

        if (rowAffect > 0) {
            return true;
        } else {
            return false;
        }
    }
      public boolean hapusPesan(String namaBioskop, String studio) throws SQLException {

        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;

        String deleteTableSQL = "DELETE from pesan WHERE nama_bioskop = ? AND no_studio = ?";
        try {
   
            kdb.bukaKoneksi();    
            dbConnection = kdb.getConn();
            ps = dbConnection.prepareStatement(deleteTableSQL);
            ps.setString(1, namaBioskop);
            ps.setString(2, studio);

            rowAffect = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            ps.close();
        }

        if (rowAffect > 0) {
            return true;
        } else {
            return false;
        }
    }
      
}
