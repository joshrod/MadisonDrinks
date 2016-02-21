package joshrod.com.madisondrinks;

/**
 * Created by milagrosjimenez on 1/31/16.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

public class TuesdayList extends Fragment {

    ListAdapter listAdapter;
    ExpandableListView exListView;
    List<String> barsHeader;
    HashMap<String, List<String>> barsChildren;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_tuesday, null);

        exListView = (ExpandableListView) vw.findViewById(R.id.tuesday_list);
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
        bV.add("$5 Martinis All Night");
        bV.add("$3 All Taps");


        List<String> buck = new ArrayList<String>();
        buck.add(getResources().getString(R.string.buck));
        buck.add("$3 Jack and Coke");
        buck.add("$2 PBR Tallboys");

        List<String> bucky = new ArrayList<String>();
        bucky.add(getResources().getString(R.string.buckingham));
        bucky.add("Happy Hour (3pm - 7pm)");
        bucky.add("\t\t\t\t$1 off Regular Food Items");
        bucky.add("\t\t\t\t$.75 off Mixers");
        bucky.add("\t\t\t\t$.50 off Beer Items");
        bucky.add("Night Specials (7pm - close)");
        bucky.add("\t\t\t\t4 Cans of Domestics for $10");
        bucky.add("\t\t\t\t$4.75 Tallboys and Whiskey Shot");
        bucky.add("Hammertime (9:30pm - 11pm)");
        bucky.add("\t\t\t\t$1 Rail Mixers");
        bucky.add("\t\t\t\t$1 Specialty Shots");
        bucky.add("\t\t\t\t$2 Wisconsin Taps");
        bucky.add("\t\t\t\t$2 Specialty Shots");

        List<String> chase = new ArrayList<String>();
        chase.add(getResources().getString(R.string.chasers));
        chase.add("$5 Select Appetizers");
        chase.add("$7 Pitchers");

        List<String> church = new ArrayList<String>();
        church.add(getResources().getString(R.string.church));
        church.add("$2 Bartender's Choice Shot");
        church.add("$2.50 All Taps");
        church.add("$3 Rails");
        church.add("$5 Vodka Redbulls");
        church.add("$5 Domestic Pitchers");

        List<String> city = new ArrayList<String>();
        city.add(getResources().getString(R.string.city));
        city.add("Happy Hour All Day");
        city.add("\t\t\t\t$1 off Everything");
        city.add("Game Night (7pm - close)");
        city.add("\t\t\t\tFree Darts");
        city.add("\t\t\t\tPlay Wii & N64 Systems");

        List<String> dlux = new ArrayList<String>();
        dlux.add("Afternoon Specials (3pm - 6:30pm)");
        dlux.add("\t\t\t\t$2 off Taps and Apps");
        dlux.add("\t\t\t\t$6 Spuds and Sparklers");


        List<String> hawk = new ArrayList<String>();
        hawk.add(getResources().getString(R.string.hawk));
        hawk.add("Beer and Shot Night");
        hawk.add("Get a free shot with your beer!");

        List<String> irish = new ArrayList<String>();
        irish.add(getResources().getString(R.string.irish));
        irish.add("Night Specials (7pm - close)");
        irish.add("\t\t\t\t$3 Flavored Rum and Vodka Drinks");
        irish.add("\t\t\t\t$3 Import Bottles");

        List<String> jordan = new ArrayList<String>();
        jordan.add(getResources().getString(R.string.jordan));
        jordan.add("Happy Hour (3pm - 6pm)");
        jordan.add("\t\t\t\t$2 Domestic Taps");
        jordan.add("\t\t\t\t$3 Micro Taps");
        jordan.add("\t\t\t\t$1 off Bottled Beers");
        jordan.add("\t\t\t\t$.50 off Wine and Mixed Drinks");
        jordan.add("\t\t\t\tDiscounts on Pitchers");
        jordan.add("1/2 Price Burgers (6pm - 9pm)");
        jordan.add("Night Specials (8pm - close)");
        jordan.add("\t\t\t\t$2 Bartender's Choice Shot");
        jordan.add("\t\t\t\t$1 Off Micro Bottles");
        jordan.add("\t\t\t\t$3 Micro Taps");


        List<String> kK = new ArrayList<String>();
        kK.add(getResources().getString(R.string.kk));
        kK.add("Burger Basket Special (6pm - 9pm)");
        kK.add("\t\t\t\t$10 Grilled Cheese/Cheeseburger Basket");
        kK.add("\t\t\t\tBottomless Domestic Taps");
        kK.add("Night Special");
        kK.add("\t\t\t\t2-4-1 Tuesday");

        List<String> lib = new ArrayList<String>();
        lib.add(getResources().getString(R.string.library));
        lib.add("Happy Hour (4pm - 7pm)");
        lib.add("\t\t\t\t$3.25 - $4.25 Taps");
        lib.add("\t\t\t\t$2.50 Rail Mixers");
        lib.add("\t\t\t\t$2.25 Domestics");
        lib.add("$3 Double Rail Mixers");
        lib.add("$2 Domestics (9pm - close)");

        List<String> lucky = new ArrayList<String>();
        lucky.add(getResources().getString(R.string.lucky));
        lucky.add("$1.50 Tacos");
        lucky.add("$3 Chalupas");
        lucky.add("$4 Bomb Shots");
        lucky.add("$3 Captain Mixers");

        List<String> hat = new ArrayList<String>();
        hat.add(getResources().getString(R.string.hat));
        hat.add("$1 Rails and Domestic Taps");

        List<String> mer = new ArrayList<String>();
        mer.add(getResources().getString(R.string.merchant));
        mer.add("Happy Hour (3pm - 6pm)");
        mer.add("\t\t\t\t$2 off Classic Cocktails and Drafts");
        mer.add("\t\t\t\t$2 off Lawnmower Beers");

        List<String> monday = new ArrayList<String>();
        monday.add(getResources().getString(R.string.monday));
        monday.add("$3 Rail Mixed Drinks");
        monday.add("$1 Domestic Taps");
        monday.add("$2 Micro and Import Taps");

        List<String> nitty = new ArrayList<String>();
        nitty.add(getResources().getString(R.string.nitty));
        nitty.add("Night Specials (9pm - close)");
        nitty.add("\t\t\t\t$2.50 Birthday Punch");
        nitty.add("\t\t\t\t$2.50 Captain Mixers");
        nitty.add("Double Power Hour (10 pm - midnight)");
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
        red.add("$5 BBQ Sandwich Baskets All Day");
        red.add("Happy Hour (4pm - 7pm)");
        red.add("\t\t\t\t1/2 off All Taps and Apps");
        red.add("\t\t\t\t$5 Red Rock Signature Drinks");
        red.add("\t\t\t\tFree Bull Rides");
        red.add("Night Specials (10pm - close)");
        red.add("\t\t\t\t$2.50 Shiner and Lonestar");
        red.add("\t\t\t\t$3 Jack Daniels Shots");
        red.add("\t\t\t\t$5 Signature Drinks");

        List<String> shed = new ArrayList<String>();
        shed.add(getResources().getString(R.string.shed));
        shed.add("$2 Domestic Taps");
        shed.add("$2 Nerds");
        shed.add("$2 Rail Drinks");

        List<String> zone = new ArrayList<String>();
        zone.add(getResources().getString(R.string.zone));
        zone.add("Happy Hour (3pm - 7pm)");
        zone.add("\t\t\t\t$1 off Any Drink");
        zone.add("\t\t\t\t$2 off Any Pitchers");

        List<String> brats = new ArrayList<String>();
        brats.add(getResources().getString(R.string.brats));
        brats.add("Flip Night");
        brats.add("Get 75% off if you win the coin toss");

        List<String> tiki = new ArrayList<String>();
        tiki.add(getResources().getString(R.string.tiki));
        tiki.add("Happy Hour (5pm - 7pm)");
        tiki.add("\t\t\t\t1/2 off Appetizers");
        tiki.add("$2 Select Shots");
        tiki.add("$3 Select Bomb Shots");
        tiki.add("$3 Double Vodka Lemonades");

        List<String> vin = new ArrayList<String>();
        vin.add(getResources().getString(R.string.vintage));
        vin.add("All Day Happy Hour");
        vin.add("\t\t\t\t1/2 off All Vintage Brews");
        vin.add("\t\t\t\t$2 Rail Mixers");
        vin.add("$2.50 Fireball Shots (Midnight - Close)");

        List<String> wand = new ArrayList<String>();
        wand.add(getResources().getString(R.string.wando));
        wand.add("All Day Every Day Specials");
        wand.add("\t\t\t\t$3.50 High Life Bottles");
        wand.add("\t\t\t\t$3.50 PBR Bottles");
        wand.add("Bacon Night");
        wand.add("\t\t\t\tFree Bacon");
        wand.add("\t\t\t\t$1.25 Cans of Coors Light & Miller Lite");
        wand.add("\t\t\t\t$4 Jumbo Rail Mixers");
        wand.add("\t\t\t\t$5 Jumbo Tito's Mixers");

        List<String> whiskey = new ArrayList<String>();
        whiskey.add(getResources().getString(R.string.whiskey));
        whiskey.add("Happy Hour (3pm - 7pm)");
        whiskey.add("\t\t\t\t$1 off all Taps");
        whiskey.add("\t\t\t\t$2 Rail Drinks");
        whiskey.add("\t\t\t\t$3 Call Drinks");
        whiskey.add("Tallboy Tuesday (9pm - close)");
        whiskey.add("\t\t\t\t$2 Tallboys");
        whiskey.add("\t\t\t\t2-4-1 Avion Shots");
        whiskey.add("\t\t\t\t$4 Crown and Malibu Mixers");

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