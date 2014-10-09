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
    JTextField variable1,variable2,variable3,variable4,variable5;
    JLabel grafico;
    JButton boton;

    public PastelGraficos(){
        variable1=new JTextField(7);
        variable1.setText("20");
        variable2=new JTextField(7);
        variable2.setText("40");
        variable3=new JTextField(7);
        variable3.setText("40");
        variable4=new JTextField(7);
        variable4.setText("40");
        variable5=new JTextField(7);
        variable5.setText("40");
        boton=new JButton("Actualizar");

        porciones=new DefaultPieDataset();
        if(variable1.getText().equalsIgnoreCase("")==false || variable2.getText().equalsIgnoreCase("")==false || variable3.getText().equalsIgnoreCase("")==false || variable4.getText().equalsIgnoreCase("")==false || variable5.getText().equalsIgnoreCase("")==false){
            porciones.setValue("Personas Discapacitadas:", Integer.parseInt(variable1.getText()));
            porciones.setValue("Adulto Mayor:", Integer.parseInt(variable2.getText()));
            porciones.setValue("Mujeres Embarazadas:", Integer.parseInt(variable3.getText()));
            porciones.setValue("Clientes Corporativos:", Integer.parseInt(variable4.getText()));
            porciones.setValue("Clientes Regulares:", Integer.parseInt(variable5.getText()));
        }

        pastel=ChartFactory.createPieChart3D("Grafico de Pastel", porciones, true, true, true);

        ActionListener accion=new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                porciones.insertValue(0, "Personas Discapacitadas:", Integer.parseInt(variable1.getText()));
                porciones.insertValue(1, "Adulto Mayor:", Integer.parseInt(variable2.getText()));
                porciones.insertValue(2, "Mujeres Embarazadas:", Integer.parseInt(variable3.getText()));
                porciones.insertValue(3, "Clientes Corporativos:", Integer.parseInt(variable4.getText()));
                porciones.insertValue(4, "Clientes Regulares:", Integer.parseInt(variable5.getText()));
                BufferedImage graficopastel=pastel.createBufferedImage(450, 300);
                ImageIcon img=new ImageIcon(graficopastel);
                grafico.setIcon(img);
            }

        };

        boton.addActionListener(accion);

        JPanel p=new JPanel();
        p.add(new JLabel("Personas Discapacitadas:"));
        p.add(variable1);
        p.add(new JLabel("Adulto Mayor:"));
        p.add(variable2);
        p.add(new JLabel("Mujeres Embarazadas:"));
        p.add(variable3);
        p.add(new JLabel("Clientes Corporativos:"));
        p.add(variable4);
        p.add(new JLabel("Clientes Regulares:"));
        p.add(variable5);
        p.add(boton);

        BufferedImage graficopastel=pastel.createBufferedImage(450, 300);
        ImageIcon img=new ImageIcon(graficopastel);
        grafico=new JLabel(img);
        add(grafico);
        add(p,BorderLayout.SOUTH);
    }
}
