package net.javaguides.springboot.springworldhelloworldtotourial;



public class Notification {
    private long id;
    private String date;
    private String remarks;

    public Notification(long id, String date, String remarks) {
        this.id = id;
        this.date = date;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
