public enum FlowerType {
    ROSE("Red"),
    TULIP("Blue"),
    LILY("White"),
    VIOLET("Violet");
    private final String color;
    FlowerType(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
