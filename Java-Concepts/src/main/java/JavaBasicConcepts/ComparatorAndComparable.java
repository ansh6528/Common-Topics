package JavaBasicConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PlayerRankingComparator implements Comparator<Player> {

	@Override
	public int compare(Player playerFirst, Player playerSecond) {
		// TODO Auto-generated method stub
		return Integer.compare(playerFirst.getRanking(), playerSecond.getRanking());
	}
	
}

public class ComparatorAndComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> playerList = new ArrayList<>();
		
		Player player1 = new Player(10, "Kevin", 28);
		Player player2 = new Player(12, "Laurens", 26);
		Player player3 = new Player(15, "Andre", 34);
		
		playerList.add(player2);
		playerList.add(player1);
		playerList.add(player3);
		
		PlayerRankingComparator comparator = new PlayerRankingComparator();
		System.out.println("Players list before sorting --> " + playerList);
		Collections.sort(playerList, comparator);
		System.out.println("Players list after sorting --> " + playerList);
	}

}

class Player implements Comparable<Player>{
	
	private int ranking;
	private String name;
	private int age;
	
	Player(int ranking, String name, int age) {
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ranking=" + ranking + ", name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(Player otherPlayer) {
		// TODO Auto-generated method stub
		return Integer.compare(getRanking(), otherPlayer.getRanking());
	}
	
}


