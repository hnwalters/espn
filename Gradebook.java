//Hayden N. Walters
/**
 *  @author Hayden N. Walters
 */


import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
	
public class Gradebook 
{
			int [] grades;
			/**
			 * 
			 * @param filename the name of the gradebook
			 * @throws IOException
			 */
			
			
			public Gradebook(String filename) throws IOException
			{
				Scanner fin = new Scanner(new FileReader(filename));
				int n = fin.nextInt();
				grades = new int[n];
				for(int i = 0; i<n; i++)
				{
					grades[i]=fin.nextInt();	
				}
				Arrays.sort(grades);
				
			}
			/**
			 * 
			 * @return the smallest grade.
			 */
			int Min()
			{
				return grades[0];
			}
			/**
			 * 
			 * @return the largest grade.
			 */
			int Max()
			{
				return grades[grades.length-1];
			}
			/**
			 * adds all the grades together then divides by the count
			 * @return the answer, average.
			 */
			double Mean()
			{
				double sum = 0;
				for(int i = 0; i<grades.length; i++)
				{
				sum = (sum + grades[i]);
				}
				
				 sum = sum/grades.length;
				
				
				return sum;
			}
			/**
			 * 
			 * @return the median of the grades, the center most grade.
			 */
			double Median()
			{
				double median;
				if (grades.length % 2 == 0)
				    median = ((double)grades[grades.length/2] + (double)grades[grades.length/2 - 1])/2;
				else
				    median = (double) grades[grades.length/2]; 
				
				
				return median;
			}
			/**
			 * 
			 * @return the number of F's, D's, C's, B's, and A's.
			 */
			int [] gradesDistribution()
			{
				int [] distro = {0,0,0,0,0};
				for(int i = 0; i<grades.length; i++) 
				{
					if(grades[i]<60) {distro[4]++;}
					if(grades[i]<70 && grades[i]>=60) {distro[3]++;}
					if(grades[i]<80 && grades[i]>=70) {distro[2]++;}
					if(grades[i]<90 && grades[i]>=80) {distro[1]++;}
					if(grades[i]<100 && grades[i]>=90) {distro[0]++;}
				}
				return distro;		
			}
			
			
			
			
			
			
			
			
			
			

		}

	


