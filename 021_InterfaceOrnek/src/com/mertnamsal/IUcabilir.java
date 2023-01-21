package com.mertnamsal;

//Interfaceler bir kural veya sözleşme gibi düşünülebilir
//Interfaceleri implement eden sınıflar bu kuralları veya sözleşme maddelerini yerine getirmekle yükümlüdürler.
//yani Interfaceler içindeki abstract metodları implement etmelidirler.
public interface IUcabilir {
	
	public void kanatCirp();
	
	public void kanatlariTemizle();
	
	public void gagala(String nesne);
	
	public void yemekYe();
}
