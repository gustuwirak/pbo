package pertemuan2;


public class kalkulator
{
    public void menu()
    {
        System.out.println("\n=========================");
        System.out.println("Kalkulator Sederhana");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Modulus");
        System.out.print("Pilih action dengan mengetik angka = ");
    }


    public float operasArithmetic(int pilihan, float ram1, float ram2)
    {
        float sum = 0;
        switch (pilihan)
        {
            case 1:
                System.out.println(+ram1 + " + " + ram2);
                System.out.print("Hasil = ");
                sum = ram1 + ram2;
                break;
            case 2:
                System.out.println(+ram1 + " - " + ram2);
                System.out.print("Hasil = ");
                sum = ram1 - ram2;
                break;
            case 3:
                System.out.println(+ram1 + " x " + ram2);
                System.out.print("Hasil = ");
                sum = ram1 * ram2;
                break;
            case 4:
                System.out.println(+ram1 + " : " + ram2);
                System.out.print("Hasil = ");
                sum = ram1 / ram2;
                break;
            case 5:
                System.out.println(+ram1 + " % " + ram2);
                System.out.print("Hasil = ");
                sum = ram1 % ram2;
                break;

        }
        return sum;
    }

}