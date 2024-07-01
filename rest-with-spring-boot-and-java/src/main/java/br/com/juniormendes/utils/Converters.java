package br.com.juniormendes.utils;

public class Converters {

	
	public static double convertToDouble(String strNumber) {
		if(strNumber == null) return 0D;
		
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
		
	}

	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		//Regex para validar se valor é numérico
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		
	}
}
