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
    JTextField variable1,variable2,variable3,variable4,variable5;
    JLabel grafico;
    JButton boton;

    public BarraGraficos(){
        variable1=new JTextField(7);
        variable1.setText("20");
        variable2=new JTextField(7);
        variable2.setText("40");
        variable3=new JTextField(7);
        variable3.setText("10");
        variable4=new JTextField(7);
        variable4.setText("40");
        variable5=new JTextField(7);
        variable5.setText("10");

        datos = new DefaultCategoryDataset();

        boton=new JButton("Actualizar");
        boton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                datos.setValue(Integer.parseInt(variable1.getText()), "Personas Discapacitadas:", "");
                datos.setValue(Integer.parseInt(variable2.getText()), "Adulto Mayor:", "");
                datos.setValue(Integer.parseInt(variable3.getText()), "Mujeres Embarazadas:", "");
                datos.setValue(Integer.parseInt(variable4.getText()), "Clientes Corporativos:", "");
                datos.setValue(Integer.parseInt(variable5.getText()), "Clientes Regulares:", "");
                BufferedImage pastelgrafico=barra.createBufferedImage(450, 300);
                ImageIcon img=new ImageIcon(pastelgrafico);
                grafico.setIcon(img);
            }

        });

        datos.addValue(Integer.parseInt(variable1.getText()), "Personas Discapacitadas:", "");
        datos.addValue(Integer.parseInt(variable2.getText()), "Adulto Mayor:", "");
        datos.addValue(Integer.parseInt(variable3.getText()), "Mujeres Embarazadas:", "");
        datos.addValue(Integer.parseInt(variable4.getText()), "Clientes Corporativos:", "");
        datos.addValue(Integer.parseInt(variable5.getText()), "Clientes Regulares:", "");

        barra = ChartFactory.createBarChart3D("Sample Category Chart", "Quarters","Sales",datos,PlotOrientation.VERTICAL,true,true,true);

        BufferedImage pastelgrafico=barra.createBufferedImage(450, 300);
        ImageIcon img=new ImageIcon(pastelgrafico);
        grafico=new JLabel(img);

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

        add(grafico);
        add(p,BorderLayout.SOUTH);
    }
}
