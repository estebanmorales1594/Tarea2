package bancobac;
import java.util.List;

public class ArrayList2 {
    public int size;
    private int maxsize;
    private String[] arreglo;
    private final int MAX_SIZE=10;
       
    public ArrayList2(){
        this.size=0;
        this.maxsize=MAX_SIZE;
        this.arreglo=new String[10];
	}
    
    public ArrayList2(int max){
        this.size=0;
	this.maxsize=max;
        this.arreglo=new String[max];
    }

    public void add(String e) throws Exception{
        if (this.size<this.maxsize){
            this.arreglo[this.size]=  e;
            this.size++;
        }
        else{   
            throw new Exception();
        }
    }
    

    public int getsize(){
        return this.size;
    }

    public String getElemento(int indice) throws Exception{
        if (indice >= this.size) {
            throw new Exception();
        }
        else{
            return arreglo[indice];
        }
    }

    public void empty(){
        this.size=0;
    }

    public void eliminarymostrar(){
        int i = 0;
        
        if (this.size != 0){
            System.out.println(arreglo[0]);
            while (i != this.size){
                this.arreglo[i] = this.arreglo[i+1];
                i ++;
            }
            this.size --;           
        }       
    }
   

    public static void main(String[] args) throws Exception{
        ArrayList2 lista = new ArrayList2();
        lista.add("Hola");
        lista.add("Adios");
        lista.add("Esteban");
        lista.add("Jose");
        String elem=lista.getElemento(2);
        System.out.println(elem);
    }

}