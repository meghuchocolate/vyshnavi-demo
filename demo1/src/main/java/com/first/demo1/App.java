package com.first.demo1;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Sweets> arr = new ArrayList<>();
    	arr.add(new Chocolates("5star",3,30));
    	arr.add(new Icecreams("butterskotch",2,50));
    	arr.add(new Chocolates("milkybar",4,10));
    	arr.add(new Chocolates("diarymilk",41,80));
    	arr.add(new Chocolates("nestle",14,90));
    	arr.add(new Chocolates("cadbury",4,105));
    	arr.add(new Chocolates("galaxy",49,100));
    	arr.add(new Icecreams("chocolate",6,500));
    	arr.add(new Icecreams("blackcurrent",12,550));
    	arr.add(new Icecreams("redvelvet",21,670));
    	arr.add(new Icecreams("vinella",2,50));
    	arr.add(new Icecreams("mango",2,20));
    	int c1=0,c2=0;
    	for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) instanceof Chocolates){
                c1++;
            }
        }
    	for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) instanceof Icecreams){
                c2++;
            }
        }
    	System.out.println(c1+" "+c2);
    	Collections.sort(arr,new Comparator<Sweets>() {
    		public  int compare(Sweets a, Sweets b){
    	        return a.quantity - b.quantity;
    	    }
    	});
    	ArrayList<String> a1=new ArrayList<>();
    	ArrayList<String> a2=new ArrayList<>();
    	for(int i=0;i<arr.size();i++) {
    		if(arr.get(i).cost<100)
    			a1.add(arr.get(i).name);
    		else
    			a2.add(arr.get(i).name);
    	}
    	System.out.println("All types of sweets are");
    	for(int i=0;i<arr.size();i++)
    		System.out.println(arr.get(i).name+" ");
    	System.out.println("Sweets having cost less than 100 are:");
    	for(int i=0;i<a1.size();i++)
    		System.out.println(a1.get(i)+" ");
    	System.out.println("Sweets having cost greater than 100 are:");
    	for(int i=0;i<a2.size();i++)
    		System.out.println(a2.get(i)+" ");
    }
}
