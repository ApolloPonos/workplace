package Java;

public class Volume {


	public static void main(String[] args) {
	
		double v,pi,r,h;
		System.out.println("Yari cap giriniz");
		r = Keyboard.readDouble();
		System.out.println("Yukseklik giriniz");
		h = Keyboard.readDouble();
		v = pi * r * r * h;
		System.out.println("Silindirin hacmi");
	}

}
