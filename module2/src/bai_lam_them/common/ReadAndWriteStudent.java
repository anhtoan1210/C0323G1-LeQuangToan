package bai_lam_them.common;

import bai_lam_them.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    public static void writeToFile(String path, List<Student> studentList){
        File file=new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            for (Student s:studentList) {
                bufferedWriter.write(s.readAndWriteStudent());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static  List<Student> readTFileStudent(String path){
        List<Student> studentList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] arr = line.split(",");
                Student student = new Student(arr[0],arr[1],arr[2],arr[3],arr[4],Double.parseDouble(arr[5]));
                studentList.add(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }return studentList;
    }
}
