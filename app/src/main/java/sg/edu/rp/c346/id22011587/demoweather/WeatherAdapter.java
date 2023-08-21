package sg.edu.rp.c346.id22011587.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    private Context context;
    private ArrayList<Weather> weatherList;

    public WeatherAdapter( Context context, ArrayList<Weather> weatherList) {
        super(context, 0, weatherList);
        this.context = context;
        this.weatherList = weatherList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        }

        Weather currentWeather = weatherList.get(position);

        TextView areaTextView = listItemView.findViewById(R.id.tvArea);
        areaTextView.setText(currentWeather.getArea());

        TextView forecastTextView = listItemView.findViewById(R.id.tvForecast);
        forecastTextView.setText(currentWeather.getForecast());

        return listItemView;
    }
}
