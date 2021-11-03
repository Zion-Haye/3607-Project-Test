import java.io.File;
import java.util.ArrayList;

public class FolderItem implements Directory {
    // Composite
    // File collection
    // Get collection method

    // FileItem[] files;
    // ArrayList<FileItem> files;

    ArrayList<Directory> files;
    String folderName;

    public FolderItem() {
        // files = new FileItem[100];

        folderName = "renamedFiles";
        // files = new ArrayList<FileItem>();
        files = new ArrayList<Directory>();
    }

    // Mutators
    public void addFile(Directory file) {
        files.add(file);
    }

    // Accessors
    public String getName() {
        return folderName;
    }

    public ArrayList<Directory> getFiles() {
        return files;
    }

    // toString??

}
