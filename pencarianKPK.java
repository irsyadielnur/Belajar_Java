
public class pencarianKPK {

    public static int kpk (int x, int y){
        int a = x, b = y;
        
        while (a != b){
            if (a < b){
                a += x;
        } else {
                b += y;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        int hasil = kpk (48, 66);
        
        System.out.println(hasil);
    }
    
}
