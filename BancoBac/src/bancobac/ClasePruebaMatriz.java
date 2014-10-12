package bancobac;

import javax.mail.MessagingException;

public class ClasePruebaMatriz {
    public int size;
    public int maxsize;
    public String[][]arreglo;
    public final int MAX_SIZE = 10;
    EnviarCorreo4 Envia;
    String Correo;
   
    
    public ClasePruebaMatriz(){
        this.size = 0;
        this.maxsize = MAX_SIZE;
        this.arreglo = new String[100][3];
        this.Envia = new EnviarCorreo4();
        
 
   
}
    public void agregar(String cliente, String correo, String tipo){
        
        
        if (this.size < this.maxsize) {
               
            this.arreglo[this.size][0] = cliente;
            this.arreglo[this.size][1] = correo;
            this.arreglo[this.size][2] = tipo;               
            this.size++;
            }        
        }        
    
    public String getElemento(int indice, int indice2) {
        
        
        return arreglo[indice][indice2];
        
    }
    
    
    public void eliminar(){
        int i = 0;
        
        if (this.size != 0){
            
            while (i != this.size){
                this.arreglo[i] = this.arreglo[i+1];
                i ++;
            }
            this.size --;           
        }       
    }
    
    public String tomarCorreo(){
        return this.arreglo[0][1];
    
}

 
public static void main(String[] args) throws Exception {
        
        ClasePruebaMatriz arreglo = new ClasePruebaMatriz();
        
        arreglo.agregar("nombre1", "correo1", "tipo1");
        arreglo.agregar("nombre2" , "correo2" , "tipo2");
        arreglo.agregar("nombre3" , "correo3" , "tipo3");

        arreglo.eliminar();
        arreglo.eliminar();
        
        String elem = arreglo.tomarCorreo();
       
        System.out.println(elem);
                                               
    }


    }


    

