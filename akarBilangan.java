
public class akarBilangan {
    public static int akarBilanganBulat (int b){
        int a = 0;
        
        while ( a*a <= b){
            a = a + 1;
            System.out.println(a); // menampilkan tahapan algoritmanya
        }
        return --a;
    }

    public static void main(String[] args) {
        int akar = akarBilanganBulat(36);
        
        System.out.println(akar);
    }
    
}
