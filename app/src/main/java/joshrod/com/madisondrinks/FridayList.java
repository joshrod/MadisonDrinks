package joshrod.com.madisondrinks;

/**
 * Created by milagrosjimenez on 1/31/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class FridayList extends Fragment {

    ListAdapter listAdapter;
    ExpandableListView exListView;
    List<String> barsHeader;
    HashMap<String, List<String>> barsChildren;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_friday, null);

        exListView = (ExpandableListView) vw.findViewById(R.id.friday_list);
        prepareList();

        listAdapter = new ListAdapter(getActivity(), barsHeader, barsChildren);

        exListView.setAdapter(listAdapter);
        return vw;
    }


    private void prepareList() {
        barsHeader = new ArrayList<String>();
        barsChildren = new HashMap<String, List<String>>();

        //add Header data
        barsHeader.add("Blue Velvet Lounge");
        barsHeader.add("Buck and Badger");
        barsHeader.add("Buckingham's");
        barsHeader.add("Chaser's");
        barsHeader.add("Church Key");
        barsHeader.add("City Bar");
        barsHeader.add("DLUX");
        barsHeader.add("Hawk's");
        barsHeader.add("Irish Pub");
        barsHeader.add("Jordan's Big Ten");
        barsHeader.add("The Kollege Klub");
        barsHeader.add("The Library");
        barsHeader.add("Lucky's");
        barsHeader.add("MadHatter's");
        barsHeader.add("Merchant");
        barsHeader.add("Monday's");
        barsHeader.add("Nitty Gritty");
        barsHeader.add("Paul's Club");
        barsHeader.add("Red Rock Saloon");
        barsHeader.add("Red Shed");
        barsHeader.add("The Red Zone");
        barsHeader.add("State Street Brats");
        barsHeader.add("Tiki Shack");
        barsHeader.add("Vintage");
        barsHeader.add("Wando's");
        barsHeader.add("Whiskey Jack's");

        //add Child data
        List<String> bV = new ArrayList<String>();
        bV.add(getResources().getString(R.string.bv));
        bV.add("$5 Martinis until 9pm");
        bV.add("$3 Shot Special");

        List<String> buck = new ArrayList<String>();
        buck.add(getResources().getString(R.string.buck));
        buck.add("$4 MobCraft Buck and Badger Brew");
        buck.add("$4 Apple Buck");
        buck.add("$14 Pie Shotskis");

        List<String> bucky = new ArrayList<String>();
        bucky.add(getResources().getString(R.string.buckingham));
        bucky.add("Happy Hour (3pm - 7pm)");
        bucky.add("\t\t\t\t$1 off Regular Food Items");
        bucky.add("\t\t\t\t$.75 off Mixers");
        bucky.add("\t\t\t\t$.50 off Beer Items");
        bucky.add("Night Specials (7pm - close)");
        bucky.add("\t\t\t\t$1 Off All Brands of Whiskey");
        bucky.add("Extended Hammertime (9pm - 11:30pm)");
        bucky.add("\t\t\t\t$1 Rail Mixers");
        bucky.add("\t\t\t\t$1 Specialty Shots");
        bucky.add("\t\t\t\t$2 Wisconsin Taps");
        bucky.add("\t\t\t\t$2 Specialty Bombs");

        List<String> chase = new ArrayList<String>();
        chase.add(getResources().getString(R.string.chasers));
        chase.add("3-4-$5 Fish Tacos");
        chase.add("Wheel-N-Deal");
        chase.add("(New Special Every 30 Minutes)");

        List<String> church = new ArrayList<String>();
        church.add(getResources().getString(R.string.church));
        church.add("Friday After Class (2pm - 9pm)");
        church.add("\t\t\t\t$2 Taps");
        church.add("\t\t\t\t$2.50 Rails");
        church.add("\t\t\t\t$3 Domestic Pitchers");
        church.add("Progressive Coors Light Pitchers Starting at $3");
        church.add("$2.50 PBR Tallboys or Taps");
        church.add("$5 Jumbo Captain Mixers");
        church.add("$5 Jumbo Long Islands");

        List<String> city = new ArrayList<String>();
        city.add(getResources().getString(R.string.city));
        city.add("Happy Hour (3pm - 7pm)");
        city.add("\t\t\t\t$1 off Everything");
        city.add("Night Specials (7pm - close)");
        city.add("\t\t\t\t$3 Cans of PBR");
        city.add("\t\t\t\t$4 Tito's Vodka Mixers");

        List<String> dlux = new ArrayList<String>();
        dlux.add(getResources().getString(R.string.dlux));
        dlux.add("NONE");

        List<String> hawk = new ArrayList<String>();
        hawk.add("NONE");

        List<String> irish = new ArrayList<String>();
        irish.add(getResources().getString(R.string.irish));
        irish.add("Night Specials (7pm - close)");
        irish.add("\t\t\t\t$4 Flavored Vodka or Rum Bombs");
        irish.add("\t\t\t\t$5 Irish Car Bombs");

        List<String> jordan = new ArrayList<String>();
        jordan.add(getResources().getString(R.string.jordan));
        jordan.add("Triple Happy Hour (3pm - 6pm)");
        jordan.add("\t\t\t\t$2 Domestic Taps");
        jordan.add("\t\t\t\t$3 Micro Taps");
        jordan.add("\t\t\t\t$1 off Bottled Beer");
        jordan.add("\t\t\t\t$.50 off Wine and Mixed Drinks");
        jordan.add("Half Time Happy Hour (6pm - 10pm)");
        jordan.add("\t\t\t\t$3 Deep Eddy Vodka Mixers");
        jordan.add("\t\t\t\t$18 Bottles of Wine");
        jordan.add("Late Night Happy Hour (10pm - midnight)");
        jordan.add("\t\t\t\t$2 Domestic Taps");
        jordan.add("\t\t\t\t$3 Micro Taps");
        jordan.add("\t\t\t\t$1 off Bottled Beer");

        List<String> kK = new ArrayList<String>();
        kK.add(getResources().getString(R.string.kk));
        kK.add("Friday After Class (2pm - 8pm)");
        kK.add("\t\t\t\t2-4-1 Domestic Taps or Rail Mixers");
        kK.add("\t\t\t\t$1 Grilled Cheese");
        kK.add("Night Specials");
        kK.add("\t\t\t\t$4.50 Long Islands");
        kK.add("\t\t\t\t$4.50 Jack Mixers");
        kK.add("\t\t\t\t$4.50 Three Olives Mixers");

        List<String> lib = new ArrayList<String>();
        lib.add(getResources().getString(R.string.library));
        lib.add("Happy Hour (4pm - 7pm)");
        lib.add("\t\t\t\t$3.25 - $4.25 Taps");
        lib.add("\t\t\t\t$2.50 Rail Mixers");
        lib.add("\t\t\t\t$2.25 Domestics");
        lib.add("$3.25 Long Islands");
        lib.add("$2 Domestics (9pm - close)");

        List<String> lucky = new ArrayList<String>();
        lucky.add(getResources().getString(R.string.lucky));
        lucky.add("$2.75 Miller Light or Coors Light Bottles");
        lucky.add("$3 Deep Eddy Vodka Mixers");

        List<String> hat = new ArrayList<String>();
        hat.add(getResources().getString(R.string.hat));
        hat.add("$5 Domestic Pitchers (8pm - midnight)");
        hat.add("$3 Fireball Shots");
        hat.add("$2 Kamikaze, Red Headed Slut, & Lemon Drop Shots");
        hat.add("$3 Apple Pie Shots");

        List<String> mer = new ArrayList<String>();
        mer.add(getResources().getString(R.string.merchant));
        mer.add("Happy Hour (3pm - 6pm)");
        mer.add("\t\t\t\t$2 off Classic Cocktails and Drafts");
        mer.add("\t\t\t\t$2 off Lawnmower Beers");

        List<String> monday = new ArrayList<String>();
        monday.add(getResources().getString(R.string.monday));
        monday.add("$1 Domestic Taps");
        monday.add("$2 Import and Micro Taps");
        monday.add("$3.50 Vodka Lemonade");

        List<String> nitty = new ArrayList<String>();
        nitty.add(getResources().getString(R.string.nitty));
        nitty.add("Night Specials (9pm - close)");
        nitty.add("\t\t\t\t2-4-1 Bud Light or Bud Bottles");
        nitty.add("\t\t\t\t$3 Tullamore Shots");
        nitty.add("Power Hour (10pm - 11pm)");
        nitty.add("\t\t\t\t$1.25 Rail Mixers");
        nitty.add("\t\t\t\t$1 High Life Taps");
        nitty.add("\t\t\t\t$2.25 Bomb Shots");
        nitty.add("Late Night Specials (11pm - close)");
        nitty.add("\t\t\t\t$4 High Life Pitchers");
        nitty.add("\t\t\t\t$2.50 Three Olives Mixers");
        nitty.add("\t\t\t\t$3 Milagro Shots");

        List<String> paul = new ArrayList<String>();
        paul.add(getResources().getString(R.string.paul));
        paul.add("$2 Mystery Shots");
        paul.add("$3 Labatt Blues");

        List<String> red = new ArrayList<String>();
        red.add(getResources().getString(R.string.rock));
        red.add("Happy Hour (4pm - 7pm)");
        red.add("\t\t\t\t1/2 off All Taps and Apps");
        red.add("\t\t\t\t$5 Red Rock Signature Drinks");
        red.add("\t\t\t\tFree Bull Rides");
        red.add("Live Country Bands Every Friday");
        red.add("Night Specials (10pm - close)");
        red.add("\t\t\t\t$7 Jack Daniels Doubles");

        List<String> shed = new ArrayList<String>();
        shed.add(getResources().getString(R.string.shed));
        shed.add("NONE");

        List<String> zone = new ArrayList<String>();
        zone.add(getResources().getString(R.string.zone));
        zone.add("Happy Hour (3pm - 7pm)");
        zone.add("\t\t\t\t$1 off Any Drink");
        zone.add("\t\t\t\t$2 off Any Pitchers");

        List<String> brats = new ArrayList<String>();
        brats.add(getResources().getString(R.string.brats));
        brats.add("Progressive Fridays");
        brats.add("\t\t\t\t5 for $5 (9pm - 10pm)");
        brats.add("\t\t\t\t4 for $5 (10pm - 11pm)");
        brats.add("\t\t\t\t3 for $5 (11pm - midnight)");
        brats.add("$6 Tullamore Dew and Absolut Double Mixers");

        List<String> tiki = new ArrayList<String>();
        tiki.add(getResources().getString(R.string.tiki));
        tiki.add("Happy Hour (5pm - 7pm)");
        tiki.add("\t\t\t\t1/2 off Appetizers");
        tiki.add("2-4-1 Rum Punches");
        tiki.add("$2 Select Shots");
        tiki.add("$3 Select Bomb Shots");
        tiki.add("$3 Double Vodka Lemonades");

        List<String> vin = new ArrayList<String>();
        vin.add(getResources().getString(R.string.vintage));
        vin.add("Happy Hour (3pm - 8pm)");
        vin.add("\t\t\t\t1/2 off all Vintage Brews");
        vin.add("\t\t\t\t$2 Rail Mixers");
        vin.add("Night Specials (8pm - close)");
        vin.add("\t\t\t\t$1 off Vintage Brews");
        vin.add("$2.50 Fireball Shots (midnight - close)");

        List<String> wand = new ArrayList<String>();
        wand.add(getResources().getString(R.string.wando));
        wand.add("All Day Every Day Specials");
        wand.add("\t\t\t\t$3.50 High Life Bottles");
        wand.add("\t\t\t\t$3.50 PBR Bottles");
        wand.add("$6 Jumbo Three Olives Mixers");

        List<String> whiskey = new ArrayList<String>();
        whiskey.add(getResources().getString(R.string.whiskey));
        whiskey.add("Happy Hour (3pm - 7pm)");
        whiskey.add("\t\t\t\t$1 off all Taps");
        whiskey.add("\t\t\t\t$2 Rail Drinks");
        whiskey.add("\t\t\t\t$3 Call Drinks");

        barsChildren.put(barsHeader.get(0), bV); //Header and Child
        barsChildren.put(barsHeader.get(1), buck);
        barsChildren.put(barsHeader.get(2), bucky);
        barsChildren.put(barsHeader.get(3), chase);
        barsChildren.put(barsHeader.get(4), church);
        barsChildren.put(barsHeader.get(5), city);
        barsChildren.put(barsHeader.get(6), dlux);
        barsChildren.put(barsHeader.get(7), hawk);
        barsChildren.put(barsHeader.get(8), irish);
        barsChildren.put(barsHeader.get(9), jordan);
        barsChildren.put(barsHeader.get(10), kK);
        barsChildren.put(barsHeader.get(11), lib);
        barsChildren.put(barsHeader.get(12), lucky);
        barsChildren.put(barsHeader.get(13), hat);
        barsChildren.put(barsHeader.get(14), mer);
        barsChildren.put(barsHeader.get(15), monday);
        barsChildren.put(barsHeader.get(16), nitty);
        barsChildren.put(barsHeader.get(17), paul);
        barsChildren.put(barsHeader.get(18), red);
        barsChildren.put(barsHeader.get(19), shed);
        barsChildren.put(barsHeader.get(20), zone);
        barsChildren.put(barsHeader.get(21), brats);
        barsChildren.put(barsHeader.get(22), tiki);
        barsChildren.put(barsHeader.get(23), vin);
        barsChildren.put(barsHeader.get(24), wand);
        barsChildren.put(barsHeader.get(25), whiskey);
    }
}