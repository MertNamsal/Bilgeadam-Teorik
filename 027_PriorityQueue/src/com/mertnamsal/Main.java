package com.mertnamsal;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		/*        
        add / offer() metodları --------> Kuyruğa eleman ekler.(Önceden gördüğümüz özellikleri taşırlar.) offer exception atmaz ekleyemezse add atar.
        clear() metodu --------> Kuyruğu Temizler.
        contains(Object o) ------> o objesi kuyruğun içindeyse true, değilse false döner.
        peek() ------> Kuyruğun başındaki elemanı döner.Eğer kuyruk boşsa null referans döner.
        poll() -----> Kuyruğun başındaki elemanı çıkartır ve değer olarak döner. Eğer kuyruk boşsa null referans döner.
        size()------> Kuyruğun içindeki eleman sayısını döner.        
        
        
         Integer lerde en yüksek öncelik en küçük sayıda, en düşük öncelik  en büyük sayıdadır.
        Stringlerde en yüksek öncelik alfabetik olarak sözlükte en önce gelen stringte,
        en düşük öncelik  alfabetik olarak sözlükte en son gelen stringtedir.
         */
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(100);
		System.out.println(queue.peek());
		System.out.println(queue.contains(102));
		System.out.println("\n-------");
		
		//Not : Queuenin içinde dönerken for each ile dolaşırsanız yanlış sıralama görebilirsiniz
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman çıkarılıyor: "+queue.poll());
		}
		
		Queue<Ogrenci> queue2 = new PriorityQueue<Ogrenci>();
		queue2.offer(new Ogrenci("Ali",107));
		queue2.offer(new Ogrenci("Veli",105));
		queue2.offer(new Ogrenci("Zeynep",102));
		queue2.offer(new Ogrenci("Fatoş",100));
		
		for(Ogrenci og : queue2) {
			System.out.println(og.toString());
		}
		
		while(queue2.isEmpty() == false) {
			System.out.println("Eleman çıkarılıyor : "+queue2.poll());
		}
	}
}
