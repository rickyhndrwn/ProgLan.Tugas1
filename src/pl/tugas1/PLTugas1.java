package pl.tugas1;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class PLTugas1 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        ArrayList<Integer> bil = new ArrayList();
        int panjang;

        System.out.print("Masukkan panjang : ");
        panjang = n.nextInt();
        System.out.println("Masukkan nilai array");
        for(int a=0;a<panjang;a++){
            System.out.print("Nilai ke "+(a+1)+": ");
            bil.add(a,n.nextInt());
        }
        System.out.println(bil.get(0));

        int max = 0;
        int min = 1000;
        for (int a=0;a<bil.size();a++) {
            if(bil.get(a)>max) {
                max=bil.get(a);
            } 
        }
        
        for (int a=0;a<bil.size();a++) {
            if(bil.get(a)<=min) {
                min=bil.get(a);
            }
        }
        
        System.out.println("Nilai maksimum : " + max);
        System.out.println("Nilai minimun  : " + min);

        double jum = 0;
        DecimalFormat df = new DecimalFormat("##.#");
        for(int a=0;a<bil.size();a++) {
            jum=jum+bil.get(a);
        }
        double rata2 = jum/bil.size();
        System.out.print("Rata - rata    : " + df.format(rata2));

        Collections.sort(bil);
        System.out.println("\nSorting        : "+bil);
            
        String angka;
        int ada = 0;
        System.out.print("\nMasukkan angka yang akan di cari : ");
        angka = n.next();
        for (int a=0;a<bil.size();a++) {
            if (angka.equals("" + bil.get(a))) {
                ada++;
            }
        }
        if (ada > 0) {
            System.out.println("Data ada");
        } else {
            System.out.println("Data tidak ada");
        }
    }
}
