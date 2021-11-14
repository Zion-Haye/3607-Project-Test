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
        public Object getItem(String participantID, String fName, String lName) {
            String fileName;
            for (FileItem test : files){
                fileName = test.getName();
                if (fileName.contains(participantID)){
                    return test;
                }else if (fileName.contains(fName) && fileName.contains(lName)){
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
