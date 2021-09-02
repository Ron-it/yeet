public class robloc{
    private String username;
    private double robux;
    private boolean old;
    private static double robuxTax = 0.08;

    public robloc() { //empty constructor

    }

    public robloc(String username, double robux, boolean old) {
        this.username = username;
        this.robux = robux;
        this.old = old;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", robux='" + getRobux() + "'" +
            ", old='" + isOld() + "'" +
            "}";
    }


    public static void main(String[] args) {
        robloc fortnite = new robloc("fortnite", 120.0, true);
        System.out.println(fortnite.getUsername());
        
    }
}