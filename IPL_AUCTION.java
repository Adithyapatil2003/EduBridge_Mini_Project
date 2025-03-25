import java.util.*;
class IPL_AUCTION
{
    static  double player1purse = 100, player2purse = 100;
    static String squadSheet1 = "";
    static String squadSheet2 = "";
    static String team1,team2;
    static  String[] players = {"MS Dhoni", "Virat Kohli", "AB De Villiers", "Chris Gayle", "KL Rahul", "Bhuvneshwar Kumar", "Mitchell Starc", "Chris Lynn","Gautam Gambhir", "Dwayne Bravo","Dwayne Smith", "Ravindra Jadeja", "Ravi Ashwin", "Suresh Raina", "Ben Stokes", "Mustafizur Rahman", "Shakib-al-Hasan", "David Warner","Brendon McCullum", "Martin Guptil","Jason Holder", "Rohit Sharma", "Shikar Dhawan", "Hardik Pandya", "Eoin Morgan", "Imran Tahir", "Adam Zampa", "Umesh Yadav","Ishant Sharma", "Parthiv Patel"};

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        System.out.println("==============Welcome to IPL Auction==================");
        System.out.println("Enter I to go to Instruction page");
        System.out.println("Enter P to start playing the game");

        String link = sc.next();
        if(link.equalsIgnoreCase("I"))
            instruction();
        else
        if(link.equalsIgnoreCase("P"))
            play();
    }
    static void play()
    {
        System.out.println("IPL Teams: \n CSK \n RR \n DD \n RCB \n KKR \n KXIP \n MI \n SRH");
        System.out.println("Chose your team Player 1");
        String s = sc.next();
        team1 = s;
        System.out.println("Thank you \n Chose your team Player 2");
        String s1 = sc.next();
        team2 = s1;
        System.out.println("Get ready to answer this question " + team1 );
        Random r = new Random();
        int num = 1+ r.nextInt(5);
        String ans;
        switch(num)
        {
            case 1: System.out.println("Q: When was IPL started??");
                ans = sc.next();
                if(ans.equalsIgnoreCase("2008"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player1purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 2: System.out.println("Q: Who won IPL 2010");
                ans = sc.next();
                if(ans.equalsIgnoreCase("CSK"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player1purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 3: System.out.println("Q: Who were runner ups in IPL 2016");
                ans = sc.next();
                if(ans.equalsIgnoreCase("RCB"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player1purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 4: System.out.println("Q: Who was the highest bidded player in 2017");
                ans = sc.nextLine();
                if(ans.equalsIgnoreCase("Ben Stokes"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player1purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 5: System.out.println("Q: Who was highest bidded player in 2016");
                ans = sc.nextLine();
                if(ans.equalsIgnoreCase("MS Dhoni"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player1purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
        }
        System.out.println("Get ready to answer this question " + team2 );

        int num1 = 1+ r.nextInt(5);
        String ans1;
        switch(num1)
        {
            case 1: System.out.println("Q: When was IPL started??");
                ans1 = sc.next();
                if(ans1.equalsIgnoreCase("2008"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player2purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 2: System.out.println("Q: Who won IPL 2010");
                ans1 = sc.next();
                if(ans1.equalsIgnoreCase("CSK"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player2purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 3: System.out.println("Q: Who were runner ups in IPL 2016");
                ans1 = sc.next();
                if(ans1.equalsIgnoreCase("RCB"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player2purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 4: System.out.println("Q: Who was the highest bidded player in 2017");
                ans1 = sc.nextLine();
                if(ans1.equalsIgnoreCase("Ben Stokes"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player2purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
            case 5: System.out.println("Q: Who was highest bidded player in 2016");
                ans1 = sc.nextLine();
                if(ans1.equalsIgnoreCase("MS Dhoni"))
                {
                    System.out.println("Correct, you add 25cr in your account");
                    player2purse += 25;
                }
                else
                    System.out.println("Oops, wrong answer");
                break;
        }
        for(int i = 0; i < 30; i++)
        {
            System.out.println(team1 + " purse: " + player1purse);
            System.out.println(team2 + " purse: " + player2purse);
            System.out.println("The auctioneer has raised " + players[i] + " as the player");

            System.out.println("Base price is proclaimed as 2cr");
            float base = 1.8f;
            int j = 1;
            while(j<2)
            {
                if(j==1)
                {
                    System.out.println(team1 + " turn: Do you want the player");
                    System.out.println("Enter R to raise and Q to quit the bid");
                    String bid = sc.next();
                    if(bid.equalsIgnoreCase("R"))
                    {
                        if(base < 5)
                            base+=0.2f;
                        else
                            base+=0.5f;
                        if(! (player1purse - base < 0))
                        {
                            System.out.println(base);
                            j++;
                        }
                        else
                        {
                            System.out.println("You have ran out of budget");
                            j++;

                        }
                    }
                    if(bid.equalsIgnoreCase("Q"))
                        j+=2;

                    if(j==2 || j ==3)
                    {
                        System.out.println(team2 + " turn: Do you want the player");
                        System.out.println("Enter R to raise and Q to quit the bid");
                        String bid1 = sc.next();
                        if(bid1.equalsIgnoreCase("R"))
                        {
                            if(base < 5)
                                base+=0.2f;
                            else
                                base+=0.5f;
                            if(! (player2purse - base < 0))
                            {
                                System.out.println(base);
                                j--;
                            }
                            else
                            {
                                System.out.println("You have ran out of budget");
                                j--;

                            }
                        }
                        else
                        {
                            j++;
                            break;
                        }

                    }

                }


            }
            if(j==3)
            {
                System.out.println(team1 + " has bidded this player succesfully");
                squadSheet1 += players[i] + "\n";
                player1purse -= base;
            }
            if(j==2)
            {
                System.out.println(team2 + " has bidded this player succesfully");
                squadSheet2 += players[i] + "\n";
                player2purse -= base;
            }
            if(j==4)
                System.out.println("Player remains unsold");
        }


        System.out.println("\n\n" + team1 + "Squad:  \n" + squadSheet1);
        System.out.println("\n\n" + team2 + "Squad:  \n" + squadSheet2);
        rating();
    }
    static void rating()
    {
        int cnt1 = 0, cnt2 = 0;
        System.out.println("10 players can rate the stronger teams \n Enter 1 to vote for " + team1 + "\n Enter 2 to vote for " + team2 );
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Vote!");
            int vote = sc.nextInt();
            switch(vote)
            {
                case 1: cnt1 ++;
                    System.out.println("Thank you");
                    break;
                case 2: cnt2++;
                    System.out.println("Thank you");
                    break;
                default : System.out.println("Invalid vote");
            }

        }
        if(cnt1>cnt2)
        {
            System.out.println(team1 + " is voted as a stronger team");
        }
        else
        if(cnt2>cnt1)
            System.out.println(team2 + " is voted as a stronger team");
        else
            System.out.println("Both teams are voted equally");
        System.out.println("\nThats the end of the auction, Thank you for playing");
    }

    static void instruction()
    {
        System.out.println("-----------Instructions!!-----------------");
        System.out.println("This is 2 player game which involves IPL auction");
        System.out.println("Each player has 100.0cr at the beginning, answering a question gives them 25cr more");
        System.out.println("To Start/Raise a bid press R");
        System.out.println("To stop bidding press Q");
        System.out.println("Player gets rated on his squad");
        System.out.println("Highest rated squad wins");
        System.out.println("ALL THE BEST!!");
        play();
    }
}