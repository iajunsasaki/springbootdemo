package com.example.demo;

import java.util.Random;

public class PaperRockScissor {
	public static String playPaperRockScissor() {
		Random random = new Random();
		int hand = random.nextInt(1, 4);
		String result = "";
		// 1 -> グー
		// 2 -> チョキ
		// 3 -> パー
		if (hand == 1) {
			result = "グー";
		}
		else if (hand == 2) {
			result = "チョキ";
		}
		else if (hand == 3) {
			result = "パー";
		}
		
		return result;
	}
}
