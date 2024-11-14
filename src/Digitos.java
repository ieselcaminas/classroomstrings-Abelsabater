public class Digitos {
    public static  int digitos(String cadena){
        int digitos=0;
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isDigit(cadena.charAt(i))){
                digitos++;
            }
        }
        return digitos;
    }
    public static void main(String[] args) {
        String cadena="1 20 hola 234 45a";
        System.out.println(digitos(cadena));
    }
}
