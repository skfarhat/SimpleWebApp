package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("darwin")) {
            return "Darwin is a cutie pie";
        }
        else if (query.toLowerCase().contains("ivan")) {
            return "APE teacher";
        }
        else if (query.toLowerCase().contains("sami")) {
            return "APE student";
        }
        else if (query.toLowerCase().contains("japke") || query.toLowerCase().contains("clark")) {
            return "Nothing to see here!";
        }
        else if (query.toLowerCase().contains("cameron")) {
            return "He resigned after losing votes in the referendum.......";
        }
        return "";
    }
}
