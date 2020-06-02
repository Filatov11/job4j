package ru.job4j.pojo;

@SuppressWarnings("ALL")
public class Shop {
    public static Product[] delete(final Product[] products, final int index) {
        products[index] = null;
        int ii = index - 1;
        Product temp = products[index];
        temp = products[index];
        for (int i = index; i <= products.length - 1; i++) {
            if (i == (products.length - 1)) {
                products[i] = null;
            } else {
                //temp = products[index];
                products[i] = products[i + 1];
            }


        }

        // products[products.length-1] = null;
        return products;
    }

    public static void main(final String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        for (Product product : products) {
            //проверяем, что объект не равен
            // null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;

        for (Product product : products) {
            //проверяем, что объект не равен
            // null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();
        System.out.println("Записываем  в ячейку с индексом 1 значение"
                + "ячейки с индексом 2 и удаляем"
                + "значение из ячейки с индексом 2");
        //записываем в ячейку с индексом 1
        // значение ячейки с индексом 2.
        products[1] = products[2];
        //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (Product product : products) {
            //проверяем, что объект не равен null.
            // так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("---------------");
        Product[] prod = new Product[5];
        prod[0] = new Product("Milk", 10);
        prod[1] = new Product("Butter", 4);
        prod[2] = new Product("Egg", 19);
        prod[3] = new Product("Onion", 4);
        prod[4] = new Product("Water", 4);
        prod = delete(prod, 4);

        for (Product prod1 : prod) {
            //проверяем, что объект не равен null. тк у
            // нас массив не заполнен целиком.
            if (prod1 != null) {
                System.out.println(prod1.getName());
            } else {
                System.out.println("null");
            }
        }


    }
}

