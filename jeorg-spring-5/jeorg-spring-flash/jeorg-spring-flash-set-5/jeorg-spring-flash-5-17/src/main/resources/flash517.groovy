import org.jesperancinha.std.flash517.context.Fish
import org.jesperancinha.std.flash517.context.FishService

beans {
    fish(Fish){
        name="Cod"
    }
    fishService(FishService) {
        fish=fish
    }
}