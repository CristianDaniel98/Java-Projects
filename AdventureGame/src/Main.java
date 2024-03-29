import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        command();
    }

    public Main() {


    }

    public static void command() {
        boolean flag = true;
        int input_user = 1;
        while(flag){
            int check_input = 0;
            System.out.println(locations.get(input_user).getDescription());
            System.out.println("Available exits are: " + locations.get(input_user).getExits().keySet());
            String user_direction;
            user_direction = scanner.nextLine();
            for(String key : locations.get(input_user).getExits().keySet()){
                if(key.equals(user_direction)) {
                    input_user = locations.get(input_user).getExits().get(key);
                    check_input = 1;
                }
            }
            if(check_input == 0){
                System.out.println("Invalid input");
            }

            if(input_user == 0){
                System.out.println(locations.get(input_user).getDescription());
                flag = false;
            }

        }
    }
}