import java.util.Scanner;

public class Longitud3 {
    public static boolean longitudIII(String cadena,int longitud){
        String [] palabras=cadena.split(" ");
        boolean llargaria=false;
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].length()>=longitud){
                llargaria=true;
                break;
            }
        }
        return llargaria;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime de quantes lletres vols");
        int longitud =sc.nextInt();
        String cadena= "Esto es una frase hoy es un buen dia";
        if(longitudIII(cadena, longitud))
            System.out.println("Hi ha alguna llarga");
        else
            System.out.println("Son totes curtes");

    }
}
