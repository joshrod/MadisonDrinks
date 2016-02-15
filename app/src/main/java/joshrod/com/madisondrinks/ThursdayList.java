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

public class ThursdayList extends Fragment {

    ListAdapter listAdapter;
    ExpandableListView exListView;
    List<String> barsHeader;
    HashMap<String, List<String>> barsChildren;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vw = inflater.inflate(R.layout.fragment_thursday, null);

        exListView = (ExpandableListView) vw.findViewById(R.id.thursday_list);
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
        bV.add("Badger Latin Night");
        bV.add("\t\t\t\t$2 Rails & Domestics");
        bV.add("\t\t\t\t$3 Dos Equis");
        bV.add("\t\t\t\t2 Camarena Shots for $5");
        bV.add("\t\t\t\t(Specials valid until midnight)");

        List<String> buck = new ArrayList<String>();
        buck.add(getResources().getString(R.string.buck));
        buck.add("$3 Moose Drool");
        buck.add("$2.50 Miller Lite Can");

        List<String> bucky = new ArrayList<String>();
        bucky.add(getResources().getString(R.string.buckingham));
        bucky.add("Happy Hour (3pm - 7pm)");
        bucky.add("\t\t\t\t$1 off Regular Food Items");
        bucky.add("\t\t\t\t$.75 off Mixers");
        bucky.add("\t\t\t\t$.50 off Beer Items");
        bucky.add("Night Specials (7pm - close)");
        bucky.add("\t\t\t\t4 Aluminum Pints for $12");
        bucky.add("Extended Hammertime (9pm - 11:30pm)");
        bucky.add("\t\t\t\t$1 Rail Mixers");
        bucky.add("\t\t\t\t$1 Specialty Shots");
        bucky.add("\t\t\t\t$2 Wisconsin Taps");
        bucky.add("\t\t\t\t$2 Specialty Bombs");

        List<String> chase = new ArrayList<String>();
        chase.add(getResources().getString(R.string.chasers));
        chase.add("$5 Burgers");
        chase.add("$7 Pitchers");

        List<String> church = new ArrayList<String>();
        church.add(getResources().getString(R.string.church));
        church.add("All Day Happy Hour (11am - 7pm)");
        church.add("\t\t\t\t$2.50 Taps");
        church.add("\t\t\t\t$2.50 Rails");
        church.add("$3 Bud Light Pitchers (7pm - midnight)");
        church.add("$3 Bartender's Choice Shot");
        church.add("$3 Svedka Mixers");
        church.add("$3.50 All Taps");
        church.add("$4 Jameson Mixers");

        List<String> city = new ArrayList<String>();
        city.add(getResources().getString(R.string.city));
        city.add("$3 Pints/$9 Pitchers of Every Beer");
        city.add("(Does Not Include Beer of the Moment)");

        List<String> dlux = new ArrayList<String>();
        dlux.add(getResources().getString(R.string.dlux));
        dlux.add("NONE");

        List<String> hawk = new ArrayList<String>();
        hawk.add(getResources().getString(R.string.hawk));
        hawk.add("$3 Long Islands");

        List<String> irish = new ArrayList<String>();
        irish.add(getResources().getString(R.string.irish));
        irish.add("Night Specials (7pm - close)");
        irish.add("\t\t\t\t$2.50 Rail Mixers");
        irish.add("\t\t\t\t$2.50 Domestic Bottles");
        irish.add("\t\t\t\t$2.50 Miller Lite and Esser's Best");
        irish.add("\t\t\t\t$3.50 Micro Pints");
        irish.add("\t\t\t\t$4 Import Pints");

        List<String> jordan = new ArrayList<String>();
        jordan.add(getResources().getString(R.string.jordan));
        jordan.add("Happy Hour (3pm - 6pm)");
        jordan.add("\t\t\t\t$2 Domestic Taps");
        jordan.add("\t\t\t\t$3 Micro Taps");
        jordan.add("\t\t\t\t$1 off Bottled Beers");
        jordan.add("\t\t\t\t$.50 off Wine and Mixed Drinks");
        jordan.add("\t\t\t\tDiscounts on Pitchers");
        jordan.add("$.65 Wing Night");
        jordan.add("Night Specials (8pm - close)");
        jordan.add("\t\t\t\t$2 Smirnoff Sour Shots");
        jordan.add("\t\t\t\t$3 Swamp Waters");
        jordan.add("\t\t\t\t$5 Jack Daniels Mixers");
        jordan.add("\t\t\t\t$1.50 Domestic Taps");
        jordan.add("\t\t\t\t$2.50 Spotted Cow or Capital Taps");

        List<String> kK = new ArrayList<String>();
        kK.add(getResources().getString(R.string.kk));
        kK.add("Burger Basket Special (6pm - 9pm)");
        kK.add("\t\t\t\t$10 Grilled Cheese/Cheeseburger Basket");
        kK.add("\t\t\t\tBottomless Domestic Taps");
        kK.add("Night Specials");
        kK.add("\t\t\t\t$2 Miller Lite or Bud Light Aluminums");
        kK.add("\t\t\t\t$3 Fireball or Terramoto Shots");
        kK.add("\t\t\t\t$4 Double Tito's, Jack, or Captain Mixers");

