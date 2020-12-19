package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class InfoViewActivity extends Activity {

    @Override
    public void onCreate(Bundle SavedInstanceState) {

        super.onCreate(SavedInstanceState);


        Intent myIntent = getIntent();

        int i = myIntent.getIntExtra(MainActivity.EXTRA_RES_ID, 0);


        setContentView(R.layout.info);
        ListView v = (ListView)findViewById(R.id.info);

        ArrayList<Info> info = new ArrayList<>();
        switch(i) {
            case 0:
                info.add(new Info(0,"JOKER","October 4, 2019","122 minutes",
                        "Todd Philips","Joanquin Phoenix","Robert De Niro",
                        "Frances Conroy","8.6/10","68%"));
                break;

            case 1:
                info.add(new Info(0,"KNIVES OUT","November 27, 2019", "130 minutes",
                        "Rian Johnson","Ana de Armas","Christopher Plummer",
                        "Jamie Lee Curtis","8/10","97%"));
                break;

            case 2:
                info.add(new Info(0,"FORD V FERRARI","November 15, 2019","152 minutes",
                        "James Mangold","Matt Damon","Christian Bale","",
                        "8.2/10","92%"));
                break;

            case 3:
                info.add(new Info(0,"DUNKIRK","21 July, 2017","106 minutes",
                        "Christopher Nolan","Fionn Whitehead","Tom Glynn-Carney",
                        "Aneurin Barnard","7.9/10","93%"));
                break;

            case 4:
                info.add(new Info(0,"LA LA LAND","December 9, 2016","128 minutes",
                        "Damien Chazelle","Emma Stone","Ryan Gosling",
                        "John Legend","8/10","91%"));
                break;

            case 5:
                info.add(new Info(0,"MOONLIGHT","October 21, 2016","111 minutes",
                        "Barry Jenkins","Trevante Rhodes","Ashton Sanders",
                        "André Holland","7.4/10","98%"));
                break;

            case 6:
                info.add(new Info(0,"THE INVISIBLE GUEST","6 January, 2017",
                        "106 minutes",
                        "Oriol Paulo","Mario Casas","Bárbara Lennie",
                        "Ana Wagener","8.1/10","67%"));
                break;

            case 7:
                info.add(new Info(0,"INSIDE OUT","June 19, 2015","94 minutes",
                        "Pete Docter","Kaitlyn Dias","Amy Poehler",
                        "Phyllis Smith","8.2/10","98%"));
                break;

            default:
                info.add(new Info(0,"","","","","","",
                        "","",""));

        }
        InfoAdapter adapter = new InfoAdapter(this, info);
        v.setAdapter(adapter);

    }
}