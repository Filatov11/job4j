package ru.job4j.abstractfactory;

/**
 * ShapeFactory
 */
public class ShapeFactory {
    private final ShapeAbstFactory factory;

    /**
     *
     * @param factory fc
     */
    public  ShapeFactory(ShapeAbstFactory factory) {
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
