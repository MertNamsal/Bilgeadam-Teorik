package com.mertnamsal.controller;

import java.util.Scanner;

import com.mertnamsal.repository.OgrenciRepository;
import com.mertnamsal.repository.entity.Ogrenci;

public class OgrenciController {
	
	private OgrenciRepository ogrenciRepository;
	
	public OgrenciController(){
		this.ogrenciRepository = new OgrenciRepository();
	}
	public void ogrenciEkleme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eklenecek öğrencinin adını giriniz : ");
		String adi = scan.nextLine();
		System.out.println("Eklenecek öğrencinin soyadını giriniz : ");
		String soyadi = scan.nextLine();
		
		//ogrenci id / nosunuda girsin
		System.out.println("Eklenecek öğrencinin no'sunu giriniz : ");
		int id = scan.nextInt();
		Ogrenci ogr = new Ogrenci(adi, soyadi , id);
		
		this.ogrenciRepository.save(ogr);
	}
	
	public void ogrenciListesiniGoster() {
		System.out.println("******************************");
		System.out.println("*                            *");
		System.out.println("*      ÖĞRENCİ LİSTESİ       *");
		System.out.println("*                            *");
		System.out.println("******************************");
		
		for(Ogrenci ogr : this.ogrenciRepository.findAll()) {
			System.out.println(ogr);
		}
	}
	public void ogrenciSil() {
		System.out.println("Silinecek öğrencinin no sunu giriniz : ");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		this.ogrenciRepository.delete(id);
		
	}
	public void ogrenciGuncelle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Güncellenecek öğrencinin adını giriniz : ");
		String adi = scan.nextLine();
		System.out.println("Güncellenecek öğrencinin soyadını giriniz : ");
		String soyadi = scan.nextLine();
		
		//ogrenci id / nosunuda girsin
		System.out.println("Güncellenecek öğrencinin no'sunu giriniz : ");
		int id = scan.nextInt();
		Ogrenci ogr = new Ogrenci(adi, soyadi , id);
		
		this.ogrenciRepository.update(ogr);
	}
	public void ogrenciBul() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bilgilerini görmek istediğiniz öğrencinin numarasını giriniz : ");
		int id = scan.nextInt();
		Ogrenci ogrenci = this.ogrenciRepository.findById(id);
		System.out.println("\nBilgilerini görmek istediğiniz ögrenci : ");
		System.out.println(ogrenci);
	}
}
