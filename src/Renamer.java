import java.io.File;

public class Renamer {
    StudentCollection students;
    FileCollection files;

    public Renamer(StudentCollection students, FileCollection files){
        this.students = students;
        this.files = files;
    }

    public void renameFiles(){
        FolderWriter.initialiseFolder();

        IIterator fileIterator = files.createIterator();
        IIterator studentIterator = students.createIterator();

        while (studentIterator.hasNext()){
            Student newStudent = (Student) studentIterator.next();
            FileItem newFileItem = (FileItem) fileIterator.getItem(newStudent);
                                (newStudent.getIdNumber(), newStudent.getFirstName(), newStudent.getLastName());
            
            
            
        }
    }


}
