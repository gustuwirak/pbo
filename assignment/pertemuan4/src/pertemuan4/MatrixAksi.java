//Ida Bagus Putu Wira Kusuma
//A11.2019.11680

package pertemuan4;

public class MatrixAksi {
    public static void main(String[] args) {
        System.out.println();
        Matrix A = Matrix.random(3,3);
        System.out.println("Matriks A ( Random )");
        A.show();

        System.out.println();
        Matrix B = A.transpose();
        System.out.println("Matriks B ( transpose dari Matriks A )");
        B.show();

        System.out.println();
        Matrix C = Matrix.identity(3);
        System.out.println("Matriks C ( Identitas )");
        C.show();

        System.out.println();
        Matrix penjumlahanAB = A.plus(B);
        System.out.println("Penjumlahan Matriks A dan B");
        penjumlahanAB.show();

        System.out.println();
        Matrix perkalianBA = B.times(A);
        System.out.println("Perkalian Matriks B dan A");
        perkalianBA.show();
    }
}