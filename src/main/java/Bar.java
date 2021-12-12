import java.util.List;

public abstract class Bar {


    public abstract boolean isHappyHour();

    public abstract void startHappyHour();

    public abstract void endHappyHour();

    public abstract void addObserver(BarObserver observer);
    public abstract void removeObserver(BarObserver observer);
    public  abstract void notifyObservers();
}
