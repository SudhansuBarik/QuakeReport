package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*
* {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Earthquake} objects.
*/
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context     of the app
     * @param earthquakes is the list of earthquakes which is the data source of the adapter
     */
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        //Get the {@link Earthquake} object at this position in the list
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView in the earthquake_list_item.xmlst_item.xml layout with the ID magnitude_text_view
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the magnitude TextView
        magnitudeTextView.setText(currentEarthquake.getMagnitude());

        // Find the TextView in the earthquake_list_item.xmlst_item.xml layout with the ID place_text_view
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the location TextView
        placeTextView.setText(currentEarthquake.getLocation());

        /**
         * To convert time in mili-seconds into a read-able format
         */
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        // Find the TextView in the earthquake_list_iteme_list_item.xml layout with the ID date_text_view
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        dateTextView.setText(formatDate(dateObject));

        // Find the TextView in the earthquake_list_iteme_list_item.xml layout with the ID time_text_view
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);
        timeTextView.setText(formatTime(dateObject));

        // Return the whole earthquake_list_item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss a");
        return timeFormat.format(dateObject);
    }
}
