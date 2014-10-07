package bancobac;

/**
 *
 * @author Esteban
 */
public class Cola {
    private String[] clientes;
    
    public Cola(){
        ArrayList2 this.clientes =new ArrayList2();
    } 
    
    public void queue(String o){
        this.arreglo.add(String o);
    }
    
    public String dequeue(){
        if(this.arreglo.size == 0){
            throw new Exception()
        }
        
        String e=arreglo[0];
        this.arreglo.delete(0);
        return e;
    }
    
    public Object front(){
        return this.arreglo[0];
    }
    
    public void empty(){
        this.lista.empty();
    }
    
    public Object near(){
        return this.arreglo[size];
    }
    
    public int length(){
        return arreglo.size;
    }
}
