public class Siglas {

    public static String siglas(String []frase){
        String siglas="";
        for (int i = 0; i < frase.length; i++) {
            if(Character.isUpperCase(frase[i].charAt(0)))
             siglas+=frase[i].charAt(0);
        }
        return siglas.toUpperCase();
    }

    public static void main(String[] args) {
        String frase= "Escuela Oficial de Idiomas";
        String [] cadena= frase.split(" ");
        System.out.println(siglas(cadena));
    }
}