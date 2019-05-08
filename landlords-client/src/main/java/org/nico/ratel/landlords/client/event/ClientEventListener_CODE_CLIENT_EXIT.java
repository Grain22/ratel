package org.nico.ratel.landlords.client.event;

import io.netty.channel.Channel;
import org.nico.ratel.landlords.client.SimpleClient;
import org.nico.ratel.landlords.enums.ClientEventCode;
import org.nico.ratel.landlords.helper.MapHelper;
import org.nico.ratel.landlords.print.SimplePrinter;

import java.util.Map;

public class ClientEventListener_CODE_CLIENT_EXIT extends ClientEventListener {

    @Override
    public void call(Channel channel, String data) {
        Map<String, Object> map = MapHelper.parser(data);

        Integer exitClientId = (Integer) map.get("exitClientId");

        String role = null;
        if (exitClientId == SimpleClient.id) {
            role = "You";
        } else {
            role = String.valueOf(map.get("exitClientNickname"));
        }
        SimplePrinter.printNotice(role + " exit from the room. Room disbanded!!\n");

        get(ClientEventCode.CODE_SHOW_OPTIONS).call(channel, data);
    }

}
