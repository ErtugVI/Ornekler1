import java.util.Scanner;

public class Negatifiptal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scan = new Scanner(System.in);
	 int teksayilarintoplami = 0;
	 int girilensayi;
	 while(true){
	System.out.println("Sayý giriniz.");
	girilensayi = scan.nextInt();
	if(girilensayi<0) { System.out.println("Negatif bir sayý girdiniz. Ýþleminiz sonlandýrýldý.");
		    	
	System.out.println("Tek sayýlarýn toplamý ;" + teksayilarintoplami);
	 break;} 
	 if(girilensayi%2==1) {
	teksayilarintoplami+=girilensayi;}
	 }
	}
}
	 
	