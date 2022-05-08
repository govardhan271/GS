package com.dailycode.math;

public class RobotPosition {

	public static void main(String[] args) {
		String command = "RRULDDDLR";
		int x=0,y=0;
		for(char c:command.toCharArray()) {
			if(c=='R') {
				x++;
			}else if(c=='L') {
				x--;
			}else if(c=='U') {
				y++;
			}else if(c=='D') {
				y--;
			}
		}
		System.out.println(x+" "+y);

	}

}
