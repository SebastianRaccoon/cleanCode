// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

import plane.ExperimentalPlane;
import model.MilitaryType;
import plane.MilitaryPlane;
import plane.PassengerPlane;
import plane.Plane;

import java.util.*;



public class Airport {
    private final List<? extends Plane> PlaneList;



    public List<PassengerPlane> getPassengerPlaneList() {
        List<? extends Plane> AllPlaneList = this.PlaneList;
        List<PassengerPlane> PassengerPlaneList = new ArrayList<>();
        for (Plane plane : AllPlaneList) {if (plane instanceof PassengerPlane) {PassengerPlaneList.add((PassengerPlane) plane);}}
        return PassengerPlaneList;
    }

    public List<MilitaryPlane> getMilitaryPlaneList() {
        List<MilitaryPlane> militaryPlaneList = new ArrayList<>();
        for (Plane plane : PlaneList) {
            if (plane instanceof MilitaryPlane) {
                militaryPlaneList.add((MilitaryPlane) plane);
            }
        }
        return militaryPlaneList;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlaneList = getPassengerPlaneList();
        PassengerPlane planeWithMaxCapacity = passengerPlaneList.get(0);
        for (PassengerPlane passengerPlane : passengerPlaneList) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlaneList() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List<MilitaryPlane> militaryPlanes = getMilitaryPlaneList();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getMilitaryType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
    return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlaneList() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlaneList();
        for (MilitaryPlane plane : militaryPlanes) {
            if (plane.getMilitaryType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlaneList() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : PlaneList) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        PlaneList.sort(new Comparator<Plane>() {
            public int compare(Plane firstComparablePlane, Plane secondComparablePlane) {
                return firstComparablePlane.getMaxFlightDistance() - secondComparablePlane.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        PlaneList.sort(new Comparator<Plane>() {
            public int compare(Plane firstComparablePlane, Plane secondComparablePlane) {
                return firstComparablePlane.getMaxSpeed() - secondComparablePlane.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        PlaneList.sort(new Comparator<Plane>() {
            public int compare(Plane firstComparablePlane, Plane secondComparablePlane) {
                return firstComparablePlane.getMinLoadCapacity() - secondComparablePlane.getMinLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlaneList() {
        return PlaneList;
    }

    private void print(Collection<? extends Plane> collection) {
        for (Plane plane : collection) {
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + PlaneList.toString() +
                '}';
    }

    //Constructor
    public Airport(List<? extends Plane> PlaneList) {
        this.PlaneList = PlaneList;
    }

}
