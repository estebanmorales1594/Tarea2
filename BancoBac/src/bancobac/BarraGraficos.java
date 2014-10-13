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

/*
Esta clase es para crear los graficos de barras, 
utilizando la libreria JFreeChart,
va a extraer el tamaña de cada una de las listas colas, 
dicha cantidad va a servir para realizar la grafica.
*/

public class BarraGraficos extends JPanel {
    JFreeChart barra;
    DefaultCategoryDataset datos;
    JLabel grafico;
    JButton boton;
    ColaClientesArray cola;

    public BarraGraficos(){

        datos = new DefaultCategoryDataset();

        boton=new JButton("Actualizar");
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int CantDisc=cola.discapacitados.size;
                int CantAdultos=cola.adultomayor.size;
                int CantEmb=cola.embarazada.size;
                int CantCorp=cola.corporativo.size;
                int CantNormal=cola.normal;
                /*Las cantidades se sacan en base a las cantidades que se 
                encuentran en el momento en el banco, si hubiera que hacerlo
                con la cantidad total.... 
                NADA MAS AGREGARLE A CADA UNO AL FINAL COMP
                */
                datos.setValue(CantDisc/*Aqui va la cantidad de los clientes discapacitados*/, "Personas Discapacitadas:", ""); 
                datos.setValue(CantAdultos/*Aqui va la cantidad de los clientes adulto mayor*/, "Adulto Mayor:", "");
                datos.setValue(CantEmb/*Aqui va la cantidad de las mujeres embarazadas*/, "Mujeres Embarazadas:", "");
                datos.setValue(CantCorp/*Aqui va la cantidad de los clientes corporativos*/, "Clientes Corporativos:", "");
                datos.setValue(CantNormal/*Aqui va la cantidad de los clientes regulares*/, "Clientes Regulares:", "");
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
