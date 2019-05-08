package org.nico.ratel.landlords.robot;

import org.nico.ratel.landlords.entity.Poker;
import org.nico.ratel.landlords.entity.PokerSell;
import org.nico.ratel.landlords.helper.PokerHelper;

import java.util.List;

public class MediumRobotDecisionMakers extends AbstractRobotDecisionMakers {

    @Override
    public PokerSell howToPlayPokers(PokerSell lastPokerSell, List<Poker> myPokers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean howToChooseLandlord(List<Poker> leftPokers, List<Poker> rightPokers, List<Poker> myPokers) {
        int leftScore = PokerHelper.parsePokerColligationScore(leftPokers);
        int rightScore = PokerHelper.parsePokerColligationScore(rightPokers);
        int myScore = PokerHelper.parsePokerColligationScore(myPokers);
        return myScore >= (leftScore + rightScore) / 2;
    }

}
