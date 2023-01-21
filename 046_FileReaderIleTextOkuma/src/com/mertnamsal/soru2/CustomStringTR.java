package com.mertnamsal.soru2;

public class CustomStringTR {
	
	private String kelime;

	
	public boolean bosMu() {
		return kelime.isEmpty();
	}
	public int uzunluk() {
		return kelime.length();
	}
	public String büyükHarfYapma() {
        return kelime.toUpperCase();
    }
    public String kücükHarfYapma() {
        return kelime.toLowerCase();
    }
    
    public int indexGetir(char arancanKarakter) {
        return kelime.indexOf(arancanKarakter);
    } 
    public String subs(int x,int y) {
    	if(y<8 && x>-1) {
    		return kelime.substring(x,y);
    	}
    	return null;
    }
    public char[] charArrayCevirme() {
    	return kelime.toCharArray();
    }
    public int sonDeger(String c) {
    	return kelime.lastIndexOf(c);
    }
    public String boslukSilme() {
    	return kelime.trim();
    }
    public boolean kontrolHarf(String c) {
    	return kelime.contains(c);
    }
    public boolean esitMi(String c) {
    	return (kelime.equals(c));
    }
    public boolean buyukKucukFarketmedenEsitMi(String c) {
    	return (kelime.equalsIgnoreCase(c));
    }
    
	
    
	
	public CustomStringTR(String kelime) {
		this.kelime = kelime;
	}

	public String getKelime() {
		return kelime;
	}

	public void setKelime(String kelime) {
		this.kelime = kelime;
	}
	
	
}
