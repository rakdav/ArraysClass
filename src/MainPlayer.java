import java.util.ArrayList;
import java.util.List;

public class MainPlayer
{
    public static void main(String[] args) {
        List<Player> players=new ArrayList<>();
        players.add(new Player("Vasia",19));
        players.add(new Player("Fedor",20));
        players.add(new Player("Boris",18));
        players.add(new Player("Alex",21));
        for (Player p:players) {
            System.out.println(p.getName()+" "+p.getCount());
        }
        players.get(0).setCount(34);
        for (Player p:players) {
            System.out.println(p.getName()+" "+p.getCount());
        }
    }
}
