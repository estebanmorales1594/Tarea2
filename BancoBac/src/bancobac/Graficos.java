/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bancobac;

import java.awt.Component;
import java.util.Locale;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ValueAxis;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYSplineRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Esteban
 */
public class Graficos extends javax.swing.JFrame {
    private Component Component;

    public Graficos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lineasPanel.setVisible(true);
        this.pastelPanel.setVisible(true);
        this.barrasPanel.setVisible(true);
        
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        barrasRadio = new javax.swing.JRadioButton();
        pastelRadio = new javax.swing.JRadioButton();
        lineasRadio = new javax.swing.JRadioButton();
        capas = new javax.swing.JLayeredPane();
        pastelPanel = new javax.swing.JPanel();
        barrasPanel = new javax.swing.JPanel();
        lineasPanel = new javax.swing.JPanel();
        graficarBoton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel1.setText("Tipo de grafico");

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Datos 1", "Datos 2"
            }
        ));
        jScrollPane2.setViewportView(datos);

        barrasRadio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        barrasRadio.setText("Barras");
        barrasRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barrasRadioActionPerformed(evt);
            }
        });

        pastelRadio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        pastelRadio.setText("Pastel");
        pastelRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastelRadioActionPerformed(evt);
            }
        });

        lineasRadio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lineasRadio.setText("Lineas");
        lineasRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineasRadioActionPerformed(evt);
            }
        });

        capas.setBackground(new java.awt.Color(0, 0, 0));
        capas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        capas.setPreferredSize(new java.awt.Dimension(370, 370));

        pastelPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pastelPanel.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout pastelPanelLayout = new javax.swing.GroupLayout(pastelPanel);
        pastelPanel.setLayout(pastelPanelLayout);
        pastelPanelLayout.setHorizontalGroup(
            pastelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );
        pastelPanelLayout.setVerticalGroup(
            pastelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        barrasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        barrasPanel.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout barrasPanelLayout = new javax.swing.GroupLayout(barrasPanel);
        barrasPanel.setLayout(barrasPanelLayout);
        barrasPanelLayout.setHorizontalGroup(
            barrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        barrasPanelLayout.setVerticalGroup(
            barrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        lineasPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lineasPanel.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout lineasPanelLayout = new javax.swing.GroupLayout(lineasPanel);
        lineasPanel.setLayout(lineasPanelLayout);
        lineasPanelLayout.setHorizontalGroup(
            lineasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        lineasPanelLayout.setVerticalGroup(
            lineasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout capasLayout = new javax.swing.GroupLayout(capas);
        capas.setLayout(capasLayout);
        capasLayout.setHorizontalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, capasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lineasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barrasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pastelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        capasLayout.setVerticalGroup(
            capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pastelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(capasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(capasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lineasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barrasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        capas.setLayer(pastelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(barrasPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        capas.setLayer(lineasPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        graficarBoton.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        graficarBoton.setText("Graficar");
        graficarBoton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graficarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        graficarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(barrasRadio)
                            .addGap(18, 18, 18)
                            .addComponent(pastelRadio)
                            .addGap(18, 18, 18)
                            .addComponent(lineasRadio))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(graficarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barrasRadio)
                            .addComponent(pastelRadio)
                            .addComponent(lineasRadio))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(graficarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barrasRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barrasRadioActionPerformed
        barrasPanel.setVisible(true);
        capas.setLayer(barrasPanel, 0, 0);
        pastelRadio.setSelected(false);
        lineasRadio.setSelected(false);
    }//GEN-LAST:event_barrasRadioActionPerformed

    private void pastelRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastelRadioActionPerformed
        pastelPanel.setVisible(true);
        capas.setLayer(pastelPanel, 0, 0);
        barrasRadio.setSelected(false);
        lineasRadio.setSelected(false);
    }//GEN-LAST:event_pastelRadioActionPerformed

    private void lineasRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineasRadioActionPerformed
        lineasPanel.setVisible(true);
        capas.setLayer(lineasPanel, 0, 0);
        pastelRadio.setSelected(false);
        barrasRadio.setSelected(false);
    }//GEN-LAST:event_lineasRadioActionPerformed

    private void graficarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarBotonActionPerformed
        ChartPanel panel;
        JFreeChart chart= null;
        
        if(lineasRadio.isSelected()){
            int validar=1;
            XYSplineRenderer renderer = new XYSplineRenderer();
            XYSeriesCollection dataset = new XYSeriesCollection();
            
            ValueAxis x = new NumberAxis();
            ValueAxis y = new NumberAxis();
            
            XYSeries serie = new XYSeries("Datos");
            
            XYPlot plot;
            lineasPanel.removeAll();
            
            try{
                for(int fila=0;fila<3;fila++){
                    serie.add(Float.parseFloat(String.valueOf(datos.getValueAt(fila, 0))),
                            Float.parseFloat(String.valueOf(datos.getValueAt(fila, 1))));
                }
            }
            catch(Exception ex){
                validar=0;
            }
            
            if (validar==1){
                dataset.addSeries(serie);
                
                x.setLabel("Eje X");
                y.setLabel("Eje Y");
                plot = new XYPlot(dataset,x,y,renderer);
                chart = new JFreeChart(plot);
                chart.setTitle("Grafico de Lineas");
            }
            else{
                JOptionPane.showMessageDialog(this, "Debe llenar con numeros");
            }
        }
        else{
            if(barrasRadio.isSelected()){
                DefaultCategoryDataset data = new DefaultCategoryDataset();
                
                String producto1 = "Sopas";
                String producto2 = "Soda";
                
                String dia1 = "Dia 1";
                String dia2 = "Dia 2";
                String dia3 = "Dia 3";
                String dia4 = "Dia 4";
                
                data.addValue(18, producto1, dia1);
                data.addValue(15, producto1, dia2);
                data.addValue(14, producto1, dia3);
                data.addValue(1, producto1, dia4);
                
                data.addValue(50, producto2, dia1);
                data.addValue(45, producto2, dia2);
                data.addValue(31, producto2, dia3);
                data.addValue(10, producto2, dia4);
                
                chart = ChartFactory.createBarChart("Grafico de Barras", 
                        "Dia", 
                        "Cantidad", 
                        data, 
                        PlotOrientation.HORIZONTAL, 
                        true, true, true);
                CategoryPlot plot = (CategoryPlot) chart.getPlot();
                plot.setDomainGridlinesVisible(true);
            }
            else{
                DefaultPieDataset data = new DefaultPieDataset();
                data.setValue("Categoria 1", 20);
                data.setValue("Categoria 2", 60);
                data.setValue("Categoria 3", 20);
                
                chart = ChartFactory.createPieChart3D("Grafico Pastel", 
                        data, 
                        true, true, true);
            }
        }
        panel = new ChartPanel(chart);
        panel.setBounds(5, 10, 410, 400);
        
        if (lineasRadio.isSelected()){
            lineasPanel.add(capas);
            lineasPanel.repaint();
        }
        else{
            if(barrasRadio.isSelected()){
                barrasPanel.add(capas);
                barrasPanel.repaint();
            }
            else{
                Component /*add*/ = pastelPanel.add(capas);
                pastelPanel.repaint();
            }
        }
    }//GEN-LAST:event_graficarBotonActionPerformed

    public static void main(String[] args){
        Graficos graficos = new Graficos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barrasPanel;
    private javax.swing.JRadioButton barrasRadio;
    private javax.swing.JLayeredPane capas;
    private javax.swing.JTable datos;
    private javax.swing.JButton graficarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel lineasPanel;
    private javax.swing.JRadioButton lineasRadio;
    private javax.swing.JPanel pastelPanel;
    private javax.swing.JRadioButton pastelRadio;
    // End of variables declaration//GEN-END:variables
}
