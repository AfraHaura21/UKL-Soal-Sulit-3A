import java.util.Scanner;

public class ukl_3a{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Rekap Nilai Produktif RPL ===");
        System.out.print("Masukan Jumlah Siswa :");
        int JumlahSiswa = input.nextInt();

        double TotalNilai = 0;

        //Memasukkan nilai untuk setiap siswa
        for (int a = 1; a <= JumlahSiswa; a++) {
            System.out.print("Masukkan nilai siswa ke-" + a + " : ");
            double nilai = input.nextDouble();
            TotalNilai += nilai;
        }

        //  Menghitung rata - rata nilai
        double RataRata = TotalNilai / JumlahSiswa;


        System.out.println("\n=== HASIL REKAP NILAI ===");
        System.out.println("Jumlah siswa : " + JumlahSiswa);
        System.out.println("Total nilai  : " + TotalNilai);
        System.out.println("Rata-rata    : " + RataRata);
    }
}