package com.dailycode;

public class IpMaxCount {

	public static void main(String[] args) {
		String lines[] = {"123.123.123.124 - - [26/Apr/2000:00:23:48 -0400]",
				"123.123.123.124 - - [26/Apr/2000:00:23:48 -0400]",
		"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400]",
		"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400]",
		"123.123.123.123 - - [26/Apr/2000:00:23:48 -0400]"};

		System.out.println(findMaxIP(lines));
	}

	private static String findMaxIP(String[] lines) {
		int max = 0;
		int tmpPos=0;
		int ipIndex = 0;
		for(int i=0;i<lines.length;i++) {
			String ip = lines[i].split("-")[0].trim();
			lines[i]=ip;
		}
		for(int i=0;i<lines.length;i++) {
			int count=1;
			tmpPos = i;
			while(i<lines.length-1&&lines[i].equals(lines[i+1])) {
				count++;
				i++;
				if(count>max) {
					max=count;
					ipIndex = tmpPos;
				}
			}
		}


		return lines[ipIndex];

	}

}
