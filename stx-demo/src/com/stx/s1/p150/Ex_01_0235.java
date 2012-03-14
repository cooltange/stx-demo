package com.stx.s1.p150;

import java.util.Scanner;
/**
 * ¥Ú”°“ªÇÄ¡‚–Œ
 * @author qinguoqiang
 *
 */


public class Ex_01_0235 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		lx(in.nextInt());
	}
	public static void lx(int h){
		
			for(int i=0;i<h;i++){ 
				for(int j = h-i;j>0;j--){ 
					System.out.print(" "); 
				} 
				for(int z=0;z<i;z++){ 
					System.out.print("*"+" " ); 
				} 
				System.out.print("\n"); 
			} 
			for(int i=h;i>=0;i--){ 
				for(int j = i;j<h;j++){ 
					System.out.print(" "); 
				} 
				for(int z=0;z<i;z++){ 
					System.out.print("*"+" "); 
				} 
			System.out.print("\n"); 
			} 
			

	}
}
	
