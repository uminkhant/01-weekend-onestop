package com.jdc.mkt.collection_test;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		ProcessingWork pt = new ProcessingWork();
		
		Thread th1 = new Thread(pt, "th1");
		th1.start();
		Thread th2 = new Thread(pt, "th2");
		th2.start();
		
		th1.join();
		th2.join();
		
	
		
		System.out.println("Counting point : "+pt.getCount());
		
	}

	 private static class ProcessingWork implements Runnable {

		private int count;
		
		public int getCount() {
			return count;
		}
		@Override
		public void run() {
			for(int i =0 ; i < 5 ;i++) {
				doWork(i);
				count++;
			}
		}
		private synchronized void doWork(int i) {
			
				try {
					Thread.sleep(i*10);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}

	}
}

