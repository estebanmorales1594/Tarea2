package bancobac;

import java.util.Arrays;

public class Matriz {
    public int size;
    private final int maxsize;
    private Object matriz;
    private final int MAX_SIZE=10;
       
    public Matriz(){
        this.size=0;
        this.maxsize=MAX_SIZE;
        this.matriz=new Object[10];
	}
    

    public void add(Object e) throws Exception{
        if (this.size<this.maxsize){
            this.matriz[this.size]=  e;
            this.size++;
        }
        else{   
            throw new Exception();
        }
    }

    public int getsize(){
        return this.size;
    }

    public Object getElemento(int indice) throws Exception{
        if (indice >= this.size) {
            throw new Exception();
        }
        else{
            return matriz[indice];
        }
    }

    public void empty(){
        this.size=0;
    }

    public void eliminarymostrar(){
        int i = 0;
        
        if (this.size != 0){
            System.out.println(matriz[0]);
            while (i != this.size){
                this.matriz[i] = this.matriz[i+1];
                i ++;
            }
            this.size --;           
        }       
    }
   

    public static void main(String[] args) throws Exception{
        Matriz matriz = new Matriz();
        matriz.add("gdgeg");
        matriz.add("sfegege");
        matriz.add("sfwfwfw");
        matriz.add("gegegeg");
        String[] elem;
        elem = matriz.getElemento(2);
        System.out.println(Arrays.toString(elem));
    }
}