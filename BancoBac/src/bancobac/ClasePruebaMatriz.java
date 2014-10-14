package bancobac;

import javax.mail.MessagingException;

public class ClasePruebaMatriz {

    public int size;
    public int maxsize;
    public String[][] arreglo;
    public final int MAX_SIZE = 10;
    EnviarCorreo Envia;
    String Correo;
    public int abc;

    public ClasePruebaMatriz() {
        this.size = 0;
        this.maxsize = MAX_SIZE;
        this.arreglo = new String[100][3];
        this.Envia = new EnviarCorreo();
        this.abc = 1;

    }

    public void agregar(String cliente, String correo, String tipo) throws MessagingException {

        if (this.size < this.maxsize) {
            this.arreglo[this.size][0] = cliente;
            this.arreglo[this.size][1] = correo;
            this.arreglo[this.size][2] = tipo;
            this.size++;
<<<<<<< HEAD
            Envia.Enviador(correo, "Banco", "Sr(a). " + cliente + " usted ha sido agregado a nuestro sistema");
        }
        
=======
            Envia.Enviador(correo, "Banco", "Sr(a). "+cliente+" usted ha sido agregado a nuestro sistema");
            }
>>>>>>> parent of 00d3c59... Algunas con Documentacion
    }        
    
    
    public void agregarC(String cliente, String correo, String tipo) throws MessagingException{  
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

    public void empty() {
        this.size = 0;
    }

    public void eliminar() throws MessagingException {
        int i = 0;
<<<<<<< HEAD

        String Correo2 = this.arreglo[0][1];
        String nombre2 = this.arreglo[0][0];

        Envia.Enviador(Correo2, "Se turno", "Sr(a)"+nombre2+", llego su turno puede pasar a la caja");
=======
        
        if (this.size != 0){
            String Correo2 = this.arreglo[0][1];
            String nombre2 = this.arreglo[0][0];
            Envia.Enviador(Correo2, "Se turno", "Sr(a)"+nombre2+", llego su turno puede pasar a la caja");
>>>>>>> parent of 00d3c59... Algunas con Documentacion
            
        while (i != this.size){
            this.arreglo[i] = this.arreglo[i+1];
            i ++;
            }
        this.size --;           
        }       
}
