/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitshapecalc;

/**
 *
 * @author Marwan Zeid
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        jTextField5 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setVisible(false);
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setVisible(false);
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setVisible(false);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setVisible(false);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setVisible(false);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setVisible(false);
        jTextField6 = new javax.swing.JTextField();
        jTextField6.setVisible(false);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setVisible(false);
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2D Shape Calculator by Mar & Tun");
        setMinimumSize(new java.awt.Dimension(403, 226));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("2D Shape Calculator"));
        jPanel1.setMinimumSize(new java.awt.Dimension(382, 175));

        jLabel1.setText("Base 1:");

        jLabel2.setText("Height:");

        jTextField1.setText("0");

        jTextField2.setText("0");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square", "Rectangle", "Parallelogram", "Rhombus", "Regular Polygon", "Trapezoid", "Triangle", "Circle", "Ellipse" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        jLabel3.setText(" Side 1:");

        jLabel4.setText("Side 2:");

        jTextField3.setText("0");

        jTextField4.setText("0");

        jTextField6.setText("0");

        jLabel5.setText("Base2:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Area");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Perimeter");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(20, 20, 20))
        );

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Perimeter:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange

    }//GEN-LAST:event_jComboBox1PropertyChange
    
    public void clearText(){
        jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         if (jComboBox1.getSelectedItem().equals("Square")){
            jLabel1.setText("Base:");
            jLabel2.setVisible(false);
            jTextField2.setVisible(false);
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Rectangle")){
            jLabel1.setText("Base:");
            jLabel2.setVisible(true);
            jLabel2.setText("Height:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Parallelogram")){
            jLabel1.setText("Base:");
            jLabel2.setVisible(true);
            jLabel2.setText("Height:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Diagonal:");
            jTextField3.setVisible(true);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Rhombus")){
            jLabel1.setText("Diagonal 1:");
            jLabel2.setVisible(true);
            jLabel2.setText("Diagonal 2:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Trapezoid")){
            jLabel1.setText("Base 1:");
            jLabel2.setVisible(true);
            jLabel2.setText("Height:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Side 1:");
            jTextField3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel4.setText("Side 2:");
            jTextField4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel5.setText("Base 2:");
            jTextField6.setVisible(true);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Circle")){
            jLabel1.setText("Radius:");
            jLabel2.setVisible(false);
            jTextField2.setVisible(false);
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Ellipse")){
            jLabel1.setText("Radius 1:");
            jLabel2.setVisible(true);
            jLabel2.setText("Radius 2:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Regular Polygon")){
            jLabel1.setText("Side Length:");
            jLabel2.setVisible(true);
            jLabel2.setText("# of Sides:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(false);
            jTextField3.setVisible(false);
            jLabel4.setVisible(false);
            jTextField4.setVisible(false);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
        else if (jComboBox1.getSelectedItem().equals("Triangle")){
            jLabel1.setText("Base:");
            jLabel2.setVisible(true);
            jLabel2.setText("Height:");
            jTextField2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel3.setText("Side 1:");
            jTextField3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel4.setText("Side 2:");
            jTextField4.setVisible(true);
            jLabel5.setVisible(false);
            jTextField6.setVisible(false);
            clearText();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel6.setText("Perimeter:");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel6.setText("Area:");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String shape = String.valueOf(jComboBox1.getSelectedItem());
        double val1 = Double.valueOf(jTextField1.getText()); // First Parameter
        double val2 = Double.valueOf(jTextField2.getText()); // Second Parameter
        double val3 = Double.valueOf(jTextField3.getText()); // Third Paremeter
        double val4 = Double.valueOf(jTextField4.getText()); // Fourth Parameter
        double val5 = Double.valueOf(jTextField6.getText()); // Fifth Parameter
        
        if (jRadioButton1.isSelected()){
            switch (shape){
                case "Square": // Create shape object based on user's input and calculate area.
                    Square sq = new Square(val1);
                    jTextField7.setText(String.valueOf(sq.retArea()));
                    break;
                case "Rectangle":
                    Rectangle rc = new Rectangle(val1,val2);
                    jTextField7.setText(String.valueOf(rc.retArea()));
                    break;
                case "Parallelogram":
                    Parallelogram para = new Parallelogram(val1, val2, val3);
                    jTextField7.setText(String.valueOf(para.retArea()));
                    break;
                case "Regular Polygon":
                    NPolygon np = new NPolygon(val1,val2);
                    jTextField7.setText(String.valueOf(np.retArea()));
                    break;
                case "Trapezoid":
                    Trapezoid tr = new Trapezoid(val1, val2, val3, val4, val5);
                    jTextField7.setText(String.valueOf(tr.retArea()));
                    break;
                case "Rhombus":
                    Rhombus rh = new Rhombus(val1, val2);
                    jTextField7.setText(String.valueOf(rh.retArea()));
                    break;
                case "Circle":
                    Circle circ = new Circle(val1);
                    jTextField7.setText(String.valueOf(circ.retArea()));
                    break;
                case "Ellipse":
                    Ellipse eli = new Ellipse(val1, val2);
                    jTextField7.setText(String.valueOf(eli.retArea()));
                    break;
                case "Triangle":
                    Triangle tri = new Triangle(val1, val2, val3, val4);
                    jTextField7.setText(String.valueOf(tri.retArea()));
                    break;
            }
        }
        else if (jRadioButton2.isSelected()){
            switch (shape){
                case "Square": // Create shape object based on user's input and calculate perimeter.
                    Square sq = new Square(val1);
                    jTextField7.setText(String.valueOf(sq.retPerimeter()));
                    break;
                case "Rectangle":
                    Rectangle rc = new Rectangle(val1,val2);
                    jTextField7.setText(String.valueOf(rc.retPerimeter()));
                    break;
                case "Parallelogram":
                    Parallelogram para = new Parallelogram(val1, val2, val3);
                    jTextField7.setText(String.valueOf(para.retPerimeter()));
                    break;
                case "Regular Polygon":
                    NPolygon np = new NPolygon(val1,val2);
                    jTextField7.setText(String.valueOf(np.retPerimeter()));
                    break;
                case "Trapezoid":
                    Trapezoid tr = new Trapezoid(val1, val2, val3, val4, val5);
                    jTextField7.setText(String.valueOf(tr.retPerimeter()));
                    break;
                case "Rhombus":
                    Rhombus rh = new Rhombus(val1, val2);
                    jTextField7.setText(String.valueOf(rh.retPerimeter()));
                    break;
                case "Circle":
                    Circle circ = new Circle(val1);
                    jTextField7.setText(String.valueOf(circ.retPerimeter()));
                    break;
                case "Ellipse":
                    Ellipse eli = new Ellipse(val1, val2);
                    jTextField7.setText(String.valueOf(eli.retPerimeter()));
                    break;
                case "Triangle":
                    Triangle tri = new Triangle(val1, val2, val3, val4);
                    jTextField7.setText(String.valueOf(tri.retPerimeter()));
                    break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
