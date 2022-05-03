import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Solution {

    public static String src = "C:\\Users\\rokov\\Desktop\\CourseWork-main\\CourseWork-main\\marks.csv";
    public static String[] arrayOfCSVFile = new String[10];

    public static int counterStudentsGrades = 0;
    public static int sumOfGrades = 0;
    public static int counterOffsets = 0;


    public static void main(String[] args) {
        ReaderFile.ReadingFile();
        AllSout.AllSoutFile();
    }
}

