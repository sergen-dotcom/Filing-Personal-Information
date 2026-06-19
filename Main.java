package OnBesinciDers;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Dosyalama_islemleri dosya = new Dosyalama_islemleri("ogrenciler.txt");

		System.out.print("Öğrenci Adı: ");
		String ad = kb.nextLine();
		System.out.print("Öğrencinin Soyadı: ");
		String soyad = kb.nextLine();
		System.out.print("Öğrencinin Numarası: ");
		int no = Integer.parseInt(kb.nextLine());
		System.out.print("Vize Notu: ");
		double not = Double.parseDouble(kb.nextLine());

		Ogrenci yeniOgrenci = new Ogrenci(ad, soyad, no, not);
		dosya.ogrenciKaydet(yeniOgrenci);

		System.out.println("Tüm Öğrenciler");
		List<Ogrenci> tumOgrenciler = dosya.tumOgrencileriOku();

		if (tumOgrenciler.isEmpty()) {
			System.out.println("Listede Öğrenci Yok");
		} else {
			for (Ogrenci o : tumOgrenciler) {
				o.bilgileriYazdir();
			}
			kb.close();
		}

	}

}
