package Train;

public class Train {
    private Engine[] mEngines;
    private Wagon[] mWagons;
    private int mEngineCount;
    private int mWagonCount;
    private int mTrainNumber;
    private double mWeight; // Total weight in kilograms

    public Train(int number) {
        mTrainNumber = number;
        mEngines = new Engine[6]; // The train can have up to 6 engines
        mEngineCount = 0;
        mWagons = new Wagon[100]; // The train can have up to 100 wagons
        mWagonCount = 0;
        mWeight = 0;
    }

    public void addEngine(Engine newEngine) {
        mEngines[mEngineCount] = newEngine;
        mEngineCount++;
    }

    public Engine removeEngine() {
        mEngineCount--;
        return mEngines[mEngineCount];
    }

    public void addWagon(Wagon newWagon) {
        mWagons[mWagonCount] = newWagon;
        mWagonCount++;
    }

    public Wagon removeWagon() {
        if (mWagonCount == 0) {
            return null;
        } else {
            mWagonCount--;
            return mWagons[mWagonCount];
        }
    }

    public double getWeight() {
        double wagonWeight = 0;
        double totalWeight = 0;
        double engineWeight = 0;
        for (int i = 0; i < mWagonCount; i++) {
            wagonWeight += mWagons[i].getWeight();
        }
        for (int i = 0; i < mEngineCount; i++) {
            engineWeight += mEngines[i].getWeight();
        }
        totalWeight = wagonWeight + engineWeight;
        return totalWeight;
    }
}
