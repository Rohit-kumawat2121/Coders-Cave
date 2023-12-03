import java.util.Scanner;

public class BMI
 {
    public static void main(String args[])
    {   Double weight,height;

        Scanner obj=new Scanner(System.in);
        String name;
        System.out.println("Input your name:");
        name=obj.nextLine();

        System.out.println("-----------------------------");

        System.out.println("Welcome to our BMI Calculator");

         System.out.println("-----------------------------");


        System.out.println("Enter the weight the in kilograms: ");
        weight=obj.nextDouble();

         System.out.println("Enter the height in meters: ");
         height=obj.nextDouble();

        Double bmi;
        bmi=weight/(height*height);
        
        System.out.print(name + " "+"your BMI(Body Mass Index is:)" + bmi + "kg/m2");

    }
    
}
