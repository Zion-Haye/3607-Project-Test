import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // CSV Reader
        CSVFileReader csvFileReader = new CSVFileReader();
        StudentCollection studentData = csvFileReader.readFile();

        // Student Data Test
        //for (Student student : studentData) {
        //    System.out.println(student.toString());
        //}

        // Folder Reader
        FolderReader folderReader = new FolderReader();
        folderReader.readFolder();

        // Make Folder Test
        FolderWriter folderWriter = new FolderWriter();
        folderWriter.initialiseFolder();
    }
}
