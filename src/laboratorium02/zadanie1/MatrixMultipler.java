package laboratorium02.zadanie1;

import java.util.Scanner;

public class MatrixMultipler {
	public double matrix1[][];
	public double matrix2[][];
	
	public double [][] multiplied()
	{
		double [][]result=new double[matrix1.length][matrix2[0].length];
		for(int i=0;i<result.length;++i)
			for(int j=0;j<result[0].length;++j)
				for(int k=0;k<matrix2.length;++k)
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
		return result;		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		String numbers[]=inputScanner.nextLine().split("\\s+");
		MatrixMultipler matrixMultipler=new MatrixMultipler();
		int n=numbers.length;
		matrixMultipler.matrix1=new double[n][n];
		matrixMultipler.matrix2=new double[n][n];
		for(int i=0;i<n;++i)
			matrixMultipler.matrix1[0][i]=Double.parseDouble(numbers[i]);
		for(int i=1;i<n;++i)
			for(int j=0;j<n;++j)
			{
				matrixMultipler.matrix1[i][j]=inputScanner.nextDouble();
			}
		for(int i=0;i<n;++i)
			for(int j=0;j<n;++j)
			{
				matrixMultipler.matrix2[i][j]=inputScanner.nextDouble();
			}
		double[][]result=matrixMultipler.multiplied();
		for(int i=0;i<result.length;++i)
		{
			for(int j=0;j<result[0].length;++j)
				System.out.print(""+result[i][j]+" ");
			System.out.println();
		}
	}

}
