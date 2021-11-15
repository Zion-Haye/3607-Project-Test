import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String participantIdentifierNum;
    private ArrayList<String> fullName;
    private String firstName;
    private String lastName;
    private String idNumber;

    public Student(String participantIdentifierNum, String fullName, String idNumber) {
        this.participantIdentifierNum = participantIdentifierNum;
        setNames(fullName);
        this.idNumber = idNumber;
        
    }

    // Modifiers
    public void setNames(String fullName) {
        this.fullName = new ArrayList<String>(Arrays.asList(fullName.split("\\s+")));// Split full
                                                                                                       // name by white
                                                                                                       // space

        // Issues
        // Names with more than 2 names
    }

    // Accessors
    public String getParticipantIdentifierNum() {
        return participantIdentifierNum;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFullNameString() {
        String newName = "";
        for (int x = 0 ; x < fullName.size(); x++) newName += fullName.get(x) +" ";
        newName = newName.substring(0, newName.length()-1);
        return newName;
    }

    public ArrayList<String> getFullName(){
        return fullName;
    }

    public String toString() {
        String studentDetails;
        studentDetails = getParticipantIdentifierNum() + ",";
        // studentDetails += getFirstName() + ",";
        // studentDetails += getLastName() + ",";
        studentDetails += "Full Name: " + getFullNameString() + ",";
        studentDetails += getIdNumber() + "\n";
        return studentDetails;

    }

}
