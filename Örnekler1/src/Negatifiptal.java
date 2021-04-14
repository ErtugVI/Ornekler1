import java.util.Scanner;

public class Negatifiptal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int teksayilarintoplami = 0, girilensayi;
		
		while(true){	
			System.out.println("Sayi giriniz.");
			girilensayi = scan.nextInt();
		
			if(girilensayi<0) { 
				System.out.println("Negatif bir sayi girdiniz. Isleminiz sonlandirildi.");
		    	
				System.out.println("Tek sayilarin toplami ;" + teksayilarintoplami);
	 			break;
			} 
			if(girilensayi%2==1) {
				teksayilarintoplami+=girilensayi;
			}
		}
	}
}
	 
	
