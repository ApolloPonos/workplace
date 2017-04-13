package edu.java.puzzle;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class duvaraCarpanTop {
	class carpmahatasi extends Exception {
	}

	public class Carpandaire extends Applet {
		public int sayac = 0;
		public int yony = 1;
		public int yonx = 1;
		boolean sinyalx = false;
		boolean sinyaly = false;
		// alttaki değişkenleri istersek kullanıcı girişlide yapabilitiz.
		public int xdegeri = 100;
		public int ydegeri = 150;
		public int kareningenisligi = 300;
		public int kareninyuksekligi = 500;
		public int kureninboyu = 50;

		// Bu dikdörtgen değerlerini özellikle seçtim ki tam köşeye çarptığında
		// bile hata vermeyip.
		// Tek bir carpmahatasi istisnası göndererek işlemini tamamlamasıdır.
		@Override
		public void init() {
			resize(900, 900); // Ekran Genişliği Ayarlanıyor.
			setSize(800, 800);
		}

		@Override
		public void paint(Graphics ciz) {
			for (int i = 0; i < 100; i++) {
				// Çabuk gösterilsin diye 50 ile çarptık boyu da 50 ile ayarlı.
				// Lakin
				// bu dikdörtgenin büyüklüğünü oranlı yapmamıza neden oluyor
				// zira tutmazsa taşıyor.
				// Taşıyor dediğimiz sonuçta x ve y koordinatlarını 1'er değil
				// 50 şer arttırmamızdan.
				// Eğer alttaki kodları xdegeri ve ydeğeri satırlarının yerine
				// koyarsak bu sorun
				// ortadan kalkar.
				// xdegeri+=yonx;
				// ydegeri+=yony;
				xdegeri += yonx * 50;
				ydegeri += yony * 50;
				try {
					cizim(ciz, xdegeri, ydegeri, kureninboyu);
				} catch (carpmahatasi ex) // İstisna oluşusup olusmadıgını
											// kontrol et. !
				{
					sayac++;
					System.out.println(sayac + ".cı kez çarptı");
				}
				try {
					Thread.sleep(300);
				} catch (InterruptedException ex) {
					Logger.getLogger(Carpandaire.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		}
		public void main(String[]args){
			System.out.println();
		}
		void cizim(Graphics ciz, int x, int y, int kureninboyu) throws carpmahatasi {
			ciz.setColor(Color.WHITE); // Ekranı Beyaz Yap
			ciz.fillRect(100, 100, kareningenisligi, kareninyuksekligi); // Ekrana
																			// Bir
																			// Dikdörtgencİc
			ciz.setColor(Color.BLACK); // Yazı Tengini Siyah Yap
			ciz.drawRect(100, 100, kareningenisligi, kareninyuksekligi);
			ciz.setColor(Color.blue); // Yazi Rengini Mavi Yap
			ciz.fillOval(x, y, kureninboyu, kureninboyu); // // Cizilen
															// Dikdortgen icine
															// bir top ciz
			if ((xdegeri + kureninboyu) >= (kareningenisligi + 100) || xdegeri == 100)
			// X koordinatında duvaa carpip carpılmadıgını kontrol ediyoruz
			{
				yonx *= -1; // Eğer taşma varsa x koordinatını -1 le carparak
							// tam zıtt yonde hareket ettier
				sinyalx = true;
			}
			if ((ydegeri + kureninboyu) >= (kareninyuksekligi + 100) || ydegeri == 100)
			// Y koordinatında duvaa carpip carpılmadıgını kontrol ediyoruz
			{
				yony *= -1; // Eğer taşma varsa x koordinatını -1 le carparak
							// tam zıtt yonde hareket ettie.
				sinyaly = true;
			}
			if (sinyalx || sinyaly) {
				if (sinyalx)
					sinyalx = false;
				if (sinyaly)
					sinyaly = false;
				throw new carpmahatasi();
			
			}

		}
	}
}
