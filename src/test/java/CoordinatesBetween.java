import org.junit.jupiter.api.Test;

import static java.awt.geom.Point2D.distance;

public class CoordinatesBetween {

    @Test
    public void coordinatesBetweenPoints() {

        // New York
        double lat1 = 40.7128;
        double lon1 = 74.0059;

        // London
        double lat2 = 51.5074;
        double lon2 = 0.1278;

        System.out.println("Distance: " + distance(lat1, lon1, lat2, lon2));
    }

    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        //double earthRadius = 6371.01; //Kilometers
        double earthRadius = 3959; // Miles
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

}
