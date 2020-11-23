package labs_examples.objects_classes_methods.labs.objects;

class Capacity {

    private int crew;
    private int maxPassengers;
    private int maxCargoTons;

    public Capacity(int crew, int maxPassengers, int maxCargoTons) {
        this.crew = crew;
        this.maxPassengers = maxPassengers;
        this.maxCargoTons = maxCargoTons;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxCargoTons() {
        return maxCargoTons;
    }

    public void setMaxCargoTons(int maxCargoTons) {
        this.maxCargoTons = maxCargoTons;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "crew=" + crew +
                ", maxPassengers=" + maxPassengers +
                ", maxCargoTons=" + maxCargoTons +
                '}';
    }
}
