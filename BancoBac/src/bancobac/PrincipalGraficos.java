package bancobac;


import javax.swing.*;

/*
Esta clase es la ventana principal de los graficos, la cual hace uso 
de las clases "BarrasGraficos" y "PastelGraficos" para mostrar los graficos

Falta implementarla dentro de la Interfaz
*/

public class PrincipalGraficos extends JApplet {
    JTabbedPane pestañas;
    PastelGraficos pastelgrafico;
    BarraGraficos barragrafico;
 
    @Override
    public void init(){
        pestañas=new JTabbedPane();
        pastelgrafico=new PastelGraficos();
        barragrafico=new BarraGraficos();

        pestañas.addTab("Grafico de Pastel", pastelgrafico);
        pestañas.addTab("Grafico de Barra", barragrafico);
        add(pestañas);
    } 
}
