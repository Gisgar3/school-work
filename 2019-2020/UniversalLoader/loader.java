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

public class loader {

    public static JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    public static ArrayList<String> fileTokens = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Input a valid file-system path to compile a Java source file.");
        String data = System.console().readLine();
        File filepath = new File(data);
        if (filepath.exists()) {
            System.out.println("\nFile-system path exists; beginning checks for valid Java source files.");
            try {
                // Make thread sleep for 1500 milliseconds; give user time to read output
                Thread.sleep(1500);
                for (File file : filepath.listFiles()) {
                    if (file.getName().endsWith(".java")) {
                        fileTokens.add(file.getName());
                        System.out.println("\n" + file.getName());
                        compiler.run(null, null, null, filepath + "\\" + file.getName());
                        System.out.format("%s has been compiled successfully.\n", file.getName());
                    }
                    else if (file.getName().endsWith(".java") == false) {
                        continue;
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