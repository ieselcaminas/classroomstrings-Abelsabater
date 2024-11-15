public class Parentesis {
    public static boolean parentesis(String texto){
        boolean parentizada=false;
        int oberta=0;
        int tancada=0;
        String ultima="";
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)=='('){
                oberta++;
                ultima="(";
            } else if (texto.charAt(i)==')') {
                tancada++;
                ultima=")";
            }
        }
        if (oberta==tancada && ultima==")" ){
            parentizada=true;
        }
        return parentizada;
    }
    public static void main(String[] args) {
        String texto="Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String texto2="una )cadena(mal parentizada y una no lo esta";
        System.out.println(parentesis(texto.toLowerCase()));
        System.out.println(parentesis(texto2.toLowerCase()));
    }
}