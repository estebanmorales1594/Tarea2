package bancobac;

/*
Esta clase es una prueba para ordenar datos de tipo "int",
HAY QUE IMPLEMENTARLA PARA "String"
*/

public class Quicksort{
    int[] matrix;
    public void Quicksort(int matrix[], int a, int b){
        this.matrix = new int[matrix.length];
        int buf;
        int from = a;
        int to = b;
        int pivot = matrix[(from+to)/2];
        do{
            while(matrix[from] < pivot){
                from++;
            }
            while(matrix[to] > pivot){
                to--;
            }
            if(from <= to){
                buf = matrix[from];
                matrix[from] = matrix[to];
                matrix[to] = buf;
                from++; to--;
            }
        }
        while(from <= to);
            if(a < to){
                Quicksort(matrix, a, to);
            }
            if(from < b){
                Quicksort(matrix, from, b);
            }
        this.matrix = matrix;
    }
    
    public static void main(String[] args){ 

    }
}