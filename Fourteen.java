class Override{

private String name;
private int roll;

public Override(String name,int roll){
this.name=name;
this.roll=roll;
}

public String toString(){

return ("Name:"+this.name+"\nRoll:"+this.roll);

}

}

public class Fourteen{
public static void main(String [] args){

Override f = new Override("DEV",14);
System.out.println(f.toString());

}

}