package week6;

public class MovieTest {

	public static void main(String[] args) {
		Movie[] list;
		list = new Movie[5];
		list[0] = new Movie("백투더 퓨처", "로버트저메키스");
		list[1] = new Movie("티파니에서 아침을", "에드워드블레이크");
		list[2] = new Movie("무빙", "마마무");
		System.out.println("=====================================");
		for(int i = 0; i<Movie.count; i++) {
			System.out.println("제목: " + list[i].name + "	감독: " + list[i].director);
		}
		System.out.println("=====================================");
	}

}
