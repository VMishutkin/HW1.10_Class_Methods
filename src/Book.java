public class Book {
    private Author author;
    private String name;
    private int yearOfPublishing;

    public Book(Author author, String name, int yearOfPublishing) {
        this.author = author;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public int hashCode() {
        return author.hashCode() + name.hashCode() + yearOfPublishing;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass()!= obj.getClass()){
            return false;
        }
        Book secondBook = (Book) obj;

        return author.equals(secondBook.getAuthor()) && name.equals(secondBook.getName()) && yearOfPublishing == secondBook.getYearOfPublishing();
    }

    @Override
    public String toString() {
        return author.toString() + " - " + name + ", " + yearOfPublishing;
    }

}
