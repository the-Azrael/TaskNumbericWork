import java.util.*;

public class Main {
    private static List numbersList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    private static void show() {
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }
        System.out.println("------- End of list ----------");
    }

    private static void getPositive() {
        List newList = new ArrayList<Integer>();
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element > 0) {
                newList.add(element);
            }
        }
        numbersList = newList;
    }

    private static void getEven() {
        List newList = new ArrayList<Integer>();
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 == 0) {
                newList.add(element);
            }
        }
        numbersList = newList;
    }

    public static void sort() {
        Collections.sort(numbersList);
    }

    public static void main(String[] args) {
        getPositive();
        getEven();
        sort();
        show();
    }
}


