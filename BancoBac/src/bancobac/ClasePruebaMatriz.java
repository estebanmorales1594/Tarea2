package bancobac;

public class ClasePruebaMatriz {
    public int size;
    public int maxsize;
    public String[][]arreglo;
    public final int MAX_SIZE = 10;
   
    
    public ClasePruebaMatriz(){
        this.size = 0;
        this.maxsize = MAX_SIZE;
        this.arreglo = new String[10][5];
   
}
    public void agregar(String cliente, String correo, String tipo, String fecha, String hora){
        
        
        if (this.size < this.maxsize) {
            
            if (this.size<=4){
                
                this.arreglo[this.size][0] = cliente;
                this.arreglo[this.size][1] = correo;
                this.arreglo[this.size][2] = tipo;
                this.arreglo[this.size][3] = fecha;
                this.arreglo[this.size][4] = hora;
                
                this.size++;
            }
        
        }
        
    }
        
   
   
    public String getElemento(int indice, int indice2) {
        
        
        return arreglo[indice][indice2];
        
    }
    
    
    public void eliminarymostrar(){
        int i = 0;
        
        if (this.size != 0){
            
            while (i != this.size){
                this.arreglo[i][i] = this.arreglo[i+1][i+0];
                i ++;
            }
            this.size --;           
        }       
    }
 
public static void main(String[] args) throws Exception {
        
        ClasePruebaMatriz arreglo = new ClasePruebaMatriz();
        
        arreglo.agregar("nombre1", "correo1", "tipo1", "fecha1" , "hora1");
 
        
        arreglo.agregar("nombre2" , "correo2" , "tipo2" , "fecha2" , "hora2");

        
        arreglo.agregar("nombre3" , "correo3" , "tipo3" , "fecha3" ,"hora3");
       
        String elem = arreglo.getElemento(2,2);
        System.out.println(elem);
                                               
    }
        
   
    }


    

