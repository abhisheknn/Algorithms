package com.practise.dsa;

import java.util.Scanner;

public class KadanesAlgo
{
	public static void main( String[] args )
    {
    
    	Scanner scanner= new Scanner(System.in);
    	int T=0;
    	
    	if(scanner.hasNextInt()){
    		T=scanner.nextInt();
    	}
    	
    	if(T>0){
    		while(T>=0){
    			int N=0;
    			int a[]=null;
    			if(scanner.hasNextInt()){
    	    		N=scanner.nextInt();
    	    	}
    	    	
    			if(N>0 && N<10){
    				a=new int[N];
    				for(int i=0;i<N;i++){
    			
    					if(scanner.hasNextInt()){
    	    	    		a[i]=scanner.nextInt();
    	    	    	}
    				
    			}
    			
    			
    				int maxSum=findMaxSum(a);
    				System.out.println(maxSum);
    		}
    			T--;
    		}
    	}
    }
    	private static int findMaxSum(int[] a) {
    		
    		int mSf=0;
    		int mEH=0;		
    		for(int i=0;i<a.length;i++){
    			mEH=mEH+a[i];
    			if(mEH<0){
    				mEH=0;
    			}
    			
    			if(mSf<mEH){
    			mSf=mEH;
    			}	
    		}
    		return mSf;
    	}
}


