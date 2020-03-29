package ru.job4j.AbstractFactory;

public class ShapeFactory {
    private final ShapeAbstFactory factory;
    public ShapeFactory(ShapeAbstFactory factory) {
        this.factory = factory;
    }

 //   public Shape create(String name) {
  //      if ("triangle".equals(name)) {
          //  shape = factory.createTriangle();
  //      } else if  ("rectangle".equals(name))  {
     //       shape = factory.createRectangle();
  //      } else
      //      {shape = factory.createEmpty();}
     //       return  shape;
  //      }

  //  }
}
