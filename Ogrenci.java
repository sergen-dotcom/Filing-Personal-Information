package OnBesinciDers;

public class Ogrenci {// 4 parametremiz var
	private String ad;
	private String soyad;
	private int ogrenciNo;
	private double not;

	public Ogrenci(String ad, String soyad, int ogrenciNo, double not) {// yapılandırıcımız var
		this.ad = ad;
		this.soyad = soyad;
		this.ogrenciNo = ogrenciNo;
		this.not = not;

	}// okuyucumuz var

	public String getAd() {
		return ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public double getNot() {
		return not;
	}

	@Override // toString eclipse kütüphanesinde bulunan farklı bir metot @override kullanarak
				// bizim istediğimiz görevi yaptırıyoruz
	public String toString() {
		return ogrenciNo + " " + ad + " " + soyad + " " + not;
	}

//static metotlar bağımsızdır her hangi bir değişkene ihtiyaç yoktur
	public static Ogrenci satirdanOlustur(String satir) {// tipi class ismiyle aynı olmalı ismi ise satirdanOlustur
		String[] parcalar = satir.split(" ");
		int no = Integer.parseInt(parcalar[0]);
		String ad = parcalar[1];
		String soyad = parcalar[2];
		double not = Double.parseDouble(parcalar[3]);
		return new Ogrenci(ad, soyad, no, not);
	}

	public void bilgileriYazdir() {
		System.out.println("Numarası: " + ogrenciNo);
		System.out.println("Adı: " + ad);
		System.out.println("Soyadı: " + soyad);
		System.out.println("Vize Notu: " + not);
	}

}
