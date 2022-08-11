public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() !=this.getClass()){
            return false;
        }
        Author secondAuthor = (Author) obj;
        return  (this.getFirstName().equals(secondAuthor.getFirstName()) && this.getLastName().equals(secondAuthor.getLastName()));
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}
