package com.example.storemanagement;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EditItem extends JFrame {

    int itmID;
    String itemName;
    int price;
    int quantity;
    int totalPrice;
    String category;
    String itemPriceRange;
    Connection con;
    PreparedStatement pst;


    public EditItem() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel8 = new JLabel();
        buttonGroup1 = new ButtonGroup();
        jPanel2 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jComboBox1 = new JComboBox<>();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel7 = new JLabel();
        jTextField4 = new JTextField();
        jLabel6 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jButton3 = new JButton();

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(27, 58, 180));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Item ID");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("Item Price");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setText("Item Category");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("Item Quantity");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12));
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "SELECT CATEGORY", "Beverages", "Bread/Bakery", "Farm Produce", "Dairy Products", "Meat", "Home Care" }));

        jButton1.setBackground(new java.awt.Color(58, 85, 190));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12));
        jButton1.setText("Update Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 30));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edit Item");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));

        jLabel13.setBackground(new java.awt.Color(0, 0, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel13.setForeground(new java.awt.Color(51, 0, 204));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel14.setText("Price Range");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Low");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Medium");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("High");

        jButton3.setFont(new java.awt.Font("Arial", 1, 12));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(253, 253, 253))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(90, 90, 90)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(34, 34, 34))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel14)
                                                                                        .addComponent(jLabel5))
                                                                                .addGap(22, 22, 22))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(18, 18, 18)))))
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jLabel9, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel10, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jRadioButton1)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton3)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                                                .addComponent(jTextField2, GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField3, GroupLayout.Alignment.LEADING))
                                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jButton3)
                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jButton2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jButton2)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jRadioButton1)
                                                                        .addComponent(jRadioButton2)
                                                                        .addComponent(jRadioButton3)
                                                                        .addComponent(jLabel14))))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton3)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) == false) {
                return false;
            }
        }

        return true;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/item_data?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Kuagbenu12345");
            pst = con.prepareStatement("insert into item_details(ID, Item, Qty, Category, PriceRange, Price)values(?,?,?,?,?,?)");

            String itName = jTextField2.getText();
            String itemCategory = jComboBox1.getSelectedItem().toString();
            String priceRange = "";

            if (jRadioButton1.isSelected()) {
                priceRange = priceRange + jRadioButton1.getText().trim();
            }
            if (jRadioButton2.isSelected()) {
                priceRange = priceRange + jRadioButton2.getText().trim();
            }
            if (jRadioButton3.isSelected()) {
                priceRange = priceRange + jRadioButton3.getText().trim();
            }

            if (isNumber(jTextField1.getText().trim()) == false) {
                JOptionPane.showMessageDialog(rootPane,  "Please Enter Integer Value in ID","Error", JOptionPane.WARNING_MESSAGE);
            } else if (jTextField1.getText().toLowerCase().trim().isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Can't Leave Empty in ID","Error",  JOptionPane.WARNING_MESSAGE);
            } //Item Name Validation
            else if (itName.isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane, "Can't Leave Empty in Name", "Error", JOptionPane.WARNING_MESSAGE);
            } else if (itName.matches(".*\\d.*")) {
                JOptionPane.showMessageDialog(rootPane, "Only Text Value can be entered in item Name", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (isNumber(jTextField3.getText().trim()) == false) {
                JOptionPane.showMessageDialog(rootPane, "Please Enter Integer Value in Price", "Error", JOptionPane.WARNING_MESSAGE);
            } else if (jTextField3.getText().toLowerCase().trim().isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane,  "Can't Leave Empty in Price","Error", JOptionPane.WARNING_MESSAGE);
            } else if (itemCategory == "SELECT CATEGORY") {
                JOptionPane.showMessageDialog(rootPane,  "Can't Leave Empty in Item Category","Error", JOptionPane.WARNING_MESSAGE);
            } else if (isNumber(jTextField4.getText().trim()) == false) {
                JOptionPane.showMessageDialog(rootPane,  "Please Enter Integer Value in Quantity","Error", JOptionPane.WARNING_MESSAGE);
            } else if (jTextField4.getText().toLowerCase().trim().isEmpty() == true) {
                JOptionPane.showMessageDialog(rootPane,  "Can't Leave Empty in Item Quantity","Error", JOptionPane.WARNING_MESSAGE);
            } else if (priceRange == "") {
                JOptionPane.showMessageDialog(rootPane,  "Can't Leave Empty in Price Range","Error", JOptionPane.WARNING_MESSAGE);
            } else {
                for (int i = 0; i < com.example.storemanagement.AddItem.item.size(); i++) {
                    for (ItemRecord it : com.example.storemanagement.AddItem.item) {
                        int itemId = Integer.parseInt(jTextField1.getText());
                        int itemPrice = Integer.parseInt(jTextField3.getText());
                        int itemQuantity = Integer.parseInt(jTextField4.getText());
                        int idItem = it.getItemId();
                        if (idItem == itemId) {
                            it.setItemId(itemId);
                            it.setItemName(itName);
                            it.setItemPrice(itemPrice);
                            it.setItemCategory(itemCategory);
                            it.setPriceRange(priceRange);
                            it.setItemQuantity(itemQuantity);

                            JOptionPane.showMessageDialog(rootPane, "Item Updated!");
                            jTextField1.setText("");
                            jTextField2.setText("");
                            jTextField3.setText("");
                            jTextField4.setText("");
                            jComboBox1.setSelectedIndex(0);
                            buttonGroup1.clearSelection();
                        }
                    }
                }
            }
        }catch (NumberFormatException nfe){
        }catch (SQLException ex){
        }catch (ClassNotFoundException ex){

        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        com.example.storemanagement.Admin ad = new com.example.storemanagement.Admin();
        ad.setVisible(true);
    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {
        try{
            int itemID = Integer.parseInt(jTextField1.getText().toString());
            for (ItemRecord ir : com.example.storemanagement.AddItem.item) {
                if (ir.getItemId() == itemID) {
                    itmID = ir.getItemId();
                    itemName = ir.getItemName();
                    jTextField2.setText(itemName);
                    price = ir.getItemPrice();
                    jTextField3.setText(Integer.toString(price));
                    category = ir.getItemCategory();
                    jComboBox1.setSelectedItem(category);
                    itemPriceRange = ir.getPriceRange();
                    if (itemPriceRange.equals("Low")) {
                        jRadioButton1.setSelected(rootPaneCheckingEnabled);
                    }
                    if (itemPriceRange.equals("Medium")) {
                        jRadioButton2.setSelected(rootPaneCheckingEnabled);
                    }
                    if (itemPriceRange.equals("High")) {
                        jRadioButton3.setSelected(rootPaneCheckingEnabled);
                    }
                    quantity = ir.getItemQuantity();
                    jTextField4.setText(Integer.toString(quantity));
                }
            }
        }catch (NumberFormatException nfe){
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jComboBox1.setSelectedIndex(0);
            buttonGroup1.clearSelection();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
        buttonGroup1.clearSelection();
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new EditItem().setVisible(true);
                Login ln = new Login();
                ln.setVisible(true);
            }
        });
    }

    // Variables declaration
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel2;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
}
