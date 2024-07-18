import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>teamIndia=Arrays.asList("virat","dhoni","rohith");
List<String>teamAustralia=Arrays.asList("Warner","Watson","Smith");
List<String>teamEngland=Arrays.asList("Bell","root","Alex");
List<List<String>>playersInWorldCup2023=new ArrayList<>();


playersInWorldCup2023.add(teamIndia);
playersInWorldCup2023.add(teamAustralia);
playersInWorldCup2023.add(teamEngland);
List<String>listOfAllPlayers=new ArrayList<>();

//Lets print all players before java8
for(List<String> team:playersInWorldCup2023) {
	for(String name:team) {
		listOfAllPlayers.add(name);
	}
}
System.out.println("players playing in world cup 2023:");
System.out.println(listOfAllPlayers);
 System.out.println("-------------------------------------");
//list of values into a big list of values using flatmap();
//java using flatmap
List<String>flatMapList=playersInWorldCup2023.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
System.out.println("Players playing in world cup 2023:");
System.out.println(flatMapList);




	}

}
