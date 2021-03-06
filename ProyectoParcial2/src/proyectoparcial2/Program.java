package proyectoparcial2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Manuel_2
 */
public class Program extends javax.swing.JFrame {
    JTextField[][] cuadricula;
    ProyectoParcial2 back;
    public Program() {
        initComponents();
        setCuadricula();
        arbolBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblRuta = new javax.swing.JLabel();
        Gramatica_Panel = new javax.swing.JPanel();
        resultadotxt = new javax.swing.JLabel();
        arbolBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Cadena");

        jButton2.setText("Evaluar");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblRuta.setToolTipText("");

        Gramatica_Panel.setToolTipText("");

        javax.swing.GroupLayout Gramatica_PanelLayout = new javax.swing.GroupLayout(Gramatica_Panel);
        Gramatica_Panel.setLayout(Gramatica_PanelLayout);
        Gramatica_PanelLayout.setHorizontalGroup(
            Gramatica_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );
        Gramatica_PanelLayout.setVerticalGroup(
            Gramatica_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        resultadotxt.setText("Resultado:");

        arbolBtn.setText("Generar arbol");
        arbolBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbolBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setText("Vaciar Campos");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(267, 267, 267)
                                .addComponent(lblRuta)
                                .addGap(96, 96, 96))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)))
                        .addComponent(limpiarBtn))
                    .addComponent(Gramatica_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultadotxt)
                    .addComponent(arbolBtn))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblRuta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(limpiarBtn))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Gramatica_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(resultadotxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbolBtn)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setCuadricula(){
        cuadricula=new JTextField[15][2];
        int x=5, y=5;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 2; j++) {
                cuadricula[i][j]= new JTextField();
                cuadricula[i][j].setHorizontalAlignment(JTextField.CENTER);
                Font font1 = new Font("SansSerif", Font.BOLD, 14);
                cuadricula[i][j].setFont(font1);
                if(j==1){ 
                cuadricula[i][j].setBounds(x, y, 200, 30);
                cuadricula[i][j].setHorizontalAlignment(JTextField.CENTER);}
                else cuadricula[i][j].setBounds(x, y, 50, 30);
                cuadricula[i][j].setName(String.valueOf(i)+String.valueOf(j));
                cuadricula[i][j].setCaretColor(Color.lightGray);
                fL fl= new fL(i,j);
                cuadricula[i][j].addFocusListener(fl);
                Border borderColor1 = BorderFactory.createLineBorder(Color.decode("#05004e"), 1);
                Border borderColor2 = BorderFactory.createLineBorder(Color.decode("#ff0000"), 1);
                if(j<1){
                        cuadricula[i][j].setBorder(borderColor2);

                }
                else{

                        cuadricula[i][j].setBorder(borderColor1);
                }
                Gramatica_Panel.add(cuadricula[i][j]);
                x+=51;
            }
            y+=31;
            x=5;
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

            String cadena="";
            arbolBtn.setEnabled(true);
            cadena = jTextField2.getText();
            if(! (cadena.length() > 0)){
                JOptionPane.showMessageDialog(this, "Advertencia, debe de introducir una cadena");
            }
            int c = 0;
            for (int i = 0; i < 15; i++) {
                    if(cuadricula[i][0].getText().length()>0 && cuadricula[i][1].getText().length()>0 ){
                        c++;
                    }
            }
            String[][] gramatica = new String[c][2];
            String simbolo1, simbolo2;
            if(c>0){
                for (int i = 0; i < 15; i++) {
                    simbolo1=cuadricula[i][0].getText();
                    simbolo2=cuadricula[i][1].getText();
                    if(simbolo1.length()>0 && simbolo2.length()>0 ){
                        gramatica[i][0]=simbolo1;
                        gramatica[i][1]=simbolo2;
                    }
                }
                back= new ProyectoParcial2(cadena,gramatica);
                back.generar();
                if(back.aceptado()){
                    resultadotxt.setText("Resultado: VERDADERO");
                }
                else{
                    resultadotxt.setText("Resultado: FALSO");
                } 
            }else{
                JOptionPane.showMessageDialog(this, "Advertencia, debe de introducir alguna gramática");
            }
            
            
            
          
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void arbolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbolBtnActionPerformed
       back.generarArbol();
    }//GEN-LAST:event_arbolBtnActionPerformed

    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        jTextField2.setText("");
        for (int i = 0; i < 15; i++) {
            cuadricula[i][0].setText("");
            cuadricula[i][1].setText("");
        }
        arbolBtn.setEnabled(false);
    }//GEN-LAST:event_limpiarBtnActionPerformed
    private class fL implements FocusListener{

        private int i,j;
        public fL(int i, int j) {
            this.i=i;
            this.j=j;
        }
        @Override
        public void focusGained(FocusEvent e) {
           cuadricula[i][j].setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public void focusLost(FocusEvent e) {
           cuadricula[i][j].setBackground(Color.white);
        }
        
    }
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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gramatica_Panel;
    private javax.swing.JButton arbolBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JLabel resultadotxt;
    // End of variables declaration//GEN-END:variables
}
