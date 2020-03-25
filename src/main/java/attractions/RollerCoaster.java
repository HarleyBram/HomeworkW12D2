package attractions;

import behaviours.ITicketed;
import people.Visitor;

import javax.imageio.ImageTranscoder;

public class RollerCoaster  extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 2.00){
            return 19.60;
        } else {
            return 8.40;
        }
    }
}
