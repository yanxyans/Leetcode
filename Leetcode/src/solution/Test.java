package solution;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		ZeroOneMatrix test = new ZeroOneMatrix();
		try {
			String file = "data/ZeroOneMatrix.txt";
			BufferedReader read = new BufferedReader(new FileReader(file));
			String line = read.readLine();
			
			String[] splitRow = line.split("\\],\\[");
			int m = splitRow.length;
			int n = splitRow[0].length() - 3;
			
			int[][] splitCol = new int [m][n];
			int k = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					int index = (i == 0 && j == 0) ? 2 : 0;
					splitCol[i][j] = splitRow[k].charAt(index + (j * 2));
				}
				k++;
			}
			
			final long startTime = System.nanoTime();
			test.updateMatrix(splitCol);
			final long duration = System.nanoTime() - startTime;
			System.out.println(duration);
			
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		
	}

}
