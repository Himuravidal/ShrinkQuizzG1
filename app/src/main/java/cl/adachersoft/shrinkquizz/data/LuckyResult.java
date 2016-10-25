package cl.adachersoft.shrinkquizz.data;

/**
 * Created by cristian on 21-10-2016.
 */

public class LuckyResult extends LuckyAnswer {


    public LuckyResult(boolean lucky) {
        super(lucky);

    }

    public String result() {
        return lucky() + " " + day();

    }


    private String lucky() {
        if (isLucky()) {
            return "En hora Buena ¡¡¡";
        } else {
            return "ANIMO ¡¡¡ ";
        }

    }

    private String day() {
        if (isDay()) {
            return "Es tu dia de suerte";
        } else {
            return "Mañana sera Mejor";
        }
    }


}
