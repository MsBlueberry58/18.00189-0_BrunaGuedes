package GameCerto;
import Models.PicturePokerCard;

import java.util.List;

public class PicturePokerHand {

    private List<PicturePokerCard> hand;

    public PicturePokerHand(List<PicturePokerCard> hand) {
        this.hand = hand;
    }

    public List<PicturePokerCard> getHand() {
        return hand;
    }

}