package com.jdc.mkt.collection_test;


public class SetDemo {

	public static void main(String[] args) throws InterruptedException {

		ProcessingThread pt = new ProcessingThread();
		Thread t1 = new Thread(pt, "t1");
		t1.start();
		Thread t2 = new Thread(pt, "t2");
		t2.start();
		t1.join();
		t2.join();
		System.out.println("counter : " + pt.getCount());
	}

}

class ProcessingThread implements Runnable {

	private int count;
	
	public int getCount() {
		return count;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

		//	processingThing(i);
			count++;
		}

	}

	private void processingThing(int i) {

		try {
			Thread.sleep(i * 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
