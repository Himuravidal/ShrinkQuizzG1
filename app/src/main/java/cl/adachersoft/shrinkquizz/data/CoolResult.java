package cl.adachersoft.shrinkquizz.data;

/**
 * Created by cristian on 19-10-2016.
 */

public class CoolResult extends CoolAnswer {


    public CoolResult(String user, boolean party, int drinks) {
        super(user, party, drinks);
    }

    public String result() {
        return getUser()+ " "+ party() + " "+ drinks();
    }

    private String party() {

        if (isParty()) {
            return "Eres un Salvaje";
        } else
            return "Vaya Nena";
    }

    private String drinks(){
        if (getDrinks()<=4 ){
            return "Bebes ccn moderacion";
        }
        else if (getDrinks()>=5 && getDrinks()<=8){
            return "Bebes como un Cosaco";
        }
        else{
            return "Bebes como orilla de playa";
        }
    }


}

