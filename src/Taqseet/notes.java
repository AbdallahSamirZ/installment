/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taqseet;

import static Taqseet.recieved_items.cID;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class notes extends javax.swing.JPanel {

    /**
     * Creates new form recieved_items
     */
    static String type;
    DefaultTableModel notesT;
    static int pid;

    public notes(String s, int id) {
        initComponents();
        type = s;
        pid = id;
        makeTable();
        notes();
        combobox();
        Home.styleTable(new JTable[]{notesTable});
    }

    public void makeTable() {

        notesT = createTableCols(notesTable, new String[]{"التاريخ", "العنوان", "الكود"});

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

    void branch(JComboBox j) {
        DBcon d = new DBcon();
        String sql2 = "SELECT * FROM `branch`";
        j.removeAllItems();
        try {
            d.rs = d.st.executeQuery(sql2);
            while (d.rs.next()) {
                j.addItem(d.rs.getString("name"));
            }
        } catch (Exception e) {

        }
    }

    void combobox() {

        branch(itemComboBox3);

    }

    void notes() {
        DBcon d = new DBcon();
        String id;
        String title, date;

        try {
            d.rs = d.st.executeQuery("select * from notes WHERE type = '" + type + "' AND person_id = '" + pid + "';");
            while (d.rs.next()) {
                id = String.valueOf(d.rs.getInt("id"));
                date = String.valueOf(d.rs.getDate("date"));
                title = d.rs.getString("title");
                String[] rowData = {date, title, id};
                notesT.addRow(rowData);
            }
        } catch (Exception e) {

        }
    }

    int auto_insert(String s, String s2) {
        int x = 0;
        DBcon d = new DBcon();
        String sql = "SELECT * FROM `" + s + "`";
        try {
            d.rs = d.st.executeQuery(sql);
            while ((d.rs).next()) {

                if ((d.rs.getInt(s2)) == x) {
                    x++;
                }
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "please try again   --  الرجاء المحاولة مرة أخري" );
        }
        return x;
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
        jLabel79 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        notesTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        itemComboBox3 = new javax.swing.JComboBox<>();
        jButton44 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(189, 195, 199));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 20, 560));

        jLabel79.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("التاريخ :");
        add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 120, 60));

        date.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        date.setText(String.valueOf(LocalDate.now()));
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 380, 60));

        jTextField41.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });
        add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 380, 60));

        jLabel99.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel99.setText("الموضوع :");
        add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 220, 120, 60));

        jLabel87.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("الملاحظة :");
        add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 290, 120, 60));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        jScrollPane8.setViewportView(jTextArea1);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 380, 290));

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        notesTable.setAutoCreateRowSorter(true);
        notesTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        notesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        notesTable.setToolTipText("");
        notesTable.setGridColor(new java.awt.Color(153, 153, 153));
        notesTable.setRowHeight(45);
        notesTable.setRowMargin(3);
        notesTable.setShowHorizontalLines(true);
        notesTable.setShowVerticalLines(true);
        notesTable.setSurrendersFocusOnKeystroke(true);
        notesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesTableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(notesTable);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 700));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("الفرع :");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 120, 60));

        itemComboBox3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        itemComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        itemComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComboBox3ActionPerformed(evt);
            }
        });
        add(itemComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 380, 60));

        jButton44.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jButton44.setText("إضافة");
        jButton44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167)));
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton44MouseClicked(evt);
            }
        });
        add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, 110, 50));

        jButton55.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jButton55.setText("عرض ");
        jButton55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167)));
        jButton55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton55MouseClicked(evt);
            }
        });
        add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 110, 50));

        jLabel100.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel100.setText("الكود :");
        add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, 120, 60));

        jTextField53.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });
        add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 380, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void itemComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemComboBox3ActionPerformed

    private void jButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseClicked
        // TODO add your handling code here:
        DBcon d = new DBcon();
        try {
            d.con.createStatement();
            d.st.executeUpdate("INSERT INTO `notes` (`id`, `title`, `note`, `date` ,`branchName`,type, person_id ) VALUES (NULL, '" + jTextField41.getText() + "', '" + jTextArea1.getText() + "', '" + this.date.getText() + "', '" + this.itemComboBox3.getSelectedItem() + "' , '" + type + "' , '" + pid + "');");
            delTblCol(notesT);
            notes();

            d.st = d.con.createStatement();
            d.st.executeUpdate("INSERT INTO `history` (`id`, `person_id`, `person_type`, `date`, `operation`,type) VALUES (NULL, '" + cID + "', 'ملحوظة', '" + LocalDate.now() + "',  ' اضافة ملحوظة '," + type + ");");
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px;'>تم </h3></html>");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px'>هناك خطأ ما -- حاول مرة اخري </h3></html>");
        }
    }//GEN-LAST:event_jButton44MouseClicked

    private void jButton55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton55MouseClicked
        delTblCol(notesT);
        notes();
    }//GEN-LAST:event_jButton55MouseClicked

    private void notesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesTableMouseClicked

        String date, id, title, note;

        int n = notesTable.getSelectedRow();
        id = notesTable.getValueAt(n, 2).toString();

        DBcon d = new DBcon();
        String sql2 = "SELECT * FROM `notes` WHERE id = '" + id + "';";
        try {
            d.rs = d.st.executeQuery(sql2);
            while ((d.rs).next()) {
                jTextField41.setText(d.rs.getString("title"));
                jTextArea1.setText(d.rs.getString("note"));
                this.date.setText(String.valueOf(d.rs.getDate("date")));
            }
            jTextField53.setText(id);
            delTblCol(notesT);
            notes();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_notesTableMouseClicked

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> itemComboBox3;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton55;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTable notesTable;
    // End of variables declaration//GEN-END:variables
}
