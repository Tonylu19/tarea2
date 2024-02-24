package Vista;

import calculator.controller.Impl_Factory;
import calculator.controller.Operaciones_AbstractFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends javax.swing.JFrame implements ActionListener {

    public Operaciones_AbstractFactory factory;

    private double a, b;
    private String operacionSeleccionada;

    public Calculadora() {
        initComponents();

        this.setLocation(550, 200);
        this.setTitle("Calculator");
        this.setResizable(false);
        factory = new Impl_Factory();
        btnsuma.addActionListener(this);
        btnresta.addActionListener(this);
        btnmultiplicar.addActionListener(this);
        btndividir.addActionListener(this);
        btnresultado.addActionListener(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btndividir = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        txttext = new javax.swing.JTextField();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnresultado = new javax.swing.JButton();
        txttitulo = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        btndividir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndividir.setText("DIVIDIR");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });
        jPanel1.add(btndividir);
        btndividir.setBounds(210, 180, 100, 50);

        btnmultiplicar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnmultiplicar.setText("MULTIPLICAR");
        jPanel1.add(btnmultiplicar);
        btnmultiplicar.setBounds(50, 180, 114, 47);
        jPanel1.add(txttext);
        txttext.setBounds(80, 50, 210, 50);

        btnsuma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsuma.setText("SUMAR");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsuma);
        btnsuma.setBounds(50, 110, 100, 50);

        btnresta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnresta.setText("RESTAR");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnresta);
        btnresta.setBounds(210, 110, 100, 50);

        btnresultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnresultado.setText("Operar");
        btnresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnresultado);
        btnresultado.setBounds(130, 250, 120, 30);

        txttitulo.setText("CALCULADORA SIMPLE");
        jPanel1.add(txttitulo);
        txttitulo.setBounds(120, 20, 140, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed

    }//GEN-LAST:event_btnsumaActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndividirActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresultadoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnresultado;
    private javax.swing.JButton btnsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txttext;
    private java.awt.Label txttitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnsuma || e.getSource() == btnresta
                || e.getSource() == btnmultiplicar || e.getSource() == btndividir) {//CAPTURAR VALOR PARA LA OPERACION
            a = Double.parseDouble(txttext.getText());
            txttext.setText(""); //LIMPIANDO PARA EL SIGUIENTE VALOR
            operacionSeleccionada = e.getActionCommand(); // GUARDANDO LA OPERACION SELECCIONADA
        } else if (e.getSource() == btnresultado) { //CAPTURANDO EL SIGUIENTE VALOR PARA CALCULAR
            b = Double.parseDouble(txttext.getText());
            txttext.setText("");
            switch (operacionSeleccionada) {
                case "+": {
                    // EFECTUANDO LA OPERACION SELECCIONADA
                    double resultado = factory.efectuarSuma().calcular(a, b);
                    txttext.setText(String.valueOf(resultado));
                    break;
                }
                case "-": {
                    double resultado = factory.efectuarResta().calcular(a, b);
                    txttext.setText(String.valueOf(resultado));
                    break;
                }
                case "X": {
                    double resultado = factory.efectuarMultiplicar().calcular(a, b);
                    txttext.setText(String.valueOf(resultado));
                    break;
                }
                case "/": {
                    double resultado = factory.efectuarDividir().calcular(a, b);
                    txttext.setText(String.valueOf(resultado));
                    break;
                }
                default:
                    break;
            }
        }

    }
}
