import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++){
            if (i > 0) { // needed to prevent index out of bounds exception
                if (list.get(i).equalsIgnoreCase("North")
                        && list.get(i - 1).equalsIgnoreCase("South")

                        || list.get(i).equalsIgnoreCase("South")
                        && list.get(i - 1).equalsIgnoreCase("North")
                        // statements to cancel out adjacent north/south elements

                        || list.get(i).equalsIgnoreCase("East")
                        && list.get(i - 1).equalsIgnoreCase("West")

                        || list.get(i).equalsIgnoreCase("West")
                        && list.get(i - 1).equalsIgnoreCase("East"))
                        // statements to cancel out adjacent east/west elements

                    {
                    list.remove(i);
                    list.remove(i - 1);
                    i = 0;
                    // remove both elements (cancel them out) and reset counter
                }
            }
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        dirReduc(new String[]{"North", "South", "South", "East", "West", "North", "West"});
    }
}

/*
"Best Practices" Solution (I did mine to allow any case letters, the solution did not ask/require of this
SithFire, SaikoKottak, gcapo, Mia Xue, Gloria Chen, BarryLi, enigmaalvarez,
Sakutox, FannyQ, jiraiyaaa (plus 18 more warriors)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
      List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
      for (int i = 0; i + 1 < dirs.size(); i++) {
        if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
          dirs.remove(i + 1);
          dirs.remove(i);
          i = -1;
        }
      }
      return dirs.toArray(new String[dirs.size()]);
    }
}
 */