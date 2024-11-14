public class DigitosII {
    public static  boolean digitosII(String cadena){
        boolean esnumero=true;
        for (int i = 0; i < cadena.length(); i++) {
            if(!Character.isDigit(cadena.charAt(i))){
                esnumero=false;
            }
        }
        return esnumero;
    }
    public static int cantidad(boolean numeros){
        int cant=0;
        if(numeros){
            cant++;
        }
        return cant;
    }
    public static void main(String[] args) {
        String cadena="1 20 hola 234 45a";
        String [] cad=cadena.split(" ");
        int contador=0;
        for (int i = 0; i < cad.length; i++) {
            if(cantidad(digitosII(cad[i]))==1){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
