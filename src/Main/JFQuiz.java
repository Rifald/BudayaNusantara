/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Toolkit;
import javax.swing.ButtonGroup;

/**
 *
 * @author User
 */
public class JFQuiz extends javax.swing.JFrame {
    String sumatra= String.format("<html><div align='justify' style ='width:%d'>1. Pulau Sumatera mempunyai ... provinsi<br/>" 
            + "a. 2<br/>" 
            + "b. 34<br/>"
            + "c. 100<br/>"
            + "d. 10<br/><br/>"
            + "2. Makanan khas provinsi Aceh adalah mie ... <br/>" 
            + "a. Palembang<br/>" 
            + "b. Ramen<br/>"
            + "c. Aceh<br/>"
            + "d. Kirin kamu<br/><br/>"
            + "3. Rumah adat yang terkenal di Bengkulu adalah rumah adat ... <br/>" 
            + "a. Bubungan satu<br/>" 
            + "b. Bubungan lima<br/>"
            + "c. Bubungan tiga<br/>"
            + "d. Bubungan tujuh<br/><br/>"
            + "4. Pakaian adat provinsi Lampung dikenal dengan nama ... <br/>" 
            + "a. Tulang Bawang<br/>" 
            + "b. Tulang Paha<br/>"
            + "c. Tulang Sayap<br/>"
            + "d. Tulang Ayam<br/><br/>"
            + "5. Makanan khas Kepulauan Riau adalah ... <br/>" 
            + "a. Otak-atik<br/>" 
            + "b. Otaku<br/>"
            + "c. Otak Manusia<br/>"
            + "d. Otak-otak<br/><br/>"
            + "6. Senjata tradisional provinsi Riau dikenal dengan ... <br/>" 
            + "a. Pedang Mainan<br/>" 
            + "b. Pedang-pedangan<br/>"
            + "c. Pedang Jenawi<br/>"
            + "d. Pedang Jenawu<br/><br/>"
            + "7. Salah satu lagu daerah provinsi Jambi adalah ... <br/>" 
            + "a. Timang-timang Ibuku Sayang<br/>" 
            + "b. Timang-timang Anakku Sayang<br/>"
            + "c. Timang-timang Pacarku Sayang<br/>"
            + "d. Timang-timang Mantanku Sayang<br/><br/>"
            + "8. Luas provinsi Sumatera Utara ... km<sup>2</sup><br/>" 
            + "a. 72.981,23<br/>" 
            + "b. 70.123,98<br/>"
            + "c. 69,696,66<br/>"
            + "d. Tidak Terkira<br/><br/>"
            + "9. Letak geografis provinsi Sumatera Barat berada pada garis ...<br/>" 
            + "a. 71ºLU-4º LS dan 98º-102º BT<br/>" 
            + "b. 1ºLU-4º LS dan 98º-102º BT<br/>"
            + "c. 17ºLU-4º LS dan 96º-102º BT<br/>"
            + "d. 1ºLU-4º LS dan 69º-102º BT<br/><br/>"
            + "10. Apakah pulau Sumatera mempunyai provinsi Sumatera Timur ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    String jawa= String.format("<html><div align='justify' style ='width:%d'>1. Pulau Jawa mempunyai ... provinsi<br/>" 
            + "a. 6<br/>" 
            + "b. 34<br/>"
            + "c. 100<br/>"
            + "d. 10<br/><br/>"
            + "2. Rumah adat Jawa Barat khususnya banyak di daerah garut adalah rumah adat ... <br/>" 
            + "a. Togog Kucing<br/>" 
            + "b. Togog Anjing<br/>"
            + "c. Togog Sapi<br/>"
            + "d. Togog Komodo<br/><br/>"
            + "3. Ibukota negara dan kota terbesar di Indonesia adalah ... <br/>" 
            + "a. Jawa Barat<br/>" 
            + "b. DI Yogyakarta<br/>"
            + "c. DKI Jakarta<br/>"
            + "d. Banten<br/><br/>"
            + "4. Makanan khas dari provinsi Yogyakarta adalah ... <br/>" 
            + "a. Preksu<br/>" 
            + "b. Mie Afui<br/>"
            + "c. Rendang<br/>"
            + "d. Nasi Gudeg<br/><br/>"
            + "5. Salah satu lagu daerah dari provinsi Jawa Tengah adalah ... <br/>" 
            + "a. Gundul Pacul, -R.C. Hardjosubroto<br/>" 
            + "b. Solo, -Jennie Blackpink<br/>"
            + "c. Anak Kambing Saya, -Ibu Sud<br/>"
            + "d. Anging Mamiri, -Arshinta P. Aziz<br/><br/>"
            + "6. Senjata tradisional DKI Jakarta dikenal dengan ... <br/>" 
            + "a. Mandau<br/>" 
            + "b. Golok<br/>"
            + "c. Keris<br/>"
            + "d. Clurit<br/><br/>"
            + "7. Salah satu tarian daerah provinsi Jawa Barat adalah ... <br/>" 
            + "a. Tari Cenderawasih<br/>" 
            + "b. Tari Enggang Gading<br/>"
            + "c. Tari Merak<br/>"
            + "d. Tari Perkutut<br/><br/>"
            + "8. Luas provinsi Banten ... km<sup>2</sup><br/>" 
            + "a. 96.981,23<br/>" 
            + "b. 90.160,98<br/>"
            + "c. 69,696,66<br/>"
            + "d. 9.160,70 <br/><br/>"
            + "9. Letak geografis provinsi Sumatera Barat berada pada garis ...<br/>" 
            + "a. 7ºLS-9ºLS dan 110º-111ºBT<br/>" 
            + "b. 1ºLU-4º LS dan 98º-112º BT<br/>"
            + "c. 17ºLU-4º LS dan 96º-102º BT<br/>"
            + "d. 1ºLU-4º LS dan 69º-102º BT<br/><br/>"
            + "10. Apakah pulau Jawa mempunyai provinsi Jawa Timur ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    String kalimantan= String.format("<html><div align='justify' style ='width:%d'>1. Pulau Kalimantan mempunyai ... provinsi<br/>" 
            + "a. 6<br/>" 
            + "b. 4<br/>"
            + "c. 5<br/>"
            + "d. 10<br/><br/>"
            + "2. Rumah adat Kalimantan Tengah adalah rumah adat ... <br/>" 
            + "a. Betang<br/>" 
            + "b. Petang<br/>"
            + "c. Beting<br/>"
            + "d. Bunting<br/><br/>"
            + "3. Ibukota provinsi Kalimantan Barat adalah ... <br/>" 
            + "a. Samarinda<br/>" 
            + "b. Balikpapan<br/>"
            + "c. Pontianak<br/>"
            + "d. Palangkaraya<br/><br/>"
            + "4. Makanan khas dari provinsi Kalimantan Barat adalah ... <br/>" 
            + "a. Bubur Pedas<br/>" 
            + "b. Bubur Manis<br/>"
            + "c. Bubur Asin<br/>"
            + "d. Bubur Asam<br/><br/>"
            + "5. Salah satu lagu daerah dari provinsi Kalimantan Selatan adalah ... <br/>" 
            + "a. Gundul Pacul<br/>" 
            + "b. Ampar-Ampar Pisang<br/>"
            + "c. Cik-cik Periuk<br/>"
            + "d. Anging Mamiri<br/><br/>"
            + "6. Senjata tradisional Kalimantan Tengah dikenal dengan ... <br/>" 
            + "a. Golok<br/>" 
            + "b. Mandau<br/>"
            + "c. Keris<br/>"
            + "d. Clurit<br/><br/>"
            + "7. Salah satu tarian daerah provinsi Kalimantan Selatan adalah ... <br/>" 
            + "a. Tari Kinyah Mandau<br/>" 
            + "b. Tari Enggang Gading<br/>"
            + "c. Tari Monong<br/>"
            + "d. Tari Babangsai<br/><br/>"
            + "8. Luas provinsi Kalimantan Utara ... km<sup>2</sup><br/>" 
            + "a. 196.981,23<br/>" 
            + "b. 192.160,98<br/>"
            + "c. 169,696,66<br/>"
            + "d. 129.066,64<br/><br/>"
            + "9. Letak geografis provinsi Kalimantan Utara berada pada garis ...<br/>" 
            + "a. 7º57'LS-9ºLS dan 110º-111ºBT<br/>" 
            + "b. 1ºLU-4º LS dan 118º-112º BT<br/>"
            + "c. 17ºLU-4º LS dan 96º-102º BT<br/>"
            + "d. 0°57′ LU dan 116°26′ BT<br/><br/>"
            + "10. Apakah pulau Kalimantan mempunyai provinsi Kalimantan Tenggara ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    String nusatenggara= String.format("<html><div align='justify' style ='width:%d'>1. Kepulauan Nusa Tenggara memiliki ... provinsi<br/>" 
            + "a. 6<br/>" 
            + "b. 3<br/>"
            + "c. 5<br/>"
            + "d. 2<br/><br/>"
            + "2. Rumah adat Nusa Tenggara Barat adalah rumah adat ... <br/>" 
            + "a. Istana Sultan Sumbawa<br/>" 
            + "b. Istana Sultan Rifaldi<br/>"
            + "c. Istana Taj Mahal<br/>"
            + "d. Istana Sultan Syarif Abdurrahman<br/><br/>"
            + "3. Ibukota provinsi Nusa Tenggara Barat adalah ... <br/>" 
            + "a. Mataram<br/>" 
            + "b. Denpasar<br/>"
            + "c. Kupang<br/>"
            + "d. Tapanuli<br/><br/>"
            + "4. Makanan khas dari provinsi Nusa Tenggara Timur adalah ... <br/>" 
            + "a. Catemak Jagung<br/>" 
            + "b. Catemak Padi<br/>"
            + "c. Catemak Beras<br/>"
            + "d. Catemak Bakwan<br/><br/>"
            + "5. Salah satu lagu daerah dari provinsi Nusa Tenggara Timur adalah ... <br/>" 
            + "a. Gundul Pacul<br/>" 
            + "b. Ampar-Ampar Pisang<br/>"
            + "c. Soleram<br/>"
            + "d. Anak  Kambing Saya<br/><br/>"
            + "6. Senjata tradisional Nusa Tenggara Timur dikenal dengan ... <br/>" 
            + "a. Pedang<br/>" 
            + "b. Sundu<br/>"
            + "c. Keris<br/>"
            + "d. Clurit<br/><br/>"
            + "7. Salah satu tarian daerah provinsi Bali adalah ... <br/>" 
            + "a. Tari Monong<br/>" 
            + "b. Tari Saman<br/>"
            + "c. Tari Kecak<br/>"
            + "d. Tari Babangsai<br/><br/>"
            + "8. Luas provinsi Kalimantan Utara ... km<sup>2</sup><br/>" 
            + "a. 26.981,23<br/>" 
            + "b. 92.160,98<br/>"
            + "c. 20.153,15<br/>"
            + "d. 29.066,64<br/><br/>"
            + "9. Provinsi di Kepulauan Nusa Tenggara yang terkenal dengan sebutan Pulau Dewata adalah ...<br/>" 
            + "a. Nusa Tenggara Timur<br/>" 
            + "b. Nusa Tenggara Barat<br/>"
            + "c. Lampung<br/>"
            + "d. Bali<br/><br/>"
            + "10. Apakah Kepulauan Nusa Tenggara mempunyai provinsi Nusa Tenggara Selatan ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    String sulawesi= String.format("<html><div align='justify' style ='width:%d'>1. Pulau Sulawesi memiliki ... provinsi<br/>" 
            + "a. 6<br/>" 
            + "b. 3<br/>"
            + "c. 5<br/>"
            + "d. 10<br/><br/>"
            + "2. Rumah adat Sulawesi Barat adalah rumah adat ... <br/>" 
            + "a. Istana Sultan Sumbawa<br/>" 
            + "b. Dulopahu<br/>"
            + "c. Pewaris<br/>"
            + "d. Mandar<br/><br/>"
            + "3. Ibukota provinsi Sulawesi Utara adalah ... <br/>" 
            + "a. Mataram<br/>" 
            + "b. Manado<br/>"
            + "c. Gorontalo<br/>"
            + "d. Makassar<br/><br/>"
            + "4. Makanan khas dari provinsi Sulawesi Tengah adalah ... <br/>" 
            + "a. Apang<br/>" 
            + "b. Binte Biluhua<br/>"
            + "c. Sup Ikan Jantung Pisang<br/>"
            + "d. Sup Konro<br/><br/>"
            + "5. Salah satu lagu daerah dari provinsi Sulawesi Tenggara adalah ... <br/>" 
            + "a. Lulo<br/>" 
            + "b. Ampar-Ampar Pisang<br/>"
            + "c. Dabu-dabu<br/>"
            + "d. Anak  Kambing Saya<br/><br/>"
            + "6. Senjata tradisional Gorontalo dikenal dengan ... <br/>" 
            + "a. Bandik<br/>" 
            + "b. Sundu<br/>"
            + "c. Wamilo<br/>"
            + "d. Pasatimpo<br/><br/>"
            + "7. Salah satu tarian daerah provinsi Gorontalo adalah ... <br/>" 
            + "a. Tari Saronde<br/>" 
            + "b. Tari Pakarena<br/>"
            + "c. Tari Pa'gellu<br/>"
            + "d. Tari Babangsai<br/><br/>"
            + "8. Luas provinsi Kalimantan Utara ... km<sup>2</sup><br/>" 
            + "a. 16.981,23<br/>" 
            + "b. 12.160,98<br/>"
            + "c. 20.150<br/>"
            + "d. 15.069<br/><br/>"
            + "9. Kota di pulau Sulawesi yang terkenal dengan sebutan Kota Serambi Madinah adalah ...<br/>" 
            + "a. Tapanuli<br/>" 
            + "b. Medan<br/>"
            + "c. Makassar<br/>"
            + "d. Gorontalo<br/><br/>"
            + "10. Apakah Pulau Sulawesi mempunyai provinsi Sulawesi Tenggara ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    String maluku= String.format("<html><div align='justify' style ='width:%d'>1. Kepulauan Maluku memiliki ... provinsi<br/>" 
            + "a. 6<br/>" 
            + "b. 3<br/>"
            + "c. 5<br/>"
            + "d. 2<br/><br/>"
            + "2. Rumah adat Maluku adalah rumah adat ... <br/>" 
            + "a. Baileo<br/>" 
            + "b. Dulopahu<br/>"
            + "c. Pewaris<br/>"
            + "d. Mandar<br/><br/>"
            + "3. Ibukota provinsi Maluku adalah ... <br/>" 
            + "a. Mataram<br/>" 
            + "b. Manado<br/>"
            + "c. Gorontalo<br/>"
            + "d. Ambon<br/><br/>"
            + "4. Makanan khas dari provinsi Maluku Uutara adalah ... <br/>" 
            + "a. Ikan Asar<br/>" 
            + "b. Gohu<br/>"
            + "c. Sup Ikan Jantung Pisang<br/>"
            + "d. Sup Konro<br/><br/>"
            + "5. Salah satu lagu daerah dari provinsi Maluku adalah ... <br/>" 
            + "a. Lulo<br/>" 
            + "b. Ayo Mama<br/>"
            + "c. Dabu-dabu<br/>"
            + "d. Borero<br/><br/>"
            + "6. Senjata tradisional Maluku Utara dikenal dengan ... <br/>" 
            + "a. Parang Salawaku<br/>" 
            + "b. Busur<br/>"
            + "c. Wamilo<br/>"
            + "d. Pasatimpo<br/><br/>"
            + "7. Salah satu tarian daerah provinsi Maluku Utara adalah ... <br/>" 
            + "a. Tari Saronde<br/>" 
            + "b. Tari Pakarena<br/>"
            + "c. Tari Cakalele<br/>"
            + "d. Tari Babangsai<br/><br/>"
            + "8. Letak geografis provinsi Kalimantan Utara berada pada garis ...<br/>" 
            + "a. 7º57'LS-9ºLS dan 110º-111ºBT<br/>" 
            + "b. 1ºLU-4º LS dan 118º-112º BT<br/>"
            + "c. 0ºLS-9ºLS dan 124º-136ºBT<br/>"
            + "d. 0°57′ LU dan 116°26′ BT<br/><br/>"
            + "9. Provinsi di Kepulauan Maluku yang terkenal dengan sebutan Ambon Manise adalah ...<br/>" 
            + "a. NTT<br/>" 
            + "b. Maluku<br/>"
            + "c. Timor-timor<br/>"
            + "d. Gorontalo<br/><br/>"
            + "10. Apakah Kepulauan Maluku mempunyai provinsi Maluku Tenggara ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    String papua= String.format("<html><div align='justify' style ='width:%d'>1. Pulau papua memiliki ... provinsi<br/>" 
            + "a. 6<br/>" 
            + "b. 3<br/>"
            + "c. 5<br/>"
            + "d. 2<br/><br/>"
            + "2. Rumah adat Papua adalah rumah adat ... <br/>" 
            + "a. Baileo<br/>" 
            + "b. Dulopahu<br/>"
            + "c. Honai<br/>"
            + "d. Mandar<br/><br/>"
            + "3. Ibukota provinsi Papua Barat adalah ... <br/>" 
            + "a. Manokwari<br/>" 
            + "b. Manado<br/>"
            + "c. Jayapura<br/>"
            + "d. Ambon<br/><br/>"
            + "4. Makanan khas dari provinsi Papua adalah ... <br/>" 
            + "a. Ikan Asar<br/>" 
            + "b. Gohu<br/>"
            + "c. Papeda<br/>"
            + "d. Sup Konro<br/><br/>"
            + "5. Salah satu lagu daerah dari provinsi Papua adalah ... <br/>" 
            + "a. Lulo<br/>" 
            + "b. Ayo Mama<br/>"
            + "c. Sajojo<br/>"
            + "d. Borero<br/><br/>"
            + "6. Senjata tradisional Papua Barat dikenal dengan ... <br/>" 
            + "a. Parang Salawaku<br/>" 
            + "b. Panah dan Busur<br/>"
            + "c. Wamilo<br/>"
            + "d. Pasatimpo<br/><br/>"
            + "7. Salah satu tarian daerah provinsi Papua adalah ... <br/>" 
            + "a. Tari Saronde<br/>" 
            + "b. Tari Sajojo<br/>"
            + "c. Tari Cakalele<br/>"
            + "d. Tari Babangsai<br/><br/>"
            + "8. Letak geografis provinsi Papua berada pada garis ...<br/>" 
            + "a. 1ºLS-6ºLS dan 131º-141ºBT<br/>" 
            + "b. 1ºLU-4º LS dan 118º-112º BT<br/>"
            + "c. 0ºLS-9ºLS dan 124º-136ºBT<br/>"
            + "d. 0°57′ LU dan 116°26′ BT<br/><br/>"
            + "9. Luas provinsi Papua ... km<sup>2</sup><br/>" 
            + "a. 808.105<br/>" 
            + "b. 128.160,98<br/>"
            + "c. 280.150<br/>"
            + "d. 815.069<br/><br/>"
            + "10. Apakah Pulau Papua mempunyai provinsi Papua Tenggara ?<br/>" 
            + "a. Ya<br/>" 
            + "b. Tidak<br/>"
            + "c. Bisa Jadi<br/>"
            + "d. Tidak Tahu<br/><br/>",300);
    
private void groupButton( ){
   ButtonGroup bg1 = new ButtonGroup();
        bg1.add(a1);
        bg1.add(b1);
        bg1.add(c1);
        bg1.add(d1);
    ButtonGroup bg2 = new ButtonGroup();
        bg2.add(a2);
        bg2.add(b2);
        bg2.add(c2);
        bg2.add(d2);
    ButtonGroup bg3 = new ButtonGroup();
        bg3.add(a3);
        bg3.add(b3);
        bg3.add(c3);
        bg3.add(d3);
    ButtonGroup bg4 = new ButtonGroup();
        bg4.add(a4);
        bg4.add(b4);
        bg4.add(c4);
        bg4.add(d4);
    ButtonGroup bg5 = new ButtonGroup();
        bg5.add(a5);
        bg5.add(b5);
        bg5.add(c5);
        bg5.add(d5);
    ButtonGroup bg6 = new ButtonGroup();
        bg6.add(a6);
        bg6.add(b6);
        bg6.add(c6);
        bg6.add(d6);
    ButtonGroup bg7 = new ButtonGroup();
        bg7.add(a7);
        bg7.add(b7);
        bg7.add(c7);
        bg7.add(d7);
    ButtonGroup bg8 = new ButtonGroup();
        bg8.add(a8);
        bg8.add(b8);
        bg8.add(c8);
        bg8.add(d8);
    ButtonGroup bg9 = new ButtonGroup();
        bg9.add(a9);
        bg9.add(b9);
        bg9.add(c9);
        bg9.add(d9);
    ButtonGroup bg10 = new ButtonGroup();
        bg10.add(a10);
        bg10.add(b10);
        bg10.add(c10);
        bg10.add(d10);
}

