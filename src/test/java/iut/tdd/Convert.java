package iut.tdd;

import java.util.HashMap;

public class Convert {
	
	static HashMap<String, String> listeHashMap = new HashMap<String, String>();
	static {
		listeHashMap.put("0", "zéro");
		listeHashMap.put("1", "un");
		listeHashMap.put("2", "deux");
		listeHashMap.put("3", "trois");
		listeHashMap.put("4", "quatre");
		listeHashMap.put("5", "cinq");
		listeHashMap.put("6", "six");
		listeHashMap.put("7", "sept");
		listeHashMap.put("8", "huit");
		listeHashMap.put("9", "neuf");
		listeHashMap.put("10", "dix");
		listeHashMap.put("11", "onze");
		listeHashMap.put("12", "douze");
		listeHashMap.put("13", "treize");
		listeHashMap.put("14", "quatorze");
		listeHashMap.put("15", "quinze");
		listeHashMap.put("16", "seize");
	}
	
	public static String num2text(String input) {
		return (listeHashMap.get(input));
	}
	public static String text2num(String input) {
		return null;
	}
}