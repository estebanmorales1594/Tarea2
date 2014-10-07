package bancobac;

/**
 *
 * @author Esteban
 */
public class Cola {
    private Lista lista;
    
    public Cola(){
        this.lista=new lista();
    } 
    
    public void queue(Object o){
        this.lista.agregar(o);
    }
    
    public Object dequeue(){
        if(this.lista.isEmpty()){
            throw new Exception()
        }
        
        Object e=this.lista.first();
        this.lista.delete(0);
        return e;
    }
    
    public Object front(){
        return this.lista.first();
    }
    
    public void empty(){
        this.lista.empty();
    }
    
    public Object near(){
        return this.lista.last();
    }
    
    public int length(){
        return this.lista.size();
    }
}
