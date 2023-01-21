package com.mertnamsal.controller;


import java.util.Scanner;

import com.mertnamsal.repository.OgretmenRepository;
import com.mertnamsal.repository.entity.Ogretmen;

public class OgretmenController {

   private OgretmenRepository ogretmenRepository;
    
    public OgretmenController() {
        this.ogretmenRepository = new OgretmenRepository();
    }
    
    public void ogretmenEkleme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eklenecek Ogr adını giriniz:");
        String adi = scanner.nextLine();
        System.out.println("Eklenecek Ogr soyadını giriniz:");
        String soyadi = scanner.nextLine();
        



       System.out.println("Eklenecek Ogr TC Kimlik no'sunu giriniz:");
        int id = scanner.nextInt();
        Ogretmen ogr = new Ogretmen(adi, soyadi, id);



       this.ogretmenRepository.save(ogr);
    }
    
    
    public void ogretmenListesiniGoster() {
        System.out.println("**************************");
        System.out.println("*                        *");
        System.out.println("*    ÖĞRETMEN  LİSTESİ   *");
        System.out.println("*                        *");
        System.out.println("**************************");
        
        for (Ogretmen ogr : this.ogretmenRepository.findAll()) {
            System.out.println(ogr);
        }
    }
    
    public void ogretmenSil() {
        System.out.println("Silinecek Ogretmenin TC Kimlik no'sunu giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        this.ogretmenRepository.delete(id);
    }
    
    
    public void ogretmenGuncelle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Güncellenecek Ogretmenin  adını giriniz:");
        String adi = scanner.nextLine();
        System.out.println("Güncellenecek Ogretmenin soyadını giriniz:");
        String soyadi = scanner.nextLine();
        



       System.out.println("Güncellenecek Ogretmenin no'sunu giriniz:");
        int id = scanner.nextInt();
        Ogretmen ogr = new Ogretmen(adi, soyadi, id);
        this.ogretmenRepository.update(ogr);
    }
    
    public void ogretmenBul() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bilgileirni görmek istediğiniz öğretmenin TC kimlik numarasını giriniz: ");
        int id = scanner.nextInt();
        Ogretmen ogr = this.ogretmenRepository.findById(id);
        System.out.println("\n\nBilgileirni görmek istedğiniz öğrenci: ");
        System.out.println(ogr);
    }
    
    
}
