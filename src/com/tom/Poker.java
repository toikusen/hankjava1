package com.tom;

import java.util.Random;

public class Poker {
	
	Card[] cards = new Card[52];
	public Poker(){
		for (int i=0 ;i<52; i++){
			cards[i] = new Card(i);
		}
	}	
	
	public void suffle(){
		for(int i=0 ;i<52; i++){
			int r = new Random().nextInt(52);
			//a = cards[i]
			//b = cards[r]
			Card temp = cards [i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
	
	
	public void print(){
		for (int i=0 ;i<52; i++){
			System.out.print(cards[i].print()+" ");
			if (i%13 == 12)
				System.out.println();
	}
			
		}
	}
		
	
	
//	char[]flowers ={0x2663,0x2666,0x2665,0x2660};
//	int[] nums = new int[52];
//	
//	public Poker(){
//		
//	for (int j=0 ; j<4; j++){
//		System.out.println("\n");
//		
//		for (int i=1 ; i<=13 ; i++){
//			System.out.print(flowers[j]+"\f"+i+"\t");
		
	

//}
