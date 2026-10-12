/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.orderfoods
import javax.swing.JOptionPane;

   public class store_ui extends javax.swing.JFrame {
        act()
    }
    public int piatos=0;
    public int nova=0;
    public int patata=0;
    public int vcut=0;
    public int coke=0;
    public int sprite=0;
    public int royal=0;
    public int md=0;
    /**
     * Creates new form store_ui
     */
    public store_ui() {
        initComponents();
    private static void act() {
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rdb_snacks = new javax.swing.JRadioButton();
        rdb_drinks = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rdb_piatos = new javax.swing.JRadioButton();
        rdb_nova = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdb_patata = new javax.swing.JRadioButton();
        rdb_vcut = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        txt_change = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rdb_coke = new javax.swing.JRadioButton();
        rdb_sprite = new javax.swing.JRadioButton();
        rdb_royal = new javax.swing.JRadioButton();
        rdb_md = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a category:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 40));

        rdb_snacks.setText("Snacks");
        jPanel1.add(rdb_snacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        rdb_drinks.setText("Drinks");
        jPanel1.add(rdb_drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 590, 140));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText(" K STORE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 90, 40));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdb_piatos.setText("PIATOS-₱22");
        rdb_piatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_piatosActionPerformed(evt);
            }
        });
        jPanel2.add(rdb_piatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        rdb_nova.setText("NOVA-₱25");
        jPanel2.add(rdb_nova, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose your snack:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rdb_patata.setText("PATATA-₱20");
        jPanel2.add(rdb_patata, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        rdb_vcut.setText("V-CUT ₱-25");
        jPanel2.add(rdb_vcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 180));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Price:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("Quantity:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel6.setText("SubTotal:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel3.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 20));
        jPanel3.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));
        jPanel3.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 280, 160));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Enter Cash  :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setText("Change  :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel4.add(txt_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, -1));
        jPanel4.add(txt_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, -1));

        btn_calculate.setText("Calculate");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton1.setText("Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 250, 160));

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Choose your drinks:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rdb_coke.setText("COKE ₱-25");
        jPanel5.add(rdb_coke, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        rdb_sprite.setText("SPRITE ₱-20");
        jPanel5.add(rdb_sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        rdb_royal.setText("ROYAL- ₱20");
        jPanel5.add(rdb_royal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        rdb_md.setText("MOUNTAIN DEW -₱25");
        jPanel5.add(rdb_md, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 280, 170));

        pack();
    }
    // TODO add your handling code here:
    // </editor-fold>                        
// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(store_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(store_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(store_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(store_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new store_ui().setVisible(true);
            }
        });
    }

       

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        rdb_piatos = new javax.swing.JRadioButton();
        rdb_nova = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdb_patata = new javax.swing.JRadioButton();
        rdb_vcut = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        rdb_coke = new javax.swing.JRadioButton();
        rdb_sprite = new javax.swing.JRadioButton();
        rdb_royal = new javax.swing.JRadioButton();
        rdb_md = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rdb_snacks = new javax.swing.JRadioButton();
        rdb_drinks = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rdb_piatos1 = new javax.swing.JRadioButton();
        rdb_nova1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdb_patata1 = new javax.swing.JRadioButton();
        rdb_vcut1 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        rdb_coke1 = new javax.swing.JRadioButton();
        rdb_sprite1 = new javax.swing.JRadioButton();
        rdb_royal1 = new javax.swing.JRadioButton();
        rdb_md1 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_price1 = new javax.swing.JTextField();
        txt_subtotal1 = new javax.swing.JTextField();
        txt_quantity1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        txt_change = new javax.swing.JTextField();
        btn_calculate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdb_piatos.setText("PIATOS-₱22");
        rdb_piatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_piatosActionPerformed(evt);
            }
        });
        jPanel2.add(rdb_piatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        rdb_nova.setText("NOVA-₱25");
        jPanel2.add(rdb_nova, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose your snack:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rdb_patata.setText("PATATA-₱20");
        jPanel2.add(rdb_patata, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        rdb_vcut.setText("V-CUT ₱-25");
        jPanel2.add(rdb_vcut, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Choose your drinks:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rdb_coke.setText("COKE ₱-25");
        jPanel5.add(rdb_coke, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        rdb_sprite.setText("SPRITE ₱-20");
        jPanel5.add(rdb_sprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        rdb_royal.setText("ROYAL- ₱20");
        jPanel5.add(rdb_royal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        rdb_md.setText("MOUNTAIN DEW -₱25");
        jPanel5.add(rdb_md, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Price:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setText("Quantity:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel8.setText("SubTotal:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel4.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 20));
        jPanel4.add(txt_subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));
        jPanel4.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("KELV COMPSTORE");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose a category:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 40));

        rdb_snacks.setText("Snacks");
        jPanel1.add(rdb_snacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        rdb_drinks.setText("Drinks");
        jPanel1.add(rdb_drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdb_piatos1.setText("PIATOS-₱22");
        rdb_piatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_piatos1ActionPerformed(evt);
            }
        });
        jPanel3.add(rdb_piatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        rdb_nova1.setText("NOVA-₱25");
        jPanel3.add(rdb_nova1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose your snack:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rdb_patata1.setText("PATATA-₱20");
        jPanel3.add(rdb_patata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        rdb_vcut1.setText("V-CUT ₱-25");
        jPanel3.add(rdb_vcut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Choose your drinks:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rdb_coke1.setText("COKE ₱-25");
        jPanel6.add(rdb_coke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        rdb_sprite1.setText("SPRITE ₱-20");
        jPanel6.add(rdb_sprite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        rdb_royal1.setText("ROYAL- ₱20");
        jPanel6.add(rdb_royal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        rdb_md1.setText("MOUNTAIN DEW -₱25");
        jPanel6.add(rdb_md1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Price:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel12.setText("Quantity:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel13.setText("SubTotal:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel7.add(txt_price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 20));
        jPanel7.add(txt_subtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, -1));
        jPanel7.add(txt_quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, -1));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Enter Cash  :");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel15.setText("Change  :");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel8.add(txt_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, -1));
        jPanel8.add(txt_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, -1));

        btn_calculate.setBackground(new java.awt.Color(153, 153, 153));
        btn_calculate.setText("Calculate");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Again");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(306, 306, 306))))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_piatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_piatosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdb_piatosActionPerformed

    private void rdb_piatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_piatos1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rdb_piatos1ActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        // TODO add your handling code here:
        int quantity;
        double price = 0;
        double subtotal;
        double cash;
        double change;

        // GET QUANTITY
        try {
            quantity = Integer.parseInt(txt_quantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter a valid quantity.",
                "Invalid Quantity",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // CHECK QUANTITY

        // CHECK SELECTED ITEM
        if (rdb_piatos.isSelected()) {
            piatos+=22;

        }
        if (rdb_nova.isSelected()) {
            nova+=25;

        }
        if (rdb_patata.isSelected()) {
            patata+=20;

        }
        if (rdb_vcut.isSelected()) {
            vcut+=25;

        }
        if (rdb_coke.isSelected()) {
            coke+=25;

        }
        if (rdb_sprite.isSelected()) {
            sprite+=20;

        }
        if (rdb_royal.isSelected()) {
            royal+=20;

        }
        if (rdb_md.isSelected()) {
            md+=25;

        }

        price= piatos+nova+patata+vcut+coke+sprite+royal+md;

        // CALCULATE SUBTOTAL
        subtotal = quantity * price;

        // DISPLAY PRICE
        txt_price.setText(String.format("₱%.2f", price));

        // DISPLAY SUBTOTAL
        txt_subtotal.setText(String.format("₱%.2f", subtotal));

        // GET CASH
        try {
            cash = Double.parseDouble(txt_cash.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Please enter a valid cash amount.",
                "Invalid Cash",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // CHECK IF CASH IS ENOUGH
        if (cash < subtotal) {
            JOptionPane.showMessageDialog(
                this,
                "Insufficient cash!",
                "Payment Error",
                JOptionPane.WARNING_MESSAGE
            );

            txt_change.setText("₱0.00");
            return;
        }

        // CALCULATE CHANGE
        change = cash - subtotal;

        // DISPLAY CHANGE
        txt_change.setText(String.format("₱%.2f", change));

        // SUCCESS MESSAGE
        JOptionPane.showMessageDialog(
            this,
            "Order successfully calculated!\n\n" +
            "Quantity: " + quantity +
            "\nPrice: ₱" + String.format("%.2f", price) +
            "\nSubtotal: ₱" + String.format("%.2f", subtotal) +
            "\nCash: ₱" + String.format("%.2f", cash) +
            "\nChange: ₱" + String.format("%.2f", change),
            "Order Summary",
            JOptionPane.INFORMATION_MESSAGE
        );
        System.out.println(price);

    }//GEN-LAST:event_btn_calculateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txt_quantity.setText(String.format("0"));
        txt_price.setText(String.format("0"));
        txt_subtotal.setText(String.format("0"));
        txt_cash.setText(String.format("0"));
        txt_change.setText(String.format("0"));
        rdb_piatos.setSelected(false);
        rdb_nova.setSelected(false);
        rdb_patata.setSelected(false);
        rdb_vcut.setSelected(false);
        rdb_coke.setSelected(false);
        rdb_sprite.setSelected(false);
        rdb_royal.setSelected(false);
        rdb_md.setSelected(false);
        rdb_snacks.setSelected(false);
        rdb_drinks.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton rdb_coke;
    private javax.swing.JRadioButton rdb_coke1;
    private javax.swing.JRadioButton rdb_drinks;
    private javax.swing.JRadioButton rdb_md;
    private javax.swing.JRadioButton rdb_md1;
    private javax.swing.JRadioButton rdb_nova;
    private javax.swing.JRadioButton rdb_nova1;
    private javax.swing.JRadioButton rdb_patata;
    private javax.swing.JRadioButton rdb_patata1;
    private javax.swing.JRadioButton rdb_piatos;
    private javax.swing.JRadioButton rdb_piatos1;
    private javax.swing.JRadioButton rdb_royal;
    private javax.swing.JRadioButton rdb_royal1;
    private javax.swing.JRadioButton rdb_snacks;
    private javax.swing.JRadioButton rdb_sprite;
    private javax.swing.JRadioButton rdb_sprite1;
    private javax.swing.JRadioButton rdb_vcut;
    private javax.swing.JRadioButton rdb_vcut1;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_change;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_price1;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_quantity1;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_subtotal1;
    // End of variables declaration//GEN-END:variables
