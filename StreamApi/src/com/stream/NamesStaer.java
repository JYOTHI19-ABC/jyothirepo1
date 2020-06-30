package com.stream;

import java.util.ArrayList;
import java.util.function.Consumer;

public class NamesStaer {

	public static void main(String[] args) {
	ArrayList<String> nm = new ArrayList<>();
	nm.add("RAMAYANA");
	nm.add("RAMANANDA");
	nm.add("RAGAVENDRA");
	nm.add("RAMASITA");
    for(String str:nm){
    System.out.println(str); 
   if(str.equals("RAMAYANA")){
	System.out.println(str);}
    }
    Consumer<String> con = (String str) -> System.out.println(str);
	
	nm.stream().filter(str-> str.contains("RAMAYANA")||str.contains("RAMASITS")).forEach(str->System.out.println(str));
	System.out.println(nm.stream());
}
}