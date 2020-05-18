package Models;
import GameCerto.PicturePokerDealer;
import GameCerto.PicturePokerHand;

import java.util.List;

public class PicturePoker {
    public static void run(){
        System.out.println("Mario Poker!");
        PicturePokerDealer dealer = new PicturePokerDealer("Luigi");
        System.out.println("Deale da meda:" + dealer.getName());
        System.out.println("Baralho Atual:");
        showPicturePokerList(dealer.getDeck().getDeckList());

        PicturePokerHand hand = new PicturePokerHand(dealer.deal());
        System.out.println("\n\nMao Atual:");
        showPicturePokerList(hand.getHand());

        System.out.println("Baralho Atual:");
        showPicturePokerList(dealer.getDeck().getDeckList());

    }
    private static void showPicturePokerList(List<PicturePokerCard> cardList) {
        System.out.println("Size:" + cardList.size());
        for (PicturePokerCard card: cardList) {
            System.out.println(card);
        }
    }
    
}