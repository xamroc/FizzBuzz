import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Main fb = new Main();
		Scanner x = fb.openFile(args[0]);
		while(x.hasNext()){
			int f = Integer.parseInt(fb.readLine(x));
			int b = Integer.parseInt(fb.readLine(x));
			int n = Integer.parseInt(fb.readLine(x));
			//System.out.print("f: " + f + " b: " + b + " n: " + n + "\n");
			
			for(int i=1; i<=n; i++){
				if(i%f==0 && i%b==0){
					System.out.print("FB ");
				}
				else if(i%f==0){
					System.out.print("F ");
				}
				else if(i%b==0){
					System.out.print("B ");
				}else System.out.print(i + " ");
			}
			System.out.println();
		}
		fb.closeFile(x);
	}
	
	private Scanner openFile(String file) {
		Scanner x = null;
		try {
			x = new Scanner(new File(file));
		} catch(Exception e) {
			System.out.println("Error reading file.");
		}
		return x;
	}
	
	private String readLine(Scanner x) {
		String line = x.next();
		return line;
	}
	
	private void closeFile(Scanner x) {
		x.close();
	}

}
