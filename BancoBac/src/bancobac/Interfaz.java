package bancobac;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JTabbedPane;
import javax.swing.*;

/*
Esta es la clase principal, en la cual el programa va a funcionar
En la ventana vamos a encontrar:
    *Primero 2 cajas de texto, donde se van a ingresar los datos del cliente,
    seguido por una caja de lista en donde va a estar el tipo de cliente y 
    su respectivo boton para agregar.

    *Luego tenemos 4 Botones, 
    -Uno para pasar a cajas que lo que va a hacer es 
    eliminar de una cola de prioridad, este boton va a depender de la cantidad 
    de cajeros que se puede escoger a la derecha
    -Otro para mostrar una lista de clientes
    -Otro para Motrar las graficas de los clientes
    -Otro Para Salir de la ventana
*/
public class Interfaz extends javax.swing.JFrame {
    ColaClientesArray matriz=new ColaClientesArray();
    public Interfaz() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        CorreoLabel = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        CorreoText = new javax.swing.JTextField();
        AgregarButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        GraficosButton = new javax.swing.JButton();
        ClientesListButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();
        PasarACajasButton = new javax.swing.JButton();
        NumeroDeCajasLabel = new javax.swing.JLabel();
        ErrorLabel = new javax.swing.JLabel();
        ListaComboBox = new javax.swing.JComboBox();
        NumeroCajeros = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Titulo.setText("Bienvenido al BAC San Jose");

        NombreLabel.setText("Nombre:");

        CorreoLabel.setText("Correo: ");

        TipoLabel.setText("Tipo: ");

        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });

        CorreoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoTextActionPerformed(evt);
            }
        });

        AgregarButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        AgregarButton.setText("Agregar la Informacion");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });

        Separator.setForeground(new java.awt.Color(0, 0, 0));

        GraficosButton.setText("Graficos");
        GraficosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficosButtonActionPerformed(evt);
            }
        });

        ClientesListButton.setText("Lista Clientes");

        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });

        PasarACajasButton.setText("Pasar a Cajas");
        PasarACajasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasarACajasButtonActionPerformed(evt);
            }
        });

        NumeroDeCajasLabel.setText("Numero de  cajeros");

        ErrorLabel.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        ListaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "discapacitado", "adulto mayor", "embarazada", "corporativo", "normal" }));

        NumeroCajeros.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separator)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(NombreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CorreoLabel)
                                            .addComponent(TipoLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ListaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(CorreoText))))
                                .addGap(53, 53, 53)
                                .addComponent(AgregarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(Titulo)))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClientesListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GraficosButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PasarACajasButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NumeroDeCajasLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumeroCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalirButton)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoLabel)
                    .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgregarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoLabel)
                    .addComponent(ListaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasarACajasButton)
                    .addComponent(NumeroDeCajasLabel)
                    .addComponent(NumeroCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(GraficosButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ClientesListButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SalirButton)
                    .addComponent(ErrorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void CorreoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoTextActionPerformed

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        String nombre= NombreText.getText();
        String correo= CorreoText.getText();
        String tipo= (String) ListaComboBox.getSelectedItem();
        try {
            matriz.agregarCola(nombre, correo, tipo);
        } catch (MessagingException ex) {
            ErrorLabel.setText("Error para enviar Correo");
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        NombreText.setText("");
        CorreoText.setText("");
    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void GraficosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficosButtonActionPerformed

    }//GEN-LAST:event_GraficosButtonActionPerformed

    private void PasarACajasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasarACajasButtonActionPerformed
        int cont=NumeroCajeros.getValue().hashCode();
        if (cont==0){
            ErrorLabel.setText("No hay clientes");
        }
        while (cont!=0){
            try {
                matriz.sacar();
            } catch (MessagingException ex) {
                ErrorLabel.setText("Error para enviar Correo");
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            cont--;
        }    
    }//GEN-LAST:event_PasarACajasButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    private javax.swing.JButton ClientesListButton;
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JTextField CorreoText;
    public javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton GraficosButton;
    private javax.swing.JComboBox ListaComboBox;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JSpinner NumeroCajeros;
    private javax.swing.JLabel NumeroDeCajasLabel;
    private javax.swing.JButton PasarACajasButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JSeparator Separator;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
