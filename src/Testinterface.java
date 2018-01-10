////Interface declaration: by first user
//interface Drawable{
//    void draw();//throws NumberFormatException
//
//
//  //  {System.out.println("drawing drawble");}
//}
////Implementation: by second user
//class Rectangle implements Drawable {
//    public void draw() throws ArithmeticException
//    {System.out.println("drawing rectangle");}
//}
//class Circle implements Drawable{
//
//    Circle(){
//
//    }
//    public void draw(){System.out.println("drawing circle");}
//}
////Using interface: by third user
//class TestInterface1{
//    public static void main(String args[]){
//        Rectangle d = new Rectangle(new Circle());
//        d.draw();
//        //In real scenario, object is provided by method e.g. getDrawable()
//         new Circle();
//        d.draw();
//        System.out.println(d instanceof Drawable);
//        System.out.printf("%h is the reference", d);
//    }}