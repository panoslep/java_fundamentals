package labs_examples.objects_classes_methods.labs.objects;

class Airplane {

    double fuelCapacity;
    double currentFuelLevel;
    Performance performance;
    Maintenance maintenance;
    Capacity capacity;
    Model airModel;

    public Airplane(Performance performance, Maintenance maintenance, Capacity capacity, Model airModel) {
        this.performance = performance;
        this.maintenance = maintenance;
        this.capacity = capacity;
        this.airModel = airModel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Model getAirModel() {
        return airModel;
    }

    public void setAirModel(Model airModel) {
        this.airModel = airModel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ",\n currentFuelLevel=" + currentFuelLevel +
                ",\n performance=" + performance +
                ",\n maintenance=" + maintenance +
                ",\n capacity=" + capacity +
                ",\n airModel=" + airModel +
                '}';
    }
}
