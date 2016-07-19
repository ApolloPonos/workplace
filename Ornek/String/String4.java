package String;

public class String4 {

	public static void main(String[] args) {
		ornek o1 = new ornek();
		String s1 = "Jak";
		String s2 = "Celil";
		int s3 = 3;
		System.out.println(s1 + " " + s2 + " " + s3 + " " + o1.islem());

	}
}

class ornek {
	int islem() {
		return 4;
	}
}