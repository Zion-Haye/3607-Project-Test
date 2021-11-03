import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String participantIdentifierNum;
    private String fullName;
    private String firstName;
    private String lastName;
    private String idNumber;

    public Student(String participantIdentifierNum, String fullName, String idNumber) {
        this.participantIdentifierNum = participantIdentifierNum;
        this.fullName = fullName;
        this.idNumber = idNumber;
        setNames(fullName);
    }

    // Modifiers
    public void setNames(String fullName) {
        ArrayList<String> fullNameArray = new ArrayList<String>(Arrays.asList(fullName.split("\\s+")));// Split full
                                                                                                       // name by white
                                                                                                       // space
        this.firstName = fullNameArray.get(0);
        this.lastName = fullNameArray.get(fullNameArray.size() - 1);

        // Issues
        // Names with more than 2 names
    }

    // Accessors
    public String getParticipantIdentifierNum() {
        return participantIdentifierNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String toString() {
        String studentDetails;
        studentDetails = getParticipantIdentifierNum() + ",";
        // studentDetails += getFirstName() + ",";
        // studentDetails += getLastName() + ",";
        studentDetails += "Full Name: " + getFullName() + ",";
        studentDetails += "First Name: " + getFirstName() + ",";
        studentDetails += "Last Name: " + getLastName() + ",";
        studentDetails += getIdNumber() + "\n";
        return studentDetails;

    }

}
