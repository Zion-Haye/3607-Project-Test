import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVFileReader {
    // Notes: last 2 Positions not being displayed

    public ArrayList<Student> readFile() {

        ArrayList<String> studentRecord; // ArrayList for individual Record
        // ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>(); //
        // Array List of ArrayList
        // ArrayList < String[] > table = new ArrayList<String[]>();
        ArrayList<Student> studentData = new ArrayList<Student>();

        Student student;

        String filePath = "lib/TestData-txt.txt";
        String line = ""; // Line in csv File
        int counter = 1;

        try {
            FileReader fr = new FileReader(filePath);
            // Create File reader and pass filepath

            BufferedReader br = new BufferedReader(fr);
            // Create Buffer reader and pass file reader

            while ((line = br.readLine()) != null) { // checks next line
                // System.out.println(line);
                studentRecord = new ArrayList<String>(Arrays.asList(line.split(",")));
                // String[] record = line.split(",");
                // System.out.println(record);
                // System.out.println(record.size());

                // System.out.println(record.get(0) + " " + record.get(1) + " " + record.get(2)
                // + "\n");
                // table.add(record);

                // String[] participantIdentifier = studentRecord.get(0).split("//s+");// Get
                // number from participant
                // student = new Student(participantIdentifier[1], studentRecord.get(1),
                // studentRecord.get(2)); // record.
                // String participantID = studentRecord.get(0);
                // String[] participantIDDetails = participantID.split("//s+");

                // ArrayList<String> participantIDDetails = new ArrayList<String>(
                // Arrays.asList(studentRecord.get(0).split(" ")));
                // System.out.println("Test" + participantIDDetails.size());

                // Skip Header Row
                if (counter > 1) {
                    ArrayList<String> participantIDDetails = new ArrayList<String>(
                            Arrays.asList(studentRecord.get(0).split("\\s+")));
                    // System.out.println("Test" + participantIDDetails.size());

                    student = new Student(participantIDDetails.get(1), studentRecord.get(1), studentRecord.get(2));
                    studentData.add(student);
                }

                counter++;
            }

            // return table;
            return studentData;

        } catch (FileNotFoundException e) {
            // Catch Error if the file is not found
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
