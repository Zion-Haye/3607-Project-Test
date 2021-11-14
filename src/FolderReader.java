import java.io.File;
import java.io.FileNotFoundException;

public class FolderReader {

    public FileCollection readFolder() {
        // Thoughts
        FileCollection fileList = new FileCollection();
        // try catch error folder File Not Found Exception?

        // Create object and parse dolfer path
        String folderPath = "lib/fileToRename";

        // try{

        File folder = new File(folderPath);

        if (folder.exists()) {

            File[] files = folder.listFiles();

            for (File file : files) {

                if (file.isFile()) {
                    // check if file

                    // System.out.println(file.getName() + "\n");

                    // FileProcessor fileProcessor = new FileProcessor();
                    // fileProcessor.getFileName(file);
                    FileItem fileItem = new FileItem(file);
                    if (file.getName().contains(".pdf")){
                        fileList.addToFiles(fileItem);
                    }
                    System.out.println(fileItem.getName());
                    fileItem.printImportantDetails();
                    // print file name
                }

                if (file.isDirectory()) {
                    // check if directory
                }
            }

        } else {
            System.out.println("Folder Does Not Exist.");
        }
        IIterator fileIterator = fileList.createIterator();
        while (fileIterator.hasNext()){
                FileItem test = (FileItem) fileIterator.next();
                if (test != null)
                    System.out.println(test);
        }
        return fileList;
        // }catch(FileNotFoundException e){
        // e.printStackTrace();
        // }
    }

}
