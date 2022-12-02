
public class perkalianRusia {

    public static int perkalianRusia (int a, int b){
        int total = 0;
        
        while (a > 0){ // akar akan terus looping
            if ( a%2 != 0){ // untuk mengambil angka yang ganjil
               total = total + b; 
            }
            a = a/2;
            b = b*2;
        }
        return total; // return int
    }
    public static void main(String[] args){
        int hasil = perkalianRusia (12, 6);
        
        System.out.println(hasil);
    }
}
