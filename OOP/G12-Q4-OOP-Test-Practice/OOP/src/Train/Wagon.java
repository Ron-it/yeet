package Train;

public class Wagon extends RollingStock {
    private Parcel[] mParcels;
    private int mParcelCount;

    public Wagon(int ID) {
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new Parcel[100];
        mParcelCount = 0;
    }

    // Accessor methods
    public int getWagonID() {
        return this.getID();
    }

    public double getWeight() {
        double totalWeight = super.getWeight();
        for (int i = 0; i < mParcelCount; i++) {
            double ParcelWeight = mParcels[i].getWeight();
            totalWeight = ParcelWeight + totalWeight;
        }
        return totalWeight;

    }

    public void addParcel(Parcel newParcel) {
        mParcels[mParcelCount] = newParcel;
        mParcelCount++;

    }
}
