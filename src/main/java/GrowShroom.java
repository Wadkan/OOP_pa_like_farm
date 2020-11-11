public interface GrowShroom {
    boolean getChanceForShroomGrowing();
    void ifShroomIncreaseProduction(); // almond 10%, spruce 15%
    boolean ifRot();    // if true no production at all
}
