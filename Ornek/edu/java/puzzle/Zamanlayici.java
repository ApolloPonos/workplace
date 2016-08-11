package edu.java.puzzle;

import java.util.Timer;
import java.util.TimerTask;

public class Zamanlayici {

	public static void main(String[] args) {
		TimerTask task = new TimerTask() {
			int i;

			public void run() {
				i++;
				System.out.println(i);
				if (i == 1000) {
					System.exit(0);
				}

			}
		};
		Timer t = new Timer();
		t.schedule(task, 0, 1000);

	}

}
