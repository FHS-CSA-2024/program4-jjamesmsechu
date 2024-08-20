//Youre on your own!!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner; //This imports the console scanner that reads user input


public class Program4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //gather user input 
        System.out.print("Enter number 1 : ");
        float num_1 = Integer.parseInt(scan.nextLine(),10);
        System.out.print("Enter number 2 : ");
        float num_2 = Integer.parseInt(scan.nextLine(),10);
        System.out.print("Enter number 3 : ");
        float num_3 = Integer.parseInt(scan.nextLine(),10);
        System.out.print("Enter number 4 : ");
        float num_4 = Integer.parseInt(scan.nextLine(),10);

        // Calculate sum and average 
        float sum = (num_1 + num_2 + num_3 + num_4);
        float average = (sum / 4);

        System.out.print("The sum is : " + sum);
        System.out.print("\nThe average is : " + average);
        }

}


//Paste console output below:
/*


*/
