import java.util.Scanner;

public class CGPAcalculator{
    
    public static void main(String[] args){
        
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Enter the no of subjects : ");
    int numSubject=scanner.nextInt();
    
    double totalCredits=0.0;
    double totalGradePoints=0.0;
    
    for( int i=1;i<=numSubject;i++){
        
    System.out.println("Subject" +i +":");
    System.out.println("Enter the credits for the subject :");
    double credits=scanner.nextDouble();
    totalCredits+=credits;
    
    System.out.println("Enter the gradePoints for the subject :");
    double grade=scanner.nextDouble();
    totalGradePoints +=grade*credits;
    }
    
    double cgpa= totalGradePoints/totalCredits;
    System.out .println("CGPA"+cgpa);
    
    scanner.close();
    
    } 
}
