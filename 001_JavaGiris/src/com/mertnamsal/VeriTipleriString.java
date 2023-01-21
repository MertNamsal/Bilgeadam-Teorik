package com.mertnamsal;

import java.util.Locale;
import java.util.Scanner;

public class VeriTipleriString {

	public static void main(String[] args) {
		
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		
		//String sık kullanılan metodları
		
		//length metodu
		//değişken.length() => metnin uzunluğunu int cinsinden verir.
		int uzunluk = metin.length();
		System.out.println(uzunluk);
		
		//charAt metodu
		
		System.out.println("3. karakter : "+metin.charAt(6));
		System.out.println("3. karakter : "+metin.charAt(metin.length()-1));
		
		//indexOf
		// bir harfin ilk nerede geçtiğini bulur
		
		System.out.println("g harfi ilk nerede geçiyor : "+ metin.indexOf("g"));
		System.out.println("g harfi ilk nerede geçiyor : "+ metin.indexOf("W"));
		
		System.out.println("Java kelimesi ilk nerede geçiyor : "+metin.indexOf("Java"));
		
		//14. karakterden sonra ilk nerde geçiyor
		System.out.println("i harfi ilk nerede geçiyor : "+ metin.indexOf("i",14));
		
		//Soru:
		//i harfi cümlenin yarısından itibaren ilk geçtiği yerin indexi:
		System.out.println("i harfi ilk nerede geçiyor : "+ metin.indexOf("i",metin.length()/2));
		
		//substring
		//
		//substring(başlangıç index , bitiş index) => başlangıç dahil bitiş dahil değil.
		//0 dan başla 4 e kadar (4 dahil değil).
		System.out.println("Metnin ilk 5 karakteri: "+ metin.substring(0, 4));
		
		//Soru:
		String test = "Test 1234";
		System.out.println(test.substring(2, 7)); //st 12 
		
		String cumle = " Hello Java ";
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);
		
		String ka ="admin", sifre ="admin";
		System.out.println(ka.toUpperCase(Locale.ENGLISH));
		System.out.println(ka.toUpperCase());
		System.out.println(sifre.toUpperCase(new Locale("tr", "TR")));
		
		
		//valueOf
		
		//converts different types of values to String
		
		int sayi = 2233;
		String ss= String.valueOf(sayi);
		System.out.println(ss);
		
		//Ornek
		//Database'de bu şekilde tutuluyor.
		/*
		String uName="gsungur@test.com";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adını giriniz : ");
		String userName = scan.nextLine();
		
		
		//Emailler hep küçük harf olur o yüzden lowercase kullan .. Sonrada boşlukları trim et
		userName=userName.toLowerCase().trim();
		
		//uName == userName yazarsak her zaman false atar.
		if(uName.equals(userName) ) {
			System.out.println("Kullanıcı adı eşleşti.");
		}
		else {
			System.out.println("Kullanıcı adı eşleşmedi !!!");
		}
		System.out.println(uName);
		System.out.println(userName); */
		
		String s2 ="Şahin yırtıcı bir kuştur";
		String s3 = s2.replace("Ş", "S");
		System.out.println(s3);
		
		//Nerelerde kullanılır
		//1.Örnek : kira sözleşmesinde
		
		String sozlesme = "Ali Kaya Güneş sokak Çankaya mah.adresindeki evini Ayşe Naz'a kiraladı..";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yeniSozlesme);
		
		//2.Örnek : web url'lerde Türkçe karakterler sorun çıkarabilir.
		//Webde sorun çıkmaması için boşluk karakterini - ile değiştirin.
		String dosyaAdi ="https://www.isbasvuru.com/alikaya iş başvuru.pdf";
		dosyaAdi = dosyaAdi.replace(" ","-").replace("ş", "s");
		System.out.println(dosyaAdi);
		
		//contains metodu
		
		String yeniMetin ="Hava bugün çok yağmurlu";
		System.out.println("Ağ harfleri var mı ? "+yeniMetin.contains(""));
		
		//equalsIgnoreCase metoduı
		
		String ad1= "Ali Kaya";
		String ad2="ali kaya";
		System.out.println(ad1.equals(ad2));
		System.out.println(ad1.equalsIgnoreCase(ad2));
		
		//startsWith
		
		ad1="Ali Kaya";
		System.out.println("A"); //True
		System.out.println("Al"); //True
		System.out.println("li"); //False
		
		//endsWith
		
		ad1="Ali Kaya;";
		System.out.println(ad1.endsWith("a")); //True
		System.out.println(ad1.endsWith("Kaya")); //True
		System.out.println(ad1.endsWith("a ")); //False
		
		//split metoduı
		//verilen ifadeye göre metni böler
		
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";
		String[] isimler = liste.split(",");
		System.out.println(isimler[0]);
		System.out.println(isimler[1]);
		
		//Örnek
		//Öğrencilerin listesi String olarak tutuluyor amaç ayrıştırmak
		
		String ogrencilerStr ="Ali Kaya,123;Veli Öz,222;Zeynep Naz,343";
		String[] ogrenciler = ogrencilerStr.split(";");
		System.out.println(ogrenciler[0]);
		System.out.println(ogrenciler[1]);
		System.out.println(ogrenciler[2]);
		
		
		//Peki ilk öğrencinin okul numarasını
		System.out.println(ogrenciler[0].split(",")[0]);  //Ali kaya yazdırır
		System.out.println(ogrenciler[1].split(",")[0]);  //123 yapar
		
		//stringbuilder kullanımı
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Merhaba");
		stringBuilder.append("Dünya");
		stringBuilder.append(" Java");
		System.out.println(stringBuilder);
		
		
		
		

	}

}
