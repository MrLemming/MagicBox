public class Main {
          public static void main(String[] args) {
            MagicBox<Integer> magicBoxInt = new MagicBox<>(5);

            magicBoxInt.add(10);
            magicBoxInt.add(20);
            magicBoxInt.add(30);
            magicBoxInt.add(40);
            magicBoxInt.add(50);

            System.out.println(magicBoxInt.pick());

            MagicBox<String> boxWithInts = new MagicBox<>(5);

            boxWithInts.add("Vera");
            boxWithInts.add("Ivan");
            boxWithInts.add("Stepan");
            boxWithInts.add("Petr");
            boxWithInts.add("Svetlana");

            System.out.println(boxWithInts.pick());
        }
    }