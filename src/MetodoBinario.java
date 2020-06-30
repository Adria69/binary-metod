//Importacion de las librerias necesarias para el proceso
import java.util.Arrays;
import java.util.Scanner;


public class MetodoBinario {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //Declaracion de la variable scaner
        
        //Ingresar el numero a buscar
        System.out.print("Ingrese el numero a buscar: ");
        int num_bus=sc.nextInt();
        
        System.out.print("Ingresa el tamaño del arreglo: "); //Mensaje para ingresar el tamaño del arreglo
        int tam = sc.nextInt();
        
        //Declaracion del arreglo
        int[] arreglo = new int[tam];
                
        //Insertar elementos en el arreglo
        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Ingresa un numero para la posicion " + i + " del arreglo: ");
            arreglo[i]=sc.nextInt();
        }
                
        //Ordenamiento por insercion
        for(int i=0; i<tam; i++){
            int pos = i;
            int aux = arreglo[i];
            
            while((pos>0)&&(arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        
        //Mostrar arreglo
        System.out.println("Contenido del arreglo ordenado");
        for(int y = 0; y<arreglo.length; y++){
            System.out.println("Arreglo["+y+"] = " +arreglo[y]);
        }
        
        // Declaracion de variables y proceso del metodo binario
        int inferior = 0;
        int centro;
        int superior = tam-1;
         
        //Proceso binario de busqueda del numero dado
        while(inferior <= superior){
            centro = (superior + inferior)/2;
            if(arreglo[centro] == num_bus){
                System.out.println("El numero buscado esta en la posicion: " +centro);
                break;
                
            }else if(num_bus < arreglo[centro]){
                superior = centro-1;
            }else{
                inferior = centro+1;
            }
            
        }
        
        //Proceso para mostrar que el numero a buscar no se encuentra dentro del arreglo
        centro=(superior + inferior)/2;
        while(arreglo[centro]!= num_bus){
            System.out.println("El numero no se encuentra en el arreglo");
            break;
        }
        
        }
    }