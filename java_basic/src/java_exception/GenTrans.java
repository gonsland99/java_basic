package java_exception;

import java_MultipleDataProcesse.Generic;

public class GenTrans{
	public static void main(String[] args) {
		Generic<String> gs = new Generic<>();
		gs.setParam("Á¦³×¸¯");
		System.out.println("String: "+gs.getParam());
		Generic<Integer> gi = new Generic<>();
		gi.setParam(123);
		System.out.println("String: "+gi.getParam());
		Generic<Double> gd = new Generic<>();
		gd.setParam(1.23);
		System.out.println("String: "+gd.getParam());
	}
}
