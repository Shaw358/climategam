import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        //welcoming screen
        System.out.println(" _____ _   _____________ ________  ___ _____   _   _ _    _____ ________  ___  ___ _____ _____ ");
        System.out.println("/  ___| | | | ___ \\ ___ \\  ___|  \\/  ||  ___| | | | | |  |_   _|_   _|  \\/  | / _ \\_   _|  ___|");
        System.out.println("\\ `--.| | | | |_/ / |_/ / |__ | .  . || |__   | | | | |    | |   | | | .  . |/ /_\\ \\| | | |__  ");
        System.out.println(" `--. \\ | | |  __/|    /|  __|| |\\/| ||  __|  | | | | |    | |   | | | |\\/| ||  _  || | |  __| ");
        System.out.println("/\\__/ / |_| | |   | |\\ \\| |___| |  | || |___  | |_| | |____| |  _| |_| |  | || | | || | | |___ ");
        System.out.println("\\____/ \\___/\\_|   \\_| \\_\\____/\\_|  |_/\\____/   \\___/\\_____/\\_/  \\___/\\_|  |_/\\_| |_/\\_/ \\____/ ");
        System.out.println("                                                                                               ");
        System.out.println("                                       Press A to start");
        System.out.println("                                      Hey, you, God here");
        System.out.println("                     Humanity, Ozone layer, Plant life, Animal life and Money");
        System.out.println("                              Keep them in balance while i'm out kay?");


        //resources
        int humanity = 50;
        int ozoneLayer = 50;
        int plantLife = 50;
        int animalLife = 50;
        int money = 50;

        Scanner scan = new Scanner(System.in);
        String hit1 = scan.nextLine();
        if (hit1.equalsIgnoreCase("a"))
        {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            for (int i1 = 1; i1 <= 20; ++i1)
            {
                System.out.println();
            }



        boolean runmachine = true;
        while (runmachine)
        {
            boolean game_over = false;

            Random question = new Random(); // current 20 questions max (might add more in teh future)
            int questionInt = question.nextInt(12);
            {


                //main code for questions and answers

                //question 1
                if (questionInt == 1) {
                    System.out.println("Should we invest in biomass technology?");
                    System.out.println("Y: -money, ozone layer, -plant life, +animal life, humanity");
                    System.out.println("N: +money, ozone layer, +plant life, animal life, humanity");

                    String Q1 = scan.nextLine();
                    if (Q1.equalsIgnoreCase("y")) {
                        money = money - 5;
                        plantLife = plantLife - 5;
                        animalLife = animalLife + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q1.equalsIgnoreCase("n")) {
                        money = money + 5;
                        plantLife = plantLife + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }
                }



                //question 2
                if (questionInt == 2) {

                    System.out.println("Should we Interfere in the Syrian civil war?");
                    System.out.println("Y: +money, -ozone layer, -plant life, -animal life, +humanity");
                    System.out.println("N: -money, +ozone layer, +plant life, +animal life, +humanity");

                    String Q2 = scan.nextLine();
                    if (Q2.equalsIgnoreCase("y")) {
                        money = money + 10;
                        plantLife = plantLife - 5;
                        animalLife = animalLife - 5;
                        humanity = humanity + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q2.equalsIgnoreCase("n")) {
                        money = money - 5;
                        plantLife = plantLife + 5;
                        animalLife = animalLife + 5;
                        ozoneLayer = ozoneLayer + 5;
                        humanity = humanity + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }
                }

                //question 3
                if (questionInt == 3) {

                    System.out.println("Should we ban coal plants?");
                    System.out.println("Y: -money, +ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("N: +money, -ozone layer, plant life, -animal life, +humanity");

                    String Q10 = scan.nextLine();
                    if (Q10.equalsIgnoreCase("y")) {
                        money = money - 15;
                        plantLife = plantLife + 5;
                        animalLife = animalLife + 5;
                        humanity = humanity + 5;
                        ozoneLayer = ozoneLayer + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q10.equalsIgnoreCase("n")) {
                        money = money - 5;
                        animalLife = animalLife - 5;
                        ozoneLayer = ozoneLayer - 10;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 4
                if (questionInt == 4) {

                    System.out.println("Should we increase the tax pet keeping?");
                    System.out.println("Y: +money, ozone layer, plant life, -animal life, humanity");
                    System.out.println("N: -money, ozone layer, plant life, +animal life, humanity");

                    String Q3 = scan.nextLine();
                    if (Q3.equalsIgnoreCase("y")) {
                        money = money + 5;
                        animalLife = animalLife - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q3.equalsIgnoreCase("n")) {
                        money = money - 5;
                        animalLife = animalLife + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 5
                if (questionInt == 5) {

                    System.out.println("Should we increase the import tax on food?");
                    System.out.println("Y: +money, ozone layer, +plant life,  -animal life, +humanity");
                    System.out.println("N: -money, ozone layer, -plant life, +animal life, -humanity");

                    String Q4 = scan.nextLine();
                    if (Q4.equalsIgnoreCase("y")) {
                        money = money + 5;
                        plantLife = plantLife + 5;
                        animalLife = animalLife - 5;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q4.equalsIgnoreCase("n")) {
                        money = money - 5;
                        plantLife = plantLife - 5;
                        animalLife = animalLife + 5;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 6
                if (questionInt == 6) {

                    System.out.println("A nuclear meltdown occured in one of our power plants, should we evacuate the people?");
                    System.out.println("Y: -money, ozone layer, plant life, animal life, +humanity");
                    System.out.println("N: +money, ozone layer, plant life, animal life, -humanity");

                    String Q5 = scan.nextLine();
                    if (Q5.equalsIgnoreCase("y")) {
                        money = money - 10;
                        humanity = humanity + 10;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q5.equalsIgnoreCase("n")) {

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 7
                if (questionInt == 7) {
                    for (int i8 = 1; i8 <= 20; ++i8) {
                        System.out.println();
                    }

                    System.out.println("The people want more parks and forests, should we sacrifice our ozone layer research for that?");
                    System.out.println("Y: money, -ozone layer, +plant life, animal life, humanity");
                    System.out.println("N: money, +ozone layer, -plant life, animal life, humanity");

                    String Q6 = scan.nextLine();
                    if (Q6.equalsIgnoreCase("y")) {
                        plantLife = plantLife + 5;
                        ozoneLayer = ozoneLayer - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q6.equalsIgnoreCase("n")) {
                        plantLife = plantLife - 5;
                        ozoneLayer = ozoneLayer + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 8
                if (questionInt == 8) {

                    System.out.println("Should strengthen the police force?");
                    System.out.println("Y: -money, ozone layer, plant life, animal life, +humanity");
                    System.out.println("N: +money, ozone layer, plant life, +animal life, -humanity");

                    String Q7 = scan.nextLine();
                    if (Q7.equalsIgnoreCase("y")) {
                        money = money - 5;
                        humanity = humanity + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q7.equalsIgnoreCase("n")) {
                        money = money + 5;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 9
                if (questionInt == 9) {

                    System.out.println("Due to a miscommunication the the protestors of the Animal protection and banking clan have been put on the same date. Should the banking clan receive the right to protest first?");
                    System.out.println("Y: +money, ozone layer, plant life, -animal life, +humanity");
                    System.out.println("N: -money, ozone layer, plant life, +animal life, +humanity");

                    String Q8 = scan.nextLine();
                    if (Q8.equalsIgnoreCase("y")) {
                        money = money + 5;
                        animalLife = animalLife - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q8.equalsIgnoreCase("n")) {
                        money = money - 5;
                        animalLife = animalLife + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }
                }

                //question 10
                if (questionInt == 10) {


                    System.out.println("We're on the verge of nuclear war, should we invest in bunkers in case of war?");
                    System.out.println("Y: -money, ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("N: +money, ozone layer, plant life, animal life, -humanity");

                    String Q9 = scan.nextLine();
                    if (Q9.equalsIgnoreCase("y")) {
                        money = money - 10;
                        plantLife = plantLife + 5;
                        animalLife = animalLife + 5;
                        humanity = humanity + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q9.equalsIgnoreCase("n")) {
                        money = money + 10;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                //question 11
                if (questionInt == 11) {

                    System.out.println("Can we use animals as manual labor to generate energy?");
                    System.out.println("Y: +money, -ozone layer, plant life, -animal life, humanity");
                    System.out.println("N: -money, +ozone layer, plant life, +animal life, humanity");

                    String Q11 = scan.nextLine();
                    if (Q11.equalsIgnoreCase("y")) {
                        money = money + 5;
                        ozoneLayer = ozoneLayer - 5;
                        animalLife = animalLife - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q11.equalsIgnoreCase("n")) {
                        money = money - 5;
                        animalLife = animalLife + 5;
                        ozoneLayer = ozoneLayer + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }
                }

                //question 12
                if (questionInt == 12) {

                    System.out.println("An oil tanker sunk releasing tons of waste into the sea, do we have permission to clean it up?");
                    System.out.println("Y: -money, ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("N: +money, ozone layer, -plant life, -animal life, -humanity");

                    String Q12 = scan.nextLine();
                    if (Q12.equalsIgnoreCase("y")) {
                        money = money - 10;
                        plantLife = plantLife +5;
                        animalLife = animalLife + 5;
                        humanity = humanity + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q12.equalsIgnoreCase("n")) {
                        money = money + 10;
                        plantLife = plantLife - 5;
                        animalLife = animalLife - 5;
                        ozoneLayer = ozoneLayer - 5;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                if (questionInt == 13) {

                    System.out.println("Both the Animal comission and CO2 comission demand to increase their yearly budgets. Do we give priority to the CO2 commision or...?");
                    System.out.println("Y: -money, +ozone layer, plant life, -animal life, humanity");
                    System.out.println("N: -money, -ozone layer, plant life, +animal life, humanity");

                    String Q13 = scan.nextLine();
                    if (Q13.equalsIgnoreCase("y")) {
                        money = money - 5;
                        animalLife = animalLife - 5;
                        ozoneLayer = ozoneLayer + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                    }

                    if (Q13.equalsIgnoreCase("n")) {
                        money = money - 5;
                        animalLife = animalLife + 5;
                        ozoneLayer = ozoneLayer - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                    }

                }

                //question 14
                if (questionInt == 14) {

                    System.out.println("Should there be a law to consume less meat?");
                    System.out.println("Y: money, +ozone layer, -plant life, +animal life, -humanity");
                    System.out.println("N: money, -ozone layer, +plant life, -animal life, +humanity");

                    String Q14 = scan.nextLine();
                    if (Q14.equalsIgnoreCase("y")) {
                        plantLife = plantLife - 5;
                        ozoneLayer = ozoneLayer + 5;
                        animalLife = animalLife + 5;
                        humanity = humanity - 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                    if (Q14.equalsIgnoreCase("n")) {
                        plantLife = plantLife + 5;
                        ozoneLayer = ozoneLayer - 5;
                        animalLife = animalLife - 5;
                        humanity = humanity + 5;

                        System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }

                        for (int i1 = 1; i1 <= 20; ++i1)
                        {
                            System.out.println();
                        }
                    }

                }

                if(humanity >= 100)
                {
                    runmachine = false;
                    humanity = 100;
                    System.out.println("Over population caused a shortage in food, energy, water. Anarchy broke out and a civil war ensued. Your country has fallen.");

                    game_over = true;
                }
                if(humanity <= 0)
                {
                    runmachine = false;
                    humanity = 0;
                    System.out.println("Everyone died and martial is declared soon after, it's a wasteland. Your country has fallen.");

                    game_over = true;
                }
                if(plantLife <= 0)
                {
                    runmachine = false;
                    plantLife = 0;
                    System.out.println("The plant life has died out... and we're not the only one. Crops have died on a massive scale and there is no more food. You country has fallen.");

                    game_over = true;
                }
                if(animalLife <= 0)
                {
                    runmachine = false;
                    animalLife = 0;
                    System.out.println("The animal life has died out. Plants can't reproduce, the soil is destroyed. Your country has fallen.");

                    game_over = true;
                }
                if(ozoneLayer <= 0)
                {
                    runmachine = false;
                    ozoneLayer = 0;
                    System.out.println("We have destroyed the ozone layer, we are being bombarded by radiation from the sun. Your country has fallen.");

                    game_over = true;
                }
                if(money <= 0)
                {
                    runmachine = false;
                    money = 0;
                    System.out.println("We're out of money, we can no longer support the state. Your country has fallen.");

                    game_over = true;
                }
            }
            if (game_over = true){
                System.out.println();
                System.out.println();
                System.out.println();

            System.out.println(" _____   ___  ___  ___ _____   _____  _   _ ___________             ");
            System.out.println("|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\            ");
            System.out.println("| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ /            ");
            System.out.println("| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /             ");
            System.out.println("| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\   _   _   _ ");
            System.out.println(" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_| (_) (_) (_)");
        }

        }

        }


    }

}

