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
    public void agregar(String cliente){
        int c = 0;
        
        if (this.size < this.maxsize) {
            
            if (this.size<=4){
                this.arreglo[c][this.size] = cliente;
                this.size++;
            }
            else{                
                this.size = 0;
                if (this.size < 5) {
                    ++c;
                    this.arreglo[c][this.size] = cliente;
                    this.size++;
            }
        }
    }
    }
    public String getElemento(int indice, int indice2) throws Exception{
        
        
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
        
        arreglo.agregar("holaA");
        arreglo.agregar("ADIOS");
        arreglo.agregar("abc");
        arreglo.agregar("sisis");
        arreglo.agregar("nonono");
        
        arreglo.agregar("0 de indice 1");
        arreglo.agregar("1 de indice 1");
        arreglo.agregar("2 de indice 1");
        arreglo.agregar("3 de indice 1");
        arreglo.agregar("4 de indice 1");
        
        arreglo.agregar("vaaamos");
       
        String elem = arreglo.getElemento(1,4);
        System.out.println(elem);
                                               
    }
        
   
    }


    

