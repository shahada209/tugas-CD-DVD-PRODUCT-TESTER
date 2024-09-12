import java.util.Scanner;

//Driver Class
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilihan = in.next();

     try{
        System.out.println("Berapa Object yang dibuat? (Max 10)");
        int jumlah = in.nextInt();
        System.out.println("jumlah  :" + jumlah);
     }catch(Exception e) {}
     System.out.println("pilih CD/DVD");
     String CD = in.next();
     String DVD = in.next();

     if (pilihan.equals("CD")) { CD c = new CD();
        c.print();
     }else if (pilihan.equals("DVD")) {DVD d = new DVD();
        d.print();

     }else{
        System.out.println("input salah");
     }

        in.close();

        

    }

    
    
}