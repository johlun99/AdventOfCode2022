package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    public static String[] readFileAsArray(String path) throws IOException {
        String test = new File(path).getAbsolutePath();
        System.out.println(test);

        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<String> output = new ArrayList<String>();
        String st;
        while ((st = br.readLine()) != null) {
            output.add(st.trim());
        }

        return output.toArray(new String[output.size()]);
    }
}
