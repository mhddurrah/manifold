package org.javaplusplus.manifold;

/**
 * @author mdorra
 * @since 2024-07-01
 */
public class Point {
  public final int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return String.format("(%d,%d)", x, y);
  }

  public Point plus(Point that) {
    return new Point(x + that.x, y + that.y);
  }
}
