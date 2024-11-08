public class FraseInvertida {
    public static String invertir(String frase){
        String cadena="";
        String [] fras=frase.split(" ");
        for (int i = fras.length -1;i>=0;--i) {
            cadena+=fras[i]+" ";
        }
        return cadena;
    }
    public static void main(String[] args) {
        String cadena="Esto es una frase";
        System.out.println(invertir(cadena));
    }
}
