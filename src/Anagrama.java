public class Anagrama {
    public static boolean anagrama(String palabra1, String palabra2){
        boolean anagramas=false;
        int lletraiguals=0;
        if(palabra1.length()==palabra2.length()){
            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if(palabra1.charAt(i)==palabra2.charAt(j)){
                        lletraiguals++;
                        break;
                    }
                }
            }
            if(lletraiguals==palabra1.length()){
                anagramas=true;
            }
        }
        return anagramas;
    }
    public static void main(String[] args) {
        String palabra1="amor";
        String palabra2="ramo";
        System.out.println(anagrama(palabra1,palabra2));
    }
}
