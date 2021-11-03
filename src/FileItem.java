import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileItem implements Directory {
    // leaf

    File file;
    String extractedData;

    public FileItem(File file) {
        this.file = file;
    }

    public String getName() {
        return file.getName();
    }

    public void setName() {
        Boolean isRenamed;
        String fileName = "lib/renamedFiles/test.docx";

        File oldFile = new File("lib/fileToRename/test-word.docx");
        File newFile = new File(fileName); // takes in file path

        isRenamed = oldFile.renameTo(newFile); // take in file , returns bool

        if (isRenamed) {
            System.out.println("Rename Successful!");
        } else {
            System.out.println("Rename Failed!");
        }

    }

    public ArrayList<String> getImportantDetails() {
        ArrayList<String> fullFileName = new ArrayList<String>(Arrays.asList(getName().split("_")));

        ArrayList<String> importantDetails = new ArrayList<String>();

        for (int x = 0; x < fullFileName.size(); x++) {

            if ((x > 0) && (x < fullFileName.size() - 2)) {
                importantDetails.add(fullFileName.get(x));
            }
        }

        return importantDetails;
    }

    public void printImportantDetails() {
        ArrayList<String> importantDetails = getImportantDetails();

        /*
         * for (String detail : importantDetails) { System.out.println(detail + " "); }
         */
        System.out.println("Important Details: \n");
        System.out.println(getImportantDetails());
    }

    // get file extension?

}
