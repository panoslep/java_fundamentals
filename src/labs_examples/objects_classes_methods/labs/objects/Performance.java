package labs_examples.objects_classes_methods.labs.objects;

class Performance {

    private double mach;
    private int maxAltitude;
    private int landDist;

    public Performance(double mach, int maxAltitude, int landDist) {
        this.mach = mach;
        this.maxAltitude = maxAltitude;
        this.landDist = landDist;
    }

    public double getMach() {
        return mach;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public int getLandDist() {
        return landDist;
    }

    public void setMach(int mach) {
        this.mach = mach;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public void setLandDist(int landDist) {
        this.landDist = landDist;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "mach=" + mach +
                ", maxAltitude=" + maxAltitude +
                ", landDist=" + landDist +
                '}';
    }
}
