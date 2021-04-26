import java.util.Scanner;
import java.util.Stack;

public class library {
    Stack<Character> stackPoint = new Stack<>();
    Stack<Character> kiri = new Stack<>();
    Stack<Character> kanan = new Stack<>();
    public String In_Stack() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan data persamaan  : ");
        String masukan = input.next();
        return masukan;
    }
    public String conversiStringToStack(String masukan){
        String cekMasukan = "y";
        int idx = masukan.indexOf("=");
        int idx2 = masukan.indexOf("1");
        if (idx == -1 || idx2 == -1){
            System.out.println("persamaan yang tidak valid");
            cekMasukan = "x";
        }
        String z = "+";
        char plus = z.charAt(0);
        String k = "=1";
        char equal = k.charAt(0);
        char one = k.charAt(1);
        for (int i = 0; i < masukan.length(); i ++){
            if (masukan.charAt(i) != plus){
                this.stackPoint.push(masukan.charAt(i));
                if (masukan.charAt(i) != one && masukan.charAt(i) != equal){
                    System.out.println("Persamaan tidak valid karena karakter diijinkan hanya +,1,dan =");
                    cekMasukan = "x";
                }

            }
        }
        return cekMasukan;
    }
    public void cekInput(Stack stack,String masukan){
        String k = "=1";
        char equal = k.charAt(0);
        char one = k.charAt(1);
        int counter = 0;
        Boolean cek = false;
        kiri = stackPoint;
        for (int j = 0; j < stackPoint.size();j++){
            if (kiri.peek() == one){
                kanan.push(kiri.pop());
            }
            if (kiri.peek() == equal){
                kiri.pop();
                counter ++;
                if (counter == 2) {
                    System.out.println("Persamaan tidak valid (Sama dengan hanya boleh satu)");
                    cek = true;
                    break;
                }
            }
        }
        if (!cek){
            if (kiri.size() == kanan.size()){
                System.out.println("Persamaan sudah valid");
            }
            if (kiri.size() != kanan.size()){
                System.out.println("Persamaan tidak valid");
            }
        }
    }
}