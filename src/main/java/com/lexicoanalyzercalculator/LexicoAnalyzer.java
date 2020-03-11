package com.lexicoanalyzercalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LexicoAnalyzer {
    private String input = "42 + 13";

    private char charArray[] = null;
    private String replaceString = null;

    private Map<Integer, String> mapaNomes = new HashMap<Integer, String>();

    private String previosStringToAddMap = null;
    private String nextStringToAddMap = null;
            Token token = new Token();

    public void analyze() {
        replaceString = input.replaceAll("\\s+", "");
        charArray = replaceString.toCharArray();
        int i;
        int j;
        for(i = 0; i < charArray.length; i++){
            previosStringToAddMap = Character.toString(charArray[i]);
            nextStringToAddMap = Character.toString(charArray[i+1]);
            if(previosStringToAddMap.matches("[\\d]*") && nextStringToAddMap.matches("\\d")){
            	for(j = 0; j < charArray.length; j++){
            	  String real = previosStringToAddMap.concat(nextStringToAddMap);
  				  mapaNomes.put(i, real); nextStringToAddMap = Character.toString(charArray[i+1]);
            	}
            	
            	
				/*
				 * String real = previosStringToAddMap.concat(nextStringToAddMap);
				 * mapaNomes.put(i, real); nextStringToAddMap =
				 * Character.toString(charArray[i+1]);
				 */
				 
            }else {
                mapaNomes.put(i, previosStringToAddMap);
            }
            System.out.println(mapaNomes.get(i));
        }
    }

    public void checkValue(String value){
        switch (value){
            case "+":
                token.setValue("soma");
                break;
            case "-":
                token.setValue("subtracao");
                break;
            case "/":
                token.setValue("divisao");
                break;
            case "*":
                token.setValue("multiplicacao");
                break;
            case "**":
                token.setValue("exponenciacao");
                break;
        }
    }
}
