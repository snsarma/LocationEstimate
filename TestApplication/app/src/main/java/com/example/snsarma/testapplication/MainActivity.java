package com.example.snsarma.testapplication;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override

    public void onCreate(Bundle savedInstanceState)

    {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


/* Use the LocationManager class to obtain GPS locations */

        LocationManager mlocManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        MyLocationListener mlocListener = new MyLocationListener();

        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
//                public void requestPermissions(@NonNull String[] permissions, int requestCode)
//             here to request the missing permissions, and then overriding
//               public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                                                      int[] grantResults)
//             to handle the case where the user grants the permission. See the documentation
//             for Activity#requestPermissions for more details.
            return;
        } else {
            try {
                mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1, 0, mlocListener);
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }


/* Class My Location Listener */

    public class MyLocationListener implements LocationListener

    {

        @Override

        public void onLocationChanged(Location loc)

        {

            double latitude;
            double longitude;

            latitude = loc.getLatitude();
            longitude = loc.getLongitude();

            double latitude1;
            double longitude1;

            latitude1 = latitude + 0.5;
            longitude1 = longitude + 0.5;


            double latitude2;
            double longitude2;

            latitude2 = latitude + 1.0;
            longitude2 = longitude + 1.0;


            double latitude3;
            double longitude3;

            latitude3 = latitude + 1.5;
            longitude3 = longitude + 1.5;


            double latitude4;
            double longitude4;

            latitude4 = latitude + 2.0;
            longitude4 = longitude + 2.0;


            double latitude5;
            double longitude5;

            latitude5 = latitude + 2.5;
            longitude5 = longitude + 2.5;


            double latitude6;
            double longitude6;

            latitude6 = latitude + 3.0;
            longitude6 = longitude + 3.0;

            double radius = Math.pow((latitude1 - latitude),2) * Math.pow((longitude1 - longitude),2);
            double radius1 = Math.pow((latitude2 - latitude1),2) * Math.pow((longitude2 - longitude1),2);
            double totalRadius = radius + radius1;
            double commRange = 1 + (Math.sqrt(2)* totalRadius);



                if(longitude1 < longitude2){
                 double downOlatitude = latitude1;
                 double downOlongitude = longitude1;

                }
                else{

                    double downOlatitude = latitude1;
                    double downOlongitude = longitude1;

                }

            if(latitude1 < latitude2){
                double downOlatitude = latitude1;
                double downOlongitude = longitude1;

            }
            else{

                double downOlatitude = latitude1;
                double downOlongitude = longitude1;

            }
            double latitudewithoutGPS;
            double longitudewithoutGPS;

            latitudewithoutGPS = (latitude + latitude1)/2 ;
            longitudewithoutGPS = (longitude + longitude1)/2;


            String Text = null;
            String Text1 = null;
            String Text2 = null;
            String Text3 = null;
            String Text4 = null;
            String Text5 = null;
            String Text6 = null;
            String Text7 = null;
            String Text8 = null;
            String Text9 = null;
            String Text10 = null;
            String Text11 = null;




            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
                Text = "My current location is: " +

                        "Latitude = " + latitude +
                        "Longitude = " + loc.getLongitude()+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();

                Text1 = "My updated location is: " +

                        "Latitude = " + latitude1 +

                        "Longitude = " + longitude1+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();

                Text2 = "My updated location is: " +

                        "Latitude = " + latitude2 +
                        "Longitude = " + longitude2+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();


                Text3 = "My updated location is: " +

                        "Latitude = " + latitude3 +
                        "Longitude = " + longitude3+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();


                Text4 = "My updated location is: " +

                        "Latitude = " + latitude4 +
                        "Longitude = " + longitude4+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();


                Text5 = "My updated location is: " +

                        "Latitude = " + latitude5 +
                        "Longitude = " + longitude5+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();


                Text6 = "My updated location is: " +

                        "Latitude = " + latitude6 +
                        "Longitude = " + longitude6+
                        "Accuracy= "+loc.getAccuracy()+
                        "Altitude= "+loc.getAltitude()+
                        "Provider:"+loc.getProvider()+
                        "Elapsed Time:"+loc.getElapsedRealtimeNanos();

                Text7 = "Radius is:"+radius;
                Text8 = "Secondary Radius is:"+radius1;
                Text9 = "Complete Radius :"+totalRadius;
                Text10 = "Communication Range :"+commRange;

                Text11 = "LatitudewithoutGPS:"+latitudewithoutGPS+
                          "LongitudewithoutGPS:"+longitudewithoutGPS;



            }


            Toast.makeText( getApplicationContext(),

                    Text,

                    Toast.LENGTH_SHORT).show();


            Toast.makeText( getApplicationContext(),

                    Text1,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text2,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text3,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text4,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text5,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text6,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text7,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text8,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text9,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text10,

                    Toast.LENGTH_SHORT).show();

            Toast.makeText( getApplicationContext(),

                    Text11,

                    Toast.LENGTH_SHORT).show();
        }


        @Override

        public void onProviderDisabled(String provider)

        {

            Toast.makeText( getApplicationContext(),

                    "Gps Disabled",

                    Toast.LENGTH_SHORT ).show();

        }


        @Override

        public void onProviderEnabled(String provider)

        {

            Toast.makeText( getApplicationContext(),

                    "Gps Enabled",

                    Toast.LENGTH_SHORT).show();

        }


        @Override

        public void onStatusChanged(String provider, int status, Bundle extras)

        {


        }

    }/* End of Class MyLocationListener */

}/* End of UseGps Activity */