package plane;

import model.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType militaryType;

    public MilitaryPlane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType militaryType) {
        super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryType = militaryType;
    }

    public MilitaryType getMilitaryType() {
        return militaryType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + militaryType +
                '}');
    }

    @Override
    public boolean equals(Object planeForComparison) {
        if (this == planeForComparison) {
            return true;
        }
        if (!(planeForComparison instanceof MilitaryPlane)) {
            return false;
        }
        if (!super.equals(planeForComparison)) {
            return false;
        }
        MilitaryPlane that = (MilitaryPlane) planeForComparison;
        return militaryType == that.militaryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), militaryType);
    }
}
