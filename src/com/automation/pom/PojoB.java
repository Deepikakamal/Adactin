package com.automation.pom;

public class PojoB {
public static void main(String[] args) {
	PojoA P = new PojoA();
	P.setA(13);
	int a = P.getA();
	System.out.println(a);

}
}
