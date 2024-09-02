package com.tnsif_daytwelve_mltithreading;

import com.tnsif_dayelevan.Threadandmultithreadingdemo.MyChildThread;

public class ThreadLifecycleDemo {

public static void main(String args[]) {
	MyChildThread myThread=new MyChildThread();
	System.out.println("Before runable stage thread"+"is alive or not"+myThread.isAlive());
	myThread.start();
	try {
		Thread.sleep(4000);
	}
	catch(InterruptedException exp) {
		
	}
	
	
}

}
