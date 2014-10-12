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
    
    EnviarCorreo4 Envia;
    
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
        
        this.Envia = new EnviarCorreo4();
        this.Correo = null;
        
    }

    public void agregarCola (String cliente, String correo, String tipo) {
        
    if (tipo == "discapacitado"){
        this.discapacitados.agregar(cliente, correo, tipo);
        this.discapacitadoscomp.agregar(cliente, correo, tipo);
    }
    
    else if (tipo=="adultomayor"){
        this.adultomayor.agregar(cliente, correo, tipo);
        this.adultomayorcomp.agregar(cliente, correo, tipo);      
    }
    
    else if (tipo == "embarazada"){
        this.embarazada.agregar(cliente, correo, tipo);
        this.embarazadacomp.agregar(cliente, correo, tipo);
    }
    else if (tipo == "corporativo"){
        this.corporativo.agregar(cliente, correo, tipo);
        this.corporativocomp.agregar(cliente, correo, tipo);
    }   
    
    else if (tipo == "normal"){
        this.normal.agregar(cliente, correo, tipo);
        this.normalcomp.agregar(cliente, correo, tipo);     
    } 
    
  }
    
    public void EnviarCorreoySacar() throws MessagingException{
        
        if (discapacitados != null ){
            
            Correo = this.discapacitados.tomarCorreo() ;
            Envia.EnviarCorreo(Correo, "discapacitado", "OMG");
            discapacitados.eliminar();
        }
        
        else if (adultomayor != null) {
           Correo = this.adultomayor.tomarCorreo() ;
           Envia.EnviarCorreo(Correo, "adultomayor", "OMG");
           adultomayor.eliminar();
        }
        
        else if (embarazada != null) {
           Correo = this.embarazada.tomarCorreo() ;
           Envia.EnviarCorreo(Correo, "embarazada", "OMG");
           embarazada.eliminar(); 
           
        }
        
        else if (corporativo != null) {
           Correo = this.corporativo.tomarCorreo() ;
           Envia.EnviarCorreo(Correo, "coprorativo", "OMG");
           corporativo.eliminar(); 
        
    }
        
        else if (normal != null) {
           
           Correo = this.normal.tomarCorreo() ;
           Envia.EnviarCorreo(Correo, "normal", "OMG");
           normal.eliminar(); 
        }
         
    }        
            
  public static void main(String[] args) throws Exception {
           
        ColaClientesArray cola = new ColaClientesArray();
        
        cola.agregarCola("pepe","jose12.13@hotmail.com","discapacitado");
        cola.agregarCola("juan","jose12.13@hotmail.com","corporativo");
        cola.agregarCola("maria","jose12.13@hotmail.com","embarazada");
        cola.agregarCola("mario","jose12.13@hotmail.com","normal");
        cola.agregarCola("jose","jose12.13@hotmail.com","adultomayor");
        cola.agregarCola("pepe","jose12.13@hotmail.com","");
        cola.agregarCola("juan","jose12.13@hotmail.com","corporativo");
        cola.agregarCola("maria","jose12.13@hotmail.com","embarazada");
        cola.agregarCola("mario","jose12.13@hotmail.com","normal");
        cola.agregarCola("jose","jose12.13@hotmail.com","adultomayor");
        cola.agregarCola("pepe","jose12.13@hotmail.com","");
        cola.agregarCola("juan","jose12.13@hotmail.com","corporativo");
        cola.agregarCola("maria","jose12.13@hotmail.com","embarazada");
        cola.agregarCola("mario","jose12.13@hotmail.com","normal");
        cola.agregarCola("jose","jose12.13@hotmail.com","adultomayor");
        
        cola.EnviarCorreoySacar() ;

        
        System.out.println(cola.discapacitados.getElemento(0,0));
        System.out.println(cola.normal.getElemento(0,0));
        System.out.println(cola.corporativo.getElemento(0,0));
        System.out.println(cola.embarazada.getElemento(0,0));
        System.out.println(cola.adultomayor.getElemento(0,0));
        
                
  }
}
