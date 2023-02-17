StringAssignment

Q1. Write a simple String Program to take input from user

Ans->
package stringassignment;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner-it takes input from the user
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the String : ");
		
		String s = sc.nextLine();//Let's Play a Game with Java Programming Language
		
		System.out.println(s);
	}

}


Q2. How do you Concatenate two strings in Java?

Ans->
package stringassignment;


//concat two differnt Strings
public class ConcatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Videsh";//First String
		
		String s2 = "Pundir"; //Second String
		
		
		
		s2 = s2.concat(s1);// create a new object, to concat the string because the string are immutable
		
		System.out.println(s2); 
		
		String s3 = new String("Rasida");
		
		System.out.println(s3);//Printing Single String Value
		
		String s4 = new String("Khatoon");
		
		s4 = s4.concat(s3);//Concatenated the string
		System.out.println(s4);
		

	}

}


Q3. How do you find the length of a string in Java Explain with an example?

Ans-> 
package stringassignment;


//We Use length() function to find the length of the of the string in Java
public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "James Gosling";
		
		System.out.println(str.length());
		
		//Length of string is 13, it's count the space also

	}

}

Q4. How do you Compare Two Strings in Java? Give an Example?

Ans->

package stringassignment;


//Compare Two String in Java
public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "James Gosling";
		
		String s2 = "James Gosling";
		
		//equal operator to compare between two string
		
		if(s1==s2) {
			System.out.println("True");// it compare the address the string in heap memory
			
			
			
		}
		else {
			System.out.println("False");
		}
		
		//.equals() method is used to compare the values of the string
		
		System.out.println(s1.equals(s2));//compare the string value in string constant pool
		
		
		
		
		// create string using new keyword
		
		String s3 = new String("Hii Dimpal");
		
		String s4 = new String("Hii Dimpal");
		
		System.out.println(s3==s4);//it's comparing the address, because the object created in string constant pool and heap memory also
		// both  are storing on different address
		
		
		
		
		System.out.println(s3.equals(s4));//it compares the values

               //Output

		/*
		 * true
		 * true
		 * false 
		 * true
		 * 
		 */
	}

}


Q5. Write a Program to find the length of the String "refrigerator",

Ans->

package stringassignment;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "refrigerator";
		
		System.out.println(s.length());//length 12
	}

}


Q6. Write a Program to check if the letter 'e' is present in the word "umbrella",

Ans->
package stringassignment;

public class CheckLetterEPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letter = "Umbrella";
		
		System.out.println(letter.contains("e"));// We Use String contains() Method to Check if a String Contains Character Java String’s
		
		//Output True 

		System.out.println(letter.contains("f"));
		
		//Output false
	}

}


Q7. Write a Program to delete all consonants from the string "Hello,have a good day".

Ans->

package stringassignment;

public class DeleteConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello, have a good day";
		
		
		String strNew = s.replaceAll("[Hlvhgdy]", "");
		
		// delete constant we use string inbuilt method to delete the constant from the string
		
		System.out.println(strNew);

	}

}


