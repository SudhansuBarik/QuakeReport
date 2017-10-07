package com.example.android.quakereport;

/**
 * {@link Earthquake} represents a single Earthquake data.
 * Each object has 3 properties: magnitude, location name, and date.
 */
public class Earthquake {

    // Magnitude of the Earthquake
    private double mMagnitude;

    // Location at which the earthquake took place
    private String mLocation;

    // Date on which the earthquake took place
    private long mTimeInMilliseconds;

    /**
     * Website URL of the earthquake
     */
    private String mUrl;

    /**
     * Create new Earthquake objects
     *
     * @param magnitude          is the magnitude of the earthquake (e.g. 4.5)
     * @param location           is the city location where the earthquake took place (e.g. San Fransisco)
     * @param timeInMilliseconds is the time at which the earthquake took place (e.g. 14030124530)
     * @param url                is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // Get the magnitude of the earthquake
    public double getMagnitude() {
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

    // Returns the website URL to find more information about the earthquake.
    public String getUrl() {
        return mUrl;
    }
}
