public class Parentesis {

    public static boolean parentesis(String texto){
        boolean parentizada=false;
        String texto2=texto.replaceAll("[abcdefghijklmnopqrstuvwxyz1234567890,.ḉ+'*/+" +
                "_!·$%&/=<> ]","");
        for (int i = 0; i < texto2.length()-1; i++) {
            if(texto2.charAt(i)=='(' && texto2.charAt(i+1)==')' ){
                parentizada=true;
            }else {
                parentizada=false;
            }
        }

        return parentizada;

    }
    public static void main(String[] args) {
        String texto="(Esto es un texto bien parentizado)(hola,buenas)";
        String texto2="Esto es un texto ) mal parentizado))(hola,buenas";
        System.out.println(parentesis(texto.toLowerCase()));
        System.out.println(parentesis(texto2.toLowerCase()));
    }
}
