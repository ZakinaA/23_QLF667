/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import DAO.InitConnexion;
import DAO.PompierDAO;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import modeles.Pompier;
import modeles.Professionnel;

/**
 *
 * @author noa.hervieu
 */
public class frm_pompier extends javax.swing.JFrame {

    /**
     * Creates new form frm_pompier
     */
    public frm_pompier(Pompier currentPompier) {
        
        initComponents();
        Connection connection = InitConnexion.ouvrirConnexion();
        
        String prenom = currentPompier.getPrenom();
        String nom = currentPompier.getNom();
        String naissance = currentPompier.getDateNaissance();
        String bip = currentPompier.getNumeroBip();

        
        lab_bonjour.setText("Bonjour, " + prenom);
        
        Txt_prenom.setText(prenom);
        Txt_nom.setText(nom);
        Txt_Naissance.setText(naissance);
        Txt_bip.setText(bip);
        
        /*Remplissage de la liste des pompier en responsabilité*/
        
        ArrayList<Professionnel> lesPompierResponsable = PompierDAO.getPompierResponsabilite(connection, currentPompier.getId());
        
        DefaultListModel<String> listid = new DefaultListModel<String>();
        for (int i = 0; i < lesPompierResponsable.size(); i++) {
            listid.addElement(valueOf(lesPompierResponsable.get(i).getId()));
        }
        
        DefaultListModel<String> listNom = new DefaultListModel<String>();
        for (int i = 0; i < lesPompierResponsable.size(); i++) {
            listid.addElement(lesPompierResponsable.get(i).getNom());
        }
        
        DefaultListModel<String> listPrenom = new DefaultListModel<String>();
        for (int i = 0; i < lesPompierResponsable.size(); i++) {
            listid.addElement(lesPompierResponsable.get(i).getPrenom());
        }
        
        DefaultListModel<String> listBip = new DefaultListModel<String>();
        for (int i = 0; i < lesPompierResponsable.size(); i++) {
            listid.addElement(lesPompierResponsable.get(i).getNumeroBip());
        }
        
        
        jList_PompierId.setModel(listid);
        jList_PompierId.setVisible(true);
        
        jList_PompierNom.setModel(listNom);
        jList_PompierNom.setVisible(true);
        
        jList_PompierPrenom.setModel(listPrenom);
        jList_PompierPrenom.setVisible(true);
        
        jList_PompierBip.setModel(listBip);
        jList_PompierBip.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab_bonjour = new javax.swing.JLabel();
        Txt_prenom = new javax.swing.JTextField();
        Lab_Prenom = new javax.swing.JLabel();
        Txt_nom = new javax.swing.JTextField();
        Lab_nom = new javax.swing.JLabel();
        Lab_Naissance = new javax.swing.JLabel();
        Txt_bip = new javax.swing.JTextField();
        Lab_bip = new javax.swing.JLabel();
        Txt_Naissance = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_PompierId = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_PompierNom = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_PompierPrenom = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_PompierBip = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lab_bonjour.setText("jLabel1");

        Txt_prenom.setEditable(false);
        Txt_prenom.setText("jTextField1");
        Txt_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_prenomActionPerformed(evt);
            }
        });

        Lab_Prenom.setText("Prénom : ");

        Txt_nom.setEditable(false);
        Txt_nom.setText("jTextField1");
        Txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_nomActionPerformed(evt);
            }
        });

        Lab_nom.setText("Nom : ");

        Lab_Naissance.setText("Naissance :");

        Txt_bip.setEditable(false);
        Txt_bip.setText("jTextField1");
        Txt_bip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_bipActionPerformed(evt);
            }
        });

        Lab_bip.setText("BIP : ");

        Txt_Naissance.setEditable(false);
        Txt_Naissance.setText("jTextField1");
        Txt_Naissance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NaissanceActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Vous êtes responsable de :");

        jList_PompierId.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList_PompierId);

        jList_PompierNom.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList_PompierNom);

        jList_PompierPrenom.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList_PompierPrenom);

        jList_PompierBip.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList_PompierBip);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lab_bonjour)
                    .addComponent(Lab_Prenom)
                    .addComponent(Txt_bip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab_bip)
                    .addComponent(Txt_Naissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab_nom)
                    .addComponent(Txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lab_Naissance))
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lab_bonjour)
                        .addGap(18, 18, 18)
                        .addComponent(Lab_Prenom)
                        .addGap(5, 5, 5)
                        .addComponent(Txt_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Lab_nom)
                        .addGap(5, 5, 5)
                        .addComponent(Txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Lab_Naissance)
                        .addGap(5, 5, 5)
                        .addComponent(Txt_Naissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Lab_bip)
                        .addGap(5, 5, 5)
                        .addComponent(Txt_bip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_prenomActionPerformed

    private void Txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_nomActionPerformed

    private void Txt_bipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_bipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_bipActionPerformed

    private void Txt_NaissanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NaissanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NaissanceActionPerformed

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
            java.util.logging.Logger.getLogger(frm_pompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_pompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_pompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_pompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_pompier(null).setVisible(true);
            }
        });
        
       

       // System.out.println("Nom : " + professionnelByMatricule.getNom());
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lab_Naissance;
    private javax.swing.JLabel Lab_Prenom;
    private javax.swing.JLabel Lab_bip;
    private javax.swing.JLabel Lab_nom;
    private javax.swing.JTextField Txt_Naissance;
    private javax.swing.JTextField Txt_bip;
    private javax.swing.JTextField Txt_nom;
    private javax.swing.JTextField Txt_prenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList_PompierBip;
    private javax.swing.JList<String> jList_PompierId;
    private javax.swing.JList<String> jList_PompierNom;
    private javax.swing.JList<String> jList_PompierPrenom;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lab_bonjour;
    // End of variables declaration//GEN-END:variables

}
