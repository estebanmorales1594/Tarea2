package bancobac;

import javax.mail.MessagingException;

public class ColaClientesArray {
    
    ClasePruebaMatriz discapacitados;
    ClasePruebaMatriz adultomayor;
    ClasePruebaMatriz embarazada;
    ClasePruebaMatriz corporativo ;
    ClasePruebaMatriz normal ;
    
    ClasePruebaMatriz discapacitadoscomp;
    ClasePruebaMatriz adultomayorcomp;
    ClasePruebaMatriz embarazadacomp;
    ClasePruebaMatriz corporativocomp;
    ClasePruebaMatriz normalcomp;
    Interfaz vent;
    
    EnviarCorreo Envia;
    String Correo;
    
    public ColaClientesArray(){
        
        this.discapacitados = new ClasePruebaMatriz();
        this.adultomayor = new ClasePruebaMatriz();
        this.embarazada = new ClasePruebaMatriz();
        this.corporativo = new ClasePruebaMatriz();
        this.normal = new ClasePruebaMatriz();
    
        this.discapacitadoscomp = new ClasePruebaMatriz();
        this.adultomayorcomp = new ClasePruebaMatriz();
        this.embarazadacomp = new ClasePruebaMatriz();
        this.corporativocomp = new ClasePruebaMatriz();
        this.normalcomp = new ClasePruebaMatriz();
        
        this.Envia = new EnviarCorreo();
        this.Correo = null;
        
    }

    public void agregarCola (String cliente, String correo, String tipo) throws MessagingException {
        
    if (tipo == "discapacitado"){
        this.discapacitados.agregar(cliente, correo, tipo);
        this.discapacitadoscomp.agregarC(cliente, correo, tipo);
    }
    
    else if (tipo == "adulto mayor"){
        
        this.adultomayor.agregar(cliente, correo, tipo);
        this.adultomayorcomp.agregarC(cliente, correo, tipo);      
    }
    
    else if (tipo == "embarazada"){
        this.embarazada.agregar(cliente, correo, tipo);
        this.embarazadacomp.agregarC(cliente, correo, tipo);
    }
    else if (tipo == "corporativo"){
        this.corporativo.agregar(cliente, correo, tipo);
        this.corporativocomp.agregarC(cliente, correo, tipo);
    }   
    
    else if (tipo == "normal"){
        this.normal.agregar(cliente, correo, tipo);
        this.normalcomp.agregarC(cliente, correo, tipo);     
    } 
    
  }
    
 
    public void sacar() throws MessagingException{
        
<<<<<<< HEAD

        if (discapacitados.getElemento(0, 0) != null ){
            discapacitados.eliminar();
        }
        
        else if (adultomayor.getElemento(0, 0) != null) {
           adultomayor.eliminar();
        }
        
        else if (embarazada.getElemento(0, 0) != null) {
           embarazada.eliminar(); 
           
        }
        
        else if (corporativo.getElemento(0, 0) != null) {
           corporativo.eliminar(); 
        }
        
        else if (normal.getElemento(0, 0) != null) {
           normal.eliminar(); 
        }


      
   
        }   
    

    

=======
        if (discapacitados != null ){
            discapacitados.eliminar();
        }
        else{ 
            if (adultomayor != null) {
                adultomayor.eliminar();
            }
            else{
                if (embarazada != null) {
                    embarazada.eliminar(); 
                }
                else{
                    if (corporativo != null) {
                        corporativo.eliminar();   
                    }
                    else{ 
                        if (normal != null) {
                            normal.eliminar(); 
                        }
                        else{
                            vent.Error("Ya no hay clientes");
                        }
                    }
                }
            }
        }    
    }        
>>>>>>> parent of 00d3c59... Algunas con Documentacion
            
  public static void main(String[] args) throws Exception {
           
        ColaClientesArray cola = new ColaClientesArray();
        ClasePruebaMatriz hola = new ClasePruebaMatriz();
        
<<<<<<< HEAD



        cola.agregarCola("pepe","jose12.13@hotmail.com","adulto mayor");
        cola.agregarCola("juan","jose12.13@hotmail.com","discapacitado");
        cola.agregarCola("maria","jose12.13@hotmail.com","discapacitado");
        cola.agregarCola("hola","jose12.13@hotmail.com","adulto mayor");
        cola.agregarCola("nooooo","jose12.13@hotmail.com","normal");

=======
        cola.agregarCola("pepe","estebanmorales1594@hotmail.com","discapacitado");
        cola.agregarCola("juan","estebanmorales1594@gmail.com","corporativo");
        cola.agregarCola("maria","estebanmorales1594@hotmail.com","embarazada");
        
>>>>>>> parent of 00d3c59... Algunas con Documentacion
        
        cola.sacar();
        cola.sacar();
        cola.sacar();
        cola.sacar();


        System.out.println(cola.discapacitados.getElemento(0,0));
        System.out.println(cola.adultomayor.getElemento(0,0));
        System.out.println(cola.embarazada.getElemento(0,0));
        System.out.println(cola.corporativo.getElemento(0,0));
        System.out.println(cola.normal.getElemento(0,0));               
  }
}
