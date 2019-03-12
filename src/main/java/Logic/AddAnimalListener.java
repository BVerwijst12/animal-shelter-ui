package Logic;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AddAnimalListener implements PropertyChangeListener {
    private final Webshop webshop;

    public AddAnimalListener(Webshop webshop) {
        this.webshop = webshop;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getNewValue() instanceof Dog) {
            System.out.println("dog");
            webshop.dogHasBeenAddedEvent((Dog)evt.getNewValue());
        }
        if (evt.getNewValue() instanceof Cat){
            System.out.println("Cat");
        }
    }
}
