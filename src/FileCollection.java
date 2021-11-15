import java.util.ArrayList;

public class FileCollection implements IContainer {
    private ArrayList<FileItem> files;

    public FileCollection(){
        files = new ArrayList<FileItem>();
    }

    public void addToFiles(FileItem newFile){
        files.add(newFile);
    }

    @Override
    public IIterator createIterator() {
        FileIterator results = new FileIterator();
        return results;
    }

    private class FileIterator implements IIterator{
        private int position=0;

        public boolean hasNext(){
            if (position < files.size()){
                return true;
            }else{
                position = 0;
                return false;
            }
        }

        @Override
        public Object getItemByID(String participantID) {
            
            for (FileItem test : files){
                String testName = test.getName();
                if (testName.equals(participantID))
                    return test;
            }
            return null;
        }


        public Object getItemByName(String fName, String lName) {
            
            for (FileItem test : files){
                if (test.getstudentNames().contains(fName) && test.getstudentNames().contains(lName)){
                    return test;
                }
            }
            return null;
        }

        @Override
        public Object next() {
            if (this.hasNext()){
                return files.get(position++);
            }else{
                return null;
            }
        }


        

    }

    

}
