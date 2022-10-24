import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 5;
        int deckCount = 30;
        int playerCount = 0;
        int pileCount = 0;
        int i = 1;

        CardStack cardName = new CardStack();
        CardStack player = new CardStack();
        CardStack discarded = new CardStack();

        int randX4 = (int)Math.floor(Math.random()*(max-min+1)+min);

        // Tarot Cards 1 - 30 // Adding items into the stack
        cardName.push(new Cards("The World"));
        cardName.push(new Cards("The Lovers"));
        cardName.push(new Cards("Judgement"));
        cardName.push(new Cards("The Hierophant"));
        cardName.push(new Cards("The Sun"));
        cardName.push(new Cards("Emperor"));
        cardName.push(new Cards("The Moon"));
        cardName.push(new Cards("Empress"));
        cardName.push(new Cards("The Star"));
        cardName.push(new Cards("High Priestess"));
        cardName.push(new Cards("The Tower"));
        cardName.push(new Cards("Magician"));
        cardName.push(new Cards("The Devil"));
        cardName.push(new Cards("The Fool"));
        cardName.push(new Cards("Temperance"));
        cardName.push(new Cards("Wands"));
        cardName.push(new Cards("Death"));
        cardName.push(new Cards("Cups"));
        cardName.push(new Cards("The Hanged Man"));
        cardName.push(new Cards("Swords"));
        cardName.push(new Cards("Justice"));
        cardName.push(new Cards("King of Pentacles"));
        cardName.push(new Cards("The Wheel of Fortune"));
        cardName.push(new Cards("Queen of Pentacles"));
        cardName.push(new Cards("The Hermit"));
        cardName.push(new Cards("Knight of Pentacles"));
        cardName.push(new Cards("Strength"));
        cardName.push(new Cards("Page of Pentacles"));
        cardName.push(new Cards("Chariot"));
        cardName.push(new Cards("Ten of Pentacles"));

        /* GAME PROPER */

        System.out.println("ROUND 1: Draw " + randX4 + " card(s) from the Player Deck.\n");
        if (randX4 == 1)
        {
            player.push(cardName.pop());
            playerCount++;
            deckCount--;
        }
        else if (randX4 == 2)
        {
            for (int p = 0; p < 2; p++) {
                player.push(cardName.pop());
                playerCount++;
                deckCount--;
            }
        }
        else if (randX4 == 3) {
            for (int p = 0; p < 3; p++)
            {
                player.push(cardName.pop());
                playerCount++;
                deckCount--;
            }
        }
        else if (randX4 == 4) {
            for (int p = 0; p < 4; p++)
            {
                player.push(cardName.pop());
                playerCount++;
                deckCount--;
            }
        }
        else if (randX4 == 5) {
            for (int p = 0; p < 5; p++)
            {
                player.push(cardName.pop());
                playerCount++;
                deckCount--;
            }
        }

        System.out.println("Player Hand shows: " + playerCount);
        player.printStack();
        System.out.println();
        System.out.println("No. of cards in Deck: " + deckCount);
        System.out.println("No. of cards Discarded: " + pileCount);
        System.out.println();
        System.out.print("==== Press any key to proceed ====");
        try
        {
            System.in.read();
        }
        catch(Exception e) {
        }

        while (!cardName.isEmpty()) {
            i++;
            System.out.print("\nROUND " + i + ": ");
            int minC = 1;
            int maxC = 3;

            int randC = (int)Math.floor(Math.random()*(maxC-minC+1)+minC);

            if (randC == 1) {

                int randX1 = (int)Math.floor(Math.random()*(max-min+1)+min);

                if (randX1 > deckCount) {
                    randX1 = deckCount;
                }

                System.out.println("Draw " + randX1 + " card/s\n");

                if (randX1 == 1 && deckCount >= 1) {
                    player.push(cardName.pop());
                    playerCount++;
                    deckCount--;
                }
                else if (randX1 == 2 && deckCount >= 2) {
                    for (int p = 0; p < 2; p++) {
                        player.push(cardName.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 3 && deckCount >= 3) {
                    for (int p = 0; p < 3; p++) {
                        player.push(cardName.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 4 && deckCount >= 4) {
                    for (int p = 0; p < 4; p++) {
                        player.push(cardName.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
                else if (randX1 == 5 && deckCount >= 5) {
                    for (int p = 0; p < 5; p++) {
                        player.push(cardName.pop());
                        playerCount++;
                        deckCount--;
                    }
                }
            }
            if (randC == 2 && !player.isEmpty()) {

                int randX2 = (int)Math.floor(Math.random()*(max-min+1)+min);

                if (randX2 > playerCount) {
                    randX2 = playerCount;
                }

                System.out.println("Discard " + randX2 + " card(s)");
                System.out.println();

                if(randX2 == 1 && playerCount >= 1) {
                    discarded.push(player.pop());
                    playerCount--;
                    pileCount++;
                }
                else if(randX2 == 2 && playerCount >= 2) {
                    for (int d = 0; d < 2; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 3 && playerCount >= 3) {
                    for (int d = 0; d < 3; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 4 && playerCount >= 4) {
                    for (int d = 0; d < 4; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
                else if(randX2 == 5 && playerCount >= 5) {
                    for (int d = 0; d < 5; d++){
                        discarded.push(player.pop());
                        playerCount--;
                        pileCount++;
                    }
                }
            }
            else if (randC == 2 && player.isEmpty()){
                System.out.println("ERROR! NOT ENOUGH CARDS.\n");
            }

            if (randC == 3 && !discarded.isEmpty()) {

                int randX3 = (int)Math.floor(Math.random()*(max-min+1)+min);

                if (randX3 > pileCount) {
                    randX3 = pileCount;
                }

                System.out.println("obtain " + randX3 + " card(s) from the discarded pile");
                System.out.println();

                if (randX3 == 1 && pileCount >= 1) {
                    player.push(discarded.pop());
                    playerCount++;
                    pileCount--;
                }
                else if (randX3 == 2 && pileCount >= 2) {
                    for (int g = 0; g < 2; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 3 && pileCount >= 3) {
                    for (int g = 0; g < 3; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 4 && pileCount >= 4) {
                    for (int g = 0; g < 4; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
                else if (randX3 == 5 && pileCount >= 5) {
                    for (int g = 0; g < 5; g++) {
                        player.push(discarded.pop());
                        playerCount++;
                        pileCount--;
                    }
                }
            }
            else if (randC == 3 && discarded.isEmpty()){
                System.out.println("ERROR! NOT ENOUGH CARDS.\n");
            }
            System.out.println("Player Hand shows: " + playerCount);
            player.printStack();
            System.out.println();
            System.out.println("No. of cards in Deck: " + deckCount);
            System.out.println("No. of cards Discarded: " + pileCount);
            System.out.println();

            System.out.print("==== Press any key to proceed ====");

            try
            {
                System.in.read();
            }
            catch(Exception e)
            {}
        }
        if (cardName.isEmpty()) {
            System.out.println("\nGame is completed.\n");
        }
    }
}