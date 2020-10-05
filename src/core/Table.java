package core;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
	
	private int[][] places = new int[4][4];
	private ArrayList<Integer> numberList = new ArrayList<Integer>();
	
	public Table() {
		places[0][0] = 1;
		places[0][1] = 2;
		places[0][2] = 3;
		places[0][3] = 4;
		places[1][0] = 5;
		places[1][1] = 6;
		places[1][2] = 7;
		places[1][3] = 8;
		places[2][0] = 9;
		places[2][1] = 10;
		places[2][2] = 11;
		places[2][3] = 12;
		places[3][0] = 13;
		places[3][1] = 14;
		places[3][2] = 15;
		places[3][3] = 0;
	}
	
	public void generateProblem() {
		for(int i=0; i<16; i++) {
			numberList.add(i);
		}
		
		Collections.shuffle(numberList);
		
		int it = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				places[i][j] = numberList.get(it);
				it++;
			}
		}
		
		System.out.println("Problem: " + numberList.toString());
	}
	
	public void performMovement(int num) {
		System.out.println(num);
		
		int a = 0;
		int b = 0;
		
		int c = 0;
		int d = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(places[i][j] == num) {
					a = i;
					b = j;
				}
				if(places[i][j] == 0) {
					c = i;
					d = j;
				}
				
			}
		}
		
		places[a][b] = 0;
		places[c][d] = num;
		
		printTable();
	}
	
	public void printTable() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf(places[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public String validateMovement(int num) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(places[i][j] == 0) {
					if(((i+1)<4) && (places[i+1][j] == num)) {
						return "up";
					}
					if(((j+1)<4) && (places[i][j+1] == num)) {
						return "left";
					}
					if(((i-1)>=0) && (places[i-1][j] == num)) {
						return "down";
					}
					if(((j-1)>=0) && (places[i][j-1] == num)) {
						return "right";
					}
				}
			}
		}
		System.out.println("This piece cannot be moved.");
		return "false";
	}
	
	public int findEmptyPlace() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(places[i][j] == 0) {
					return translatePosition(i, j);
				}
			}
		}
		
		return 0;
	}
	
	public int translatePosition(int i, int j) {
		if((i == 0) && (j == 0)) {
			return 1;
		}
		if((i == 0) && (j == 1)) {
			return 2;
		}
		if((i == 0) && (j == 2)) {
			return 3;
		}
		if((i == 0) && (j == 3)) {
			return 4;
		}
		if((i == 1) && (j == 0)) {
			return 5;
		}
		if((i == 1) && (j == 1)) {
			return 6;
		}
		if((i == 1) && (j == 2)) {
			return 7;
		}
		if((i == 1) && (j == 3)) {
			return 8;
		}
		if((i == 2) && (j == 0)) {
			return 9;
		}
		if((i == 2) && (j == 1)) {
			return 10;
		}
		if((i == 2) && (j == 2)) {
			return 11;
		}
		if((i == 2) && (j == 3)) {
			return 12;
		}
		if((i == 3) && (j == 0)) {
			return 13;
		}
		if((i == 3) && (j == 1)) {
			return 14;
		}
		if((i == 3) && (j == 2)) {
			return 15;
		}
		if((i == 3) && (j == 3)) {
			return 16;
		}
		
		return 0;
	}

	public int[][] getPlaces() {
		return places;
	}

	public void setPlaces(int[][] places) {
		this.places = places;
	}

	public ArrayList<Integer> getNumberList() {
		return numberList;
	}

	public void setNumberList(ArrayList<Integer> numberList) {
		this.numberList = numberList;
	}

}
