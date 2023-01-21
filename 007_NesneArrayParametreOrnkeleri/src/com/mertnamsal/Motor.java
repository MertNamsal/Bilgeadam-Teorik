package com.mertnamsal;

//Nesne yönelimli programlamanın ilk prensibi kapsülleme (encapsulation) olarak adlandırılır.

//Bu özellik, dilin nesne kullanıcısından gereksiz uygulama ayrıntılarını saklar.

//Oluşturulan bir sınıf (class) içerisinde kullanıcının işlemlerini daha kolay gerçekleştirebilmesi için bazı işlemler birleştirilerek tek bir işlem gibi gösterilir.
//Bu birleştirme işlemine kapsülleme denir.

//Erişim belirteçleri (access modifier) sayesinde kapsülleme çok daha kolay yapılmaktadır.
//Erişim belirteçleri, oluşturulan sınıf veya sınıf içindeki elemanların erişim seviyelerini belirlemek için kullanılan anahtar kelimeler grubuna verilen isimdir.

//Metotlar ve değişkenler bir anahtar sözcük ile önceden bellirlenen sınırlar dahilinde kullanılabilir.
//Bu anahtar kelimeler şu şekilde sıralanabilir.

public class Motor {
	public int motorHacmi;
	public String saseNo;
	public int yakitTuketimi; // lt/100km
	
	public void motorBilgileriniYazdir() {
		System.out.println("motorHacmi : "+this.motorHacmi + " saseNo : "+saseNo+" yakitTuk : "+yakitTuketimi); //içine motorHacmi diye birşey gelirse diye this kullanılıyor.
	}
	
	

}
