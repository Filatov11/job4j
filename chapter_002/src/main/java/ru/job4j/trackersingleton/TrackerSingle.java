package ru.job4j.trackersingleton;
import java.util.Arrays;
import java.util.Random;
//import ru.job4j.tracker.Items;
public class TrackerSingle {
    private final Items[] items = new Items[100];
    private int position = 0;
    private final Items[] itemss = new Items[100];
    public int getPosition() {
        return position;
    }
    private TrackerSingle() {
    }

    public static TrackerSingle getInstance() {
        return Holder.INSTANCE;
    }
    public String generateId() {
        Random rm = new Random();
        String str = String.valueOf(rm.nextLong() + System.currentTimeMillis());
        return str;
    }

    public  boolean delete(String id) {
        boolean res = false;
        Items temp = new Items(null);
        int index = 0; String nmm, idd;
        for (int i = 0; i < this.position; i++) {
            if (this.itemss[i].getId().equals(id)) {
                temp.setId(this.itemss[i].getId()); temp.setName(this.itemss[i].getName());
                for (int j = i; j < this.position - 1; j++) {
                    System.out.println("i = " + i  +  ":  j = " + j);
                    nmm = this.itemss[j + 1].getName();
                    System.out.println("nmm = " + nmm);
                    idd = this.itemss[j + 1].getId();
                    System.out.println("idd  = " + idd);
                    this.itemss[j].setName(nmm);
                    this.itemss[j].setId(idd);
                }
                this.position--;
                res =  true;
            }

        }

        return res;
    }


    public Items add(Items items) {
        items.setId(this.generateId());
        this.itemss[this.position++] = items;
        return items;
    }

    public boolean replace(String id, Items item) {
        boolean res = false;
        for (int i = 0; i < this.position; i++) {
            if ((this.itemss[i].getId().equals(item.getId()))) {
                this.itemss[i].setName(item.getName());
                res = true;
                break;
            }
        }
        return res;
    }

    public Items[] findByName(String key) {
        int cnt = 0;
        Items[] temp = new Items[this.position];
        for (int i = 0; i < this.position; i++) {
            if ((this.itemss[i].getId().equals(key))) {
                temp[cnt] = this.itemss[i];
                cnt++;
            }
        }
        Items[] tempItem = new Items[this.position];
        tempItem = Arrays.copyOf(temp, cnt);
        return tempItem;
    }
    public Items findById(String id) {
        Items ret = new Items(null);
        for (int i = 0; i < this.position; i++) {
            if ((this.itemss[i].getId().equals(id))) {
                ret = this.itemss[i];
                break;
            }

        }
        return ret;
    }
    public Items[] findAll() {

        return Arrays.copyOf(itemss, position);

    }
    private static final class Holder {
        private static final TrackerSingle INSTANCE = new TrackerSingle();
    }


}






