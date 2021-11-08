public class Tester{
  public static void main(String args[]){
    /*
    //Phase 1 Testing
    SuperArray example1 = new SuperArray();
    System.out.println(example1.size());
    System.out.println(example1.toString());
    System.out.println(example1.toStringDebug());
    example1.add("hello");
    System.out.println(example1.size());
    System.out.println(example1.toString());
    System.out.println(example1.toStringDebug());
    example1.add("world");
    System.out.println(example1.size());
    System.out.println(example1.toString());
    System.out.println(example1.toStringDebug());
    System.out.println(example1.get(4));
    example1.add("second index element");
    System.out.println(example1.get(2));
    System.out.println(example1.set(4, "should be error"));
    System.out.println(example1.set(2, "changed second index"));
    System.out.println(example1.get(2));

    //Phase 2 Testing
    SuperArray example2 = new  SuperArray();
    example2.add("element 1");
    example2.add("element 2");
    example2.add("element 3");
    example2.add("element 4");
    System.out.println("First loop (should print out all the elements in the SuperArray)");
    for (int i = 0; i < example2.size(); i++){
      System.out.println(example2.get(i));
    }
    System.out.println("\nSecond loop (should print out all the elements in the SuperArray but change them too)");
    for (int i = 0; i < example2.size(); i++){
      System.out.println(example2.set(i, example2.get(i) + " changed"));
    }
    System.out.println("\nThird loop loop (should print out all the changed elements in the SuperArray)");
    for (int i = 0; i < example2.size(); i++){
      System.out.println(example2.get(i));
    }

    SuperArray example3 = new SuperArray(2);
    example3.add("element 1");
    example3.add("element 2");
    for (int i = 0; i < example3.size(); i++){
      System.out.println(example3.get(i));
    }
    System.out.println("\nSecond loop (should print out all the elements in the SuperArray but change them too)");
    for (int i = 0; i < example3.size(); i++){
      System.out.println(example3.set(i, example3.get(i) + " changed"));
    }
    System.out.println("\nThird loop loop (should print out all the changed elements in the SuperArray)");
    for (int i = 0; i < example3.size(); i++){
      System.out.println(example3.get(i));
    }
    System.out.println(example3.toString());
    System.out.println(example3.toStringDebug());
    System.out.println(example3.testResize().toStringDebug());
    example3.add("element 3");
    example3.add("element 4");
    example3.add("element 5");
    System.out.println(example3.toString());
    System.out.println(example3.toStringDebug());
    System.out.println(example3.testResize().toStringDebug());
    System.out.println("First loop (should print out all the elements in the SuperArray)");
    for (int i = 0; i < example3.size(); i++){
      System.out.println(example3.get(i));
    }
    System.out.println("\nSecond loop (should print out all the elements in the SuperArray but change them too)");
    for (int i = 0; i < example3.size(); i++){
      System.out.println(example3.set(i, example3.get(i) + " changed"));
    }
    System.out.println("\nThird loop loop (should print out all the changed elements in the SuperArray)");
    for (int i = 0; i < example3.size(); i++){
      System.out.println(example3.get(i));
    }

    SuperArray example4 = new SuperArray(5);
    example4.add("hi");
    example4.add("my");
    example4.add("name");
    example4.add("is");
    example4.add("sheikh");
    System.out.println(example4.remove(2));
    System.out.println(example4.toString());
    System.out.println(example4.toStringDebug());

    SuperArray example5 = new SuperArray(6);
    example5.add("element1");
    example5.add("hi");
    example5.add("hi");
    example5.add("my");
    example5.add("name's");
    example5.add("sheikh");
    System.out.println(example5.indexOf("hi")); //should return 1
    System.out.println(example5.lastIndexOf("hi")); //should return 2
    */

    SuperArray example6 = new SuperArray(8);
    example6.add("zero");
    example6.add("one");
    example6.add("three");
    example6.add("four");
    example6.add("five");
    example6.add("six");
    System.out.println(example6.toStringDebug());
    example6.add(2, "two");
    System.out.println(example6.toStringDebug());
    System.out.println(example6.remove("three"));
    System.out.println(example6.remove("four"));
    System.out.println(example6.toStringDebug());
  }
}
