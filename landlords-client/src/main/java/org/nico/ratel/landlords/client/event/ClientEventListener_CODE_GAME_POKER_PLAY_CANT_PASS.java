package org.nico.ratel.landlords.client.event;

import io.netty.channel.Channel;
import org.nico.ratel.landlords.enums.ServerEventCode;
import org.nico.ratel.landlords.print.SimplePrinter;

public class ClientEventListener_CODE_GAME_POKER_PLAY_CANT_PASS extends ClientEventListener {

    @Override
    public void call(Channel channel, String data) {
        SimplePrinter.printNotice("You played the previous card, so you can't pass.");
        pushToServer(channel, ServerEventCode.CODE_GAME_POKER_PLAY_REDIRECT);
    }

}
