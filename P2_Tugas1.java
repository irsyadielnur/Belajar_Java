import java.util.Scanner;
public class P2_Tugas1 {
    
    public static int perkalianRusia (){
        Scanner input = new Scanner (System.in);
        int total = 0;
        
            System.out.print("Masukkan bilangan a = ");
            int a = input.nextInt();
            
            System.out.print("Masukkan bilangan b = ");
            int b = input.nextInt();
            
            System.out.println("A       B = ");
            System.out.print(a + "\t");
            System.out.println(b);
            
            while ( a > 0 ){
                if ( a%2 != 0){
                    total = total + b;
                }
                a = a/2;
                b = b*2;
                
                if ( a%2 != 0) {
                    System.out.print(a + "\t");
                    System.out.println(b + " Ambil angka " + b);
                } else {
                    System.out.print(a + "\t");
                    System.out.println(b);
                }
            }
            return total;
    }
    
    public static void main(String[] args) {
        int nilai = perkalianRusia();
        
        System.out.println("Perkalian Rusia a * b = " +nilai);
    }
    
}
