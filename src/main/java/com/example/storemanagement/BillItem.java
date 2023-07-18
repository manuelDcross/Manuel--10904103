package com.example.storemanagement;

import javax.swing.*;
import java.util.ArrayList;


public class BillItem extends JFrame {

    public static ArrayList<BillingItemRecord> bRecord = new ArrayList<BillingItemRecord>();
    int itmID;
    String itemName;
    int price;
    int quantity;
    int totalPrice;
    String category;


    public BillItem() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jTextField3 = new JTextField();
        jLabel4 = new JLabel();
        jTextField4 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel5 = new JLabel();
        jTextField5 = new JTextField();
        jButton3 = new JButton();
        jLabel7 = new JLabel();
        jTextField6 = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("Item Id");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Item Name");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Item Price");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Item Quantity");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Price");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Item Category");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel7)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jButton3)))
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                                        .addComponent(jTextField3)
                                                        .addComponent(jTextField4, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField5, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField6))
                                                .addGap(0, 155, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        UpdateItem it = new UpdateItem();
        it.setVisible(true);
        setVisible(false);


    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {
        try {
            int itemID = Integer.parseInt(jTextField1.getText().toString());
            for (ItemRecord ir : com.example.storemanagement.AddItem.item) {
                if (ir.getItemId() == itemID) {
                    itmID = ir.getItemId();
                    itemName = ir.getItemName();
                    jTextField2.setText(itemName);
                    price = ir.getItemPrice();
                    jTextField3.setText(Integer.toString(price));
                    category = ir.getItemCategory();
                    jTextField6.setText(category);
                }
            }
        } catch (NumberFormatException nfe) {

        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame f;

        f = new JFrame();
        int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
        if (a == JOptionPane.OK_OPTION) {
            BillingItemRecord bi = new BillingItemRecord(itmID, itemName, price, category, quantity, totalPrice);
            bRecord.add(bi);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
        }


    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (bRecord.isEmpty() == false) {
            bRecord.clear();
        }
        Vendor e = new Vendor();
        e.setVisible(true);
        setVisible(false);
    }

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {
        if (jTextField4.getText().isEmpty()) {
            jTextField5.setText("");
        } else {
        }
        try {
            quantity = Integer.parseInt(jTextField4.getText());
            for (ItemRecord i : com.example.storemanagement.AddItem.item) {
                if (quantity <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Quantity cannot be less than 1");
                    break;
                } else if (quantity > i.getItemQuantity()) {
                    JOptionPane.showMessageDialog(rootPane, "Insufficient quantity for the selected item");
                    break;
                } else {
                    totalPrice = price * quantity;
                    jTextField5.setText(Integer.toString(totalPrice));
                }
            }
        } catch (NumberFormatException e) {

        }
    }


    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new BillItem().setVisible(true);
                Login ln = new Login();
                ln.setVisible(true);
            }
        });
    }

    // Variables declaration
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;


}
