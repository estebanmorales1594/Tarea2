package bancobac;

public class ArrayList2 {
    private int size;
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
            this.arreglo[this.size]=e;
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

    public void insert(int indice, int e) throws Exception{
        for(int i=indice; indice<=this.size++;i++){
            int temp1;
            temp1= getElemento(i);
            this.arreglo[i]=e;
            e= temp1;
        }
    }

    public int find(int e){
        for (int i=0;i<=this.size;i++){
            if(e==this.arreglo[i]){
                return i;
            }
        }
        return 0;
    }
/*
    public void delete(int e){
        for(int i=0; i<=this.size++){
            if (e==this.arreglo[i]){
                for(int j, j<=this.size--,i++);{
                    this.arreglo[i]=getElemento(++i);
                }
            }
	}
    } 
    */
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