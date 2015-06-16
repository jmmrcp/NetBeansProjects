

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone {

    public static void main(String[] args) throws java.lang.Exception {
        foo();
    }

    public static void foo() {
        File pwd = new File(System.getProperty("user.dir"));
        if (pwd.isDirectory()) {
            File[] bar = pwd.listFiles();
            for (int i = 0; i < bar.length; i++) {
                System.out.println(bar[i].getName());
            }
        } else {
            System.out.println("Error. The argument is not a directory");
        }
    }
}