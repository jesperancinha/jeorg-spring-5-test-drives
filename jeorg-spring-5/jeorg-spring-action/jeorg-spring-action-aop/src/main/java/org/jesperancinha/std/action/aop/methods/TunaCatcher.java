package org.jesperancinha.std.action.aop.methods;

import org.jesperancinha.std.action.aop.model.Tuna;
import org.springframework.stereotype.Service;

@Service
public class TunaCatcher implements SeaFoodCatcher<Tuna> {
    @Override
    public Tuna catchWithNet() {
        return null;
    }

    @Override
    public Tuna catchWithFishingPole() {
        return null;
    }

    @Override
    public Tuna catchByHand() {
        return null;
    }

    @Override
    public void catchByHandExtra() {

    }

    @Override
    public Tuna catchWithClaws() {
        return null;
    }

    @Override
    public Tuna catchWithSuperSonicWaves() {
        return null;
    }

    @Override
    public Tuna catchWithABucket() {
        return null;
    }

    @Override
    public Tuna catchWithLove() {
        return null;
    }
}
