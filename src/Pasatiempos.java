public class Pasatiempos {

    public static String pasatiempos(String texto){
        String texto2=texto.replaceAll("[aeiuoäëïöüáéíóúàèìùò]",".");
        return texto2;
    }
    public static void main(String[] args) {
        String texto= "un ejemplo de pasatiempos";
        System.out.println(pasatiempos(texto.toLowerCase()));
    }
}
