package demo;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class tc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator cal=new Calculator();
CalculatorSoap a1=cal.getCalculatorSoap();
System.out.println(a1.add(10,20));
System.out.println(a1.divide(20,3));
	}

}
