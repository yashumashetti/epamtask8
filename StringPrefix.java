package com.epam.lambdas_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringPrefix {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aloha","add","david","ask","aaa","Abc");
		filterPrefix(list).forEach(System.out::println);
	}

	private static List<String> filterPrefix(List<String> list) {
		return list.stream().filter(s -> s.length()==3 && s.charAt(0)=='a').collect(Collectors.toList());
	}

}