public interface IIterator {
    public Object getItem(String participantID, String fName, String lName);
    public boolean hasNext();
    public Object next();
}
