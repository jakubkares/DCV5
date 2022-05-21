package ukol;

public class PlantException extends Exception {
    public void exception(int frequency) {
        if (frequency < 0 ){
            System.out.println("uschne vam kytka");
        }
    }
}
