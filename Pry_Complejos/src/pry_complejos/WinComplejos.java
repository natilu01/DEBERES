
package pry_complejos;

public class WinComplejos extends javax.swing.JFrame {

    public WinComplejos() {
        initComponents();
         this.setTitle("***CALCULADORA DE NÚMEROS COMPLEJOS*** ");//encabezado para la ventana principal
    }
   public ClsComplejos m, n;
   public float x, y;
   public int a;
   public int opc;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        TxtPantalla = new javax.swing.JTextField();
        BtnReal = new javax.swing.JButton();
        BtnImaginario = new javax.swing.JButton();
        BtnMas = new javax.swing.JButton();
        BtnMenos = new javax.swing.JButton();
        BtnPor = new javax.swing.JButton();
        BtnDividido = new javax.swing.JButton();
        BtnIgual = new javax.swing.JButton();
        BtnAla = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        jButton7.setText("/");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnReal.setText("REAL");
        BtnReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealActionPerformed(evt);
            }
        });

        BtnImaginario.setText("IMAGINARIO");
        BtnImaginario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnImaginarioActionPerformed(evt);
            }
        });

        BtnMas.setText("+");
        BtnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasActionPerformed(evt);
            }
        });

        BtnMenos.setText("-");
        BtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosActionPerformed(evt);
            }
        });

        BtnPor.setText("*");
        BtnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPorActionPerformed(evt);
            }
        });

        BtnDividido.setText("/");
        BtnDividido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivididoActionPerformed(evt);
            }
        });

        BtnIgual.setText("=");
        BtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIgualActionPerformed(evt);
            }
        });

        BtnAla.setText("ALA");
        BtnAla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlaActionPerformed(evt);
            }
        });

        BtnCerrar.setText("CERRAR");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("LIMPIAR");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(BtnReal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnImaginario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnLimpiar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnIgual)
                                    .addComponent(BtnMas))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnAla)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnMenos)
                                        .addGap(39, 39, 39)
                                        .addComponent(BtnPor)
                                        .addGap(41, 41, 41)
                                        .addComponent(BtnDividido)))))
                        .addGap(52, 52, 52)
                        .addComponent(BtnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnImaginario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMas)
                    .addComponent(BtnMenos)
                    .addComponent(BtnDividido)
                    .addComponent(BtnPor))
                .addGap(18, 18, 18)
                .addComponent(BtnAla)
                .addGap(9, 9, 9)
                .addComponent(BtnIgual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCerrar)
                    .addComponent(BtnLimpiar))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDivididoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivididoActionPerformed
        TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
        opc =4;
    }//GEN-LAST:event_BtnDivididoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIgualActionPerformed
         
       switch (opc){
          case 1: 
              //SUMA         
              m.suma(n);
              break;
          case 2:
              //RESTA
              m.resta(n);
              break;
          case 3:
              //MULTIPLICACION
              m.por(n);
              break; 
          case 4:
              //DIVISION
              m.para(n);
              break;
          case 5:
              //POTENCIACION
              m.ala(a);
              break;
       
          default: 
   
      }
      TxtPantalla.setText(m.ver());
      TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnIgualActionPerformed

    private void BtnAlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlaActionPerformed
        a= Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.requestFocus();
        opc = 5;
    }//GEN-LAST:event_BtnAlaActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPorActionPerformed
        TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
        opc =3;
    }//GEN-LAST:event_BtnPorActionPerformed

    private void BtnRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealActionPerformed
           x=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);
        TxtPantalla.requestFocus(); 
    }//GEN-LAST:event_BtnRealActionPerformed

    private void BtnImaginarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnImaginarioActionPerformed
            y=Integer.parseInt(TxtPantalla.getText());
       m= new ClsComplejos(x,y);
            
       TxtPantalla.setText(m.ver());
       TxtPantalla.requestFocus();
    }//GEN-LAST:event_BtnImaginarioActionPerformed

    private void BtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosActionPerformed
        TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
        opc =2;
    }//GEN-LAST:event_BtnMenosActionPerformed

    private void BtnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasActionPerformed
        TxtPantalla.setText(null);
       TxtPantalla.requestFocus();
        opc =1;
    }//GEN-LAST:event_BtnMasActionPerformed

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
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinComplejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinComplejos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAla;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnDividido;
    private javax.swing.JButton BtnIgual;
    private javax.swing.JButton BtnImaginario;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnMas;
    private javax.swing.JButton BtnMenos;
    private javax.swing.JButton BtnPor;
    private javax.swing.JButton BtnReal;
    private javax.swing.JTextField TxtPantalla;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables
}
