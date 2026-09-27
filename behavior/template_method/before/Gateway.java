package behavior.template_method.before;

import java.util.concurrent.ThreadLocalRandom;

public class Gateway {
    
    public boolean charge(float value) {
        Boolean[] result = { true, false };
        return result[ThreadLocalRandom.current().nextInt(0, 1)];
    }

}
