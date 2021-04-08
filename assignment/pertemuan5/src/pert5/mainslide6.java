package pert5;
import java.util.Scanner;

public class mainslide6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total Inputan =");
        int tot = input.nextInt();
        int [] nilai = new int[tot];

        for (int i = 0; i < tot; i++) {
            System.out.println("Masukkan Nilai = ");
            nilai[i] = input.nextInt();    
        }

        libslide6 show = new libslide6();
        show.daftarnilai(nilai,tot);
    }
}
