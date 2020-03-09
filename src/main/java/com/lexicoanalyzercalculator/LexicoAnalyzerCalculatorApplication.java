package com.lexicoanalyzercalculator;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LexicoAnalyzerCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LexicoAnalyzerCalculatorApplication.class, args);
		//String path = "E:\\WS-Eclipse\\Lexico-Analyzer-Calculator\\src\\main\\java\\com\\lexicoanalyzercalculator\\Lexer.flex";
		
		LexicoAnalyzer lexicoAnalyzer = new LexicoAnalyzer();
		lexicoAnalyzer.analyze();
	}
	/*
	 * public static void GenerateLexer(String path) { File file = new File(path);
	 * JFlex.Main.generate(file); }
	 */
}
