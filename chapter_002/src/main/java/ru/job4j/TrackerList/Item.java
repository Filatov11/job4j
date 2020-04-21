package ru.job4j.TrackerList;

public class Item {

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

    public Item(String name) {
        this.name = name;
    }


 //  public  Item add(Item items) {
  //   items.setId(this.generateId());
 //      this.items[this.position++] = items;
  //     return items;
 /////   }



}
