package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main extends Exception{
    public Main(String message) {
        super(message);
    }
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(5,0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + ": " + CheckFileExtension(student.getValue()));
        }
    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        if (y == 0) {
            try {
                throw new DivideByZeroException("Cannot divide by 0");
            }
            catch (DivideByZeroException e) {
                e.printStackTrace();
            }
        }
        return x / (double)y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.equals("")) {
            try {
                throw new EmptyStringException("The filename is empty");
            }
            catch (EmptyStringException e) {
                e.printStackTrace();
                return -1;
            }
        }
        if (fileName.endsWith(".java")) {
            return 1;
        }
        else {
            return 0;
        }

    }
}