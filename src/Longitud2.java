import java.util.Scanner;

public class Longitud2 {
    public static boolean longitudII(String cadena,int longitud){
        boolean palabra=false;
        String [] palabras=cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length()==longitud){
                palabra= true;
                break;
            }
        }
        return palabra;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime de quantes lletres vols");
        int longitud =sc.nextInt();
        String cadena= "Esto es una frase hoy es un buen dia";
        if(longitudII(cadena,longitud)){
            System.out.println("Hi ha alguna que te "+longitud+" lletres");
        }
    }
}
