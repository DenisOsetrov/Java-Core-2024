package homeworks.homework_1;


import java.util.List;

public class Book {
     private String title;
     private int pages;
     private List<String> authors;
     private Genre genre; // Використовуємо enum для жанру


     // Конструктор Alt+Insert
     public Book(String title, int pages, List<String> authors, Genre genre) {
          this.title = title;
          this.pages = pages;
          this.authors = authors;
          this.genre = genre;
     }

     // Getter and Setter
     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public int getPages() {
          return pages;
     }

     public void setPages(int pages) {
          this.pages = pages;
     }

     public List<String> getAuthors() {
          return authors;
     }

     public void setAuthors(List<String> authors) {
          this.authors = authors;
     }

     public Genre getGenre() {
          return genre;
     }

     public void setGenre(Genre genre) {
          this.genre = genre;
     }

     // method toString
     @Override
     public String toString() {
          return "Book{" +
                  "title='" + title + '\'' +
                  ", pages=" + pages +
                  ", authors=" + authors +
                  ", genre=" + genre +
                  '}';
     }
}