        List<String> lib = new ArrayList<String>();
        lib.add(getResources().getString(R.string.library));
        lib.add("Happy Hour (4pm - 7pm)");
        lib.add("\t\t\t\t$3.25 - $4.25 Taps");
        lib.add("\t\t\t\t$2.50 Rail Mixers");
        lib.add("\t\t\t\t$2.25 Domestics");
        lib.add("$3 Kraken and Mount Gay Mixers");
        lib.add("$2 Domestics (9pm - close)");

        List<String> lucky = new ArrayList<String>();
        lucky.add(getResources().getString(R.string.lucky));
        lucky.add("$1 Taps of Bud Light");
        lucky.add("$3 Long Island Iced Teas");
        lucky.add("$3 Doctor Shots");
        lucky.add("$1 Corn Dogs");

        List<String> hat = new ArrayList<String>();
        hat.add(getResources().getString(R.string.hat));
        hat.add("$2 Long Islands");
        hat.add("$3 Fireball Shots");
        hat.add("$5 Domestic Pitchers (9pm - Midnight)");

        List<String> mer = new ArrayList<String>();
        mer.add(getResources().getString(R.string.merchant));
        mer.add("Happy Hour (3pm - 6pm)");
        mer.add("\t\t\t\t$2 off Classic Cocktails and Drafts");
        mer.add("\t\t\t\t$2 off Lawnmower Beers");
        mer.add("$3 Taps after 9pm");

        List<String> monday = new ArrayList<String>();
        monday.add(getResources().getString(R.string.monday));
        monday.add("$1 Domestic Taps");
        monday.add("$2 Import and Micro Taps");
        monday.add("$3.50 Vodka Lemonade");

        List<String> nitty = new ArrayList<String>();
        nitty.add(getResources().getString(R.string.nitty));
        nitty.add("Night Specials (9pm - close)");
        nitty.add("\t\t\t\t1/2 off all Craft Beer & Craft Cocktails");
        nitty.add("\t\t\t\t1/2 off Specialty Shots");
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
        red.add("Free Beer at 9pm Until the Keg Runs Out");
        red.add("Night Specials (10pm - close)");
        red.add("\t\t\t\t$2 Bud Light");
        red.add("\t\t\t\t$3 Shots");
        red.add("\t\t\t\t$4 Double Rails");
        red.add("Beer Pong at 10pm");

        List<String> shed = new ArrayList<String>();
        shed.add(getResources().getString(R.string.shed));
        shed.add("$2 Bud Light Pints");
        shed.add("$2.50 Bacardi High Balls");

        List<String> zone = new ArrayList<String>();
        zone.add(getResources().getString(R.string.zone));
        zone.add("Happy Hour (3pm - 7pm)");
        zone.add("\t\t\t\t$1 off Any Drink");
        zone.add("\t\t\t\t$2 off Any Pitchers");
        zone.add("Trivia Night");

        List<String> brats = new ArrayList<String>();
        brats.add(getResources().getString(R.string.brats));
        brats.add("Progressive Night for Rail Mixers");
        brats.add("\t\t\t\t5 for $5 (9pm - 10pm)");
        brats.add("\t\t\t\t4 for $5 (10pm - 11pm)");
        brats.add("\t\t\t\t3 for $5 (11pm - midnight)");
        brats.add("\t\t\t\t2 for $5 (midnight - close)");

        List<String> tiki = new ArrayList<String>();
        tiki.add(getResources().getString(R.string.tiki));
        tiki.add("Happy Hour (5pm - 7pm)");
        tiki.add("\t\t\t\t1/2 off Appetizers");
        tiki.add("2-4-1 Mai Tais");
        tiki.add("$2 Select Shots");
        tiki.add("$3 Select Bomb Shots");
        tiki.add("$3 Double Vodka Lemonades");

        List<String> vin = new ArrayList<String>();
        vin.add(getResources().getString(R.string.vintage));
        vin.add("Happy Hour (3pm - 8pm)");
        vin.add("\t\t\t\t1/2 off all Vintage Brews");
        vin.add("\t\t\t\t$2 Rail Mixers");
        vin.add("Afternoon Specials (3pm - 10pm)");
        vin.add("\t\t\t\t$2 Chicken, Beef Tacos");
        vin.add("\t\t\t\t$2.50 Fish Tacos");
        vin.add("Night Specials (10pm - close)");
        vin.add("\t\t\t\t$1 Pints of PBR");
        vin.add("\t\t\t\t$2 Rail Mixers");
        vin.add("$2.50 Fireball Shots (midnight - close)");

        List<String> wand = new ArrayList<String>();
        wand.add(getResources().getString(R.string.wando));
        wand.add("All Day Every Day Specials");
        wand.add("\t\t\t\t$3.50 High Life Bottles");
        wand.add("\t\t\t\t$3.50 PBR Bottles");
        wand.add("Night Specials");
        wand.add("\t\t\t\t$2 Jameson Shots");
        wand.add("\t\t\t\t$2 Fireball Shots");
        wand.add("\t\t\t\t$2 Domestic Drafts");
        wand.add("\t\t\t\t$4 Jumbo Captain Mixers");
        wand.add("\t\t\t\t$3 Vegas Bombs");
        wand.add("\t\t\t\t$15 Fishbowls");

        List<String> whiskey = new ArrayList<String>();
        whiskey.add(getResources().getString(R.string.whiskey));
        whiskey.add("Happy Hour (3pm - 7pm)");
        whiskey.add("\t\t\t\t$1 off all Taps");
        whiskey.add("\t\t\t\t$2 Rail Drinks");
        whiskey.add("\t\t\t\t$3 Call Drinks");
        whiskey.add("The Social Hours");

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