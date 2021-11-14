public interface SIterator {
    public Student getStudent(String participantID, String fName, String lName);
    public boolean hasNext();
    public Student next();
}
