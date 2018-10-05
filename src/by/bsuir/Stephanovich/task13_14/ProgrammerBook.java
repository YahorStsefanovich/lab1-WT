package by.bsuir.Stephanovich.task13_14;

import by.bsuir.Stephanovich.task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int lvl){
        super(title, author, price, isbn);
        this.language = language;
        this.lvl = lvl;
    }

    public ProgrammerBook(){
        super();
        this.language = null;
        this.lvl = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) obj;
        return super.equals(obj) &&
                (Objects.equals(book.language, language)) &&
                (Objects.equals(book.lvl, lvl));
    }

    @Override
    public String toString() {
        return super.toString() + ", language: " + language + ", level: " + lvl;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    private int lvl;

    private String language;

    public String getLanguge() {
        return language;
    }

    public void setLanguge(String language) {
        this.language = language;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
