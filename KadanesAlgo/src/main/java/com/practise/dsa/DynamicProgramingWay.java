package com.practise.dsa;

import java.util.Scanner;

public class DynamicProgramingWay {
	public static void main( String[] args )
    {
    
    	Scanner scanner= new Scanner(System.in);
    	int T=0;
    	
    	if(scanner.hasNextInt()){
    		T=scanner.nextInt();
    	}
    	
    	if(T>0 && T<200){
    		while(T>=0){
    			int N=0;
    			int a[]=null;
    			if(scanner.hasNextInt()){
    	    		N=scanner.nextInt();
    	    	}
    	    	
    			if(N>0 && N<1000){
    				a=new int[N];
    				for(int i=0;i<N;i++){
    			
    					if(scanner.hasNextInt()){
    	    	    		int n=scanner.nextInt();
    						if(n<=100 && n>=-100)
    						a[i]=n;
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
    		
    		int mSf=a[0];
    		int mEH=a[0];		
    		for(int i=0;i<a.length;i++){
    			mEH=Math.max(a[i], mEH+a[i]);
    			mSf=Math.max(mSf, mEH);
    		}
    		return mSf;
    	}
}
