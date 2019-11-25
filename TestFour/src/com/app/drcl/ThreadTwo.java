package com.app.drcl;

public class ThreadTwo extends Thread{
	
	public void run() {
		for(int j=0;j<=11;j++) {
			System.out.println("Thread Two exceuted "+j);
		}
			
	}

}
