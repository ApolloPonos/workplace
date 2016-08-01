package edu.java.course.intro;

public class Kurs3 {

	public static void main(String[] args) {
		int m[][] = new int[25][25];
		int i, j;
		int cow, cal;
		cow = 25;
		cal = 25;
		for (i = 0; i < cow; i++) {

			m[i][i] = 1;
			{
				m[i][cal - 1 - i] = 1;

				{
					m[cow / 2] = 1;
					{

						m[i][cal / 2] = 1;

						for (i = 0; i < cow; i++)
							m[i][j] = 1;
						{
							m[i][4 - i] = 1;
							for (i = 0; i < cow; i++)
								for (j = 0; j < cal; j++)
									System.out.println(m[i][j]);

						}
					}

				}
			}
		}
		]