package edu.java.Headfirstjava;

public class ChapterDrumKit {
	boolean topHat = true;
	boolean snare = true;

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}

	void playSnare() {
		System.out.println("bang bang ba-bang");

	}
}

class DrumKitTestDrive {
	public static void main(String[] args) {
		ChapterDrumKit d = new ChapterDrumKit();
		d.playSnare();
		d.snare = false;
		d.playTopHat();

		if (d.snare == true) {
			d.playSnare();
		}
	}
}
