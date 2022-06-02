package com.masai;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) 
	{
	
		switch(stadium){
		case EDEN_GARDENS_STADIUM:
		System.out.println("This is the home ground of KKR");
		break;
		case WANKHEDE_STADIUM:
		System.out.println("This is the home ground of Mumbai Indians");
		break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
			case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		default:
		System.out.println("invaid input");
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		IPL ipl=new IPL();
		System.out.println("Enter The Stadium Name");
		String studiumName=sc.next();
		Stadium studium=Stadium.valueOf(studiumName);
		
		ipl.homeTeamStadium(studium);

	}

}
