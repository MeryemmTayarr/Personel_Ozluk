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
public class terfiFormu extends javax.swing.JFrame {

    
    private terfi terfi = new terfi();
    private terfiyonetimi terfiyonetimi = new terfiyonetimi();
    private int terfiID;
    private personelFormu personelFormu=null;
   
    
    private void listele(){
        
        terfitablo.setModel(terfiyonetimi.Listele());
    }
    
    public terfiFormu(personelFormu personelFormu){
        initComponents();
        listele();
        this.personelFormu = personelFormu;
    }
    
    public terfiFormu() {
        initComponents();
        listele();
    }
    
     
    private void temizle(){
        txtterfitipi.setText("");
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
        txtterfitipi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        terfitablo = new javax.swing.JTable(){
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Terfi Adı :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        txtterfitipi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtterfitipi.setForeground(new java.awt.Color(153, 153, 153));
        txtterfitipi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtterfitipi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 30));

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 70, 30));

        jButton3.setText("Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 30));

        terfitablo.setModel(new javax.swing.table.DefaultTableModel(
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
        terfitablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terfitabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(terfitablo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, 610, 230));

        jButton4.setText("Kapat");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 280));

        setSize(new java.awt.Dimension(616, 283));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtterfitipi.getText().trim().equals(""))
        {
            System.out.println("boş alan bırakmayın");
        }
        else
        {
            terfi.setTerfiTipi(txtterfitipi.getText());
            terfiyonetimi.Ekle(terfi);
            listele();
            terfiyonetimi.temizle(terfi);
            temizle();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         if(txtterfitipi.getText().trim().equals(""))
        {
            System.out.println("boş alan bırakmayın");
        }
        else
        {
            terfi.setTerfiid(terfiID);
            terfi.setTerfiTipi(txtterfitipi.getText());
            terfiyonetimi.Guncelle(terfi);
            listele();
            terfiyonetimi.temizle(terfi);
            temizle();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       terfiyonetimi.Sil(terfiID);
       listele();
       terfiyonetimi.temizle(terfi);
       temizle();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void terfitabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terfitabloMouseClicked
        
        terfiID = (int) (terfitablo.getValueAt(terfitablo.getSelectedRow(),0));
        if(evt.getClickCount()==2)
        {
            if(personelFormu!=null)
            {
                this.personelFormu.terfiId = ((int)terfitablo.getValueAt(terfitablo.getSelectedRow(),0));    
                this.personelFormu.txtpersonelTerfi.setText((String)terfitablo.getValueAt(terfitablo.getSelectedRow(),1));
                this.hide();
            }
            else{
                terfiID=(int)terfitablo.getValueAt(terfitablo.getSelectedRow(),0);
                txtterfitipi.setText((String)terfitablo.getValueAt(terfitablo.getSelectedRow(),1));
        
            }
        }
    }//GEN-LAST:event_terfitabloMouseClicked

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
            java.util.logging.Logger.getLogger(terfiFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(terfiFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(terfiFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(terfiFormu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new terfiFormu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable terfitablo;
    private javax.swing.JTextField txtterfitipi;
    // End of variables declaration//GEN-END:variables
}