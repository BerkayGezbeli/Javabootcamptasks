
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		int ogrenciSayisi = 12;
		String mesaj = "��renci sayisi : ";
		System.out.println(mesaj + ogrenciSayisi);
		
		
		
		double sayi = 12.5;
		float sayi2 = -129;
		char karakter = 'A';
		boolean dogruMu = false;
		
		int sayi1 = 24;
		
		if(sayi1<20) {
			System.out.println("Sayi 20'den k���kt�r.");
		}else if(sayi1 == 20) {
			System.out.println("Sayi 20'ye e�ittir.");
		}else {
			System.out.println("Sayi 20'den b�y�kt�r.");
		}
		
		int num1 = 24;
		int num2 = 25;
		int num3 = 26;
		int enBuyuk = num1;
		
		if (enBuyuk < num2) {
			enBuyuk = num2;
		}
		else if(enBuyuk < num3) {
			enBuyuk = num3;
		}
		
		System.out.println("En b�y�k : " + enBuyuk);
		
		char grade = 'A';
		
		switch (grade) {
			case 'A':
				System.out.println("�ok iyi");
				break;
			case 'B':
				System.out.println("�yi");
				break;
			case 'C':
				System.out.println("Orta");
				break;
			case 'D':
				System.out.println("Fena de�il");
				break;
			case 'F':
				System.out.println("Kald�n�z");
				break;
		}
		
		for (int i = 2;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("D�ng� bitti");
		
		int i = 1;
		
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While d�ng�s� bitti.");
		
		int j=100;
		do{
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-while d�ng�s� bitti.");
		
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] ="Engin";
		ogrenciler[1] ="Derin";
		ogrenciler[2] ="Salih";
		ogrenciler[3] = "Ahmet";
		
		for (int k = 0;k<ogrenciler.length;k++) {
			System.out.println(ogrenciler[k]);
		}
		
		double[] myList = {1.2,6.3,4.3,5.6};		
		double total = 0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En b�y�k = " + max);
		
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";
		
		for(int l=0; l<=2; l++) {
			System.out.println("------------");
			for(int m=0;m<=2;m++) {
				System.out.println(sehirler[l][m]);
			}
		}
		
		String mesaj2 = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj2);
		
		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Ya�as�n!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		
		 int nmbr = 71;
	        boolean flag = false;
	        for (int h = 2; h < nmbr; ++h) {
	            if (nmbr % h == 0) {
	                flag = true;
	                break;
	            }
	        }
	        if (!flag)
	            System.out.println(nmbr + " is a prime number.");
	        else
	            System.out.println(nmbr + " is not a prime number.");
		
		
		int number = 28;
		int total1 = 0;
		
		for(int s=1;s<number;i++) {
			if(number%s==0) {
				total1=total1+s;
			}
		}
		
		if(total1 == number) {
			System.out.println("M�kemmel say�d�r.");
		}else {
			System.out.println("M�kemmel say� de�ildir.");
		}
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi=false;
		
		for (int nmber : sayilar) {
			if (nmber == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Say� mevcuttur");
		}else {
			System.out.println("Say� mevcut de�ildir");
		}
		
	}

}
