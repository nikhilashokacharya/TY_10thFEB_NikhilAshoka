package com.tyss.capgemini.threads;

public class CustomThread2 extends Thread {

	Object object1;
	Object object2;

	CustomThread2(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {
		synchronized (object2) {
			System.out.println("CustomThread2 : "+object2);
			synchronized (object1) {
				System.out.println("CustomThread2 : "+object1);
				object1.notify();
			}
		}
	}

}
