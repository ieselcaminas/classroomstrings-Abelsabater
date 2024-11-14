public class Sumabinaria {

    public static String sumabinaria(String  bin1, String  bin2){
        String suma="";
        int decimal1=0;
        int decimal2=0;
        for (int i = 0; i < bin1.length(); i++) {
            if(bin1.charAt(i)=='1'){
                decimal1+=Math.pow(2,bin1.length()-i-1);
            }
        }
        for (int i = 0; i < bin2.length(); i++) {
            if(bin2.charAt(i)=='1'){
                decimal2+=Math.pow(2,bin2.length()-i-1);
            }
        }
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