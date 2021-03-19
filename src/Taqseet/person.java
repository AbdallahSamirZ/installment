/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taqseet;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class person extends javax.swing.JPanel {

    /**
     * Creates new form recieved_items
     */
    int i;
    public DefaultTableModel persontable;

    public person(int i) {
        this.i = i;
        initComponents();
        makeTable();
        mandobTable();
        Home.styleTable(new JTable[]{personT});
    }

    public void delTblCol(DefaultTableModel table) {
        if (table.getRowCount() != 0) {
            for (int i = table.getRowCount() - 1; i >= 0; i--) {
                table.removeRow(i);

            }
        }
    }

    DefaultTableModel createTableCols(JTable table, String[] cols) {
        DefaultTableModel dmodel;
        dmodel = (DefaultTableModel) table.getModel();
        for (int i = 0; i < cols.length; i++) {
            dmodel.addColumn(cols[i]);
        }
        return dmodel;
    }

    public void makeTable() {
        persontable = createTableCols(personT, new String[]{"الموبايل", "الاسم", "الكود"});
    }

    void mandobTable() {
        //delTblCol(persontable);
        if (i == 1) {
            DBcon d = new DBcon();
            String sql2 = "SELECT * FROM mandob WHERE name != 'متعدد'";
            String name, id, mob;
            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    id = String.valueOf(d.rs.getInt("id"));
                    name = d.rs.getString("name");
                    mob = d.rs.getString("mob");
                    String[] rowData = {mob, name, id};
                    persontable.addRow(rowData);
                }
            } catch (Exception e) {

            }
        } else {
            DBcon d = new DBcon();
            String sql2 = "SELECT * FROM client WHERE blocked != 1";
            String name, id, mob1, mob2, add1, add2, curdNum, jop, jopPlace;
            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    id = String.valueOf(d.rs.getInt("id"));
                    name = d.rs.getString("name");
                    mob1 = d.rs.getString("mob1");
                    mob2 = d.rs.getString("mob2");
                    add1 = d.rs.getString("address1");
                    add2 = d.rs.getString("address2");
                    curdNum = String.valueOf(d.rs.getString("card_num"));
                    jop = d.rs.getString("job");
                    jopPlace = d.rs.getString("job_place");
                    String[] rowData = {mob1, name, id};
                    persontable.addRow(rowData);
                }
            } catch (Exception e) {

            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        personId = new javax.swing.JTextField();
        personName = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        personMob = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        personT = new javax.swing.JTable();

        setBackground(new java.awt.Color(189, 195, 199));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 60));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 60));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("الكود : ");
        add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 70, 60));

        personId.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personId.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        personId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        personId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personIdActionPerformed(evt);
            }
        });
        add(personId, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 230, 60));

        personName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        personName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        personName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                personNameCaretUpdate(evt);
            }
        });
        personName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personNameActionPerformed(evt);
            }
        });
        add(personName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 330, 60));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("الاسم :");
        add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 80, 60));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("الموبايل :");
        add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 100, 60));

        personMob.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personMob.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        personMob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        personMob.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                personMobCaretUpdate(evt);
            }
        });
        personMob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personMobActionPerformed(evt);
            }
        });
        add(personMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 60));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        personT.setAutoCreateRowSorter(true);
        personT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        personT.setToolTipText("");
        personT.setGridColor(new java.awt.Color(153, 153, 153));
        personT.setRowHeight(45);
        personT.setRowMargin(3);
        personT.setShowHorizontalLines(true);
        personT.setShowVerticalLines(true);
        personT.setSurrendersFocusOnKeystroke(true);
        personT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personTMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(personT);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1250, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void personIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personIdActionPerformed

