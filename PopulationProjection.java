package whatever;

public class PopulationProjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birth = 7*60*60*24*365;
		int death = 3*60*60*24*365;
		int immigrant = 45*60*60*24*365;
		int current_pop = 312032486;
		for (int x = 0 ; x <= 4 ; x++) 
			System.out.println((current_pop + birth - death + immigrant)*5);
	}

}
