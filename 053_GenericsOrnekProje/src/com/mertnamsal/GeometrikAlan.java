package com.mertnamsal;

public class GeometrikAlan <T,G>{ //istediğimiz kadar yapabiliyoruz , lü

	T obj1;
	G obj2;
	
	public GeometrikAlan(T object1,G object2) {
		this.obj1=object1;
		this.obj2=object2;
	}

	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public G getObj2() {
		return obj2;
	}

	public void setObj2(G obj2) {
		this.obj2 = obj2;
	}
	
	public int geometrikSeklinAlaniniHesapla() {
		//Cast etme:
		Sekil sekil1 = (Sekil) obj1;
		Sekil sekil2 = (Sekil) obj2;
		return (sekil1.alanHesapla()+sekil2.alanHesapla());
				
	}
	
	
}
