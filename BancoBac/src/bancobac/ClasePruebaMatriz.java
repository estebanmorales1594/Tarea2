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
        if (this.size < this.maxsize) {
            this.arreglo[this.size][this.size] = cliente;
            this.size++;       
        }
    }
    
    public String getElemento(int indice, int indice2) throws Exception{
        if (indice >= this.size) {
            throw new Exception();
        }
        else{
            return arreglo[indice][indice2];
        }
    } 
    
    public void eliminarymostrar(){
        int i = 0;
        
        if (this.size != 0){
            
            while (i != this.size){
                this.arreglo[i] = this.arreglo[i+1];
                i ++;
            }
            this.size --;           
        }       
    }
 
public static void main(String[] args) throws Exception {
        
        ClasePruebaMatriz arreglo = new ClasePruebaMatriz();
        
        arreglo.agregar("hola");
        arreglo.agregar("ADIOS");
        arreglo.agregar("abc");
        
        
       
            
        String elem = arreglo.getElemento(0,1);
            
        System.out.println(elem);
                                               
    }
        
       
    }


    

