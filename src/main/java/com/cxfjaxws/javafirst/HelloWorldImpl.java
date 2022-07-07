package com.cxfjaxws.javafirst;

public class HelloWorldImpl implements HelloWorld {
	   @Override
	   public String greetings(String name) {
	      return ("hi " + name);
	   }
	}
