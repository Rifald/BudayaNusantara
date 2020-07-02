/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uas.bioskopapp.admin.kelas;

import com.uas.bioskopapp.admin.connect.Konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Timestamp;
/**
 *
 * @author User
 */
public class Akses {
    private Connection koneksi;
    private PreparedStatement ps;
    private Konek kdb = new Konek();
    private String id_pemesan,nama_admin,username, nama_pemesan, nama_bioskop, no_studio, nama_film ,kursi;

    public Akses() {
    }
    
    public Akses(String id_pemesan, String nama_admin,String username, String nama_pemesan, String nama_bioskop, String no_studio, String nama_film,String kursi) {
       this.id_pemesan = id_pemesan;
       this.nama_admin = nama_admin;
        this.nama_pemesan = nama_pemesan;
        this.username = username;
        this.nama_bioskop = nama_bioskop;
        this.no_studio = no_studio;
        this.nama_film = nama_film;
        this.kursi = kursi;
    }
    
    public boolean setConfirm(String id_pemesan)
            throws SQLException {

        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        String updateTableSQL = "UPDATE pesan SET status = ?"
                + " WHERE id_pesan = ?";
        try {

            kdb.bukaKoneksi();

            dbConnection = kdb.getConn();

            ps = dbConnection.prepareStatement(updateTableSQL);

            ps.setString(1, "CONFIRMED");
            ps.setString(2, id_pemesan);

            

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
    
    public boolean masukkanDataHistory() throws SQLException {
    //deklarasi connection dan preparedStatement
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        String insertTableSQL = "INSERT INTO history"
                + "(nama_admin, username, nama_pemesan, bioskop ,nama_film, no_studio, kursi,timestamp) VALUES"
                + "(?,?,?,?,?,?,?,?)";
        try {
    //buka koneksi 
            kdb.bukaKoneksi();
    //inisialisasi dbConnection 
            dbConnection = kdb.getConn();
   
            ps = dbConnection.prepareStatement(insertTableSQL);
            ps.setString(1, this.nama_admin);
            ps.setString(2, this.username);
            ps.setString(3, this.nama_pemesan);
            ps.setString(4, this.nama_bioskop);
            ps.setString(5, this.nama_film);
            ps.setString(6, this.no_studio);
            ps.setString(7, this.kursi);
            Timestamp now = new Timestamp(new Date().getTime());
            ps.setTimestamp(8, now);
    //langkah 4: eksekusi query
            rowAffect = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

            ps.close();
        }
    //langkah ke-5: menterjemahkan hasil yang dikembalikan
    //dari bentuk integer ke dalam bentuk boolean sebagai representasi keberhasilan eksekusi
        if (rowAffect > 0) {
            return true;
        } else {
            return false;
        }
    }
}
