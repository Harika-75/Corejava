package collections;
import java.util.*;
public class LoginAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Map<String, Integer> loginAttempts = new HashMap<>();
        Set<String> blockedUsers = new HashSet<>();


        login("harika", loginAttempts, blockedUsers);
        login("harika", loginAttempts, blockedUsers);
        login("harika", loginAttempts, blockedUsers);
        login("harika", loginAttempts, blockedUsers); 

        login("ravi", loginAttempts, blockedUsers);
        login("ravi", loginAttempts, blockedUsers);
        login("ravi", loginAttempts, blockedUsers);

        login("anjali", loginAttempts, blockedUsers);

        System.out.println("\nBlocked Users:");
        for (String user : blockedUsers) {
            System.out.println(user);
        }
    }

    public static void login(String username,
                              Map<String, Integer> attemptsMap,
                              Set<String> blockedUsers) {

        if (blockedUsers.contains(username)) {
            System.out.println(username + " is blocked. Login denied.");
            return;
        }

       
        int attempts = attemptsMap.getOrDefault(username, 0) + 1;
        attemptsMap.put(username, attempts);

        System.out.println(username + " login attempt: " + attempts);
        System.out.println();

        if (attempts >= 3) {
            blockedUsers.add(username);
            System.out.println(username + " has been BLOCKED!");
            System.out.println();
        }

	}
}
