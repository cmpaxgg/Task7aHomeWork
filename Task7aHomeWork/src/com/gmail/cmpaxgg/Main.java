package com.gmail.cmpaxgg;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship shipOne = new Ship("Christopher Columbus", 10);
		Ship shipTwo = new Ship("Emma Maersk", 10);
		Ship shipThree = new Ship("Jules Verne", 10);

		ExecutorService dock = Executors.newFixedThreadPool(2);

		dock.execute(shipOne);
		dock.execute(shipTwo);
		dock.execute(shipThree);
		dock.shutdown();
	}

}
