package se.houseoffinance.parsers.JSON;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String pathOfJsonFile = "/path/to/the/jsonFile"; //todo CHANGE ME

        List<Object> messagesList = new ArrayList<>(2000000); // Created with initial capacity

        BufferedReader bufferedReader = null;

        ObjectMapper mapper = JsonFactory.create();

        try {
            bufferedReader = Files.newBufferedReader(Paths.get(pathOfJsonFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (bufferedReader != null) {
            messagesList = bufferedReader.lines().map(mapper::fromJson).collect(Collectors.toList());
        }

    }

}
