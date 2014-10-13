package bancobac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
Esta clase es una prueba para ordenar fechas
*/

public class PrincipalFecha extends JApplet {
    PanelDibujo pd;
    JButton ordenar;
    JRadioButton ascendente;
    JRadioButton descendente;

    public void init(){
        JPanel fechas=new JPanel();
        ordenar=new JButton("Ordenar"); 
        
        ordenar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //pd.fechas 
                        /*Como  hacer para que tome todas las fechas y que 
                        las guarde en "pd.fechas" que es una lista en PanelDibujo, en vez de 
                        agregar una por una*/
                pd.agregarFecha(22,10,2014);
                pd.agregarFecha(22,11,2014);
                pd.agregarFecha(22,9,2014);
                pd.agregarFecha(21,10,2014);
                pd.agregarFecha(21,9,2014);
                pd.agregarFecha(21,11,2014);
                pd.agregarFecha(23,10,2014);
                pd.agregarFecha(23,11,2014);
                pd.agregarFecha(23,9,2014);
                pd.agregarFecha(22,10,2013);
                pd.agregarFecha(22,11,2013);
                pd.agregarFecha(22,9,2013);
                pd.agregarFecha(21,10,2013);
                pd.agregarFecha(21,9,2013);
                pd.agregarFecha(21,11,2013);
                pd.agregarFecha(23,10,2013);
                pd.agregarFecha(23,11,2013);
                pd.agregarFecha(23,9,2013);
                pd.agregarFecha(22,10,2015);
                pd.agregarFecha(22,11,2015);
                pd.agregarFecha(22,9,2015);
                pd.agregarFecha(21,10,2015);
                pd.agregarFecha(21,9,2015);
                pd.agregarFecha(21,11,2015);
                pd.agregarFecha(23,10,2015);
                pd.agregarFecha(23,11,2015);
                pd.agregarFecha(23,9,2015);
                if(ascendente.isSelected()){
                    pd.ordenarAscendente();
                }
                else{
                    if(descendente.isSelected()){
                        pd.ordenarDescendente();
                    }
                }
                pd.repaint();
                repaint();
            }
        });

        fechas.add(ordenar);

        add(fechas,BorderLayout.NORTH);

        JPanel porden=new JPanel();
        ascendente=new JRadioButton("Ascendente");
        ascendente.setSelected(true);
        descendente=new JRadioButton("Descendente");
        ButtonGroup grupo=new ButtonGroup();
        grupo.add(ascendente);
        grupo.add(descendente);

        porden.add(ascendente);
        porden.add(descendente);

        add(porden,BorderLayout.SOUTH);

        pd=new PanelDibujo(this);
        add(pd);
    }
}
