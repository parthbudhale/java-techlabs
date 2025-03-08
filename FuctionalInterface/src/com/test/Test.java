package com.test;
import com.model.A;
import com.model.B;
public class Test {
	public static void main(String[] args) {
		A test = () ->System.out.println("print main");	
			test.show();
			B test1 = ( a,  b) -> a+b;
			int ans =test1.add(20,30);
			System.out.println("interface B add method:"  +ans);	
		}
	}

