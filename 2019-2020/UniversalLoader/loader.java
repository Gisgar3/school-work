/*
Copyright (c) Gavin R. Isgar 2019-2020

Java class compiler/loader
*/

import java.io.*;
import java.lang.*;
import java.util.*;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class loader {

    public static void main(String[] args) {
        System.out.println("Input a valid file-system path to compile Java class.");
        String data = System.console().readLine();
        File filepath = new File(data);
        if (filepath.exists()) {
            System.out.println("\nFile-system path exists; beginning checks for valid Java classes.");
            try {
                // Make thread sleep for 1500 milliseconds; give user time to read output
                Thread.sleep(1500);
                for (File file: filepath.listFiles()) {
                    if (file.getName().endsWith(".java")) {
                        System.out.println("\n" + file.getName());
                    }
                    else {
                        System.out.println("\nNo valid Java class files exist in this directory; cancelling operation.");
                    }
                }
            }
            catch (Exception exception) {
                System.out.println(exception);
            }
        }
        else {
            System.out.println("\nInvalid file-system path. Please try again.");
        }
    }
}