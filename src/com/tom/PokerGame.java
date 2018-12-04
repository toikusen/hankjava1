package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		int[] n = new int[10];
		System.out.println(n[0]);
		
		Card[] c = new Card[10];
		c[0] = new Card(8);
		System.out.println(c[0].print());
		
		
//		int n = 4;
//		int[] a =new int[52];
//		Card c = new Card(5);
//		Card[] cards = new Card[52];
				
		Poker poker = new Poker();
		poker.print();
		
		System.out.println("\n");
		
		
//		
//		char[]flowers ={0x2663,0x2666,0x2665,0x2660};
//		for (int j=0 ; j<4; j++){
//			System.out.println("\n");
//			
//			for (int i=1 ; i<=13 ; i++){
//				System.out.print(flowers[j]+"\f"+i+"\t");
//			}
//		}
//		
//		System.out.println("\n");
		
//		char f =0x2666;
//		System.out.println(f);
//		int[] nums = new int[52];
//		nums[0] = 77;
//		nums[4] = 98;
//		System.out.println(nums[4]);
//		System.out.println(nums.length);
//		for (int i = 0 ; i<nums.length; i++){
//			System.out.println(nums[i]);
//		}
		
		
		for(int i = 0; i<52;i++){
			Random random = new Random();
			int num = random.nextInt(13)+1;
			System.out.print(num);
			
			int colar = random.nextInt(4);
			switch(colar){
			case 0 :
				System.out.print("S");
				break;
			case 1:
				System.out.print("H");
				break;
			case 2:
				System.out.print("D");
				break;
			case 3:
				System.out.print("C");
				break;
				
			}
		
		}
		
		/*if(colar == 0){
			System.out.print("S");	
			}
		else{
			if(colar == 1){
				System.out.print("H");
			}
			else{
				if(colar == 2){
					System.out.print("D");
				}
				else{
						System.out.print("C");
					}
		
			}
		}*/
	}
}