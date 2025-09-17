import java.util.Scanner;

class Player 
{
    String name;
    int m_played;
    int runs;
    int wickets;

    // Constructor (set default values)
    Player() 
    {
        name = "Prashant";
        m_played = 101;
        runs = 596;
        wickets = 0;
    }
    

    // get method to accept input
    void get(Scanner sc) 
    {
        System.out.print("Enter Player Name    : ");
        name = sc.nextLine();

        System.out.print("Enter Matches Played : ");
        m_played = sc.nextInt();

        System.out.print("Enter Runs Scored    : ");
        runs = sc.nextInt();

        System.out.print("Enter Wickets Taken  : ");
        wickets = sc.nextInt();
        sc.nextLine();                                          // consume newline
    }


    // display method to show details
    void display() 
    {
        System.out.println("Player_Name   : " + name);
        System.out.println("Matches Played: " + m_played);
        System.out.println("Runs Scored   : " + runs);
        System.out.println("Wickets Taken : " + wickets);
        System.out.println("---------------------------------");
    }
}//class Player ends here


class Test
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // take n from user
        System.out.print("Enter number of Players: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Player[]players = new Player[n];

        // Step 1: get values for all players
        System.out.println("Enter details of " + n + " Players:");
        for (int i=0; i< players.length; i++) 
        {
            System.out.println("\n--- Player " +(i+1) +" ---");
            players[i] = new Player();              // constructor (set)
            players[i].get(sc);                     // get
        }


        // Step 2: display all players
        System.out.println("\n=== Player Details ===");
        for (Player p : players) 
        {
            p.display();                            // display
        }


        // Step 3: use if conditions to find max runs and wickets
        Player maxRunsPlayer = players[0];
        Player maxWicketsPlayer = players[0];

        for (int i = 1; i < players.length; i++) 
        {
            if (players[i].runs > maxRunsPlayer.runs)            // if
            {
                maxRunsPlayer = players[i];
            }
            if (players[i].wickets > maxWicketsPlayer.wickets)  // if
            {
                maxWicketsPlayer = players[i];
            }
        }

        // Step 4: display results
        System.out.println("\n=== Player with Maximum Runs ===");
        maxRunsPlayer.display();

        System.out.println("\n=== Player with Maximum Wickets ===");
        maxWicketsPlayer.display();
    }
}
