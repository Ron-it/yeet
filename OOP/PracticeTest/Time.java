public class Time {
    private int hours;
    private int minutes;

    public Time() {
        this.hours = 0;
        this.minutes = 0;
    }

    public Time(int minutes) {
        this.hours = Math.abs(minutes / 60);
        this.minutes = Math.abs(minutes % 60);
    }

    public Time(int hours, int minutes) {
        this.hours = Math.abs(hours + (minutes / 60));
        this.minutes = Math.abs(minutes % 60);
    }

    public int getHours() {
        if (hours > 23) {
            return (this.hours % 24);
        } else {
            return this.hours;
        }
    }

    public void setHours(int hours) {
        if (hours > 23) {
            minutes = (minutes + (hours * 60));
            hours = hours % 24;
        }
        this.hours = hours;
    }

    public int getMinutes() {
        if (minutes > 59) {
            return (this.minutes % 60);
        } else {
            return this.minutes;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes > 59) {
            hours = (hours + (minutes / 60));
            minutes = minutes % 60;
        }
        this.minutes = minutes;
    }

    public int toMinutes() {
        return (hours * 60 + minutes);
    }

    public int diff(Time anotherTime) {
        int t1 = this.toMinutes();
        int t2 = anotherTime.toMinutes();
        int difference = t2 - t1;
        if (t1 > t2) {
            difference = (t2 + 24 * 60) - t1;
        }
        return difference;
    }

    public Time add(Time anotherTime) {
        int totalMinutes = toMinutes() + anotherTime.toMinutes();
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        return new Time(hours, minutes);
    }

    public int compareTo(Time anotherTime) {
        return this.toMinutes() - anotherTime.toMinutes();
    }

    public boolean equals(Time anotherTime) {
        return this.toMinutes() == anotherTime.toMinutes();
    }

    @Override
    public String toString() {
        // return " hours=" + getHours() + ": minutes=" + getMinutes();
        return String.format("[%02d:%02d]", getHours(), getMinutes());
    }

}