package bancobac;


import javax.swing.*;


public class PrincipalGraficos extends JApplet {
    JTabbedPane pestañas;
    PastelGraficos pastelgrafico;
    BarraGraficos barragrafico;
    LineaGraficos lineagrafico;
 
    public void init(){
        pestañas=new JTabbedPane();
        pastelgrafico=new PastelGraficos();
        barragrafico=new BarraGraficos();
        lineagrafico=new LineaGraficos();

        pestañas.addTab("Grafico de Pastel", pastelgrafico);
        pestañas.addTab("Grafico de Barra", barragrafico);
        pestañas.addTab("Grafico de Linea", lineagrafico);
        add(pestañas);
    } 
}




