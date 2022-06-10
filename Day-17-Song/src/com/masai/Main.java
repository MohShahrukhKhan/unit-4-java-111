package com.masai;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   PlayList pl=new PlayList();
		pl.addSong(new Song("s1", "s1"));   
		pl.addSong(new Song("Song2", "mySong"));   
		pl.addSong(new Song("s1", "s1"));   
		pl.addSong(new Song("Song2", "mySong"));   
		
		for(Song s:pl.songs){
			s.play();
		}
	
		

     

	}

}
