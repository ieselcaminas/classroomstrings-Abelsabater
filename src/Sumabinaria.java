public class Sumabinaria {
    public static String sumabinaria(String  bin1, String  bin2){
        String res="";
        char b1;
        char b2;
        int bi1;
        int bi2;
        int acarreo=0;
        int llargaria;
        if(bin1.length()>bin2.length()){
            llargaria=bin1.length();
            for (int i = bin2.length(); i < llargaria; i++) {
                bin2="0"+bin2;
            }
        }else{
            llargaria=bin2.length();
            for (int i = bin1.length(); i < llargaria; i++) {
                bin1="0"+bin1;
            }
        }
        int suma;
        for (int i = llargaria -1; i >=0 ; i--) {
            b1=bin1.charAt(i);
            b2=bin2.charAt(i);
            bi1=Integer.parseInt(""+b1);
            bi2=Integer.parseInt(""+b2);
            suma=bi1+bi2+acarreo;


            if(suma==0){
                res="0"+res;
                acarreo=0;
            }else if(suma==1){
                res="1"+res;
                acarreo=0;
            } else if(suma==2){
                res="0"+res;
                acarreo=1;
            }
            else{
                res= "1"+res;
                acarreo=1;
            }
        }
        if(acarreo==1){
            res="1"+res;
        }
        return res;
    }
    public static void main(String[] args) {
        String bin1="10110110";
        String bin2="1001101";
        System.out.println(sumabinaria(bin1,bin2));
    }
}