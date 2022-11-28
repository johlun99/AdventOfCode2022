package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public static String[] readFileAsArray(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<String> output = new ArrayList<>();
        String st;
        while ((st = br.readLine()) != null) {
            output.add(st.trim());
        }

        return output.toArray(new String[output.size()]);
    }
    public static Integer[] readFileAsIntegerArray(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<Integer> output = new ArrayList<>();
        String row;
        while ((row = br.readLine()) != null) {
            if (row.length() > 0) {
                output.add(Integer.parseInt(row.trim()));
            }
        }

        return output.toArray(new Integer[output.size()]);
    }
}
