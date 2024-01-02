package dizideki_elemanlarin_tekrar_sayisi;

import java.util.Arrays;

public class dizideki_elemanlarin_tekrar_sayisi {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
		System.out.println("Dizi : " + Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("Tekrar sayıları: ");

		for (int i = 0; i < arr.length; i++) {
			int counter = 1;
			while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
				i++;
				counter++;
			}
			System.out.println(arr[i] + " sayısı " + counter + " kere tekrar edildi.");
		}
	}
}
