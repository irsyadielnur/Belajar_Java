import java.util.Arrays;
import java.util.Scanner;
public class tugas2 {
    
    public static int[][] InputArray(int baris, int kolom){
        Scanner input = new Scanner(System.in);
        int[][] array = new int[baris][kolom]; //buat temporary
        
        for (int i = 0; i < baris; i++) {
            for (int a = 0; a < kolom; a++){
                System.out.format("Input Data Arrays KE (%d,%d) = ", i+1, a+1);
                array[i][a] = input.nextInt();
            }
        }
        return array;
    }

    public static void CetakArray(int [][] myArray){
        System.err.println();
        System.out.println(Arrays.deepToString(myArray));
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kolom,baris;
        int[][] A; //deklarasi array
        
        System.out.print("Input jumlah kolom array = ");
        kolom = input.nextInt();

        System.out.print("Input jumlah baris array = ");
        baris = input.nextInt();

        System.err.println();
        
        A = new int[kolom][baris]; // untuk deklarasi ukuran array 
        
        System.out.println("Array A");
        A = InputArray(kolom, baris);
        
        CetakArray(A);
    }


}
