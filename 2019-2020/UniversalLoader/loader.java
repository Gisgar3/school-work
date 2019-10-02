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

    public static void main(String[] args) {
        System.out.println("Input a valid file-system path to compile Java class.");
        String data = System.console().readLine();
        if (Files.exists(Paths.get(data))) {
            System.out.println("Path exists");
        }
        else {
            System.out.println("Invalid path. Please try again.");
        }
    }
}