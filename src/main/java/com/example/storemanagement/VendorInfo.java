package com.example.storemanagement;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VendorInfo extends JFrame {

    DefaultTableModel dtm;
    String[] eName;

    public VendorInfo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jTextField1 = new JTextField();
        jButton2 = new JButton();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(27, 58, 180));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Employee Info");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Password", "Email", "Phone Number", "Gender", "Country"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(58, 85, 190));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Sort by name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(48, 48, 48)
                                .addComponent(jButton2)
                                .addContainerGap())
                        .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(33, 33, 33))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton2))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        com.example.storemanagement.Admin ad = new com.example.storemanagement.Admin();
        ad.setVisible(true);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        addT();

    }

    public void addT(){
        dtm = (DefaultTableModel) jTable1.getModel();

        for (VendorRecord emm2 : RegisterVendor.vendor) {
            String name = emm2.getName();
            String email = emm2.getEmail();
            String password = emm2.getPassword();
            long number = emm2.getPhoneNumber();
            String gender = emm2.getGender();
            String country = emm2.getCountry();

            Object[] o = {name, password, email, number, gender, country};
            dtm.addRow(o);
        }
    }

    private void table(String search) {
        dtm = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }


    private void columnArr(){
        int rowCount = jTable1.getRowCount();
        eName = new String[rowCount];

        if (rowCount != 0) {
            for (int i = 0; i < rowCount; i++) {
                String name = jTable1.getValueAt(i, 0).toString();
                eName[i] = name;
            }
        }
    }


    private void selectionSort(){
        // Selection Sort
        if (eName.length != 0) {
            int min;
            String temp = "";

            for (int i = 0; i < eName.length; i++) {
                dtm.setRowCount(0);
                min = i;
                for (int j = i + 1; j < eName.length; j++) {
                    if (eName[j].compareTo(eName[min]) < 0) {
                        min = j;
                    }
                }

                temp = eName[i];
                eName[i] = eName[min];
                eName[min] = temp;
            }

            for(int z=0;z<eName.length;z++){
                for(VendorRecord em : RegisterVendor.vendor){
                    String name = em.getName().toLowerCase();
                    if(name.equals(eName[z])){
                        Object[] o = {em.getName(),em.getPassword(),em.getEmail(),em.getPhoneNumber(),em.getGender(),em.getCountry()};
                        dtm.addRow(o);
                    }
                }
//                System.out.println(eName[z]);
            }
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        columnArr();

        selectionSort();

    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {

        // Binary Search
        String empName = jTextField1.getText().toLowerCase();
        System.out.println(empName.isBlank());
        if(empName.isBlank() == true){
            dtm.setRowCount(0);
            addT();
            table(empName);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        columnArr();

        selectionSort();

        //Binary Search
        String empName = jTextField1.getText().toLowerCase();

        if(empName.isBlank() == false){
            int li = 0;
            int hi = eName.length - 1;
            int mi = (li + hi) / 2;
            while (li <= hi) {
                if (eName[mi].compareTo(empName) == 0) {
                    table(empName);
                    break;
                } else if (eName[mi].compareTo(empName) < 0) {
                    li = mi + 1;
                } else {
                    hi = mi - 1;
                }

                mi = (li + hi) / 2;
            }

            if (li > hi) {
                System.out.println("element not found");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Enter name please", "Error", JOptionPane.ERROR_MESSAGE);
            table(empName);
        }

    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new VendorInfo().setVisible(true);
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
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;

}

