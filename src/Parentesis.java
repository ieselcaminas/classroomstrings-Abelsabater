public class Parentesis {
    public static boolean parentesis(String texto){
        boolean parentizada=true;
        int contador=0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i)=='('){
                contador++;
            } else if (texto.charAt(i)==')') {
                contador--;
            }
            if (contador <0){
                parentizada=false;
                break;
            }
        }
        if(contador!=0){
            parentizada=false;
        }
        return parentizada;
    }
    public static void main(String[] args) {
        String texto="Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String texto2="una () cadena ( mal parentizada";
        System.out.println(parentesis(texto.toLowerCase()));
        System.out.println(parentesis(texto2.toLowerCase()));
    }
}