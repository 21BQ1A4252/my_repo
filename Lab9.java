abstract class Shape{
  int dim1, dim2;
    Shape (int dim1, int dim2) {
    this.dim1 = dim1;
    this.dim2 = dim2;
  }
    Shape (int dim1){
    this.dim1 = dim1;
  }
  abstract void Area ();
}
class Rectangle extends Shape{
  Rectangle (int x, int y){
    super (x, y);
  }
  void Area () {
    System.out.println ("Area of the rectangle is:" + dim1 * dim2);
  }
}
class Triangle extends Shape{
  Triangle (int x, int y){
    super (x, y);
  }
  void Area () {
    System.out.println ("Area of the triangle is:" + 0.5 * dim1 * dim2);
  }
}
class Circle extends Shape{
  Circle (int x){
    super (x);
  }
  void Area (){
    System.out.println ("Area of the circle is:" + 3.14 * dim1 * dim1);
  }}
class Lab9{
  public static void main (String args[]){
    Rectangle r1 = new Rectangle (4, 5);
      r1.Area ();
    Triangle t1 = new Triangle (3, 4);
      t1.Area ();
    Circle c1 = new Circle (2);
      c1.Area ();
  }
}
