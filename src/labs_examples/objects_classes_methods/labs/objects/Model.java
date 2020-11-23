package labs_examples.objects_classes_methods.labs.objects;

class Model {

    private String airliner;
    private String manufacturer;
    private String type;

    public Model(String airliner, String manufacturer, String type) {
        this.airliner = airliner;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public String getAirliner() {
        return airliner;
    }

    public void setAirliner(String airliner) {
        this.airliner = airliner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Model{" +
                "airliner='" + airliner + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
