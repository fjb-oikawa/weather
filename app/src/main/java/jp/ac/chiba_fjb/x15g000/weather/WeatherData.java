package jp.ac.chiba_fjb.x15g000.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Created by oikawa on 2017/06/15.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class WeatherData {
    public Date publicTime;
    public String title;

    public static class Description{
        public String text;
        public Date publicTime;
    }
    public Description description;
    public String link;
    public static class Forecasts{
        public String dateLabel;
        public String telop;
        public Date date;
        public static class Temperature{
            public static class A{
                public int celsius;
                public double fahrenheit;
            }
            public A min;
            public A max;
        }
        public Temperature temperature;
        public static class Image{
            public int width;
            public int height;
            public String title;
            public String url;
        }
        public Image image;
    }
    public Forecasts[] forecasts;
}
