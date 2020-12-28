package com.ushwamala.javacourse.SpringAnnotations.Components;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

    private String fileName =
            "C:\\Users\\ushma\\Desktop\\SpringBoot\\SpringForBeginners\\spring-demo-app\\src\\fortunes.txt";
    private final List<String> fortunes;

    // create a random number generator
    private final Random random = new Random();

    public FileFortuneService() {

        File file = new File(fileName);

        System.out.println("Reading fortunes from file: " + file);
        System.out.println("File exists: " + file.exists());

        // initialize array list
        fortunes = new ArrayList<>();

        // read fortunes from file
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fortunes.add(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = random.nextInt(fortunes.size());

        String fortune = fortunes.get(index);

        return fortune;
    }

}

