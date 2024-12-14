package objectoriented;
import java.util.Scanner;
public class sol_1oopsMovie {
		String title,director,genre;
		double rating;
		sol_1oopsMovie(String title,String director,String genre,double rating){
			this.title=title;
			this.director=director;
			this.genre=genre;
			this.rating=rating;
		}
		void display() {
			System.out.println("Name of the movie : "+title);
			System.out.println("Director of the movie : "+director);
			System.out.println("Genre of the movie : "+genre);
			System.out.println("Rating of the movie : "+rating);
		} 
		void update(double rating) {
			this.rating=rating;
			System.out.println("updated rating : "+rating);
		}
}
