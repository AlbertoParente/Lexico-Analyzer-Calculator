package com.lexicoanalyzercalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Token {
    private String lexama;
    private String type;
    private String value;
    private ArrayList<String> operator = new ArrayList<>();
    private ArrayList<String> punctuation = new ArrayList<>();

    public Token(){
    	operator.addAll(Arrays.asList("+","-", "*", "**", "/"));
        punctuation.addAll(Arrays.asList("(",")"));
    }

    public String getLexama() {
        return lexama;
    }

    public void setLexama(String lexama) {
        this.lexama = lexama;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<String> getOperator() {
        return operator;
    }

    public void setOperator(ArrayList<String> operator) {
        this.operator = operator;
    }

    public ArrayList<String> getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(ArrayList<String> punctuation) {
        this.punctuation = punctuation;
    }

}
