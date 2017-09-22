//Hayden N. Walters 
/**
 * This class reads in a textfile input by the user. Then sorts it into an array, then prints out the information corresponding to a specified command input by the user.
 * @author Hayden N. Walters
 */
import java.io.IOException;
import java.util.Scanner;

public interface espn2 
{
	/**
	 * 
	 * @param args the various arguments in the while loop
	 * @throws IOException 
	 */
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter a command.");
		String command;
		/**
		 * A while statement that when true, when the user inputs a certain command, a specific set of data is printed.
		 */
		Gradebook G= null;
		while(true)
		{
			/**
			 * allows the user to input a filename to be read from
			 */
			command=cin.nextLine();
			if(command.equalsIgnoreCase("Read"))
			{ 
				System.out.println("Type filename, including the .txt");
				String filename = cin.nextLine();
				G= new Gradebook(filename);	
				System.out.println("Enter next command");
			}
			/**
			 * finds the smallest grade
			 */
			if(command.equalsIgnoreCase("Min"))
			{
				System.out.println(G.Min());
				System.out.println("Enter next command");
			}
			/**
			 * finds the largest grade
			 */
			if(command.equalsIgnoreCase("Max"))
			{
				System.out.println(G.Max());
				System.out.println("Enter next command");
			}
			/**
			 * finds the average of the grades
			 */
			if(command.equalsIgnoreCase("Average"))
			{
				System.out.println(G.Mean());
				System.out.println("Enter next command");
			}
			/**
			 * displays the number of each letter grade
			 */
			if(command.equalsIgnoreCase("Dist"))
			{ 
				int [] distro = G.gradesDistribution();	
				System.out.println("F" + distro[4]);
				System.out.println("D" + distro[3]);
				System.out.println("C" + distro[2]);
				System.out.println("B" + distro[1]);
				System.out.println("A" + distro[0]);
				System.out.println("Enter next command");
			}
			/**
			 * finds the median of the grades
			 */
			if(command.equalsIgnoreCase("Median"))
			{
				System.out.println(G.Median());
				System.out.println("Enter next command");
			}
			/**
			 * tells the number of total grades
			 */
			if(command.equalsIgnoreCase("Count"))
			{
				System.out.println(G.grades.length);
				System.out.println("Enter next command");
			}
			/**
			 * stops the program
			 */
			if(command.equalsIgnoreCase("Quit"))
			{
				System.out.println("Thank you for using espn2.0");
				break;
			}
			/**
			 * empties the array
			 */
			if(command.equalsIgnoreCase("Empty"))
			{
				G=null;
				System.out.println("Gradebook has been emptied. Enter the command read, then the next filename to continue.");
					
			}
			
		
		}

			
		
		
		
		
		
		
		
		
		cin.close();
		
		
		
		
		
		
		
	}
	 
	
	
	
	

}
