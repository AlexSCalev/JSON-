package dto;

import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    public static void writeFile() {
        Gson gson = new Gson();
        CreateFile date1 = createFileDate();

        try (FileWriter writer = new FileWriter("users.json")) {
            gson.toJson(date1, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CreateFile createFileDate() {
        Category date2 = new Category(0, "string");
        String[] photoUrls = {"string"};
        Category[] date3 = {date2};
        CreateFile date1 = new CreateFile(0, date2, "doggie", photoUrls, date3, "available");
        return date1;
    }

    public static void readFile() {
        Gson gson = new Gson();
        try{
            Reader reader = new FileReader("users.json");
            CreateFile staff = gson.fromJson(reader,CreateFile.class);
            System.out.println(staff);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
