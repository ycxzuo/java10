package com.yczuoxin.demo;

import java.net.*;
import java.util.HashSet;
import java.util.Set;

/**
 *  A: 4
 *  B: 5
 *  C: 6
 *  D: None of the above
 */
public class UrlSet {
    private static final String[] URL_NAMES = {
            "http://javapuzzlers.com",
            "http://apache2-snort.skybar.dreamhost.com",
            "http://www.google.com",
            "http://javapuzzlers.com",
            "http://findbugs.sourceforge.net",
            "http://www.cs.umd.edu"
    };

    public static void main(String[] args)
            throws MalformedURLException {
        Set<URL> favorites = new HashSet<URL>();
        for (String urlName : URL_NAMES)
            favorites.add(new URL(urlName));
        System.out.println(favorites.size());
    }
}