package org.example;

import java.io.FileReader;
import java.io.IOException;

public class SuppressedExceptionExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("nonexistentfile.txt")) {
            // Trying to read from a nonexistent file (IOException will occur)
            System.out.println("Reading file...");
        } catch (IOException e) {
            // Handle the IOException, but another exception might be suppressed
            System.out.println("Caught IOException: " + e);
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + t);
            }
        }
    }
}
