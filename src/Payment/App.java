package Payment;

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		String[] bkash = { "1", "2", "3", "4", "5" };
		String[] paypal = { "9", "8", "7", "6" };
		LinkedList<String> linklist = new LinkedList<String>();

		// From array to List
		for (String pay : bkash) {
			linklist.add(pay);
		}
		for (String pay : paypal) {
			linklist.add(pay);
		}
		System.out.println(linklist);
		// System.out.println(bkash);
		LinkedList<String> bkashpay = new LinkedList<String>();
		bkashpay.addAll(linklist.subList(0, 5));

		LinkedList<String> paypalpay = new LinkedList<String>();
		paypalpay.addAll(linklist.subList(5, 9));

		System.out.println("Bkash:" + bkashpay);
		System.out.println("PayPal:" + paypalpay);

		// From list to Array

		String[] bkashArray = bkashpay.toArray(new String[bkashpay.size()]);
		for (String b : bkashArray)

			System.out.print(b + " ");

		System.out.println();
		String[] payPalArray = paypalpay.toArray(new String[paypalpay.size()]);
		for (String c : payPalArray)
			System.out.print(c + " ");

	}
}
