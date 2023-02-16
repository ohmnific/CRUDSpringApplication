package net.javaguides.springboot.springworldhelloworldtotourial;

 

public class Statistic {
    private long id;
    private String serviceName;
    private String details;

    public Statistic(long id, String serviceName, String details) {
        this.id = id;
        this.serviceName = serviceName;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
