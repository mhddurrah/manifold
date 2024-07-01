package org.javaplusplus.manifold;

import manifold.science.measures.Length;

import static manifold.science.util.UnitConstants.*;

/**
 * @author mdorra
 * @since 2024-07-01
 */
public class Runner {
  public static void main(String[] args) {
    String string = "true";
    System.out.println(string.asBoolean() ? "Idz true" : "Falze!");

    // operator overloading
    Point point = new Point(1, 2);
    Point point1 = new Point(1, 2);
    Point point2 = point + point1;
    System.out.println(point2);

    // unit expressions
    Length x = 1.cm + 2.mm;
    System.out.println(x);
  }
}
