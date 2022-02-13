import java.io.*;
import java.util.*;

public class angry1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("angry.in"));
		PrintWriter pw  = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));
		int n = Integer.parseInt(br.readLine());
		TreeSet<Integer> hays = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			hays.add(Integer.parseInt(br.readLine()));
		}
		for (int i : hays) {
			System.out.println(i);
		}
		System.out.println("______________");
		List<Integer> hayss = new ArrayList<Integer>(hays);
		int largest = 0;
		for (int i = 0; i < hays.size(); i++) {
			int curr = checkExplosions(hayss, i);
			if (curr > largest) {
				largest = curr;
			}
			System.out.println("i:" + i + "curr: " + curr);
		}
		System.out.println("largest:" + largest);
		
	}
	
	
	static int ExplosionRadius = 1;
	public static int checkExplosions(List<Integer> hays, int CowStart) {
		// go to cowstart, check +- Explosion radius.
		int[] applicable = new int[ExplosionRadius*2];
		int Explosions = 0;
		if (CowStart-1 >= 0) {
			if (Math.abs(hays.get(CowStart-1) - hays.get(CowStart)) == 1) {
				Explosions++;
				Explosions = Explosions + checkNext(hays, CowStart-1, 2);
			}
		}
		if (CowStart+1 < hays.size()) {
			if (Math.abs(hays.get(CowStart+1) - hays.get(CowStart)) == 1) {
				Explosions++;
				Explosions = Explosions + checkNext(hays, CowStart+1, 2);
			}
			
		}
		return Explosions; 
	}
	public static int checkNext(List<Integer> hay, int CowStart, int currExR) {
		int Explosions = 0;
		List<Integer>  hays = new ArrayList<Integer>(hay);
		if (CowStart-currExR >= 0) {
			if (Math.abs(hays.get(CowStart-1) - hays.get(CowStart)) == 1) {
				Explosions++;
				Explosions = Explosions + checkNext(hays, CowStart-1, currExR+1);
			}
		}
		if (CowStart+currExR < hays.size()) {
			if (Math.abs(hays.get(CowStart+1) - hays.get(CowStart)) == 1) {
				Explosions++;
				Explosions = Explosions + checkNext(hays, CowStart+1, currExR+1);
			}
			
		}
		return Explosions; 
	}

}
