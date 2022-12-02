import java.util.Scanner;

public class P4_Tugas2 {
   
    public static int[][] BuatArrays(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("input baris Array = ");
        int baris = input.nextInt();
        
        System.out.print("input kolom Array = ");
        int kolom = input.nextInt();
        
        int[][] Array = new int[baris][kolom];
        
        for (int b = 0; b < baris; b++){
            for (int k = 0; k < kolom; k++){
                System.out.format("Isi nilai array(%d, %d) = ", b+1 , k+1);
                Array[b][k] = input.nextInt();
            }
        }
        
        for (int b = 0; b < baris; b++){
            System.out.print("|\t");
            for (int k = 0; k < kolom; k++){
                System.out.format("%d\t", Array[b][k]);
            }
                System.out.println("|");
        }
        return Array;
}
    
    public static void main(String[] args) {
       int[][] arrays = BuatArrays();
       
        System.out.print(arrays);
    }
}
