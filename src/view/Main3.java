package view;

import controller.Fatorial;

public class Main3 {

	public static void main(String[] args) {
		int num;
		do  {
		 num =(int)((Math.random()*100)+ 0);
		}while (num <0 || num > 12);
		Fatorial fa = new Fatorial();
		int v = fa.Fat(num);
		System.out.println("fatorial de "+ num + " é = "+ v);
	}
}
