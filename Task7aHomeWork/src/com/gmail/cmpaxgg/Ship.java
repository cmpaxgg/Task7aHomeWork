package com.gmail.cmpaxgg;

public class Ship implements Runnable {

	private String name;
	private int cargo = 10;

	public Ship(String name, int cargo) {
		super();
		this.name = name;
		this.cargo = cargo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getÑargo() {
		return cargo;
	}

	public void setÑargo(int cargo) {
		this.cargo = cargo;
	}

	public void run() {
		for (; cargo > 0;) {
			cargo -= 1;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ship " + getName() + "--------->off-load cargo");
		}

		System.out.println("Ship " + getName() + "--------->finish off-load cargo");
	}
}
