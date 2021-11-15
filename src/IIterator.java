public interface IIterator {
    public Object getItemByID(String participantID);
    public Object getItemByName(String fName, String lName);
    public boolean hasNext();
    public Object next();
}
