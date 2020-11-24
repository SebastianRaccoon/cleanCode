package plane;

import java.util.Objects;

abstract public class Plane {
    String planeModel;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    public Plane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.planeModel = planeModel;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMinLoadCapacity() {
        return this.maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + planeModel + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object planeForComparison) {
        if (this == planeForComparison) return true;
        if (!(planeForComparison instanceof Plane)) return false;
        Plane plane = (Plane) planeForComparison;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(planeModel, plane.planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
