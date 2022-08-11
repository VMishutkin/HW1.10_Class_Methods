public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Book darkTowerBook = new Book(stephenKing,"Dark Tower", 1992);
        Author keiHorstmann = new Author("Horstmann", "Key");
        Book coreJava = new Book(keiHorstmann, "Core Java", 2019);
        Book falseDarkTowerBook = new Book(stephenKing,"Dark Tower", 1992);

        System.out.println("Результат сравнения книг - " + darkTowerBook.equals(falseDarkTowerBook));
        darkTowerBook.setYearOfPublishing(2004);
        System.out.println(coreJava);
        System.out.println("Результат сравнения книг после изменения- " + darkTowerBook.equals(falseDarkTowerBook));

        Author falseKing = new Author("Stephen", "King");
        System.out.println("Результат сравнения авторов - " + stephenKing.equals(falseKing));
        System.out.println("Хэш код стивена - " + stephenKing.hashCode() + ", хэш код лжестивена - " + falseKing.hashCode());

    }
}