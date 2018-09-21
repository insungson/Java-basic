package day03;

import abstract_interface.Calculation;

public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Plus plus = new Plus();
plus.setData(27,32);


//plus.makeResult();
//plus.answer();


Calculation c = plus;
IMakerable im = plus;

im.makeResult();
c.answer();

//Minus miner = new Minus();
//miner.setData(27,32);
//miner.answer();

Calculation z =new Plus();
System.out.println(z instanceof Plus);
System.out.println(z instanceof IMakerable);
System.out.println(z instanceof Minus);
System.out.println(z instanceof Calculation);

	}

}
