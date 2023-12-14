package my.home.package10;

import my.home.package10.files_path.Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathInput = "/home/devs/code/java/java_epam/resource/fileInput.txt";
        String pathOutput = "/home/devs/code/java/java_epam/resource/fileOutput.txt";

        String pathDir = "/home/devs/code/java/java_epam/resource";

        Example example = new Example();
        example.test(pathInput);
    }
}
