package pl.tugas1; //tugas1
//1. selesaikan dan tunjukkan kesalahan/jenis error pada program (50%)
//2. modifikasi program untuk menemukan tipe eror syntax, run-time, dan logic error (50%) 
//syntax error : line 18
//logic error : line 26 & 27
//run-time error : line 54
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class tugas1_kelompok6 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        ArrayList<Integer> bil = new ArrayList();
        int panjang;
        System.out.print("Masukkan panjang : ");//penghapusan pada tanda ';'
        panjang = n.nextInt();                  //bisa menimbulkan syntax error
        System.out.println("Masukkan nilai array");
        for(int z = 0 ; z<panjang ; z++){
            System.out.print("  Nilai ke "+(z+1)+": ");
            bil.add(n.nextInt());
        }

        int min=1000;//pengubahan pada nilai "min" dari '1000' ke '0' dan 
        int max=0;   //nilai "max" dari '0' ke '1000' bisa menimbulkan logic error
        for (int a = 0; a < bil.size(); a++) {
            if (bil.get(a) > max) {
                max = bil.get(a);
            } 
        }
        for (int a = 0; a < bil.size(); a++) {
            if (bil.get(a) <= min) {
                min = bil.get(a);
            }
        }
        System.out.println("Nilai minimum: " + min);
        System.out.println("Nilai maksimum : " + max);

        double jum = 0;
        DecimalFormat df = new DecimalFormat("##.#");
        for (int a = 0; a < bil.size(); a++) {
            jum = jum + bil.get(a);
        }
        double rata2 = jum / bil.size();
        System.out.print("Rata - rata    : " + df.format(rata2));

        Collections.sort(bil);
        System.out.println("\nSorting        : "+bil);
        
        //Modifikasi program berupa penambahan fitur manipulasi data lebih lanjut
        
        String e;//pengubahan tipe variabel 'e' dari "String" ke "int", bisa menimbulkan run-time error
        do{
            System.out.println("masukkan pilihan:");
            System.out.println("1.menambah data\n2.mengganti data\n3.menghapus data\n4.mencari data");
            System.out.print("masukkan pilihan:");
            int input;
            input=n.nextInt();

            switch (input) {
                case 1:
                    int c=bil.size();
                    System.out.print("Masukkan panjang tambahan : ");
                    panjang = n.nextInt();
                    System.out.println("Masukkan nilai array");
                    for(int b = bil.size() ; b<panjang+c ; b++){
                        System.out.print("  Nilai ke "+(b+1)+": ");
                        bil.add(n.nextInt());

                    }
                    Collections.sort(bil);
                    System.out.println("\nSorting        : "+bil);
                    break;
                case 2:
                    System.out.println("masukkan indeks yang ingin diganti:");
                    int h=n.nextInt();
                    System.out.println("masukkan data:");
                    int x=n.nextInt();
                    bil.remove(h);
                    bil.add(h,x);
                    Collections.sort(bil);
                    System.out.println("\nSorting        : "+bil);
                    break;
                case 3:
                    System.out.print("masukkan indeks elemen yang ingin dihapus:");
                    int inde=n.nextInt();
                    bil.remove(inde);
                    System.out.println("data berhasil dihapus");
                    Collections.sort(bil);
                    System.out.println("\nSorting        : "+bil);
                    break;
                case 4:
                    String angka;
                    int ada = 0;
                    System.out.print("\nMasukkan angka yang akan di cari : ");
                    angka = n.next();
                    for (int a = 0; a < bil.size(); a++) {
                        if (angka.equals("" + bil.get(a))) {
                            ada++;
                        }
                    }
                    if (ada > 0) {
                        System.out.println("Data ada");
                    }
                    else {
                        System.out.println("Data tidak ada");
                    }       break;
                default:
                    System.out.println("maaf salah opsi");
                    break;
            }
            System.out.println("ingin mengulang?<y/n>");
            e = n.next();
        }while( "y".equals(e));
    }
}
