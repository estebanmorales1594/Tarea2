package bancobac;


import javax.swing.*;


public class PrincipalGraficos extends JApplet {
    JTabbedPane pestañas;
    PastelGraficos pastelgrafico;
    BarraGraficos barragrafico;
 
    public void init(){
        pestañas=new JTabbedPane();
        pastelgrafico=new PastelGraficos();
        barragrafico=new BarraGraficos();

        pestañas.addTab("Grafico de Pastel", pastelgrafico);
        pestañas.addTab("Grafico de Barra", barragrafico);
        add(pestañas);
    } 
}




