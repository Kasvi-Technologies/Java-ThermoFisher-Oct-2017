package com.thermofisher.collectionsex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.thermofisher.beans.Employee;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map is a key and value pair
		int a [] = new int[2];
		try {
			Employee emp = new Employee();
			//NUllable Object
			//performing any operation on nullable object will throw 
			//exception
		
			//emp.setEmpId(1000); //exception occurs	
			addEmployee(emp);
			System.out.println("Employee setter emthod completed...");
			
			//Arithmatic operations..
			int i = 100/10; //divide by zero	
			//BL
			
			
			a[1] = 100; //ArrayIndexOutofBounds
			
			//BL
			//BL
		}  catch(NullPointerException npe){
			System.out.println(npe.getMessage());
			npe.printStackTrace();
		} catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException ae){
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			try {
				System.out.println(a[3]);
			}	catch(Exception e){
				System.out.println("catch inside catch..........");
			}
		} catch (Exception e){
			//Handled here
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("after catch block...");
		
		//below logic will not be executed...
		Map<Integer, String> strMap = 
				new HashMap<Integer, String>();		
		
		strMap.put(10, "sfsdfdsf");
		strMap.put(20, "eeqwesfsdfdsf");
		strMap.put(50, "adsdsfsdfdsf");
		strMap.put(60, "zzzzsfsdfdsf");
		strMap.put(30, "vvvvsfsdfdsf");
		
		//To retrieve an element whose key is 50
		System.out.println(strMap.get(50));
		
		//To repeat all elements
		
		//All keys which are available in a map
		Set<Integer> keySet = strMap.keySet();
		Iterator<Integer> intKeySetItr = keySet.iterator();
		
		while(intKeySetItr.hasNext()){
			Integer key = intKeySetItr.next();
			System.out.println(strMap.get(key));
		}		
		
	}
	
	public static void addEmployee(Employee emp) 
										throws Exception {
		
		if (emp.getEmpId() <= 0 ){
			throw new Exception("Employee id can't be lessthan 1");
		}
		
		//BL for addemployee if empid> 0
		//BL
		//BL
	}

}
