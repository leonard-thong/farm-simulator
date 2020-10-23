package gameobjects.items.crops;

import javafx.scene.image.Image;

public class Sunflower extends Crop {
    public Sunflower() {
        super(1, "Sunflower", 1.4, new Image("/images/Sunflower_Stage_3.png"));
    }

    @Override
    public boolean harvest() {
        return this.getLifeStage() == 3;
    }
}
