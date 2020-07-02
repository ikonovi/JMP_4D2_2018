# m01-t05

##  Collection to stream
1. Create the following classes:
 * Author with fields: 
   * String name
   * short age
   * List<Book> books
 * Book with fields
   * String title
   * List<Author> authors
   * int numberOfPages
2. Create two arrays: Author[] authors and Book[] books. Their elements must use elements from the neighboring array.
3.	Create a stream of books and then:
    1. check if some/all book(s) have more than 200 pages;
    1. find the books with max and min number of pages;
    1. filter books with only single author;
    1. sort the books by number of pages/title;
    1. get list of all titles;
    1. print them using forEach method;
    1. get distinct list of all authors
4.	Use peek method for debugging intermediate streams during execution the previous task.
5.	Use parallel stream with subtask #3.
6.	Analyze with mentor results of previous subtask execution, explain him the difference between stream and parallel stream.
7.	Use the Optional type for determining the title of the biggest book of some author.

  
