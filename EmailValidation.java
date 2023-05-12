package email_Validation;

import java.util.regex.*;

import java.util.Scanner;

import java.util.ArrayList;

public class EmailValidation 
{
	public static void main(String args[])
	{
		
	
	ArrayList<String> emailId= new ArrayList<String>();
	
	emailId.add("mayankpadhi99@gmail.com");
	emailId.add("Darkfrost99@gmail.com");
	emailId.add("AbhijeetChavda@gmail.com");
	emailId.add("EmilCosman72@gmail.com");
	
	System.out.println("WELCOME TO E-MAIL VALIDATOR\n");
	System.out.println("Enter the e-mailId to be searched\n");
	
	Scanner sc= new Scanner(System.in);
	
	String EmailVarifier = sc.nextLine();
	
	//Checking if the email follow proper formatting by using methods of regex.
	if(Pattern.matches("^[a-zA-Z0-9!#$&'*+-/=?^_`{|}~]*@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9][.][a-zA-Z]*$",EmailVarifier))
	{
		System.out.println("email written is in correct format.\n");
	
	
	    //for-each to iterate all the added emails.
	    for (String emailler:emailId)
	   {
		    if (emailler.contains(EmailVarifier))
		    {
			   System.out.println("EmailId found of " +" "+ emailler);
		    }
		  
	   }
	 
	}
	else
		System.out.println("Please enter a email of proper format");
	
	
	
	
	
	
	}
	

}
