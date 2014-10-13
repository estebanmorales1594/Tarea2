package bancobac;

/*
Esta clase es una prueba de funciones(IGNORAR)
*/
public class Prueba {
    
    public Prueba(){}
    
    public boolean Comparar(String valor1, String valor2){
        int n1=valor1.length();
        int n2=valor2.length();
        if (n1<n2){
            return true true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) { 
        Prueba p=new Prueba();
        boolean com=p.Comparar("Hola", "Adios");
        System.out.println(com);
    } 
    
}
