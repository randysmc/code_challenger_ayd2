import java.util.Arrays;
import java.util.Scanner;


public class Anagrama{


    public static boolean esAnagrama(String palabra1, String palabra2){

        //primero validamos que las palabras tengan la misma longitud
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        //ahora miramos si la longitud de palabra 1 es igual a la longitud de palabra 2
        boolean resultado = true;

        if(palabra1.length() != palabra2.length()){
            resultado = false;
        } 
        else{

            char[] palabra1Char = palabra1.toCharArray();  
            char[] palabra2Char = palabra2.toCharArray();  
            Arrays.sort(palabra1Char);  
             //O(n log n)
            Arrays.sort(palabra2Char);  
            //O(m log m)
            resultado = Arrays.equals(palabra1Char, palabra2Char); 
        }


    return resultado;
    }




    public static void main(String[]args){
        //System.out.println(esAnagrama("espada", "pesada"));
        //System.out.println(esAnagrama("hola", null));
        Scanner sc = new Scanner(System.in);
        String p1 = "";
        String p2 = "";
        System.out.println("Ingrese la primer palabra");
        p1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra");
        p2 = sc.nextLine();

        System.out.println(esAnagrama(p1, p2));
    

    }
}