    public JFQuiz() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Quiz Budaya Nusantara");
        groupButton();
        jScrollPane1.setVisible(false);
        jawab.setVisible(false);
        no1.setVisible(false);
        a1.setVisible(false);
        b1.setVisible(false);
        c1.setVisible(false);
        d1.setVisible(false);
        no2.setVisible(false);
        a2.setVisible(false);
        b2.setVisible(false);
        c2.setVisible(false);
        d2.setVisible(false);
        no3.setVisible(false);
        a3.setVisible(false);
        b3.setVisible(false);
        c3.setVisible(false);
        d3.setVisible(false);
        no4.setVisible(false);
        a4.setVisible(false);
        b4.setVisible(false);
        c4.setVisible(false);
        d4.setVisible(false);
        no5.setVisible(false);
        a5.setVisible(false);
        b5.setVisible(false);
        c5.setVisible(false);
        d5.setVisible(false);
        no6.setVisible(false);
        a6.setVisible(false);
        b6.setVisible(false);
        c6.setVisible(false);
        d6.setVisible(false);
        no7.setVisible(false);
        a7.setVisible(false);
        b7.setVisible(false);
        c7.setVisible(false);
        d7.setVisible(false);
        no8.setVisible(false);
        a8.setVisible(false);
        b8.setVisible(false);
        c8.setVisible(false);
        d8.setVisible(false);
        no9.setVisible(false);
        a9.setVisible(false);
        b9.setVisible(false);
        c9.setVisible(false);
        d9.setVisible(false);
        no10.setVisible(false);
        a10.setVisible(false);
        b10.setVisible(false);
        c10.setVisible(false);
        d10.setVisible(false);
        submit.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PenampilSoal = new javax.swing.JLabel();
        pilihMateri = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();
        tompil = new javax.swing.JButton();
        jawab = new javax.swing.JLabel();
        no1 = new javax.swing.JLabel();
        a1 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JRadioButton();
        d1 = new javax.swing.JRadioButton();
        no2 = new javax.swing.JLabel();
        a2 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        d2 = new javax.swing.JRadioButton();
        no3 = new javax.swing.JLabel();
        a3 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        d3 = new javax.swing.JRadioButton();
        no4 = new javax.swing.JLabel();
        a4 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        d4 = new javax.swing.JRadioButton();
        no5 = new javax.swing.JLabel();
        a5 = new javax.swing.JRadioButton();
        b5 = new javax.swing.JRadioButton();
        c5 = new javax.swing.JRadioButton();
        d5 = new javax.swing.JRadioButton();
        no6 = new javax.swing.JLabel();
        a6 = new javax.swing.JRadioButton();
        b6 = new javax.swing.JRadioButton();
        c6 = new javax.swing.JRadioButton();
        d6 = new javax.swing.JRadioButton();
        no7 = new javax.swing.JLabel();
        a7 = new javax.swing.JRadioButton();
        b7 = new javax.swing.JRadioButton();
        c7 = new javax.swing.JRadioButton();
        d7 = new javax.swing.JRadioButton();
        no8 = new javax.swing.JLabel();
        a8 = new javax.swing.JRadioButton();
        b8 = new javax.swing.JRadioButton();
        c8 = new javax.swing.JRadioButton();
        d8 = new javax.swing.JRadioButton();
        no9 = new javax.swing.JLabel();
        a9 = new javax.swing.JRadioButton();
        b9 = new javax.swing.JRadioButton();
        c9 = new javax.swing.JRadioButton();
        d9 = new javax.swing.JRadioButton();
        no10 = new javax.swing.JLabel();
        a10 = new javax.swing.JRadioButton();
        b10 = new javax.swing.JRadioButton();
        c10 = new javax.swing.JRadioButton();
        d10 = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PenampilSoal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PenampilSoal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 153)));
        jScrollPane1.setViewportView(PenampilSoal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 547, 442));

        pilihMateri.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pilihMateri.setText("Pilih Materi :");
        getContentPane().add(pilihMateri, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, 30));

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumatra", "Jawa", "Kalimantan", "Nusa Tenggara", "Sulawesi", "Maluku", "Papua" }));
        getContentPane().add(pilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 115, -1));

        tompil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tompil.setText("Pilih");
        tompil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tompilActionPerformed(evt);
            }
        });
        getContentPane().add(tompil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, 30));

        jawab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jawab.setText("Pilihan Jawaban :");
        getContentPane().add(jawab, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        no1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no1.setText("1.");
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        a1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a1.setText("A");
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        b1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b1.setText("B");
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        c1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c1.setText("C");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, -1, -1));

        d1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d1.setText("D");
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, -1, -1));

        no2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no2.setText("2");
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        a2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a2.setText("A");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        b2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b2.setText("B");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, -1));

        c2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c2.setText("C");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        d2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d2.setText("D");
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 170, -1, -1));

        no3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no3.setText("3.");
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, -1, -1));

        a3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a3.setText("A");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        b3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b3.setText("B");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, -1, -1));

        c3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c3.setText("C");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, -1, -1));

        d3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d3.setText("D");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        no4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no4.setText("4.");
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        a4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a4.setText("A");
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, -1, -1));

        b4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b4.setText("B");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        c4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c4.setText("C");
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, -1, -1));

        d4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d4.setText("D");
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, -1, -1));

        no5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no5.setText("5.");
        getContentPane().add(no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        a5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a5.setText("A");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));

        b5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b5.setText("B");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, -1, -1));

        c5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c5.setText("C");
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, -1, -1));

        d5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d5.setText("D");
        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });
        getContentPane().add(d5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, -1, -1));

        no6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no6.setText("6.");
        getContentPane().add(no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        a6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a6.setText("A");
        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));

        b6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b6.setText("B");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        c6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c6.setText("C");
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, -1, -1));

        d6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d6.setText("D");
        d6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d6ActionPerformed(evt);
            }
        });
        getContentPane().add(d6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 330, -1, -1));

        no7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no7.setText("7.");
        getContentPane().add(no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));

        a7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a7.setText("A");
        a7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        b7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b7.setText("B");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, -1, -1));

        c7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c7.setText("C");
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        d7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d7.setText("D");
        d7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d7ActionPerformed(evt);
            }
        });
        getContentPane().add(d7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, -1, -1));

        no8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no8.setText("8.");
        getContentPane().add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        a8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a8.setText("A");
        a8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        getContentPane().add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        b8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b8.setText("B");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        c8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c8.setText("C");
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, -1, -1));

        d8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d8.setText("D");
        d8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d8ActionPerformed(evt);
            }
        });
        getContentPane().add(d8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, -1, -1));

        no9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no9.setText("9.");
        getContentPane().add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, -1));

        a9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a9.setText("A");
        a9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });
        getContentPane().add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, -1));

        b9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b9.setText("B");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));

        c9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c9.setText("C");
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, -1, -1));

        d9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d9.setText("D");
        d9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d9ActionPerformed(evt);
            }
        });
        getContentPane().add(d9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, -1, -1));

        no10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        no10.setText("10.");
        getContentPane().add(no10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, -1));

        a10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        a10.setText("A");
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });
        getContentPane().add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, -1, -1));

        b10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        b10.setText("B");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, -1, -1));

        c10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        c10.setText("C");
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });
        getContentPane().add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, -1, -1));

        d10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        d10.setText("D");
        d10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d10ActionPerformed(evt);
            }
        });
        getContentPane().add(d10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, -1, -1));

        submit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quiz Budaya");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Nusantara");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 190, -1));

        jBack.setBackground(new java.awt.Color(255, 255, 255));
        jBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-to-filled-50.png"))); // NOI18N
        jBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBackMouseClicked(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/36924104622_1e269518dd_o.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a4ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a6ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a7ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c7ActionPerformed

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a8ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c9ActionPerformed

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c10ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a10ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(pilihan.getSelectedItem().equals("Sumatra")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 0;
            }
            if (b1.isSelected()){
                point1 = 0;
            }
            if (c1.isSelected()){
                point1 = 0;
            }
            if (d1.isSelected()){
                point1 = 10;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 0;
            }
            if (b2.isSelected()){
                point2 = 0;
            }
            if (c2.isSelected()){
                point2 = 10;
            }
            if (d2.isSelected()){
                point2 = 0;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 0;
            }
            if (b3.isSelected()){
                point3 = 10;
            }
            if (c3.isSelected()){
                point3 = 0;
            }
            if (d3.isSelected()){
                point3 = 0;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 10;
            }
            if (b4.isSelected()){
                point4 = 0;
            }
            if (c4.isSelected()){
                point4 = 0;
            }
            if (d4.isSelected()){
                point4 = 0;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 0;
            }
            if (b5.isSelected()){
                point5 = 0;
            }
            if (c5.isSelected()){
                point5 = 0;
            }
            if (d5.isSelected()){
                point5 = 10;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 0;
            }
            if (b6.isSelected()){
                point6 = 0;
            }
            if (c6.isSelected()){
                point6 = 10;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 0;
            }
            if (b7.isSelected()){
                point7 = 10;
            }
            if (c7.isSelected()){
                point7 = 0;
            }
            if (d7.isSelected()){
                point7 = 0;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 10;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 0;
            }
            if (d8.isSelected()){
                point8 = 0;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 0;
            }
            if (b9.isSelected()){
                point9 = 10;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 0;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 0;
            }
            if (b10.isSelected()){
                point10 = 10;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }
         if(pilihan.getSelectedItem().equals("Jawa")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 10;
            }
            if (b1.isSelected()){
                point1 = 0;
            }
            if (c1.isSelected()){
                point1 = 0;
            }
            if (d1.isSelected()){
                point1 = 0;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 0;
            }
            if (b2.isSelected()){
                point2 = 10;
            }
            if (c2.isSelected()){
                point2 = 0;
            }
            if (d2.isSelected()){
                point2 = 0;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 0;
            }
            if (b3.isSelected()){
                point3 = 0;
            }
            if (c3.isSelected()){
                point3 = 10;
            }
            if (d3.isSelected()){
                point3 = 0;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 0;
            }
            if (b4.isSelected()){
                point4 = 0;
            }
            if (c4.isSelected()){
                point4 = 0;
            }
            if (d4.isSelected()){
                point4 = 10;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 10;
            }
            if (b5.isSelected()){
                point5 = 0;
            }
            if (c5.isSelected()){
                point5 = 0;
            }
            if (d5.isSelected()){
                point5 = 0;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 0;
            }
            if (b6.isSelected()){
                point6 = 10;
            }
            if (c6.isSelected()){
                point6 = 0;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 0;
            }
            if (b7.isSelected()){
                point7 = 0;
            }
            if (c7.isSelected()){
                point7 = 10;
            }
            if (d7.isSelected()){
                point7 = 0;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 0;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 0;
            }
            if (d8.isSelected()){
                point8 = 10;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 10;
            }
            if (b9.isSelected()){
                point9 = 0;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 0;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 10;
            }
            if (b10.isSelected()){
                point10 = 0;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }
         if(pilihan.getSelectedItem().equals("Kalimantan")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 0;
            }
            if (b1.isSelected()){
                point1 = 0;
            }
            if (c1.isSelected()){
                point1 = 10;
            }
            if (d1.isSelected()){
                point1 = 0;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 10;
            }
            if (b2.isSelected()){
                point2 = 0;
            }
            if (c2.isSelected()){
                point2 = 0;
            }
            if (d2.isSelected()){
                point2 = 0;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 0;
            }
            if (b3.isSelected()){
                point3 = 0;
            }
            if (c3.isSelected()){
                point3 = 10;
            }
            if (d3.isSelected()){
                point3 = 0;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 10;
            }
            if (b4.isSelected()){
                point4 = 0;
            }
            if (c4.isSelected()){
                point4 = 0;
            }
            if (d4.isSelected()){
                point4 = 0;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 0;
            }
            if (b5.isSelected()){
                point5 = 10;
            }
            if (c5.isSelected()){
                point5 = 0;
            }
            if (d5.isSelected()){
                point5 = 0;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 0;
            }
            if (b6.isSelected()){
                point6 = 10;
            }
            if (c6.isSelected()){
                point6 = 0;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 0;
            }
            if (b7.isSelected()){
                point7 = 0;
            }
            if (c7.isSelected()){
                point7 = 0;
            }
            if (d7.isSelected()){
                point7 = 10;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 0;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 0;
            }
            if (d8.isSelected()){
                point8 = 10;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 0;
            }
            if (b9.isSelected()){
                point9 = 0;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 10;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 0;
            }
            if (b10.isSelected()){
                point10 = 10;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }
         if(pilihan.getSelectedItem().equals("Nusa Tenggara")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 0;
            }
            if (b1.isSelected()){
                point1 = 10;
            }
            if (c1.isSelected()){
                point1 = 0;
            }
            if (d1.isSelected()){
                point1 = 0;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 10;
            }
            if (b2.isSelected()){
                point2 = 0;
            }
            if (c2.isSelected()){
                point2 = 0;
            }
            if (d2.isSelected()){
                point2 = 0;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 10;
            }
            if (b3.isSelected()){
                point3 = 0;
            }
            if (c3.isSelected()){
                point3 = 0;
            }
            if (d3.isSelected()){
                point3 = 0;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 10;
            }
            if (b4.isSelected()){
                point4 = 0;
            }
            if (c4.isSelected()){
                point4 = 0;
            }
            if (d4.isSelected()){
                point4 = 0;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 0;
            }
            if (b5.isSelected()){
                point5 = 0;
            }
            if (c5.isSelected()){
                point5 = 0;
            }
            if (d5.isSelected()){
                point5 = 10;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 0;
            }
            if (b6.isSelected()){
                point6 = 10;
            }
            if (c6.isSelected()){
                point6 = 0;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 0;
            }
            if (b7.isSelected()){
                point7 = 0;
            }
            if (c7.isSelected()){
                point7 = 10;
            }
            if (d7.isSelected()){
                point7 = 0;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 0;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 10;
            }
            if (d8.isSelected()){
                point8 = 10;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 0;
            }
            if (b9.isSelected()){
                point9 = 0;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 10;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 0;
            }
            if (b10.isSelected()){
                point10 = 10;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }
         if(pilihan.getSelectedItem().equals("Sulawesi")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 10;
            }
            if (b1.isSelected()){
                point1 = 0;
            }
            if (c1.isSelected()){
                point1 = 0;
            }
            if (d1.isSelected()){
                point1 = 0;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 0;
            }
            if (b2.isSelected()){
                point2 = 0;
            }
            if (c2.isSelected()){
                point2 = 0;
            }
            if (d2.isSelected()){
                point2 = 10;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 0;
            }
            if (b3.isSelected()){
                point3 = 10;
            }
            if (c3.isSelected()){
                point3 = 0;
            }
            if (d3.isSelected()){
                point3 = 0;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 0;
            }
            if (b4.isSelected()){
                point4 = 0;
            }
            if (c4.isSelected()){
                point4 = 10;
            }
            if (d4.isSelected()){
                point4 = 0;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 10;
            }
            if (b5.isSelected()){
                point5 = 0;
            }
            if (c5.isSelected()){
                point5 = 0;
            }
            if (d5.isSelected()){
                point5 = 0;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 0;
            }
            if (b6.isSelected()){
                point6 = 0;
            }
            if (c6.isSelected()){
                point6 = 10;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 10;
            }
            if (b7.isSelected()){
                point7 = 0;
            }
            if (c7.isSelected()){
                point7 = 0;
            }
            if (d7.isSelected()){
                point7 = 0;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 0;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 0;
            }
            if (d8.isSelected()){
                point8 = 10;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 0;
            }
            if (b9.isSelected()){
                point9 = 0;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 10;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 10;
            }
            if (b10.isSelected()){
                point10 = 0;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }
         if(pilihan.getSelectedItem().equals("Maluku")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 0;
            }
            if (b1.isSelected()){
                point1 = 0;
            }
            if (c1.isSelected()){
                point1 = 0;
            }
            if (d1.isSelected()){
                point1 = 10;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 10;
            }
            if (b2.isSelected()){
                point2 = 0;
            }
            if (c2.isSelected()){
                point2 = 0;
            }
            if (d2.isSelected()){
                point2 = 0;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 0;
            }
            if (b3.isSelected()){
                point3 = 0;
            }
            if (c3.isSelected()){
                point3 = 0;
            }
            if (d3.isSelected()){
                point3 = 10;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 0;
            }
            if (b4.isSelected()){
                point4 = 10;
            }
            if (c4.isSelected()){
                point4 = 0;
            }
            if (d4.isSelected()){
                point4 = 0;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 0;
            }
            if (b5.isSelected()){
                point5 = 10;
            }
            if (c5.isSelected()){
                point5 = 0;
            }
            if (d5.isSelected()){
                point5 = 0;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 10;
            }
            if (b6.isSelected()){
                point6 = 0;
            }
            if (c6.isSelected()){
                point6 = 0;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 0;
            }
            if (b7.isSelected()){
                point7 = 0;
            }
            if (c7.isSelected()){
                point7 = 10;
            }
            if (d7.isSelected()){
                point7 = 0;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 0;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 10;
            }
            if (d8.isSelected()){
                point8 = 0;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 0;
            }
            if (b9.isSelected()){
                point9 = 10;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 0;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 0;
            }
            if (b10.isSelected()){
                point10 = 10;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }
         if(pilihan.getSelectedItem().equals("Papua")){
            int point1 = 0;
            if (a1.isSelected()){
                point1 = 0;
            }
            if (b1.isSelected()){
                point1 = 0;
            }
            if (c1.isSelected()){
                point1 = 0;
            }
            if (d1.isSelected()){
                point1 = 10;
            }
            int point2 = 0;
            if (a2.isSelected()){
                point2 = 0;
            }
            if (b2.isSelected()){
                point2 = 0;
            }
            if (c2.isSelected()){
                point2 = 10;
            }
            if (d2.isSelected()){
                point2 = 0;
            }
             int point3 = 0;
            if (a3.isSelected()){
                point3 = 10;
            }
            if (b3.isSelected()){
                point3 = 0;
            }
            if (c3.isSelected()){
                point3 = 0;
            }
            if (d3.isSelected()){
                point3 = 0;
            }
            int point4 = 0;
            if (a4.isSelected()){
                point4 = 0;
            }
            if (b4.isSelected()){
                point4 = 0;
            }
            if (c4.isSelected()){
                point4 = 10;
            }
            if (d4.isSelected()){
                point4 = 0;
            }
            int point5 = 0;
            if (a5.isSelected()){
                point5 = 0;
            }
            if (b5.isSelected()){
                point5 = 0;
            }
            if (c5.isSelected()){
                point5 = 10;
            }
            if (d5.isSelected()){
                point5 = 0;
            }
            int point6 = 0;
            if (a6.isSelected()){
                point6 = 0;
            }
            if (b6.isSelected()){
                point6 = 10;
            }
            if (c6.isSelected()){
                point6 = 0;
            }
            if (d6.isSelected()){
                point6 = 0;
            }
            int point7 = 0;
            if (a7.isSelected()){
                point7 = 0;
            }
            if (b7.isSelected()){
                point7 = 10;
            }
            if (c7.isSelected()){
                point7 = 0;
            }
            if (d7.isSelected()){
                point7 = 0;
            }
            int point8 = 0;
            if (a8.isSelected()){
                point8 = 10;
            }
            if (b8.isSelected()){
                point8 = 0;
            }
            if (c8.isSelected()){
                point8 = 0;
            }
            if (d8.isSelected()){
                point8 = 0;
            }
            int point9 = 0;
            if (a9.isSelected()){
                point9 = 10;
            }
            if (b9.isSelected()){
                point9 = 0;
            }
            if (c9.isSelected()){
                point9 = 0;
            }
            if (d9.isSelected()){
                point9 = 0;
            }
            int point10 = 0;
            if (a10.isSelected()){
                point10 = 0;
            }
            if (b10.isSelected()){
                point10 = 10;
            }
            if (c10.isSelected()){
                point10 = 0;
            }
            if (d10.isSelected()){
                point10 = 0;
            }
            int jumlah1 = (point1+point2+point3+point4+point5+point6+point7+point8+point9+point10);
            javax.swing.JOptionPane.showMessageDialog (JFQuiz.this, "Nilai Anda " + jumlah1);
        }         

    }//GEN-LAST:event_submitActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d4ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d3ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d5ActionPerformed

    private void d7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d7ActionPerformed

    private void d6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d6ActionPerformed

    private void d9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d9ActionPerformed

    private void d10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d10ActionPerformed

    private void d8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d8ActionPerformed

    private void tompilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tompilActionPerformed
        jScrollPane1.setVisible(true);
        jawab.setVisible(true);
        no1.setVisible(true);
        a1.setVisible(true);
        b1.setVisible(true);
        c1.setVisible(true);
        d1.setVisible(true);
        no2.setVisible(true);
        a2.setVisible(true);
        b2.setVisible(true);
        c2.setVisible(true);
        d2.setVisible(true);
        no3.setVisible(true);
        a3.setVisible(true);
        b3.setVisible(true);
        c3.setVisible(true);
        d3.setVisible(true);
        no4.setVisible(true);
        a4.setVisible(true);
        b4.setVisible(true);
        c4.setVisible(true);
        d4.setVisible(true);
        no5.setVisible(true);
        a5.setVisible(true);
        b5.setVisible(true);
        c5.setVisible(true);
        d5.setVisible(true);
        no6.setVisible(true);
        a6.setVisible(true);
        b6.setVisible(true);
        c6.setVisible(true);
        d6.setVisible(true);
        no7.setVisible(true);
        a7.setVisible(true);
        b7.setVisible(true);
        c7.setVisible(true);
        d7.setVisible(true);
        no8.setVisible(true);
        a8.setVisible(true);
        b8.setVisible(true);
        c8.setVisible(true);
        d8.setVisible(true);
        no9.setVisible(true);
        a9.setVisible(true);
        b9.setVisible(true);
        c9.setVisible(true);
        d9.setVisible(true);
        no10.setVisible(true);
        a10.setVisible(true);
        b10.setVisible(true);
        c10.setVisible(true);
        d10.setVisible(true);
        submit.setVisible(true);
        if(pilihan.getSelectedItem().equals("Sumatra")){
            PenampilSoal.setText(sumatra);
        }
        if(pilihan.getSelectedItem().equals("Jawa")){
            PenampilSoal.setText(jawa);
        }
        if(pilihan.getSelectedItem().equals("Kalimantan")){
            PenampilSoal.setText(kalimantan);
        }
        if(pilihan.getSelectedItem().equals("Nusa Tenggara")){
            PenampilSoal.setText(nusatenggara);
        }
        if(pilihan.getSelectedItem().equals("Sulawesi")){
            PenampilSoal.setText(sulawesi);
        }
        if(pilihan.getSelectedItem().equals("Maluku")){
            PenampilSoal.setText(maluku);
        }
        if(pilihan.getSelectedItem().equals("Papua")){
            PenampilSoal.setText(papua);
        }
    }//GEN-LAST:event_tompilActionPerformed

    private void jBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBackMouseClicked
        // TODO add your handling code here:
        JFrame1 m = new JFrame1();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBackMouseClicked

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
            java.util.logging.Logger.getLogger(JFQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PenampilSoal;
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton a10;
    private javax.swing.JRadioButton a2;
    private javax.swing.JRadioButton a3;
    private javax.swing.JRadioButton a4;
    private javax.swing.JRadioButton a5;
    private javax.swing.JRadioButton a6;
    private javax.swing.JRadioButton a7;
    private javax.swing.JRadioButton a8;
    private javax.swing.JRadioButton a9;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b10;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton b5;
    private javax.swing.JRadioButton b6;
    private javax.swing.JRadioButton b7;
    private javax.swing.JRadioButton b8;
    private javax.swing.JRadioButton b9;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c10;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton c5;
    private javax.swing.JRadioButton c6;
    private javax.swing.JRadioButton c7;
    private javax.swing.JRadioButton c8;
    private javax.swing.JRadioButton c9;
    private javax.swing.JRadioButton d1;
    private javax.swing.JRadioButton d10;
    private javax.swing.JRadioButton d2;
    private javax.swing.JRadioButton d3;
    private javax.swing.JRadioButton d4;
    private javax.swing.JRadioButton d5;
    private javax.swing.JRadioButton d6;
    private javax.swing.JRadioButton d7;
    private javax.swing.JRadioButton d8;
    private javax.swing.JRadioButton d9;
    private javax.swing.JButton jBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jawab;
    private javax.swing.JLabel no1;
    private javax.swing.JLabel no10;
    private javax.swing.JLabel no2;
    private javax.swing.JLabel no3;
    private javax.swing.JLabel no4;
    private javax.swing.JLabel no5;
    private javax.swing.JLabel no6;
    private javax.swing.JLabel no7;
    private javax.swing.JLabel no8;
    private javax.swing.JLabel no9;
    private javax.swing.JLabel pilihMateri;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JButton submit;
    private javax.swing.JButton tompil;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8_Hand_With_Pen_48px.png")));
    }
}
