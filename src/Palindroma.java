public class Palindroma {

    public static boolean palindroma(String cadena){
        boolean palindroma= false;
        String cadena2="";
        String cadena3=cadena.replaceAll(" ","");
        for (int i = cadena.length() -1; i >=0 ; i--) {
            cadena2+=cadena.charAt(i);
        }
        String cadena4=cadena2.replaceAll(" ","");
        if(cadena3.equals(cadena4)){
            palindroma=true;
        }
        return palindroma;
    }

    public static void main(String[] args) {
        String cadena= "ojo rojo";
        System.out.println(palindroma(cadena));
    }
}
