import java.util.Scanner;
import java.util.Arrays; //library array
public class pengenalan04 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // membuat array
        int [] nilai = {10, 20, 30, 40, 50};
        
        // outpun lansung seluruh array
        System.out.println("outpun array lansung semua = " + Arrays.toString(nilai));
        // untuk output satu satu
        System.out.println("output array satu satu = " +nilai[2] +", " +nilai[3]);
    }
    
}
