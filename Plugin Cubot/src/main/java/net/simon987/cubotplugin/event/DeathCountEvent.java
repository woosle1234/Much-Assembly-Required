package net.simon987.cubotplugin.event;

import net.simon987.server.event.GameEvent;
import net.simon987.server.game.objects.GameObject;

public class DeathCountEvent extends GameEvent {

    public DeathCountEvent(){

    }

    public DeathCountEvent(GameObject object, int c) {
        setSource(object);
        if(c>=0){
            object.setCounter(c);
        }else{
            object.setCounter(0);
        }
    }

    @Override
    public GameObject getSource() {
        return (GameObject) super.getSource();
    }

    public int getCounter() {
        return (int) getSource().getCounter();
    }
}