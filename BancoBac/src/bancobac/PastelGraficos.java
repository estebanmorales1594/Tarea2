package bancobac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/*
Esta clase es para crear los graficos pastel, 
utilizando la libreria JFreeChart,
va a extraer el tamaña de cada una de las listas colas, 
dicha cantidad va a servir para realizar la grafica.
*/

public class PastelGraficos extends JPanel {
    DefaultPieDataset porciones;
    JFreeChart pastel;
    JLabel grafico;
    JButton boton;
    ColaClientesArray cola;

    public PastelGraficos(){
        boton=new JButton("Actualizar");

        porciones=new DefaultPieDataset();

        pastel=ChartFactory.createPieChart3D("Grafico de Pastel", porciones, true, true, true);

        ActionListener accion=new ActionListener(){

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
                porciones.insertValue(0, "Personas Discapacitadas:", CantDisc/*Aqui va la cantidad de los clientes discapacitados*/);
                porciones.insertValue(1, "Adulto Mayor:", CantAdultos/*Aqui va la cantidad de los clientes adulto mayor*/);
                porciones.insertValue(2, "Mujeres Embarazadas:", CantEmb/*Aqui va la cantidad de las mujeres dicapacitadas*/);
                porciones.insertValue(3, "Clientes Corporativos:", CantCorp/*Aqui va la cantidad de los clientes corporativos*/);
                porciones.insertValue(4, "Clientes Regulares:", CantNormal/*Aqui va la cantidad de los clientes regulares*/);
                BufferedImage graficopastel=pastel.createBufferedImage(450, 300);
                ImageIcon img=new ImageIcon(graficopastel);
                grafico.setIcon(img);
            }

        };

        boton.addActionListener(accion);

        JPanel p=new JPanel();
        p.add(boton);

        BufferedImage graficopastel=pastel.createBufferedImage(450, 300);
        ImageIcon img=new ImageIcon(graficopastel);
        grafico=new JLabel(img);
        add(grafico);
        add(p,BorderLayout.SOUTH);
    }
}
