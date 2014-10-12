package bancobac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarraGraficos extends JPanel {
    JFreeChart barra;
    DefaultCategoryDataset datos;
    JLabel grafico;
    JButton boton;

    public BarraGraficos(){

        datos = new DefaultCategoryDataset();

        boton=new JButton("Actualizar");
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                datos.setValue(10/*Aqui va la cantidad de los clientes discapacitados*/, "Personas Discapacitadas:", ""); 
                datos.setValue(20/*Aqui va la cantidad de los clientes adulto mayor*/, "Adulto Mayor:", "");
                datos.setValue(30/*Aqui va la cantidad de las mujeres embarazadas*/, "Mujeres Embarazadas:", "");
                datos.setValue(40/*Aqui va la cantidad de los clientes corporativos*/, "Clientes Corporativos:", "");
                datos.setValue(50/*Aqui va la cantidad de los clientes regulares*/, "Clientes Regulares:", "");
                BufferedImage pastelgrafico=barra.createBufferedImage(450, 300);
                ImageIcon img=new ImageIcon(pastelgrafico);
                grafico.setIcon(img);
            }

        });


        barra = ChartFactory.createBarChart3D("Sample Category Chart", "Quarters","Sales",datos,PlotOrientation.VERTICAL,true,true,true);

        BufferedImage pastelgrafico=barra.createBufferedImage(450, 300);
        ImageIcon img=new ImageIcon(pastelgrafico);
        grafico=new JLabel(img);

        JPanel p=new JPanel();
        p.add(boton);  

        add(grafico);
        add(p,BorderLayout.SOUTH);
    }
}
