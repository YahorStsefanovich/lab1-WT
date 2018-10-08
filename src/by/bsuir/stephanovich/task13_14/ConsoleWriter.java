package by.bsuir.stephanovich.task13_14;

import by.bsuir.stephanovich.task12.Book;
import by.bsuir.stephanovich.task15.BookAuthorComparator;

import java.util.ArrayList;

public class ConsoleWriter {
    public static void main(String ... args){
        ProgrammerBook pb1 = new ProgrammerBook(
                "Философия Java",
                "Б. Эккель",
                100,
                14,
                "Русский",
                2
        );

        ProgrammerBook pb2 = new ProgrammerBook(
                "Java philosophy",
                "B. Eckel",
                100,
                14,
                "English",
                2
        );

        System.out.println(pb1.toString());
        System.out.println(pb2.toString());

        System.out.println("Hash: " +pb1.hashCode());
        System.out.println("Hash" + pb2.hashCode());

        System.out.println("Are equals: " + pb1.equals(pb2));
    }
}
