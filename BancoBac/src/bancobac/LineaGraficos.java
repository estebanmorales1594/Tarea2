package bancobac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.*;

public class LineaGraficos extends JPanel {
    XYSeries series;
    XYDataset datos;
    JFreeChart linea;
    JTextField variable;
    JLabel grafico;
    JButton boton;
    int x=0;

    public LineaGraficos(){

        variable=new JTextField(7);
        boton=new JButton("Actualizar");
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                series.add(Integer.parseInt(variable.getText()),x);
                x++;
                BufferedImage pastelgrafico=linea.createBufferedImage(450, 300);
                ImageIcon img=new ImageIcon(pastelgrafico);
                grafico.setIcon(img);
            }

        });

        series= new XYSeries("Popularidad Java Zone");
        series.add(5,x);
        x++;
        series.add(30,x);
        x++;
        series.add(40,x);
        x++;

        datos = new XYSeriesCollection(series);
        linea = ChartFactory.createXYLineChart("Ejemplo Grafico de Linea","Popularidad","Meses",datos,PlotOrientation.HORIZONTAL,true,true,true);

        BufferedImage pastelgrafico=linea.createBufferedImage(450, 300);
        ImageIcon img=new ImageIcon(pastelgrafico);
        grafico=new JLabel(img);

        JPanel p=new JPanel();
        p.add(new JLabel("Valor Popularidad:"));
        p.add(variable);
        p.add(boton);
        add(grafico);
        add(p,BorderLayout.SOUTH);
    }
}

