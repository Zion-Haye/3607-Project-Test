import java.io.File;

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

    // get file extension?

}
