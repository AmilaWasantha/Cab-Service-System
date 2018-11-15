/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.view;

/**
 *
 * @author user
 */
 class Vehicle{
	void park(){
	
	}
}
class Car extends Vehicle{
	void park(){
		System.out.println("Car parking...");
	}
}
class Bus extends Vehicle{
	void park(){
		System.out.println("Bus parking...");
	}
}
class Van  extends Vehicle{
	void park(){
		System.out.println("Van parking...");
	}
}
class Demo{
	public static void main(String args[]){
		Vehicle v1;
		v1=new Car();
		v1.park(); //Car parking..
		
		v1=new Bus();
		v1.park();	//Bus parking..
		
		v1=new Van();
		v1.park();	//Van parking..
	}



}