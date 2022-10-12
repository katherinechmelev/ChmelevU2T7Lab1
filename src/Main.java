import java.util.Scanner;

public class Main {
public static void main(String [] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = scan.nextLine();

    int lenStr1 = str1.length();
    System.out.println("String length: " + lenStr1);

    int firstHalf = lenStr1/2;

    System.out.println("First half: " + str1.substring(0, firstHalf));
    System.out.println("Second half: " + str1.substring(firstHalf));


    System.out.print("Enter second string: ");
    String str2= scan.nextLine();
    int lenStr2 = str2.length();

    if (lenStr1 > lenStr2){
        System.out.println(str1 + " is longer");
    }else if(lenStr1 < lenStr2){
        System.out.println(str2 + " is longer");
    }else if (lenStr1 == lenStr2){
        System.out.println("Both strings have the same length.");
    }

    if (str1.equals(str2)){
        System.out.println("Both strings have the exact same characters.");
    }else if (str1.compareTo(str2) < 0) {
        System.out.println(str1 + " is first alphabetically");
    }else if(str1.compareTo(str2) > 0) {
        System.out.println(str2 + " is first alphabetically");
    }
    int indexOfSecondString = str1.indexOf(str2);
    if (indexOfSecondString != -1){
        System.out.println(str2 + " is found in " + str1 + " at index " + indexOfSecondString);
    }else{
        System.out.println(str2 + " is NOT found in " + str1);
    }







}
}
