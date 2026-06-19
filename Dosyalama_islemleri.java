package OnBesinciDers;

import java.io.*;//io input-output demek , yıldız ise io da ne varsa getir demek
import java.util.ArrayList;
import java.util.List;

public class Dosyalama_islemleri {
	private String dosyaAdi;

	public Dosyalama_islemleri(String dosyaAdi) {
		this.dosyaAdi = dosyaAdi;
	}

	public void ogrenciKaydet(Ogrenci ogrenci) {// Ogrenci class tan geliyor ogrenci değişken
		try (BufferedWriter yazar = new BufferedWriter(new FileWriter(dosyaAdi, true))) {
			yazar.write(ogrenci.toString());
			yazar.newLine();
			System.out.println("Kayıt Başarılı: " + dosyaAdi);
		} catch (IOException e) {
			System.out.println("Kayıt Hatası: " + e.getMessage());
		}
	}

//dosyadaki bilgiler okunur
	public List<Ogrenci> tumOgrencileriOku() {
		List<Ogrenci> liste = new ArrayList<>();

		try (BufferedReader okuyucu = new BufferedReader(new FileReader(dosyaAdi))) {
			String satir;
			while ((satir = okuyucu.readLine()) != null) {
				if (!satir.isBlank()) {
					liste.add(Ogrenci.satirdanOlustur(satir));
				}
			}
		} catch (IOException e) {
			System.out.println("Okuma Hatası: " + e.getMessage());
		}
		return liste;
	}

}
