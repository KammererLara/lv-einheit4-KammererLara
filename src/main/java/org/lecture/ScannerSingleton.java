package org.lecture;

import java.util.Scanner;

public class ScannerSingleton {
    private static Scanner scanner;

    private ScannerSingleton() {}

    public static Scanner getInstance(){
        if(scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }
}
