package bancobac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PastelGraficos extends JPanel {
    DefaultPieDataset porciones;
    JFreeChart pastel;
    JLabel grafico;
    JButton boton;

    public PastelGraficos(){
        boton=new JButton("Actualizar");

        porciones=new DefaultPieDataset();

        pastel=ChartFactory.createPieChart3D("Grafico de Pastel", porciones, true, true, true);

        ActionListener accion=new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                porciones.insertValue(0, "Personas Discapacitadas:", 10/*Aqui va la cantidad de los clientes discapacitados*/);
                porciones.insertValue(1, "Adulto Mayor:", 20/*Aqui va la cantidad de los clientes adulto mayor*/);
                porciones.insertValue(2, "Mujeres Embarazadas:", 30/*Aqui va la cantidad de las mujeres dicapacitadas*/);
                porciones.insertValue(3, "Clientes Corporativos:", 40/*Aqui va la cantidad de los clientes corporativos*/);
                porciones.insertValue(4, "Clientes Regulares:", 50/*Aqui va la cantidad de los clientes regulares*/);
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
