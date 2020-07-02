package Main;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFrame1 extends javax.swing.JFrame {

    private String Jabar;
    private JButton Sumatra;
    private JButton Sum;
    private String Aceh;
    public int pJbtn;

    public JFrame1() {
        initComponents();
        jBQuiz.setVisible(false);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        setIcon();
        this.setLocationRelativeTo(null);
        this.setTitle("BuNus - Budaya Nusantara");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSum = new javax.swing.JButton();
        jJaw = new javax.swing.JButton();
        jNus = new javax.swing.JButton();
        jKal = new javax.swing.JButton();
        JSul = new javax.swing.JButton();
        jMal = new javax.swing.JButton();
        jPap = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBQuiz = new javax.swing.JButton();
        JOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BuNus");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Budaya");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSum.setBackground(new java.awt.Color(255, 0, 0));
        jSum.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jSum.setForeground(new java.awt.Color(255, 255, 255));
        jSum.setText("Sumatra");
        jSum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSumMouseClicked(evt);
            }
        });
        jSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumActionPerformed(evt);
            }
        });
        jPanel3.add(jSum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, 70));

        jJaw.setBackground(new java.awt.Color(204, 0, 0));
        jJaw.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jJaw.setForeground(new java.awt.Color(255, 255, 255));
        jJaw.setText("Jawa");
        jJaw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jJawMouseClicked(evt);
            }
        });
        jPanel3.add(jJaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 240, 70));

        jNus.setBackground(new java.awt.Color(204, 0, 0));
        jNus.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jNus.setForeground(new java.awt.Color(255, 255, 255));
        jNus.setText("Kep. Nusa Tenggara");
        jNus.setPreferredSize(new java.awt.Dimension(240, 40));
        jNus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNusMouseClicked(evt);
            }
        });
        jNus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNusActionPerformed(evt);
            }
        });
        jPanel3.add(jNus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, 70));

        jKal.setBackground(new java.awt.Color(204, 0, 0));
        jKal.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jKal.setForeground(new java.awt.Color(255, 255, 255));
        jKal.setText("Kalimantan");
        jKal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jKalMouseClicked(evt);
            }
        });
        jKal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKalActionPerformed(evt);
            }
        });
        jPanel3.add(jKal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 240, 70));

        JSul.setBackground(new java.awt.Color(204, 0, 0));
        JSul.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        JSul.setForeground(new java.awt.Color(255, 255, 255));
        JSul.setText("Sulawesi");
        JSul.setPreferredSize(new java.awt.Dimension(238, 40));
        JSul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSulMouseClicked(evt);
            }
        });
        JSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSulActionPerformed(evt);
            }
        });
        jPanel3.add(JSul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 240, 70));

        jMal.setBackground(new java.awt.Color(204, 0, 0));
        jMal.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jMal.setForeground(new java.awt.Color(255, 255, 255));
        jMal.setText("Kepulauan Maluku");
        jMal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMalMouseClicked(evt);
            }
        });
        jPanel3.add(jMal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 240, 70));

        jPap.setBackground(new java.awt.Color(255, 0, 0));
        jPap.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jPap.setForeground(new java.awt.Color(255, 255, 255));
        jPap.setText("Papua");
        jPap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPapMouseClicked(evt);
            }
        });
        jPanel3.add(jPap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, 240, 70));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("JBUTTON1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 247, 98));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("JBUTTON2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 210, 247, 98));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("JBUTTON3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 320, 247, 98));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("JBUTTON4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 247, 98));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("JBUTTON5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 247, 98));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("JBUTTON6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 90, 247, 98));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("JBUTTON7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 210, 247, 98));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("JBUTTON8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 320, 247, 98));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 0, 0));
        jButton9.setText("JBUTTON9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 440, 247, 98));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 0, 0));
        jButton10.setText("JBUTTON10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 550, 247, 98));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jBQuiz.setBackground(new java.awt.Color(255, 255, 255));
        jBQuiz.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jBQuiz.setForeground(new java.awt.Color(255, 0, 0));
        jBQuiz.setText("Quiz");
        jBQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuizActionPerformed(evt);
            }
        });
        jPanel3.add(jBQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 670, 180, 80));

        JOut.setBackground(new java.awt.Color(255, 0, 0));
        JOut.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        JOut.setForeground(new java.awt.Color(255, 255, 255));
        JOut.setText("LOGOUT");
        JOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOutMouseClicked(evt);
            }
        });
        JOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOutActionPerformed(evt);
            }
        });
        jPanel3.add(JOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 10, 110, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indonesia__lovelynesia_by_mongkih.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1710, 790));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Nusantara");

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JOutActionPerformed

    private void JOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JOutMouseClicked

        final ImageIcon icon = new ImageIcon("src/aneuk-aceh-transparant-mbkaos.png");
        int input = JOptionPane.showConfirmDialog(null,
            "<html><h1 style='font-family: Calibri; font-size: 36pt;'>Yakin Ingin Keluar " + " ? ", "LOGOUT",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,icon);
        
        switch(input){
            case JOptionPane.YES_OPTION:
            login l = new login();
            l.setVisible(true);
            dispose();
            break;
            case JOptionPane.NO_OPTION:
            break;                
        }
    }//GEN-LAST:event_JOutMouseClicked

    private void jBQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuizActionPerformed
        JFQuiz q = new JFQuiz();
        q.setVisible(true);
        this.setVisible (false);
    }//GEN-LAST:event_jBQuizActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        switch (pJbtn) {
            case 1:
            JFlam l = new JFlam();
            l.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton10ActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        switch (pJbtn) {
            case 1:
            JFbabe bb = new JFbabe();
            bb.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        switch (pJbtn) {
            case 1:
            JFsumsel ss = new JFsumsel();
            ss.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton8ActionPerformed
    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        switch (pJbtn) {
            case 1:
            JFben bn = new JFben();
            bn.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton7ActionPerformed
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        switch (pJbtn) {
            case 1:
            JFjam jm = new JFjam();
            jm.setVisible(true);
            this.setVisible(false);
            break;
            case 2:
            JFjatim jt = new JFjatim();
            jt.setVisible(true);
            this.setVisible(false);
            break;
            case 5:
            JFgor gr = new JFgor();
            gr.setVisible(true);
            this.setVisible(false);
            break;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        switch (pJbtn) {
            case 1:
            JFkepri kr = new JFkepri();
            kr.setVisible(true);
            this.setVisible(false);
            break;
            case 2:
            JFdiy diy = new JFdiy();
            diy.setVisible(true);
            this.setVisible(false);
            break;
            case 3:
            JFkalut ku = new JFkalut();
            ku.setVisible(true);
            this.setVisible(false);
            break;
            case 5:
            JFsultra str = new JFsultra();
            str.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switch (pJbtn) {
            case 1:
            JFriau r = new JFriau();
            r.setVisible(true);
            this.setVisible(false);
            break;
            case 2:
            JFjateng jt = new JFjateng();
            jt.setVisible(true);
            this.setVisible(false);
            break;
            case 3:
            JFkaltim kt = new JFkaltim();
            kt.setVisible(true);
            this.setVisible(false);
            break;
            case 5:
            JFsulsel sls = new JFsulsel();
            sls.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switch (pJbtn) {
            case 1:
            JFsumbar smb = new JFsumbar();
            smb.setVisible(true);
            this.setVisible(false);
            break;
            case 2:
            JFban bt = new JFban();
            bt.setVisible(true);
            this.setVisible(false);
            break;
            case 3:
            JFkalsel ks = new JFkalsel();
            ks.setVisible(true);
            this.setVisible(false);
            break;
            case 4:
            JFntt ntt = new JFntt();
            ntt.setVisible(true);
            this.setVisible(false);
            break;

            case 5:
            JFsulteng st = new JFsulteng();
            st.setVisible(true);
            this.setVisible(false);
            break;
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch (pJbtn) {
            case 1:
            JFsumut sut = new JFsumut();
            sut.setVisible(true);
            this.setVisible(false);
            break;
            case 2:
            JFjak jk = new JFjak();
            jk.setVisible(true);
            this.setVisible(false);
            break;
            case 3:
            JFkalteng kt = new JFkalteng();
            kt.setVisible(true);
            this.setVisible(false);
            break;
            case 4:
            JFntb ntb = new JFntb();
            ntb.setVisible(true);
            this.setVisible(false);
            break;

            case 5:
            JFsulut sl = new JFsulut();
            sl.setVisible(true);
            this.setVisible(false);
            break;
            case 6:
            JFmalut mu = new JFmalut();
            mu.setVisible(true);
            this.setVisible(false);
            break;
            case 7:
            JFpapbar pb = new JFpapbar();
            pb.setVisible(true);
            this.setVisible(false);
            break;

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        switch (pJbtn) {
            case 1:
            JFac a = new JFac();
            a.setVisible(true);
            this.setVisible(false);
            break;
            case 2:
            JFjabar jb = new JFjabar();
            jb.setVisible(true);
            this.setVisible(false);
            break;
            case 3:
            JFkalbar kb = new JFkalbar();
            kb.setVisible(true);
            this.setVisible(false);
            break;
            case 4:
            JFbali bl = new JFbali();
            bl.setVisible(true);
            this.setVisible(false);
            break;

            case 5:
            JFsulbar sb = new JFsulbar();
            sb.setVisible(true);
            this.setVisible(false);
            break;
            case 6:
            JFmal m = new JFmal();
            m.setVisible(true);
            this.setVisible(false);
            break;
            case 7:
            JFpap p = new JFpap();
            p.setVisible(true);
            this.setVisible(false);
            break;

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPapMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton1.setText("Papua");
        pJbtn = 7;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jButton2.setEnabled(true);
        jButton2.setText("Papua Barat");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
    }//GEN-LAST:event_jPapMouseClicked

    private void jMalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMalMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton1.setText("Maluku");
        pJbtn = 6;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jButton2.setEnabled(true);
        jButton2.setText("Maluku Utara");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
    }//GEN-LAST:event_jMalMouseClicked

    private void JSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSulActionPerformed

    }//GEN-LAST:event_JSulActionPerformed

    private void JSulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSulMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton1.setText("Sulawesi Barat");
        pJbtn = 5;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jButton2.setEnabled(true);
        jButton2.setText("Sulawesi Utara");
        jButton3.setEnabled(true);
        jButton3.setText("Sulawesi Tengah");
        jButton4.setEnabled(true);
        jButton4.setText("Sulawesi Selatan");
        jButton5.setEnabled(true);
        jButton5.setText("Sulawesi Tenggara");
        jButton6.setEnabled(true);
        jButton6.setText("Gorontalo");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
    }//GEN-LAST:event_JSulMouseClicked

    private void jKalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jKalActionPerformed

    private void jKalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jKalMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton1.setText("Kalimantan Barat");
        jButton2.setEnabled(true);
        pJbtn = 3;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jButton2.setText("Kalimantan Tengah");
        jButton3.setEnabled(true);
        jButton3.setText("Kalimantan Selatan");
        jButton4.setEnabled(true);
        jButton4.setText("Kalimantan Timur");
        jButton5.setEnabled(true);
        jButton5.setText("Kalimantan Utara");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
    }//GEN-LAST:event_jKalMouseClicked

    private void jNusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNusActionPerformed

    private void jNusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNusMouseClicked
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        jButton1.setText("Bali");
        pJbtn = 4;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jButton2.setEnabled(true);
        jButton2.setText("Nusa Tenggara Barat");
        jButton3.setEnabled(true);
        jButton3.setText("Nusa Tenggara Timur");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
    }//GEN-LAST:event_jNusMouseClicked

    private void jJawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jJawMouseClicked
 
        jButton1.setEnabled(true);
        jButton1.setText("Jawa Barat");
        pJbtn = 2;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jButton2.setEnabled(true);
        jButton2.setText("DKI Jakarta");
        jButton3.setEnabled(true);
        jButton3.setText("Banten");
        jButton4.setEnabled(true);
        jButton4.setText("Jawa Tengah");
        jButton5.setEnabled(true);
        jButton5.setText("DI Yogyakarta");
        jButton6.setEnabled(true);
        jButton6.setText("Jawa Timur");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
    }//GEN-LAST:event_jJawMouseClicked

    private void jSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSumActionPerformed

    private void jSumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSumMouseClicked
        // TODO add your handling code here:

        jButton1.setEnabled(true);
        jButton1.setText("Nanggroe Aceh Darussalam");
        pJbtn = 1;
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jButton2.setEnabled(true);
        jButton2.setText("Sumatera Utara");
        jButton3.setEnabled(true);
        jButton3.setText("Sumatera Barat");
        jButton4.setEnabled(true);
        jButton4.setText("Riau");
        jButton5.setEnabled(true);
        jButton5.setText("Kepulauan Riau");
        jButton6.setEnabled(true);
        jButton6.setText("Jambi");
        jButton7.setEnabled(true);
        jButton7.setText("Bengkulu");
        jButton8.setEnabled(true);
        jButton8.setText("Sumatera Selatan");
        jButton9.setEnabled(true);
        jButton9.setText("Kep. Bangka Belitung");
        jButton10.setEnabled(true);
        jButton10.setText("Lampung");
        jBQuiz.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton10.setVisible(true);
    }//GEN-LAST:event_jSumMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new JFrame1().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JOut;
    private javax.swing.JButton JSul;
    private javax.swing.JButton jBQuiz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jJaw;
    private javax.swing.JButton jKal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jMal;
    private javax.swing.JButton jNus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jPap;
    private javax.swing.JButton jSum;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Bunus.png")));
    }
}
