package org.nico.ratel.landlords.client.event;

import io.netty.channel.Channel;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import java.util.Map;

public class ClientEventListener_CODE_GAME_OVER extends ClientEventListener {

    @Override
    public void call(Channel channel, String data) {
        Map<String, Object> map = MapHelper.parser(data);
        SimplePrinter.printNotice("\nPlayer " + map.get("winnerNickname") + "[" + map.get("winnerType") + "]" + " won the game");
        SimplePrinter.printNotice("Game over, friendship first, competition second\n");
    }

}
