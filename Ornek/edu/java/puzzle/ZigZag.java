package edu.java.puzzle;

public class ZigZag {

	public static void main(String[] args) {
		bounce(20, 2);
	}

	private static void bounce (int spaceLength, int bounceCount){
		for (int i = 0; i < bounceCount; i++) {
			round(spaceLength);
		}
	}
	
	private static void round(int spaceLength){
		String  initialLine = createLine(spaceLength);
		String newLine = initialLine;
		System.out.println(newLine);
		for (int i = 0; i < spaceLength * 2; i++) {
			newLine = shiftStar(newLine, i < spaceLength);
			System.out.println(newLine);
		}
	}
	
	private static String shiftStar(String line, boolean isForward){
		int starIndex = line.indexOf("*");
		String result = line;
		if(isForward){
			result = line.substring(0, starIndex ) +" *" +line.substring(starIndex + 2, line.length());
		}else{
			result = line.substring(0, starIndex - 1 ) +"* " +line.substring(starIndex + 1, line.length());
		}
		return result;
	}
	
	private static String createLine(int spaceCount){
		String line = "|*";
		
		for (int i = 0; i < spaceCount; i++) {
			line = line + " ";
		}
		line = line + "|";
		return line;
	}
}
