package IteratorPractice;
    import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    	public class IteratorPractice { 
    		public class Student{
    			private int id;
    			private String name;
    			private double cpga;
    			
				public Student(int id, String name, double cpga) {
					
					this.id = id;
					this.name = name;
					this.cpga = cpga;
				}
    			
    			
    		}

    		  static Iterator func(ArrayList mylist){
    		      Iterator it=mylist.iterator();
    		      while(it.hasNext()){
    		         Object element = it.next();
    		         it.remove();
    		         if(element instanceof String) 
    					break;
    				}
    		      return it;
    		      
    		  }
    	    public static void main(String[] args) {
    	        ArrayList mylist = new ArrayList();
    	        Scanner sc = new Scanner(System.in);
    	        int n = sc.nextInt();
    	        int m = sc.nextInt();
    	        for(int i = 0;i<n;i++){
    	           mylist.add(sc.nextInt());
    	        }
    	        
    	        mylist.add("###");
    	        for(int i=0;i<m;i++){
    	           mylist.add(sc.next());
    	        }
    	        
    	        java.util.Iterator it=func(mylist);
    	        while(it.hasNext()){
    	           Object element = it.next();
    	           System.out.println((String)element);
    	        }
    	     }
    	
    }





