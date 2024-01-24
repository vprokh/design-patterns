package headfirst.designpatterns.structure.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EI {
    public static void main(String args[]) {
        List<String> v = new ArrayList<>(Arrays.asList(args));
        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
