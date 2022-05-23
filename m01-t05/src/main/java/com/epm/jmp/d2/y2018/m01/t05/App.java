package com.epm.jmp.d2.y2018.m01.t05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/**
 *
 * Task 5. (20 points) Collection to stream
 *
 */
public class App {

    public static void main(String[] args) {

        // 1. Create the following classes: ...

        Author author1 = new Author("1st Author's Name", (short) 56, new ArrayList<Book>());
        Author author2 = new Author("2nd Author's Name", (short) 44, new ArrayList<Book>());
        Author author3 = new Author("3rd Author's Name", (short) 34, new ArrayList<Book>());

        Book book1 = new Book("1st Book Title", 180, Arrays.asList(author1));
        Book book2 = new Book("2nd Book Title", 330, Arrays.asList(author1, author2));
        Book book3 = new Book("3rd Book Title", 661, Arrays.asList(author1, author2, author3));

        author1.getBooks().addAll(Arrays.asList(book1, book2, book3));
        author2.getBooks().addAll(Arrays.asList(book2, book3));
        author3.getBooks().addAll(Arrays.asList(book3));

        /*
         * 2. Create two arrays: Author[] authors and Book[] books. Their elements must use elements from the
         * neighboring array.
         */
        @SuppressWarnings("unused")
        Author[] authors = {author1, author2, author3};
        Book[] books = {book1, book2, book3};

        // 3-I. - check if some/all book(s) have more than 200 pages;
        // 3-4. - Use peek method for debugging intermediate streams during execution the previous task.
        System.out.println("3-I, 4.");
        System.out.println(Arrays.stream(books).peek(System.out::println)
                .anyMatch(b -> b.getNumberOfPages() > 200));

        // 3-II. - find the books with max and min number of pages;
        System.out.println("3-II.");
        Arrays.stream(books).max((b1, b2) -> b1.getNumberOfPages() - b2.getNumberOfPages())
                .ifPresent(System.out::println);

        // 3-III. - filter books with only single author;
        // 3-5. - Use parallel stream with subtask #3.
        System.out.println("3-III, 5.");
        Arrays.stream(books).parallel().filter(b -> {
            return b.getAuthors().size() == 1;
        }).forEach(System.out::println);

        // 3-IV. - sort the books by number of pages/title;
        System.out.println("3-IV. - by number of pages");
        Arrays.stream(books).sorted((b1, b2) -> b1.getNumberOfPages() - b2.getNumberOfPages())
                .forEach(System.out::println);
        System.out.println("3-IV. - by title");
        Arrays.stream(books).sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()))
                .forEach(System.out::println);

        // 3-V. - get list of all titles;
        // 3-VI. - print them using forEach method;
        System.out.println("3-V, IV");
        Arrays.stream(books).map(b -> b.getTitle()).forEach(System.out::println);

        // 3-VII. - get distinct list of all authors
        System.out.println("3-VII");
        Arrays.stream(books).map(b -> b.getAuthors()).flatMap(list -> list.stream()).distinct()
                .forEach(System.out::println);

        // 6. Analyze with mentor results of previous subtask execution, explain him the difference between stream and
        // parallel stream.
        /*
         * Answer:
         * Parallel stream is executed in multiple threads meanwhile sequential stream is executed in one thread.
         * Parallel streams can provide benefit in performance.
         */

        // 7. Use the Optional type for determining the title of the biggest book of some author.
        System.out.println("7.");
        Optional<Book> biggestBook = author1.getBooks().stream()
                .max((b1, b2) -> b1.getNumberOfPages() - b2.getNumberOfPages());
        if (biggestBook.isPresent())
            System.out.println("The author with name \"" + author1.getName()
                    + "\" has the biggest book with title \"" + biggestBook.get().getTitle()
                    + "\"");
        else
            System.out.println("There is no biggest book.");

    }
}
