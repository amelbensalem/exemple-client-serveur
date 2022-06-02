package com.exemple.client;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AuthentificationFrame extends javax.swing.JFrame {

    public AuthentificationFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPseudo = new javax.swing.JLabel();
        txtPseudo = new javax.swing.JTextField();
        lblMotDePasse = new javax.swing.JLabel();
        txtMotDePasse = new javax.swing.JPasswordField();
        btnSeConnecter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPseudo.setText("Pseudo");

        lblMotDePasse.setText("Mot de Passe");

        btnSeConnecter.setText("Se Connecter");
        btnSeConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeConnecterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeConnecter)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMotDePasse)
                            .addComponent(lblPseudo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPseudo)
                            .addComponent(txtMotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPseudo)
                    .addComponent(txtPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotDePasse)
                    .addComponent(txtMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSeConnecter)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeConnecterActionPerformed
        try {
            String pseudo = txtPseudo.getText();
            String mdp = txtMotDePasse.getText();
            
            Main.out.println(pseudo);
            Main.out.println(mdp);
            Main.out.flush();
            
            String reponse = Main.in.readLine();
            if (reponse.equals("200")) {
                ChatFrame cf = new ChatFrame(pseudo);
                
                ThreadEcouteur te = new ThreadEcouteur(cf);
                te.start();
                                
                cf.setVisible(true);
                dispose();
            } else {
                JOptionPane.showInternalMessageDialog(null, "L'authentification a échoué", "Erreur", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } catch (IOException ex) {
            Logger.getLogger(AuthentificationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeConnecterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeConnecter;
    private javax.swing.JLabel lblMotDePasse;
    private javax.swing.JLabel lblPseudo;
    private javax.swing.JPasswordField txtMotDePasse;
    private javax.swing.JTextField txtPseudo;
    // End of variables declaration//GEN-END:variables
}
