package cl.adachersoft.shrinkquizz.data;

import android.content.Context;

/**
 * Created by cristian on 24-10-2016.
 */

public class MatchAnswer {


    private String name, loverName, quarter;
    private Context context;

    public String getName() {
        return name;
    }

    public String getLoverName() {
        return loverName;
    }

    public String getQuarter() {
        return quarter;
    }

    public Context getContext() {
        return context;
    }

    public MatchAnswer(String name, String loverName, String quarter, Context context) {
        this.name = name;
        this.loverName = loverName;
        this.quarter = quarter;
        this.context = context;
    }
}
