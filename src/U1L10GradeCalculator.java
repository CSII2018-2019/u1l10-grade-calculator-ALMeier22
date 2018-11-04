import javax.swing.JOptionPane;

public class U1L10GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String amountGrades = JOptionPane.showInputDialog(null,
				 "How many grades will you enter?");
		int numberGrades = Integer.parseInt(amountGrades);
		
		double[] grades = new double[numberGrades];
		
		for (int i = 0; i<numberGrades; i++) {
			String gradeInput =  JOptionPane.showInputDialog(null, "Enter grade: ");
			grades [i] = Double.parseDouble(gradeInput);
		}
		
		double sum = 0;
		double lowest = 100;
		
		for (int i = 0; i<numberGrades; i++) {
			sum = sum + grades [i];
			if(lowest > grades[i]) {
				lowest = grades[i];
			}
			
		}
		double average = sum / numberGrades; 
		System.out.println("average is " + average);
		
		printGradeLetter(average);
		
		System.out.println("Lowest grade is " + lowest);
		
		double sum2 = sum - lowest;
		double average2 = sum2 / (numberGrades - 1);
		
		System.out.println("average without lowest is " + average2);

		printGradeLetter(average2);
		
	}
	
	public static void printGradeLetter(double grade) {
		if (grade >= 100) {
			System.out.println("Grade: A");
		}
		else if (grade >= 80) {
			System.out.println("Grade: B");
		}
		else if (grade >= 70) {
			System.out.println("Grade: C");
		}
		else if (grade >= 61) {
			System.out.println("Grade: D");
		}
		else {
			System.out.println("Grade: F");
		}
	}

}
