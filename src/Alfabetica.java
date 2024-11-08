public class Alfabetica {
    public static boolean alfabetica(String palabra){
        boolean alfabetica=false;
        int valor=0;
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i)>valor){
                valor=palabra.charAt(i);
                alfabetica=true;
            }else{
                alfabetica=false;
                break;
            }
        }
        return alfabetica;
    }
    public static void main(String[] args) {
        String palabra="mina";
        String palabra2="amor";
        System.out.println(alfabetica(palabra.toUpperCase()));
        System.out.println(alfabetica(palabra2.toUpperCase()));
    }
}
