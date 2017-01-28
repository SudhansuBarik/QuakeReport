package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a single Earthquake data.
 * Each object has 3 properties: magnitude, location name, and date.
 */
public class Earthquake {

    // Magnitude of the Earthquake
    private String mMagnitude;

    // Location at which the earthquake took place
    private String mLocation;

    // Date on which the earthquake took place
    private long mTimeInMilliseconds;

    /**
     * Create new Earthquake objects
     *
     * @param magnitude is the magnitude of the earthquake (e.g. 4.5)
     * @param location  is the city location where the earthquake took place (e.g. San Fransisco)
     * @param timeInMilliseconds     is the time at which the earthquake took place (e.g. 14030124530)
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    // Get the magnitude of the earthquake
    public String getMagnitude() {
        return mMagnitude;
    }

    // Get the location of the earthquake
    public String getLocation() {
        return mLocation;
    }

    // Get the date of the earthquake
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