//        DBcon d = new DBcon();
//        Home h = new Home();
//        try {
//            int id = Integer.valueOf(personId.getText());
//            h.mandobId.setText(personId.getText());
//            d.rs = d.st.executeQuery("SELECT * FROM mandob WHERE ID ='" + id + "';");
//            while (d.rs.next()) {
//                personName.setText(d.rs.getString("name"));
//                h.mandobName.setText(d.rs.getString("name"));
//
//                personMob.setText(d.rs.getString("mob"));
//                h.mandobMobile.setText(d.rs.getString("mob"));
//                personAdd.setText(d.rs.getString("address"));
//                h.mandobCollectionRate.setText(d.rs.getString("Tahsel_percentage"));
////                 h.mandobLocation.setText(d.rs.getString("total_recieved_money"));
////                 h.mandobLocation.setText(d.rs.getString("total_required_money"));
//                h.mandobCollectionRate.setText(d.rs.getString("Tahsel_percentage"));
//
//            }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_personIdActionPerformed

    private void personNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personNameActionPerformed

    }//GEN-LAST:event_personNameActionPerformed

    private void personMobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personMobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personMobActionPerformed

    private void personTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personTMouseClicked
        int n = personT.getSelectedRow();
        String name = personT.getValueAt(n, 1).toString();
        String id = personT.getValueAt(n, 2).toString();
        String mobile = personT.getValueAt(n, 0).toString();
        DBcon d = new DBcon();
        //Home h = new Home();
        if (i == 1) {
            try {
                personId.setText(id);
                Home.mandobId.setText(id);
                d.rs = d.st.executeQuery("SELECT * FROM mandob WHERE id ='" + id + "';");
                while (d.rs.next()) {
                    personName.setText(d.rs.getString("name"));
                    Home.mandobName.setText(d.rs.getString("name"));
                    personMob.setText(d.rs.getString("mob"));
                    Home.mandobMobile.setText(d.rs.getString("mob"));
                    Home.mandobCollectionRate.setText(d.rs.getString("Tahsel_percentage"));
                    Home.mandobLocation.setText(d.rs.getString("address"));
                    Home.mandobCardName.setText(d.rs.getString("card_num"));

                    Home.itemComboBox1.setSelectedItem(d.rs.getString("branchName"));
                    Home.jComboBox5.setSelectedItem(d.rs.getString("areaName"));
                }
            } catch (Exception e) {
            }
        } else {
            String sql2 = "SELECT * FROM client  WHERE id ='" + id + "';";

            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    personId.setText(String.valueOf(d.rs.getInt("id")));
                    personName.setText(d.rs.getString("name"));
                    personMob.setText(d.rs.getString("mob1"));
                    Home.Cid.setText(String.valueOf(d.rs.getInt("id")));
                    Home.Cname.setText(d.rs.getString("name"));
                    Home.mob1.setText(d.rs.getString("mob1"));
                    Home.mob2.setText(d.rs.getString("mob2"));
                    Home.add1.setText(d.rs.getString("address1"));
                    Home.add2.setText(d.rs.getString("address2"));
                    Home.cNum.setText(String.valueOf(d.rs.getString("card_num")));
                    Home.Cjob.setText(d.rs.getString("job"));
                    Home.jobPlace.setText(d.rs.getString("job_place"));
                    Home.itemComboBox2.setSelectedItem(d.rs.getString("branchName"));
                    Home.jComboBox6.setSelectedItem(d.rs.getString("areaName"));

                }
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_personTMouseClicked

    private void personNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_personNameCaretUpdate
        // TODO add your handling code here:
        delTblCol(persontable);
        if (i == 1) {
            DBcon d = new DBcon();
            String sql2 = "SELECT * FROM mandob WHERE name like '" + personName.getText() + "%';";
            String name, id, mob;
            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    id = String.valueOf(d.rs.getInt("id"));
                    name = d.rs.getString("name");
                    mob = d.rs.getString("mob");
                    String[] rowData = {mob, name, id};
                    persontable.addRow(rowData);
                }
            } catch (Exception e) {

            }
        } else {
            DBcon d = new DBcon();
            String sql2 = "SELECT * FROM client WHERE blocked != 1 AND name like '" + personName.getText() + "%';";
            String name, id, mob1, mob2, add1, add2, curdNum, jop, jopPlace;
            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    id = String.valueOf(d.rs.getInt("id"));
                    name = d.rs.getString("name");
                    mob1 = d.rs.getString("mob1");
                    mob2 = d.rs.getString("mob2");
                    add1 = d.rs.getString("address1");
                    add2 = d.rs.getString("address2");
                    curdNum = String.valueOf(d.rs.getString("card_num"));
                    jop = d.rs.getString("job");
                    jopPlace = d.rs.getString("job_place");
                    String[] rowData = {mob1, name, id};
                    persontable.addRow(rowData);
                }
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_personNameCaretUpdate

    private void personMobCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_personMobCaretUpdate

        delTblCol(persontable);
        if (i == 1) {
            DBcon d = new DBcon();
            String sql2 = "SELECT * FROM mandob WHERE mob like '%" + personMob.getText() + "%';";
            String name, id, mob;
            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    id = String.valueOf(d.rs.getInt("id"));
                    name = d.rs.getString("name");
                    mob = d.rs.getString("mob");
                    String[] rowData = {mob, name, id};
                    persontable.addRow(rowData);
                }
            } catch (Exception e) {

            }
        } else {
            DBcon d = new DBcon();
            String sql2 = "SELECT * FROM client WHERE blocked != 1 AND mob1 like '%" + personMob.getText() + "%';";
            String name, id, mob1;
            try {
                d.rs = d.st.executeQuery(sql2);
                while ((d.rs).next()) {
                    id = String.valueOf(d.rs.getInt("id"));
                    name = d.rs.getString("name");
                    mob1 = d.rs.getString("mob1");

                    String[] rowData = {mob1, name, id};
                    persontable.addRow(rowData);
                }
            } catch (Exception e) {

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_personMobCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField personId;
    private javax.swing.JTextField personMob;
    private javax.swing.JTextField personName;
    private javax.swing.JTable personT;
    // End of variables declaration//GEN-END:variables
}