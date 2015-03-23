package singleton;

/**
 * Created by Ronan on 23/03/2015.
 */
public class ALonelySingleton {

    private static ALonelySingleton aLonelySingleton = new ALonelySingleton();

    private ALonelySingleton() {

    }

    public static ALonelySingleton getInstance() {
        return aLonelySingleton;
    }
}