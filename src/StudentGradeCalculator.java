import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Grade Calculator");
        System.out.println("To get your average percentage and final grade, kindly input your marks for the following subjects: ");
        Scanner sc= new Scanner(System.in);
        System.out.println("Mathematics(Enter your marks out of 100): ");
        int Math;
        while (true) {  
            Math = sc.nextInt();        
            if (Math>=0 && Math<=100) {
                break; 
            } else {
                System.out.println("The marks should be between 0 and 100. Please try again.");
            }
        }

        System.out.println("English(Enter your marks out of 100): ");
        int Eng;
        while (true) { 
            Eng = sc.nextInt(); 
            if (Eng>=0 && Eng<=100) {
                break; 
            } else {
                System.out.println("The marks should be between 0 and 100. Please try again.");
            }
        }

        System.out.println("Chemistry(Enter your marks out of 100): ");
        int Chem;
        while (true) {
            Chem = sc.nextInt(); 
            if (Chem>=0 && Chem<=100) {
                break; 
            } else {
                System.out.println("The marks should be between 0 and 100. Please try again.");
            }
        }

        System.out.println("Physics(Enter your marks out of 100): ");
        int Phys;
        while (true) {
            Phys = sc.nextInt();
            if (Phys>=0 && Phys<=100) {
                break; 
            } else {
                System.out.println("The marks should be between 0 and 100. Please try again.");
            }
        }
        System.out.println("Geography(Enter your marks out of 100): ");
        int Geo;
        while (true) {   
            Geo=sc.nextInt(); 
            if (Geo>=0 && Geo<=100) {
                break; 
            } else {
                System.out.println("The marks should be between 0 and 100. Please try again.");
            }
        }
        System.out.println("Computer Studies(Enter your marks out of 100): ");
        int Comp;
        while (true) {
            Comp = sc.nextInt();
            if (Comp>=0 && Comp<=100) {
                break; 
            } else {
                System.out.println("The marks should be between 0 and 100. Please try again.");
            }
        }
        int sum=Math+Eng+Chem+Phys+Geo+Comp;
        float average=(sum/6);
        if(average>=0 && average<=19){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: F");
        }
        else if(average>=20 && average<=24){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: E");
        }
        else if(average>=25 && average<=29){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: D-");
        }
        else if(average>=30 && average<=34){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: D");
        }
        else if(average>=35 && average<=39){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: D+");
        }
        else if(average>=40 && average<=44){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: C-");
        }
        else if(average>=45 && average<=49){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: C");
        }
        else if(average>=50 && average<=54){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: C+");
        }
        else if(average>=55 && average<=59){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: B-");
        }
        else if(average>=60 && average<=64){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: B");
        }
        else if(average>=65 && average<=69){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: B+");
        }
        else if(average>=70 && average<=74){
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: A-");
        }
        else{
            System.out.println("Total marks: "+sum);
            System.out.println("Average percentage: "+average+"%");
            System.out.println("Grade: A");
        }
    }
}
