package day03;

import abstract_interface.Calculation;

public class Plus extends Calculation implements IMakerable{


	@Override
	public void makeResult() {
		// TODO Auto-generated method stub
		result = a+b;
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println(a+"+"+b+"="+(a+b));
	}

}
