/*
Mostrar por pantalla el valor mayor del vector de 5 elementos
 */
package primera2223;

public class Ejercicio015 {
    public static void main(String arg[]){
        int datos[] = {-17, -55, -23, -11, -88};
        int mayor = datos[0];// le asigno el primer valor, para que también funciones con los números negativos
        int posmax = 0; //para saber cuál es la posición que ocupa
        for(int i = 1; datos.length > i; i++){// empezamos en 1 para que no se compare consigo mismo
            if (datos[i] > mayor){
                mayor = datos[i];
                posmax = i;
               } 
        }
        System.out.printf("El número mayor es %d y está en la posición %d \n", mayor, posmax);
        
    
    
    }
    
}
