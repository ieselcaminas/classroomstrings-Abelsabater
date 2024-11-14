public class Sumabinaria {
    public static String sumabinaria(String  bin1, String  bin2){
        int sumad=Integer.parseInt(bin1,2)+Integer.parseInt(bin2,2);
        String suma=Integer.toBinaryString(sumad);
        return suma;
    }
    public static void main(String[] args) {
        String bin1="1100";
        String bin2="1010";
        System.out.println(sumabinaria(bin1,bin2));
    }
}