package week6;

public class Movie {
	String name, director;
	static int count = 0;

	public Movie(String name, String director) {
		super();
		this.name = name;
		this.director = director;
		count++;
	}
}
