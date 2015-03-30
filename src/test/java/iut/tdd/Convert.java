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
		listeHashMap.put("20", "vingt");
		listeHashMap.put("30", "trente");
		listeHashMap.put("40", "quarante");
		listeHashMap.put("50", "cinquante");
		listeHashMap.put("60", "soixante");
	}

	public static String num2text(String input) {
		if(listeHashMap.get(input)!=null){
			return(listeHashMap.get(input));
		}else if(input.substring(1,2).equals("1")){
			String resultat = listeHashMap.get(input.substring(0,1)+"0") + " et un";
			return resultat;
		}else{
			String resultat=listeHashMap.get(input.substring(0,1)+"0")+ " " + listeHashMap.get(input.substring(1,2));
			return resultat;
		}
	}

	public static String text2num(String input) {
		return null;
	}
}