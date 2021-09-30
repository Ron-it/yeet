public class Event {
    private String eventTitle;
    private String eventLocation;
    private Date eventDate;
    private Time eventTime;

    public Event(String eventTitle, String eventLocation, Date eventDate, Time eventTime) {
        this.eventTitle = eventTitle;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
    }

    public String getEventTitle() {
        return this.eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventLocation() {
        return this.eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEventDate() {
        return this.eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Time getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(Time eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "{" + " eventTitle='" + getEventTitle() + "'" + ", eventLocation='" + getEventLocation() + "'"
                + ", eventDate='" + getEventDate() + "'" + ", eventTime='" + getEventTime() + "'" + "}";
    }
}