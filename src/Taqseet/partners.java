/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taqseet;

import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class partners extends javax.swing.JPanel {

    /**
     * Creates new form recieved_items
     */
    DefaultTableModel partnerTable;

    public partners() {
        initComponents();
        makeTable();
        Home.styleTable(new JTable[]{partnerT});
    }

    public void delTblCol(DefaultTableModel table) {
        if (table.getRowCount() != 0) {
            for (int i = table.getRowCount() - 1; i >= 0; i--) {
                table.removeRow(i);
            }
        }
    }

    public void showtable() {
        DBcon d = new DBcon();
        try {
            String name, id;
            d.rs = d.st.executeQuery("SELECT * FROM `partners`");
            while ((d.rs).next()) {
                name = d.rs.getString("name");
                id = String.valueOf(d.rs.getInt("id"));
                String[] rowData = {name, id};
                partnerTable.addRow(rowData);
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

    DefaultTableModel createTableCols(JTable table, String[] cols) {
        DefaultTableModel dmodel;
        dmodel = (DefaultTableModel) table.getModel();
        for (int i = 0; i < cols.length; i++) {
            dmodel.addColumn(cols[i]);
        }
        return dmodel;
    }

    public void makeTable() {
        partnerTable = createTableCols(partnerT, new String[]{"الاسم", "الكود"});

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel74 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        partnerT = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        mobi = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        paidLable = new javax.swing.JLabel();
        recivedLable = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        mon = new javax.swing.JTextField();
        nesba = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(189, 195, 199));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, 60));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        partnerT.setAutoCreateRowSorter(true);
        partnerT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        partnerT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        partnerT.setToolTipText("");
        partnerT.setGridColor(new java.awt.Color(153, 153, 153));
        partnerT.setRowHeight(45);
        partnerT.setRowMargin(3);
        partnerT.setShowHorizontalLines(true);
        partnerT.setShowVerticalLines(true);
        partnerT.setSurrendersFocusOnKeystroke(true);
        partnerT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partnerTMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(partnerT);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 710));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("الكود : ");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 110, 60));

        id.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 270, 60));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("الإسم :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 80, 110, 60));

        name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        name.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nameCaretUpdate(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 270, 60));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("المدفوع :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 150, 110, 60));

        paid.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        paid.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        paid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidActionPerformed(evt);
            }
        });
        add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 270, 60));

        jPanel2.setBackground(new java.awt.Color(189, 195, 199));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 380));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("الموبايل :");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 110, 60));

        mobi.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mobi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        mobi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        mobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobiActionPerformed(evt);
            }
        });
        add(mobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 220, 60));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("التاريخ :");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 110, 60));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        date.setText(LocalDate.now()+"");
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 220, 60));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money.png"))); // NOI18N
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 90, 80));

        paidLable.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        paidLable.setForeground(new java.awt.Color(204, 0, 51));
        paidLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paidLable.setText("0000000000");
        add(paidLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 220, 50));

        recivedLable.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        recivedLable.setForeground(new java.awt.Color(204, 0, 51));
        recivedLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recivedLable.setText("0000000000");
        add(recivedLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 640, 230, 50));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receive_Cash.png"))); // NOI18N
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus_small.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 60, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("النسبة :");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 110, 60));

        mon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        mon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        mon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        mon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monActionPerformed(evt);
            }
        });
        jPanel3.add(mon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 360, 60));

        nesba.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nesba.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nesba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        nesba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nesbaActionPerformed(evt);
            }
        });
        jPanel3.add(nesba, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 360, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/give.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("المبلغ :");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 110, 60));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 790, 210));

        jPanel1.setBackground(new java.awt.Color(149, 175, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 149, 167), 3));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 360, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/get_money.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 60));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("سحب مبلغ نهائيا :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 180, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 790, 100));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel2.png"))); // NOI18N
        jLabel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel83MouseClicked(evt);
            }
        });
        add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 60, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paidActionPerformed

    private void mobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobiActionPerformed

    private void nesbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nesbaActionPerformed
        String mob = null, paid = null, cashPrice = null, recived = null;
        DBcon d = new DBcon();
        float nesba = Float.valueOf(this.nesba.getText());
        float money = 0;
        String sql2 = "SELECT * FROM `partners` WHERE id = " + id.getText() + ";";
        try {
            d.rs = d.st.executeQuery(sql2);
            while ((d.rs).next()) {
                paid = String.valueOf(d.rs.getFloat("payments"));
                recived = String.valueOf(d.rs.getFloat("received_money"));
            }
            money = ((nesba / 100) * Float.valueOf(paid)) / 12;
            mon.setText("" + money);
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_nesbaActionPerformed

    private void monActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void partnerTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partnerTMouseClicked
        String id = null, name = "unknown", quant = null, price = null;
        int n = partnerT.getSelectedRow();
        name = partnerT.getValueAt(n, 0).toString();
        id = partnerT.getValueAt(n, 1).toString();

        String mob = null, paid = null, cashPrice = null, recived = null;
        DBcon d = new DBcon();
        String sql2 = "SELECT * FROM `partners` WHERE id = " + id + ";";
        try {
            d.rs = d.st.executeQuery(sql2);
            while ((d.rs).next()) {

                mob = String.valueOf(d.rs.getString("mobile"));
                paid = String.valueOf(d.rs.getFloat("payments"));
                recived = String.valueOf(d.rs.getFloat("received_money"));

            }
        } catch (SQLException ex) {

        }
        this.id.setText(id);
        this.name.setText(name);
        mobi.setText(mob);
        recivedLable.setText(recived);
        paidLable.setText(paid);

    }//GEN-LAST:event_partnerTMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        DBcon d = new DBcon();
        try {
            float RM = 0, paiding = 0;
            int flag = 1;
            int id = 0;

            d.rs = d.st.executeQuery("SELECT * FROM `partners`");
            while ((d.rs).next()) {
                if ((d.rs.getString("name")).equals(name.getText())) {
                    flag = 0;
                    break;
                } else {
                    flag++;
                    continue;
                }
            }
            if (flag != 0) {
                if (this.id.getText().isEmpty() == true) {
                    id = auto_insert("partners", "id");
                } else {
                    id = Integer.parseInt(this.id.getText());
                }

                String sql3 = "INSERT INTO `partners` (`id`, `name`, `mobile`, `payments`, `received_money`) VALUES ('" + id + "', '" + name.getText() + "', '" + mobi.getText() + "', '0',  '0');";
                d.st = d.con.createStatement();
                d.st.executeUpdate(sql3);

            }
            d.rs = d.st.executeQuery("SELECT * FROM `partners` WHERE `partners`.`name`='" + name.getText() + "';");
            while (d.rs.next()) {
                id = d.rs.getInt("id");
                RM = d.rs.getFloat("received_money");
                paiding = d.rs.getFloat("payments");
            }
            String ss = "UPDATE `partners` SET `payments` = '" + (Float.valueOf(paid.getText()) + paiding) + "' WHERE `id` = " + id + ";";
            d.st = d.con.createStatement();
            d.st.executeUpdate(ss);
            paidLable.setText((Float.valueOf(paid.getText()) + paiding) + "");
            recivedLable.setText(RM + "");
            delTblCol(partnerTable);
            showtable();
            d.st = d.con.createStatement();
            d.st.executeUpdate("INSERT INTO `history` (`id`, `person_id`, `person_type`, `date`, `operation`,type) VALUES (NULL, '" + this.id.getText() + "', '" + name.getText() + "', '" + LocalDate.now() + "',  '" + paid.getText() + "استلام من الشريك مبلغ قدره  ' , 'partners');");
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px;'>تم </h3></html>");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px'>هناك خطأ ما -- حاول مرة اخري </h3></html>");
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        delTblCol(partnerTable);
        showtable();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        String mob = null, paid = null, cashPrice = null, recived = null;
        DBcon d = new DBcon();
        float nesba = Float.valueOf(this.nesba.getText());

        String sql2 = "SELECT * FROM `partners` WHERE id = " + id.getText() + ";";
        try {
            d.rs = d.st.executeQuery(sql2);
            while ((d.rs).next()) {
                paid = String.valueOf(d.rs.getFloat("payments"));
                recived = String.valueOf(d.rs.getFloat("received_money"));
            }
            String ss = "UPDATE `partners` SET `received_money` = '" + (Float.valueOf(mon.getText()) + Float.valueOf(recived)) + "' WHERE `id` = " + id.getText() + ";";
            d.st = d.con.createStatement();
            d.st.executeUpdate(ss);

            paidLable.setText(paid + "");
            recivedLable.setText((Float.valueOf(mon.getText()) + Float.valueOf(recived)) + "");
            delTblCol(partnerTable);
            showtable();
            d.st = d.con.createStatement();
            d.st.executeUpdate("INSERT INTO `history` (`id`, `person_id`, `person_type`, `date`, `operation`,type) VALUES (NULL, '" + this.id.getText() + "', '" + name.getText() + "', '" + LocalDate.now() + "',  '" + mon.getText() + "تسليم الشريك مبلغ قدره  ' , 'partners');");
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px;'>تم </h3></html>");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px'>هناك خطأ ما -- حاول مرة اخري </h3></html>");
        }

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        DBcon d = new DBcon();
        try {
            float RM = 0, paiding = 0;

            int id = 0;

            d.rs = d.st.executeQuery("SELECT * FROM `partners` WHERE `partners`.`name`='" + name.getText() + "';");
            while (d.rs.next()) {
                id = d.rs.getInt("id");
                RM = d.rs.getFloat("received_money");
                paiding = d.rs.getFloat("payments");
            }
            String ss = "UPDATE `partners` SET `payments` = '" + (-Float.valueOf(jTextField1.getText()) + paiding) + "' WHERE `id` = " + id + ";";
            d.st = d.con.createStatement();
            d.st.executeUpdate(ss);
            paidLable.setText((-Float.valueOf(jTextField1.getText()) + paiding) + "");
            recivedLable.setText(RM + "");
            delTblCol(partnerTable);
            showtable();
            d.st = d.con.createStatement();
            d.st.executeUpdate("INSERT INTO `history` (`id`, `person_id`, `person_type`, `date`, `operation`,type) VALUES (NULL, '" + this.id.getText() + "', '" + name.getText() + "', '" + LocalDate.now() + "',  '" + jTextField1.getText() + "سحب الشريك مبلغ قدره  ' , 'partners');");
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px;'>تم </h3></html>");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "<html><h1 style='font-family: Calibri; font-size:20px'>هناك خطأ ما -- حاول مرة اخري </h3></html>");
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        id.setText(null);
        name.setText(null);
        paid.setText(null);
        mobi.setText(null);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void nameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nameCaretUpdate

        DBcon d = new DBcon();
        try {
            String name, id;
            d.rs = d.st.executeQuery("SELECT * FROM `partners` like name = '" + this.name.getText() + "%'");
            while ((d.rs).next()) {
                name = d.rs.getString("name");
                id = String.valueOf(d.rs.getInt("id"));
                String[] rowData = {name, id};
                partnerTable.addRow(rowData);
            }
        } catch (Exception e) {
        }
// TODO add your handling code here:
    }//GEN-LAST:event_nameCaretUpdate

    private void jLabel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel83MouseClicked
        Home.exportExcel(partnerT, "جدول الشركاء");
    }//GEN-LAST:event_jLabel83MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mobi;
    private javax.swing.JTextField mon;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nesba;
    private javax.swing.JTextField paid;
    private javax.swing.JLabel paidLable;
    private javax.swing.JTable partnerT;
    private javax.swing.JLabel recivedLable;
    // End of variables declaration//GEN-END:variables
}