package ru.job4j.trackersingleton;

public class Items {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Items(String name) {
        this.name = name;
    }


 //  public  Items add(Items items) {
 //      items.setId(this.generateId());
 //      this.items[this.position++] = items;
  //     return items;
 /////   }



}
