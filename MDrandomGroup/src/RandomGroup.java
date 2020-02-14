import java.util.ArrayList;
import java.util.Random;

public class RandomGroup {

	public static void main(String[] args) {
		ArrayList<String> group = new ArrayList<String>(); // group = all people
		group.add("A");
		group.add("B");
		group.add("C");
		group.add("D");
		group.add("E");
		group.add("F");
		group.add("G");
		group.add("H");
		group.add("I");
		group.add("K");
		group.add("L");
		group.add("M");
		group.add("O");
		group.add("P");
		System.out.println(group);
		
		int groupSize = group.size(); // group size
		int size = 3; //max size for team
		int numOfGroups = groupSize / size; //number of teams
		
		Random rand = new Random();
		
		if (groupSize % size == 0) { //if all teams will have even number of people
			for (int j = 0; j < numOfGroups - 1; j++) {

				for (int i = 0; i < size; i++) {
					int random = rand.nextInt(groupSize - 1);

					System.out.print(group.get(random));
					group.remove(random);
					groupSize--;

				}
				System.out.println("");
			}
			System.out.println(group);
		} else { //if there will be one team with less people
			for (int j = 0; j < numOfGroups; j++) {

				for (int i = 0; i < size; i++) {
					int random = rand.nextInt(groupSize - 1);

					System.out.print(group.get(random));
					group.remove(random);
					groupSize--;

				}
				System.out.println("");
			}
			System.out.println(group);
		}

	}

}
