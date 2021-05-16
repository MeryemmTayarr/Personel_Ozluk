/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personeltakipoto;

/**
 *
 * @author sabir
 */
public class kullaniciFormu extends javax.swing.JFrame {

    private kullanici kullanici = new kullanici();
    private kullaniciYonetimi kullaniciyonetimi = new kullaniciYonetimi();
    private int kullaniciID;
   
    
    private void listele(){
        
        kullaniciTablosu.setModel(kullaniciyonetimi.Listele());
    }
    
    
    
    public kullaniciFormu() {
        initComponents();
        listele();  
        
    }

    
    private void temizle(){
        txtkullanici.setText("");
        txtparola.setText("");
        txtgizlisoru.setText("");
        txtgizlicevap.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        txtkullanici = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtparola = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtgizlisoru = new javax.swing.JTextField();
        txtgizlicevap = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kullaniciTablosu = new javax.swing.JTable(){
            public boolean isCellEditable(int i, int i1) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kullanıcı :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        txtkullanici.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtkullanici.setForeground(new java.awt.Color(153, 153, 153));
        txtkullanici.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtkullanici, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Parola :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        txtparola.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtparola.setForeground(new java.awt.Color(153, 153, 153));
        txtparola.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtparola, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Gizli Soru :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        txtgizlisoru.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtgizlisoru.setForeground(new java.awt.Color(153, 153, 153));
        txtgizlisoru.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtgizlisoru, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, 30));

        txtgizlicevap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtgizlicevap.setForeground(new java.awt.Color(153, 153, 153));
        txtgizlicevap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtgizlicevap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Gizli Cevap :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        jButton1.setText("EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 30));

        jButton2.setText("SİL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 30));

        jButton3.setText("GÜNCELLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 30));

        kullaniciTablosu.setModel(new javax.swing.table.DefaultTableModel(
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
        kullaniciTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullaniciTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kullaniciTablosu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 390, 220));

        jButton4.setText("KAPAT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        setSize(new java.awt.Dimension(392, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txtkullanici.getText().trim().equals("") || txtparola.getText().trim().equals("") || 
                txtgizlisoru.getText().trim().equals("") || txtgizlicevap.getText().trim().equals(""))
        {
            System.out.println("boş alan bırakmayın");
        }
        else
        {
            kullanici.setKullaniciAdi(txtkullanici.getText());
            kullanici.setParola(txtparola.getText());
            kullanici.setGizliSoru(txtgizlisoru.getText());
            kullanici.setGizliCevap(txtgizlicevap.getText());
            kullaniciyonetimi.Ekle(kullanici);
            listele();
            kullaniciyonetimi.temizle(kullanici);
            temizle();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(txtkullanici.getText().trim().equals("") || txtparola.getText().trim().equals("") || 
                txtgizlisoru.getText().trim().equals("") || txtgizlicevap.getText().trim().equals(""))
        {
            System.out.println("boş alan bırakmayın");
        }
        else
        {
            kullanici.setId(kullaniciID);
            kullanici.setKullaniciAdi(txtkullanici.getText());
            kullanici.setParola(txtparola.getText());
            kullanici.setGizliSoru(txtgizlisoru.getText());
            kullanici.setGizliCevap(txtgizlicevap.getText());
            
            kullaniciyonetimi.Guncelle(kullanici);
            listele();
            kullaniciyonetimi.temizle(kullanici);
            temizle();
            
        }
        
        
            
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       kullaniciyonetimi.Sil(kullaniciID);
       listele();
       kullaniciyonetimi.temizle(kullanici);
       temizle();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void kullaniciTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullaniciTablosuMouseClicked
        
        kullaniciID = (int) (kullaniciTablosu.getValueAt(kullaniciTablosu.getSelectedRow(),0));
        if(evt.getClickCount()==2){
            kullaniciID=(int)kullaniciTablosu.getValueAt(kullaniciTablosu.getSelectedRow(),0);
            txtkullanici.setText((String)kullaniciTablosu.getValueAt(kullaniciTablosu.getSelectedRow(),1));
            txtparola.setText((String)kullaniciTablosu.getValueAt(kullaniciTablosu.getSelectedRow(),2));
            txtgizlisoru.setText((String)kullaniciTablosu.getValueAt(kullaniciTablosu.getSelectedRow(),3));
            txtgizlicevap.setText((String)kullaniciTablosu.getValueAt(kullaniciTablosu.getSelectedRow(),4));
        }
        
    }//GEN-LAST:event_kullaniciTablosuMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setVisible(false);
       this.hide();
    
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(kullaniciFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullaniciFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullaniciFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullaniciFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullaniciFormu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable kullaniciTablosu;
    private javax.swing.JTextField txtgizlicevap;
    private javax.swing.JTextField txtgizlisoru;
    private javax.swing.JTextField txtkullanici;
    private javax.swing.JTextField txtparola;
    // End of variables declaration//GEN-END:variables
}
