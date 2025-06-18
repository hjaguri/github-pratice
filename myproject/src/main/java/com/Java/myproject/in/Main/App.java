package com.Java.myproject.in.Main;
import com.Hans.main.App;


class Arithmetic
{
	public int sum(int x , int y){
		return x+y;
	}
}
public class App 
{
    public static void main( String[] args )
    {
		System.out.println("Program 1 :: Start");
        System.out.println( "Generated through maven..." );
		Arithmetic a = new Arithmetic();
		int result = a.sum(10,20);
		System.out.println("Result ::  " + result);
		System.out.println("Program 1 :: End");

		System.out.println("Program 2 :: Start");
		System.out.println("Another Program is running the same program");
		App app = new App();
		int answer = app.add(50,50);
		System.out.println("Sum of two number is :: " + answer);
		System.out.println("Program 2 :: End");

    }
}
