public class Shape{

private int x,y,height,width;

Shape(int x, int y, int width, int height){

this.x = x;
this.y = y;
this.width = width;
this.height = height;

}

Shape(int x, int y){

this(x,y,0,0);

}

Shape(){

this(0,0,1,1);

}

public void show(){

System.out.println("X-co:"+this.x+", Y-co:"+this.y+", Width:"+this.width+", Height:"+this.height);
}

public static void main(String [] args){

Shape s = new Shape(1,2,3,4);
Shape s1 = new Shape(1,2);
Shape s2 = new Shape();

System.out.println("For first object");
s.show();
System.out.println("For second object");
s1.show();
System.out.println("For third object");
s2.show();
}

}


