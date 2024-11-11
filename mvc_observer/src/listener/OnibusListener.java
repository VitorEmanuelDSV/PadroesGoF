package listener;

import source.OnibusEvent;

import java.util.EventListener;

public interface OnibusListener extends EventListener {

    public void mudouStatus(OnibusEvent e);


}
