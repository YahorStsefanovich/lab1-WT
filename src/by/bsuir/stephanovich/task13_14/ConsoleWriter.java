package by.bsuir.stephanovich.task13_14;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

import java.util.ArrayList;

public class ConsoleWriter {
    private static ArrayList<ProgrammerBook>  fillArray(int amount){
        ArrayList<ProgrammerBook> collection = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            System.out.print("Input title: ");
            String title = ConsoleReader.scanner.next();

            System.out.print("Input author: ");
            String author = ConsoleReader.scanner.next();

            System.out.print("Input price: ");
            int price = ConsoleReader.readIntNumber();

            System.out.print("Input ISBN: ");
            int isbn = ConsoleReader.readIntNumber();

            System.out.print("Input language: ");
            String lang = ConsoleReader.scanner.next();

            System.out.print("Input lvl: ");
            int lvl = ConsoleReader.readIntNumber();

            ProgrammerBook b = new ProgrammerBook(title, author, price, isbn, lang, lvl);
            collection.add(b);
            System.out.print("Added book: " +  b.toString());
        }
        System.out.println("Collection filled");
        System.out.println(collection);
        return collection;
    }

    public static void main(String ... args){
            ConsoleReader.print("Input amount of books: ");
            int amount = ConsoleReader.readIntNumber();
            ArrayList<ProgrammerBook> collection = fillArray(amount);
            System.out.println("Result collection: ");
            System.out.println(collection);
    }
}
