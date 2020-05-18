package GameCerto;

import java.util.List;

import Models.PicturePokerCard;

public interface PicturePokerHand {
    private List<PicturePokerCard> hand;

    public PicturePokerHand(List<PicturePokerCard> hand) implements {
        this.hand = hand;
    }

    public List<PicturePokerCard> getHand() {
        return hand;
    }
}
