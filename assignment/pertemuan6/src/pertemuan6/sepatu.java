package pertemuan6;

import java.util.Scanner;


public class sepatu {
    String nama;
    sepatu next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan Merk Sepatu        : ");
        nama=str.nextLine();
        next=null;
    }
    public void view(){
        System.out.println("Stock Sepatu        : "+nama);
    }
    public static void main(String[] args) {
        int menu=0;
        stack st=new stack();
        while(menu!=5){
            System.out.print("1.Tambahkan stock sepatu (push)\n2.Hapus stock sepatu (pop)\n3.Lihat Stock (view)\n4.Cek Stock (isEmpty)\n5.Exit\n : ");
            menu=in.nextInt();
            if(menu==1){
                sepatu baru=new sepatu();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) st.isEmpty();
            else if(menu==5) System.out.println("keluar . . .");
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }    
}
    