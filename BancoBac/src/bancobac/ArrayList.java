package bancobac;

public class ArrayList {
    private int size;
    private int maxsize;
    private int[] arreglo;
    private final int MAX_SIZE=10;
       
    public ArrayList(){
        this.size=0;
        this.maxsize=MAX_SIZE;
        this.arreglo=new int[10];
        this.arreglo=new int[this.maxsize];
	}
    public ArrayList(int max){
        this.size=0;
	this.maxsize=max;
        this.arreglo=new int[max];
    }

    public void add(int e) throws Exception{
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

    public int getElemento(int indice) throws Exception{
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
        ArrayList lista = new ArrayList();
        lista.add(8);
        lista.add(6);
        lista.add(5);
        lista.add(2);
        int elem=lista.getElemento(2);
        System.out.println(elem);
        lista.insert(2, 10);
        int elem2=lista.getElemento(2);
        System.out.println(elem2);
    }
}
   
