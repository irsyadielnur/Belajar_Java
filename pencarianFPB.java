
public class pencarianFPB {
    
    public static int fpb (int x, int y){
        int tmp;
        
        if (x < y){
            tmp = x;
            x = y;
            y = tmp;
        } while (y > 0){
            tmp = x%y;
            x = y;
            y = tmp;
            
        }
        return x;
    }
    public static void main(String[] args) {
       int hasil = fpb (48, 66);
       
        System.out.println(hasil);
    }
    
}
