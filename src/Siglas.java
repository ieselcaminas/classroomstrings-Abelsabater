public class Siglas {

    public static String siglas(String frase){
        String [] cadena= frase.split(" ");
        String siglas="";
        for (int i = 0; i < cadena.length; i++) {
            siglas+=cadena[i].charAt(0);
        }
        return siglas.toUpperCase();
    }

    public static void main(String[] args) {
        String frase= "Hola aço es una frase";
        System.out.println(siglas(frase));
    }
}
