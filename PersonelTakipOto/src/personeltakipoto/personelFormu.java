/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipoto;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author sabir
 */
public class personelFormu extends javax.swing.JFrame {

    private personel personel = new personel();
    private personelYonetim personelYonetim = new personelYonetim();
    private int personeID;
    public int terfiId;

    private void listele() {
        personelFormTablo.setModel(personelYonetim.Listele());
          personelFormTablo.getColumnModel().getColumn(0).setMinWidth(0);
        personelFormTablo.getColumnModel().getColumn(0).setMaxWidth(0);
        
        personelFormTablo.getColumnModel().getColumn(13).setMinWidth(0);
        personelFormTablo.getColumnModel().getColumn(13).setMaxWidth(0);
        
        
        personelFormTablo.getColumnModel().getColumn(6).setMinWidth(0);
        personelFormTablo.getColumnModel().getColumn(6).setMaxWidth(0);
        
        
        personelFormTablo.getColumnModel().getColumn(7).setMinWidth(0);
        personelFormTablo.getColumnModel().getColumn(7).setMaxWidth(0);
    }

    public personelFormu() {
        initComponents();
        listele();
      
       
        
    }

    private void temizle() {
        txtPersonelTckn.setText("");
        txtPersonelAd.setText("");
        txtPersonelSoyad.setText("");
        txtPersonelTelefon.setText("");
        txtPersonelEmail.setText("");
        txtPersonelDogumTarihi.setText("");
        txtPersonelBaslamaTarihi.setText("");
        txtPersonelAdliSicil.setSelectedIndex(0);
        txtPersonelAskerlik.setSelectedIndex(0);
        txtPersonelKangrubu.setSelectedIndex(0);
        txtpersonelTerfi.setText("");
        terfiId = 0;
        txtPersonelAdres.setText("");
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
        jLabel6 = new javax.swing.JLabel();
        txtPersonelTckn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPersonelAd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPersonelSoyad = new javax.swing.JTextField();
        txtPersonelTelefon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpersonelTerfi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPersonelEmail = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        txtPersonelAdliSicil = new javax.swing.JComboBox<>();
        txtPersonelAskerlik = new javax.swing.JComboBox<>();
        txtPersonelKangrubu = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtPersonelDogumTarihi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPersonelBaslamaTarihi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPersonelAdres = new javax.swing.JTextField();
        btnKapat1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personelFormTablo = new javax.swing.JTable(){

            public boolean isCellEditable(int i, int i1) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("TCKN :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        txtPersonelTckn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelTckn.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelTckn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPersonelTckn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPersonelTcknKeyPressed(evt);
            }
        });
        jPanel1.add(txtPersonelTckn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("AD :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        txtPersonelAd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelAd.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelAd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("SOYAD :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        txtPersonelSoyad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelSoyad.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelSoyad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, 30));

