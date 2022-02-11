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
		
	}
	static int Explosions = 0;
	static int ExplosionRadius = 0;
	public static int checkExplosions(TreeSet<Integer> hay, int CowStart) {
		
		return Explosions;
	}

}
