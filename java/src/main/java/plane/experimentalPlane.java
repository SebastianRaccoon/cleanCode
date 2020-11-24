package plane;

import model.ClassificationLevel;
import model.ExperimentalType;

public class ExperimentalPlane extends Plane{

    private ExperimentalType experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType experimentalType, ClassificationLevel classificationLevel) {
        super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object planeForComparison) {
        return super.equals(planeForComparison);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + planeModel + '\'' +
                '}';
    }
}