        txtPersonelTelefon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelTelefon.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelTelefon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelTelefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("TELEFON :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("TERFİ :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        txtpersonelTerfi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtpersonelTerfi.setForeground(new java.awt.Color(153, 153, 153));
        txtpersonelTerfi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtpersonelTerfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, 30));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 26, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("EMAİL :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        txtPersonelEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, 30));

        btnEkle.setText("EKLE");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        jPanel1.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 90, 40));

        btnSil.setText("SİL");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel1.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 80, 40));

        btnGuncelle.setText("GÜNCELLE");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, 40));

        txtPersonelAdliSicil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sabıkalı", "Sabıkasız" }));
        jPanel1.add(txtPersonelAdliSicil, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 170, 30));

        txtPersonelAskerlik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Askerlik Çağında Değil", "Muaf", "Belirsiz", "Tecilli", " " }));
        jPanel1.add(txtPersonelAskerlik, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 170, 30));

        txtPersonelKangrubu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O−", "O+", "A+", "B−", "B+", "AB−", "AB+" }));
        jPanel1.add(txtPersonelKangrubu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 170, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("D.TARİHİ :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, -1));

        txtPersonelDogumTarihi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelDogumTarihi.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelDogumTarihi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelDogumTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 170, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("BAŞLAMA T:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 90, -1));

        txtPersonelBaslamaTarihi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelBaslamaTarihi.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelBaslamaTarihi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelBaslamaTarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 170, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("ADLİ SİCİL :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("ASKERLİK :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 90, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("KAN :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 70, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ADRES :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, -1));

        txtPersonelAdres.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPersonelAdres.setForeground(new java.awt.Color(153, 153, 153));
        txtPersonelAdres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPersonelAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 460, 50));

        btnKapat1.setText("KAPAT");
        btnKapat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapat1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnKapat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 80, 40));

        personelFormTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        personelFormTablo.setFocusable(false);
        personelFormTablo.setIntercellSpacing(new java.awt.Dimension(0, 0));
        personelFormTablo.setRowHeight(25);
        personelFormTablo.setSelectionBackground(new java.awt.Color(232, 57, 95));
        personelFormTablo.setShowHorizontalLines(false);
        personelFormTablo.getTableHeader().setReorderingAllowed(false);
        personelFormTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personelFormTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personelFormTablo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 950, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 550));

        setSize(new java.awt.Dimension(954, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        terfiFormu terfiformu = new terfiFormu(this);
        terfiformu.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed

        if (txtPersonelTckn.getText().trim().equals("") || txtPersonelAd.getText().trim().equals("") || txtPersonelSoyad.getText().trim().equals("") || txtPersonelTelefon.getText().trim().equals("") || txtPersonelEmail.getText().trim().equals("") || txtPersonelDogumTarihi.getText().trim().equals("") || txtPersonelBaslamaTarihi.getText().trim().equals("") || txtPersonelAdres.getText().trim().equals("") || txtpersonelTerfi.getText().trim().equals("")) 
        {
            System.out.println("boş alan bırakmayın");
        } 
        else {
            if(txtPersonelTckn.getText().length()==11){
                 personel.setTckn(txtPersonelTckn.getText());
            personel.setAd(txtPersonelAd.getText());
            personel.setSoyad(txtPersonelSoyad.getText());
            personel.setTelefon(txtPersonelTelefon.getText());
            personel.setEmail(txtPersonelEmail.getText());
            personel.setDogumtarihi(txtPersonelDogumTarihi.getText());
            personel.setBaslamaTarihi(txtPersonelBaslamaTarihi.getText());
            personel.setAdlisicilKaydı((String) txtPersonelAdliSicil.getSelectedItem());
            personel.setAskerlikDurumu((String) txtPersonelAskerlik.getSelectedItem());
            personel.setKangrubu((String) txtPersonelKangrubu.getSelectedItem());
            personel.setTerfiid(terfiId);
            personel.setAdres(txtPersonelAdres.getText());

            personelYonetim.Ekle(personel);
            listele();
            personelYonetim.temizle(personel);
            temizle();
            }
            else{
                System.out.println("TC NO 11 HANE GİR");
            }

           

        }

    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed

        if (txtPersonelTckn.getText().trim().equals("") || txtPersonelAd.getText().trim().equals("")
                || txtPersonelSoyad.getText().trim().equals("") || txtPersonelTelefon.getText().trim().equals("")
                || txtPersonelEmail.getText().trim().equals("") || txtPersonelDogumTarihi.getText().trim().equals("") || txtPersonelBaslamaTarihi.getText().trim().equals("")
                || txtPersonelAdres.getText().trim().equals("") || txtpersonelTerfi.getText().trim().equals("")) {
            System.out.println("boş alan bırakmayın");
        } else {

            personel.setTckn(txtPersonelTckn.getText());
            personel.setAd(txtPersonelAd.getText());
            personel.setSoyad(txtPersonelSoyad.getText());
            personel.setTelefon(txtPersonelTelefon.getText());
            personel.setEmail(txtPersonelEmail.getText());
            personel.setDogumtarihi(txtPersonelDogumTarihi.getText());
            personel.setBaslamaTarihi(txtPersonelBaslamaTarihi.getText());
            personel.setAdlisicilKaydı((String) txtPersonelAdliSicil.getSelectedItem());
            personel.setAskerlikDurumu((String) txtPersonelAskerlik.getSelectedItem());
            personel.setKangrubu((String) txtPersonelKangrubu.getSelectedItem());
            personel.setTerfiid(terfiId);
            personel.setAdres(txtPersonelAdres.getText());
            personel.setPersonelid(personeID);

            personelYonetim.Guncelle(personel);
            listele();
            System.out.println("burası çalışıyor denememememee" + personel.getTckn() );
            
            personelYonetim.temizle(personel);
            temizle();
            

        }

    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

        personelYonetim.Sil(personeID);
        listele();
        personelYonetim.temizle(personel);
        temizle();

    }//GEN-LAST:event_btnSilActionPerformed

    private void personelFormTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personelFormTabloMouseClicked

        personeID = (int) (personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 0));
        if (evt.getClickCount() == 2) {
            personeID = (int) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 0);
            txtPersonelTckn.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 1));
            txtPersonelAd.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 2));
            txtPersonelSoyad.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 3));
            txtPersonelTelefon.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 4));
            txtPersonelEmail.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 5));
            txtPersonelDogumTarihi.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 6));
            txtPersonelBaslamaTarihi.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 7));
            txtPersonelAdliSicil.setSelectedItem((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 8));
            txtPersonelAskerlik.setSelectedItem((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 9));
            txtPersonelKangrubu.setSelectedItem((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 10));
            txtpersonelTerfi.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 11));
            txtPersonelAdres.setText((String) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 12));
            terfiId = ((int) personelFormTablo.getValueAt(personelFormTablo.getSelectedRow(), 13));
            System.out.println(terfiId);
            System.out.println(personeID);
        }

    }//GEN-LAST:event_personelFormTabloMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosed

    private void btnKapat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapat1ActionPerformed
        this.setVisible(false);
       this.hide();
    }//GEN-LAST:event_btnKapat1ActionPerformed

    private void txtPersonelTcknKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonelTcknKeyPressed
        
    }//GEN-LAST:event_txtPersonelTcknKeyPressed

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
            java.util.logging.Logger.getLogger(personelFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personelFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personelFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personelFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personelFormu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnKapat1;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personelFormTablo;
    private javax.swing.JTextField txtPersonelAd;
    private javax.swing.JComboBox<String> txtPersonelAdliSicil;
    private javax.swing.JTextField txtPersonelAdres;
    private javax.swing.JComboBox<String> txtPersonelAskerlik;
    private javax.swing.JTextField txtPersonelBaslamaTarihi;
    private javax.swing.JTextField txtPersonelDogumTarihi;
    public javax.swing.JTextField txtPersonelEmail;
    private javax.swing.JComboBox<String> txtPersonelKangrubu;
    private javax.swing.JTextField txtPersonelSoyad;
    private javax.swing.JTextField txtPersonelTckn;
    private javax.swing.JTextField txtPersonelTelefon;
    public javax.swing.JTextField txtpersonelTerfi;
    // End of variables declaration//GEN-END:variables
}