package com.cxfjaxws.javafirst;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
   String greetings(String text);
}