package org.nakul;

import java.util.Scanner;

public class MountainAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mountain Adventure Game!");
        System.out.println("You have decided to visit the mountains for an adventure.");

        startJourney(scanner);
    }

    private static void startJourney(Scanner scanner) {
        System.out.println("You arrive at the base of the mountain. Choose your trail:");
        System.out.println("1. Easy Trail");
        System.out.println("2. Difficult Trail");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                easyTrail(scanner);
                break;
            case "2":
                difficultTrail(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                startJourney(scanner);
                break;
        }
    }

    private static void easyTrail(Scanner scanner) {
        System.out.println("You chose the Easy Trail. After some time, you encounter a river.");
        System.out.println("1. Cross the river");
        System.out.println("2. Follow the river");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You decided to cross the river. You carefully step on the stones.");
                riverCrossing(scanner);
                break;
            case "2":
                System.out.println("You decided to follow the river. You find a hidden path leading to a beautiful waterfall.");
                hiddenPath(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                easyTrail(scanner);
                break;
        }
    }

    private static void riverCrossing(Scanner scanner) {
        System.out.println("While crossing the river, you slip and fall into the water.");
        System.out.println("1. Swim to the shore");
        System.out.println("2. Call for help");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You swim to the shore safely. You continue your journey.");
                findTraveler(scanner);
                break;
            case "2":
                System.out.println("You call for help, and a nearby hiker helps you out. You make a new friend.");
                newFriend(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                riverCrossing(scanner);
                break;
        }
    }

    private static void hiddenPath(Scanner scanner) {
        System.out.println("The hidden path leads to a beautiful waterfall with a rainbow.");
        System.out.println("1. Take a photo");
        System.out.println("2. Sit and relax");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You take a stunning photo of the waterfall. It's a memory to cherish.");
                meetTraveler(scanner);
                break;
            case "2":
                System.out.println("You sit by the waterfall and relax, enjoying the peaceful environment.");
                restByWaterfall(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                hiddenPath(scanner);
                break;
        }
    }

    private static void difficultTrail(Scanner scanner) {
        System.out.println("You chose the Difficult Trail. After a while, you face a steep cliff.");
        System.out.println("1. Climb the cliff");
        System.out.println("2. Find another way");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You decided to climb the cliff. It's challenging but you make it to the top.");
                cliffTop(scanner);
                break;
            case "2":
                System.out.println("You decided to find another way. You discover a cave nearby.");
                exploreCave(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                difficultTrail(scanner);
                break;
        }
    }

    private static void cliffTop(Scanner scanner) {
        System.out.println("At the top of the cliff, you find an old map.");
        System.out.println("1. Follow the map");
        System.out.println("2. Ignore the map and continue");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You decide to follow the map. It leads you to an ancient temple.");
                ancientTemple(scanner);
                break;
            case "2":
                System.out.println("You ignore the map and continue your journey.");
                findCave(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                cliffTop(scanner);
                break;
        }
    }

    private static void ancientTemple(Scanner scanner) {
        System.out.println("Inside the ancient temple, you find a mystical artifact.");
        System.out.println("1. Take the artifact");
        System.out.println("2. Leave the artifact");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You take the artifact and feel a surge of power.");
                mysticalArtifact(scanner);
                break;
            case "2":
                System.out.println("You decide to leave the artifact and respect the temple.");
                respectTemple(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                ancientTemple(scanner);
                break;
        }
    }

    private static void exploreCave(Scanner scanner) {
        System.out.println("You chose to explore the cave. Inside, you find something unexpected.");
        System.out.println("1. Continue exploring");
        System.out.println("2. Leave the cave");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You continue exploring the cave and find hidden treasure!");
                hiddenTreasure(scanner);
                break;
            case "2":
                System.out.println("You decided to leave the cave and continue your journey.");
                continueJourney(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                exploreCave(scanner);
                break;
        }
    }

    private static void findTraveler(Scanner scanner) {
        System.out.println("You meet a traveler who seems to be lost.");
        System.out.println("1. Help the traveler");
        System.out.println("2. Ignore the traveler");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You help the traveler find their way. In return, they give you a map to a hidden treasure.");
                treasureMap(scanner);
                break;
            case "2":
                System.out.println("You ignore the traveler and continue your journey alone.");
                soloJourney(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                findTraveler(scanner);
                break;
        }
    }

    private static void newFriend(Scanner scanner) {
        System.out.println("Your new friend shares some useful tips about the mountain.");
        System.out.println("1. Follow the tips");
        System.out.println("2. Ignore the tips");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You follow the tips and have a safer journey.");
                safeJourney(scanner);
                break;
            case "2":
                System.out.println("You ignore the tips and face more challenges ahead.");
                challengingJourney(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                newFriend(scanner);
                break;
        }
    }

    private static void meetTraveler(Scanner scanner) {
        System.out.println("You meet a traveler who tells you about a hidden treasure in the mountains.");
        System.out.println("1. Search for the treasure");
        System.out.println("2. Continue your journey");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You decide to search for the treasure.");
                searchTreasure(scanner);
                break;
            case "2":
                System.out.println("You continue your journey, enjoying the scenic beauty.");
                scenicJourney(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                meetTraveler(scanner);
                break;
        }
    }

    private static void restByWaterfall(Scanner scanner) {
        System.out.println("While resting, you find a rare flower by the waterfall.");
        System.out.println("1. Pick the flower");
        System.out.println("2. Leave the flower");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You pick the rare flower and keep it as a souvenir.");
                souvenir(scanner);
                break;
            case "2":
                System.out.println("You decide to leave the flower and continue your journey.");
                continueJourney(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                restByWaterfall(scanner);
                break;
        }
    }

    private static void findCave(Scanner scanner) {
        System.out.println("You discover a cave with ancient writings on the walls.");
        System.out.println("1. Try to read the writings");
        System.out.println("2. Ignore the writings and move on");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You try to read the writings and learn about the history of the mountain.");
                ancientHistory(scanner);
                break;
            case "2":
                System.out.println("You ignore the writings and move on.");
                moveOn(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                findCave(scanner);
                break;
        }
    }

    private static void mysticalArtifact(Scanner scanner) {
        System.out.println("The artifact grants you a special ability to understand animal languages.");
        System.out.println("1. Use the ability to communicate with animals");
        System.out.println("2. Keep the ability secret");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You use the ability to communicate with animals and gain valuable information.");
                animalCommunication(scanner);
                break;
            case "2":
                System.out.println("You keep the ability secret and continue your journey.");
                secretAbility(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                mysticalArtifact(scanner);
                break;
        }
    }

    private static void respectTemple(Scanner scanner) {
        System.out.println("By respecting the temple, you feel a sense of peace and continue your journey with renewed energy.");
        System.out.println("1. Continue exploring the mountain");
        System.out.println("2. Head back home");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You continue exploring the mountain and discover new trails.");
                newTrails(scanner);
                break;
            case "2":
                System.out.println("You head back home, feeling accomplished.");
                endJourney(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                respectTemple(scanner);
                break;
        }
    }

    private static void hiddenTreasure(Scanner scanner) {
        System.out.println("You find a hidden treasure chest filled with gold and jewels.");
        System.out.println("1. Take the treasure");
        System.out.println("2. Leave the treasure");

        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("You take the treasure and become wealthy.");
                wealthyLife(scanner);
                break;
            case "2":
                System.out.println("You decide to leave the treasure for others to find.");
                selfless(scanner);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                hiddenTreasure(scanner);
                break;
        }
    }

    private static void continueJourney(Scanner scanner) {
        System.out.println("You continue your journey, encountering various scenic spots and making memories.");
        // Add more story and decisions here
    }

    private static void treasureMap(Scanner scanner) {
        System.out.println("You follow the map and discover a hidden cave with treasure.");
        // Add more story and decisions here
    }

    private static void soloJourney(Scanner scanner) {
        System.out.println("You continue your journey alone, facing challenges and overcoming them.");
        // Add more story and decisions here
    }

    private static void safeJourney(Scanner scanner) {
        System.out.println("Thanks to your friend's tips, you avoid several dangers.");
        // Add more story and decisions here
    }

    private static void challengingJourney(Scanner scanner) {
        System.out.println("Without following the tips, you face more challenges but grow stronger.");
        // Add more story and decisions here
    }

    private static void searchTreasure(Scanner scanner) {
        System.out.println("You find the hidden treasure and feel accomplished.");
        // Add more story and decisions here
    }

    private static void scenicJourney(Scanner scanner) {
        System.out.println("You enjoy the beautiful scenery and make wonderful memories.");
        // Add more story and decisions here
    }

    private static void souvenir(Scanner scanner) {
        System.out.println("The rare flower becomes a cherished souvenir of your journey.");
        // Add more story and decisions here
    }

    private static void ancientHistory(Scanner scanner) {
        System.out.println("You learn about the ancient history of the mountain and its secrets.");
        // Add more story and decisions here
    }

    private static void moveOn(Scanner scanner) {
        System.out.println("You move on and find new adventures ahead.");
        // Add more story and decisions here
    }

    private static void animalCommunication(Scanner scanner) {
        System.out.println("Using your ability, you gain valuable insights from the animals.");
        // Add more story and decisions here
    }

    private static void secretAbility(Scanner scanner) {
        System.out.println("You keep your ability secret and continue your journey.");
        // Add more story and decisions here
    }

    private static void newTrails(Scanner scanner) {
        System.out.println("You discover new trails and continue your adventure.");
        // Add more story and decisions here
    }

    private static void endJourney(Scanner scanner) {
        System.out.println("You end your journey and head back home, feeling accomplished.");
        // Add more story and decisions here
    }

    private static void wealthyLife(Scanner scanner) {
        System.out.println("You live a wealthy life thanks to the treasure you found.");
        // Add more story and decisions here
    }

    private static void selfless(Scanner scanner) {
        System.out.println("You feel good about leaving the treasure for others to find.");
        // Add more story and decisions here
    }
}
