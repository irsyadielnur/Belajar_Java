import java.util.Scanner;
public class pengenalan02 {
    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

        // int umur = 19; input lansung di program
        
        // println untuk membuat input pada garis baru
        
        System.out.print("tolong input umur anda : ");
        int umur = input.nextInt();
        
        System.out.print("masukkan nilai IPK anda :");
        double ipk = input.nextDouble();
       
        if (umur >= 17) {
                System.out.println("anda bisa membuat KTP");
            } else {
                System.out.println("anda tidak bisa membuat ktp");
            }
    }
    
}
