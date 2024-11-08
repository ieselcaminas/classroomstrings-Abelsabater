import java.util.Scanner;

public class Longitud {
    public static int longitud(String cadena,int longitud){
        int contador=0;
        String [] palabras=cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length()==longitud){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime de quantes lletres vols");
        int longitud =sc.nextInt();
        String cadena= "Esto es una frase hoy es un buen dia";
        System.out.println(longitud(cadena,longitud));
    }
}
