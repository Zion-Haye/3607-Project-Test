import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileItem implements Directory {
    // leaf

    private File file;
    private String id;
    private ArrayList<String> namesList;
    private String assignmentFileName;
    //String extractedData;

    public FileItem(File file) {
        this.file = file;
        namesList = new ArrayList<String>();
        getImportantDetails();
    }

    public String getName() {
        return file.getName();
    }

    public String getId() {
        return id;
    }
    
    public ArrayList<String> getstudentNames() {
        return namesList;
    }

    public String getAssignmentFileName() {
        return assignmentFileName;
    }

    public void setName() {
        Boolean isRenamed;
        String fileName = "lib/renamedFiles/test.docx";

        File oldFile = new File("lib/fileToRename/test-word.docx");
        File newFile = new File(fileName); // takes in file path

        //File f = new File("lib/renamedFiles");
        //f.mkdirs();

        isRenamed = oldFile.renameTo(newFile); // take in file , returns bool

        if (isRenamed) {
            System.out.println("Rename Successful!");
        } else {
            System.out.println("Rename Failed!");
        }

    }

    private void getImportantDetails() {
        ArrayList<String> fullFileName = new ArrayList<String>(Arrays.asList(getName().split("_")));

        //ArrayList<String> importantDetails = new ArrayList<String>();
        
        int x;
        for (x = 1; x < fullFileName.size()-2; x++) 
            namesList.add(fullFileName.get(x));
        
        id = fullFileName.get(x++);//Participaant id
        assignmentFileName = fullFileName.get(x);

    }

    public void printImportantDetails() {
       String names = "";
       for (String name : namesList) names += name + " ";
        System.out.println( "Important Details: " +
                            "\nID: " + id +
                            "\nName: " + names +
                            "\nOriginal File Name: " + assignmentFileName);
        
        //System.out.println(getImportantDetails() + "\n\n");
    }

    // get file extension?

}
