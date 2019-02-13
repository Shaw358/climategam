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
        System.out.println("                                Game will start in 20 seconds");
        System.out.println("                                    You have 5 resources:");
        System.out.println("                     Humanity, Ozone layer, Plant life, Animal life and Money");
        System.out.println("                                     Keep them in balance!");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        for (int i1 = 1; i1 <= 20; ++i1)
        {
            System.out.println();
        }

        //resources
        int humanity = 50;
        int ozoneLayer = 50;
        int plantLife = 50;
        int animalLife = 50;
        int money = 50;

        Scanner scan = new Scanner(System.in);
        String hit1 = scan.nextLine();
        if (hit1.equals("n"))
        {

        boolean runmachine = true;
        while (runmachine)
        {

            Random question = new Random(); // current 20 questions max (might add more in teh future)
            int questionInt = question.nextInt(20);
            {
                //main code for questions and answers

                //question 1
                if (questionInt == 1) {
                    for (int i2 = 1; i2 <= 20; ++i2) {
                        System.out.println();
                    }

                    System.out.println("Should we invest in biomass technology?");
                    System.out.println("Y: -money, ozone layer, -plant life, +animal life, humanity");
                    System.out.println("N: +money, ozone layer, +plant life, animal life, humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);

                }

                //question 2
                if (questionInt == 2) {
                    for (int i3 = 1; i3 <= 20; ++i3) {
                        System.out.println();
                    }

                    System.out.println("Should we Interfere in the Syrian civil war?");
                    System.out.println("Y: +money, -ozone layer, -plant life, -animal life, +humanity");
                    System.out.println("N: -money, +ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 3
                if (questionInt == 3) {
                    for (int i4= 1; i4 <= 20; ++i4) {
                        System.out.println();
                    }

                    System.out.println("Should we ban coal plants?");
                    System.out.println("Y: -money, +ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("N: +money, -ozone layer, plant life, -animal life, +humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 4
                if (questionInt == 4) {
                    for (int i5 = 1; i5 <= 20; ++i5) {
                        System.out.println();
                    }

                    System.out.println("Should we increase the tax pet keeping?");
                    System.out.println("Y: +money, ozone layer, plant life, -animal life, +humanity");
                    System.out.println("N: -money, ozone layer, plant life, +animal life, +humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 5
                if (questionInt == 5) {
                    for (int i6 = 1; i6 <= 20; ++i6) {
                        System.out.println();
                    }

                    System.out.println("Should we increase the import tax on food?");
                    System.out.println("Y: +money, ozone layer, +plant life,  -animal life, +humanity");
                    System.out.println("N: -money, ozone layer, -plant life, +animal life, -humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 6
                if (questionInt == 6) {
                    for (int i7 = 1; i7 <= 20; ++i7) {
                        System.out.println();
                    }

                    System.out.println("A nuclear meltdown occured in one of our power plants, should we evacuate the people?");
                    System.out.println("Y: -money, ozone layer, plant life, animal life, +humanity");
                    System.out.println("N: +money, ozone layer, plant life, animal life, -humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 7
                if (questionInt == 6) {
                    for (int i8 = 1; i8 <= 20; ++i8) {
                        System.out.println();
                    }

                    System.out.println("The people want more parks and forests, should we sacrifice our ozone layer research for that?");
                    System.out.println("Y: money, -ozone layer, +plant life, animal life, humanity");
                    System.out.println("N: money, +ozone layer, -plant life, animal life, humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 8
                if (questionInt == 6) {
                    for (int i9 = 1; i9 <= 20; ++i9) {
                        System.out.println();
                    }

                    System.out.println("Should strengthen the police force?");
                    System.out.println("Y: -money, ozone layer, plant life, animal life, +humanity");
                    System.out.println("N: +money, ozone layer, plant life, +animal life, -humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 9
                if (questionInt == 6) {
                    for (int i10 = 1; i10 <= 20; ++i10) {
                        System.out.println();
                    }

                    System.out.println("Due to a miscommunication the the protestors of the Animal protection and banking clan have been put on the same date. Should the banking clan receive the right to protest first?");
                    System.out.println("Y: +money, ozone layer, plant life, -animal life, +humanity");
                    System.out.println("N: -money, ozone layer, plant life, +animal life, +humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 10
                if (questionInt == 6) {
                    for (int i11 = 1; i11 <= 20; ++i11) {
                        System.out.println();
                    }

                    System.out.println("We're on the verge of nuclear war, should we invest in bunkers in case of war?");
                    System.out.println("Y: -money, ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("N: +money, ozone layer, plant life, animal life, -humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 11
                if (questionInt == 6) {
                    for (int i11 = 1; i11 <= 20; ++i11) {
                        System.out.println();
                    }

                    System.out.println("Can we use animals as manual labor to generate energy?");
                    System.out.println("Y: +money, -ozone layer, plant life, -animal life, humanity");
                    System.out.println("N: -money, +ozone layer, plant life, +animal life, humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                //question 12
                if (questionInt == 6) {
                    for (int i11 = 1; i11 <= 20; ++i11) {
                        System.out.println();
                    }

                    System.out.println("An oil tanker sunk releasing tons of waste into the sea, do we have permission to clean it up?");
                    System.out.println("Y: -money, ozone layer, +plant life, +animal life, +humanity");
                    System.out.println("N: +money, ozone layer, -plant life, -animal life, -humanity");
                    System.out.println("Money: " + money + " ozone layer: " + ozoneLayer + " plant life: " + plantLife + " animal life: " + animalLife + " humanity: " + humanity);
                }

                if(humanity >= 100)
                {
                    runmachine = false;
                    humanity = 100;
                    System.out.println("Over population caused a shortage in food, energy, water. Anarchy broke out and a civl war ensued. Your country has fallen.");

                    boolean game_over = true;
                }
                if(humanity <= 0)
                {
                    runmachine = false;
                    humanity = 0;
                    System.out.println("Everyone died and martial is declared soon after, it's a wasteland. Your country has fallen.");

                    boolean game_over = true;
                }
                if(plantLife <= 0)
                {
                    runmachine = false;
                    plantLife = 0;
                    System.out.println("The plant life has died out... and we're not the only one. Crops have died on a massive scale and there is no more food. You country has fallen.");

                    boolean game_over = true;
                }
                if(animalLife <= 0)
                {
                    runmachine = false;
                    animalLife = 0;
                    System.out.println("The animal life has died out. Plants can't reproduce, the soil is destroyed. Your country has fallen.");

                    boolean game_over = true;
                }
                if(ozoneLayer <= 0)
                {
                    runmachine = false;
                    ozoneLayer = 0;
                    System.out.println("We have destroyed the ozone layer, we are being bombarded by radiation from the sun. Your country has fallen.");

                    boolean game_over = true;
                }
                if(money <= 0)
                {
                    runmachine = false;
                    money = 0;
                    System.out.println("We're out of money, we can no longer support the state. Your country has fallen.");

                    boolean game_over = true;
                }
            }

        }

        }


    }

}

