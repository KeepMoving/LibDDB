package com.lib.project.test;

import com.lib.project.util.GenerateRandomString;

public class TestRandomString {

	public static void main(String[] args) {
		GenerateRandomString generateRandomString = new GenerateRandomString();
		System.out.println(generateRandomString.randomString(1));
		System.out.println(generateRandomString.randomString(2));
		System.out.println(generateRandomString.randomString(3));
		System.out.println(generateRandomString.randomString(4));
		System.out.println(generateRandomString.randomString(5));
		System.out.println(generateRandomString.randomString(5));
		System.out.println(generateRandomString.randomString(5));
	}

}
