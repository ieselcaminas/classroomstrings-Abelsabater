public class Sumabinaria {
    public static String sumabinaria(String  bin1, String  bin2){
        String suma="";
        int decimal1=Integer.parseInt(bin1,2);
        int decimal2=Integer.parseInt(bin2,2);
        int sumad=decimal1+decimal2;
        do{
            suma=sumad%2+suma;
            sumad/=2;
        }while(sumad>0);
        return suma;
    }
    public static void main(String[] args) {
        String bin1="11011011";
        String bin2="110110101";
        System.out.println(sumabinaria(bin1,bin2));
    }
}