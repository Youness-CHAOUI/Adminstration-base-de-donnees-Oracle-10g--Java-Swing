/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminBD;

import static AdminBD.MIDAdmni.parent_pane;
import MyClasses.ConnectODB;
import MyClasses.MySwingUtilities;
import MyClasses.bestLook;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed BENZNANA
 */
public class modifUser extends javax.swing.JPanel {

    /**
     * Creates new form modifUser
     */
    public modifUser() {
        bestLook.setBestLookAndFeelAvailable();
        initComponents();
        jComboBox2.removeAllItems();

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
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        combooo = new javax.swing.JComboBox();
        lbexper = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        addutil = new javax.swing.JButton();
        addutil1 = new javax.swing.JButton();
        lbnom = new javax.swing.JLabel();
        lbtmpdef = new javax.swing.JLabel();
        lbtbtemp = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JPasswordField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListdrop1 = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListcreate1 = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListalter1 = new javax.swing.JList();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jPanel1.setPreferredSize(new java.awt.Dimension(896, 530));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Gestion des Utilisateurs");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("TableSpace Temporaire");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 138, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("TableSpace par défaut");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 121, -1, -1));
        jPanel3.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 61, 162, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Mot de passe");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 63, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nom Utilisateur");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 46, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Statut du compte:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 112, -1, -1));

        combooo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Déverrouillé", "Verrouillé" }));
        jPanel3.add(combooo, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 133, 143, -1));

        lbexper.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbexper.setText("Expiration du mot de passe\t");
        jPanel3.add(lbexper, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 103, 170, -1));

        jPanel5.setBackground(new java.awt.Color(188, 220, 193));

        jLabel7.setText("Gérer un utilisateur de base de données");

        addutil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addutil.setText("Sauvegarder");
        addutil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addutilActionPerformed(evt);
            }
        });

        addutil1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addutil1.setText("Annuler");
        addutil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addutil1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(addutil1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addutil)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addutil)
                            .addComponent(addutil1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 34));

        lbnom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbnom.setForeground(java.awt.Color.blue);
        lbnom.setText("jLabel12");
        jPanel3.add(lbnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 46, 162, -1));

        lbtmpdef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbtmpdef.setForeground(java.awt.Color.blue);
        lbtmpdef.setText("jLabel14");
        jPanel3.add(lbtmpdef, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 121, 162, -1));

        lbtbtemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbtbtemp.setForeground(java.awt.Color.blue);
        lbtbtemp.setText("jLabel19");
        jPanel3.add(lbtbtemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 138, 163, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Confirmer le mot de passe");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 83, -1, -1));
        jPanel3.add(jPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 81, 162, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 81, 162, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Profils");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 83, -1, -1));
        jPanel3.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 103, -1, 14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.blue);
        jLabel5.setText("\tMot de passe expiré");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 104, 160, -1));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 100, 220, 20));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jListdrop1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DROP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 153, 153))); // NOI18N
        jListdrop1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jListdrop1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "TABLESPACE", "ROLLBACK SEGMENT", "ANY INDEX", "ANY TABLE", "ANY PROCEDURE", "ANY SEQUENCE", "ANY TRIGGER", "ANY VIEW", "ANY SYNONYM", "ANY ROLE" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListdrop1);

        jListcreate1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 153, 153))); // NOI18N
        jListcreate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jListcreate1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "VIEW", "TRIGGER", "TABLESPACE", "TABLE", "ROLE", "SESSION", "SEQUENCE", "ROLLBACK SEGMENT", "PROFILE", "PROCEDURE", "ANY INDEX", "ANY TABLE", "ANY PROCEDURE", "ANY SEQUENCE", "ANY TRIGGER", "ANY VIEW", "ANY SYNONYM" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jListcreate1);

        jListalter1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 153, 153))); // NOI18N
        jListalter1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jListalter1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "SESSION", "TABLESPACE", "ROLLBACK SEGMENT", "DATABASE", "SYSTEM", "ANY INDEX", "ANY TABLE", "ANY PROCEDURE", "ANY SEQUENCE", "ANY TRIGGER", "ANY ROLE", "PROFILE" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jListalter1);

        jPanel7.setBackground(new java.awt.Color(188, 220, 193));

        jLabel17.setText(" Privilèges utilisateur");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jLabel16.setText("Accorder directement des privilèges système :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setText("Utilisateurs de base de données");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Tous les objets de base de \ndonnées appartiennent à un \nutilisateur de base de données. \nUtilisez cette page pour créer un \nnouvel utilisateur et définir les \nprivilèges.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modifier Utilisateur", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addutilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addutilActionPerformed
        String user = null;
        try {
            Connection cn = (new ConnectODB("System", "cy15")).getCon();

            if (!jPassword.getText().equals("")) {
                if (check.isSelected()) {
                    if (combooo.getSelectedIndex() == 0) {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "IDENTIFIED BY " + jPassword.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT UNLOCK" + " "
                                + "PASSWORD EXPIRE";
                    } else {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "IDENTIFIED BY " + jPassword.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT LOCK" + " "
                                + "PASSWORD EXPIRE";
                    }
                } else {
                    if (combooo.getSelectedIndex() == 0) {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "IDENTIFIED BY " + jPassword.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT UNLOCK";
                    } else {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "IDENTIFIED BY " + jPassword.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT LOCK";
                    }
                }
            } else {
                if (check.isSelected()) {
                    if (combooo.getSelectedIndex() == 0) {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT UNLOCK" + " "
                                + "PASSWORD EXPIRE";
                    } else {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT LOCK" + " "
                                + "PASSWORD EXPIRE";
                    }
                } else {
                    if (combooo.getSelectedIndex() == 0) {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT UNLOCK";
                    } else {
                        user = "Alter USER " + lbnom.getText() + " "
                                + "PROFILE " + jComboBox2.getSelectedItem().toString() + " "
                                + "ACCOUNT LOCK";
                    }
                }
            }

            String priva = "GRANT " + privil(jListalter1) + " TO " + lbnom.getText();
            String privd = "GRANT " + privild(jListdrop1) + " TO " + lbnom.getText();
            String privc = "GRANT " + privilc(jListcreate1) + " TO " + lbnom.getText();

            Statement stmt = null;
            stmt = cn.createStatement();
            stmt.executeUpdate(user);

            if (jListalter1.getSelectedIndex() >= 0) {
                System.out.println(priva);
                Statement st1 = cn.createStatement();
                st1.executeUpdate(priva);
            } else {
                System.out.println("y a ps de selection alter ");
            }
            if (jListdrop1.getSelectedIndex() >= 0) {
                System.out.println(privd);
                Statement st2 = cn.createStatement();
                st2.executeUpdate(privd);
            } else {
                System.out.println("y a ps de selection drop ");
            }
            if (jListcreate1.getSelectedIndex() >= 0) {
                System.out.println(privc);
                Statement st3 = cn.createStatement();
                st3.executeUpdate(privc);
            } else {
                System.out.println("y a ps de selection create ");
            }
            JOptionPane.showMessageDialog(this, "Modifications effectuées. l'Utilisateur : "+ lbnom.getText() + " modifié.", "Succés", WIDTH);
            MySwingUtilities.setContentPane(parent_pane, new listeUser());
        } catch (SQLException ex) {
            Logger.getLogger(AjoutUtilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addutilActionPerformed

    private void addutil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addutil1ActionPerformed
    MySwingUtilities.setContentPane(parent_pane, new Accueil());
    }//GEN-LAST:event_addutil1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addutil;
    private javax.swing.JButton addutil1;
    public static javax.swing.JCheckBox check;
    public static javax.swing.JComboBox combooo;
    public static javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListalter1;
    private javax.swing.JList jListcreate1;
    private javax.swing.JList jListdrop1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JLabel lbexper;
    public static javax.swing.JLabel lbnom;
    public static javax.swing.JLabel lbtbtemp;
    public static javax.swing.JLabel lbtmpdef;
    // End of variables declaration//GEN-END:variables

    public String privilc(JList l) {
        String s = "";
        try {
            ArrayList<String> df = (ArrayList<String>) l.getSelectedValuesList();
            int nb = df.size();
            int i = 0;
            for (Iterator it = df.iterator(); it.hasNext();) {
                i++;
                if (nb == i) {
                    s = s + " CREATE " + it.next();
                } else {
                    s = s + " CREATE " + it.next() + ",";
                }

            }
        } catch (Exception e) {
            e.getMessage();
        }
        return s;
    }

    public String privild(JList l) {
        String s = "";
        try {
            ArrayList<String> df = (ArrayList<String>) l.getSelectedValuesList();
            int nb = df.size();
            int i = 0;
            for (Iterator it = df.iterator(); it.hasNext();) {
                i++;
                if (nb == i) {
                    s = s + " DROP " + it.next();
                } else {
                    s = s + " DROP " + it.next() + ",";
                }

            }
        } catch (Exception e) {
            e.getMessage();
        }
        return s;
    }

    public String privil(JList l) {
        String s = "";
        try {
            ArrayList<String> df = (ArrayList<String>) l.getSelectedValuesList();
            int nb = df.size();
            int i = 0;
            for (Iterator it = df.iterator(); it.hasNext();) {
                i++;
                if (nb == i) {
                    s = s + " ALTER " + it.next();
                } else {
                    s = s + " ALTER " + it.next() + ",";
                }

            }
        } catch (Exception e) {
            e.getMessage();
        }
        return s;
    }

}
