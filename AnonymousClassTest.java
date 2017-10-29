package com.thermofisher.test;

import com.thermofisher.other.GatewayInterface;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Anonymous class
		GatewayInterface iciciGateWay = new GatewayInterface(){
			
			public void payment() {
				System.out.println("ICICI Bank Payment.......");
			}
		};
		
		//Anonymous class
		GatewayInterface hdfcGateWay = new GatewayInterface(){
					
			public void payment() {
				System.out.println("HDFC Bank Payment.......");
			}
		};
		
		GatewayInterface hdfcGateWay1 = getGateWayInterface();
		hdfcGateWay1.payment();
	}
	
	public static GatewayInterface getGateWayInterface(){
		GatewayInterface hdfcGateWay = new GatewayInterface(){
			
			public void payment() {
				System.out.println("HDFC Bank Payment.......");
			}
			//n number of methods.....
			
		};
		
		return hdfcGateWay;
	}

}
