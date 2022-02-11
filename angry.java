import java.util.*;
import java.io.*;
public class angry {

	public static void main(String[] args) throws IOException{
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("angry.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));
		
		int n = Integer.parseInt(br.readLine());
		int[] hays= new int[n];
		for (int i = 0; i < n; i++) {
			hays[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("ja: " + Arrays.toString(hays));
		hays = sort(hays);
		System.out.println(Arrays.toString(hays));
		int[] nextnums = new int[2];
		// j = explosionRanges
		System.out.println(hays.length);
		for (int i = 0; i < hays.length; i++) {
			//currNumIndex = i
			nextnums = 
			boolean explosions = true;
			for (int j = 1; explosions = true; j++) {
				System.out.println(i+1);
				if (i +1 < hays.length) {
					if (hays[i+1] - hays[i] <= j) {
						nextnums[1] =  hays[i+1];
						explosions = true;
					}
					else {
						explosions = false;
					}
				}
				System.out.println(i-1);
				
				if (i -1 > 0) {
					if (hays[i] - hays[i-1] <= j ) {
						nextnums[0] = hays[i-1];
						explosions = true;
					}
					else {
						explosions = false;
					}
				}
				
				System.out.println(i + "; " + Arrays.toString(nextnums));
			}
		}
		
	}
	public static int[] sort(int[] array) {
		int swaps = 0;
		
		do {
			swaps  = 0;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i] >= array[i+1]) {
					int prev = array[i+1];
					array[i+1] = array[i];
					array[i] = prev;
					swaps++;
					
				}
				
			}
			//System.out.println(Arrays.toString(array));
		}
		while(swaps != 0);
		return array;
	}

}
