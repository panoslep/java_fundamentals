package labs_examples.objects_classes_methods.labs.objects;

class Maintenance {

    private int yearsInService;
    private int yrsB4decom;
    private String monthOfLastService;

    public Maintenance(int yearsInService, int yrsB4decom, String monthOfLastService) {
        this.yearsInService = yearsInService;
        this.yrsB4decom = yrsB4decom;
        this.monthOfLastService = monthOfLastService;
    }

    public int getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }

    public int getYrsB4decom() {
        return yrsB4decom;
    }

    public void setYrsB4decom(int yrsB4decom) {
        this.yrsB4decom = yrsB4decom;
    }

    public String getMonthOfLastService() {
        return monthOfLastService;
    }

    public void setMonthOfLastService(String monthOfLastService) {
        this.monthOfLastService = monthOfLastService;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "yearsInService=" + yearsInService +
                ", yrsB4decom=" + yrsB4decom +
                ", monthOfLastService='" + monthOfLastService + '\'' +
                '}';
    }
}
