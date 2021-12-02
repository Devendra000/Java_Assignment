import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Pizzas{

private static int pizza, price;
private int num, type, top , topPizza;

Pizzas(int type, int num){
 this.type=type;
 this.num=num;
}

Pizzas(int type, int num, int top, int tp){
    this.type = type;
    this.num = num;
    this.top = top;
    this.topPizza = tp;
   }

void order(){
    
    if(type == 1){
        if(this.num<5){
            price = this.num*100;
            pizza = this.num;
        }
        else if(this.num>5){
            price = this.num * 100;
            pizza = this.num + (this.num/5);
        }

       System.out.println("Type of pizza: Standard\nNo. of pizzas ordered: "+this.num+"\nTotal no. of pizzas after 'Offer' applied:"+this.pizza+"\nTotal cost:"+this.price+"\n\n");

    }
    else if(type == 2){
        if(this.num<5){
            price = this.num*200+(20*this.top);
            pizza = this.num;
        }
        else if(this.num>=5){
            price = this.num*200+(20*this.top*topPizza);
            pizza = this.num + (this.num/5);
        }

        System.out.println("Type of pizza: Deluxe\nNo. of pizzas ordered: "+this.num+"\nTotal no. of pizzas after 'Offer' applied:"+this.pizza+"\nTotal cost:"+this.price+"\n\n");

    }
}

}

public class Pizza{

public static void main(String [] args){
Scanner s = new Scanner(System.in);

int i,j,k,l;

while (1==1){

System.out.println("State type of pizza you want:\n1.Standard\n2.Deluxe\nAny other number:EXIT");
 i = s.nextInt();

if(i==1){

System.out.println("State no. of Pizza (!!!OFFER: Buy 5 Get 1 free):");
 j = s.nextInt();

Pizzas p = new Pizzas(i,j);
p.order();

}

else if(i==2){
    System.out.println("State no. of Pizza (!!!OFFER: Buy 5 Get 1 free):");
 j = s.nextInt();

while(true){

    System.out.println("Do you want extra toppings? Enter no of extra toppings: UPTO 3 AVAILABLE(0 if you don't):");
 k = s.nextInt();

if(k<0 || k>3)
{
    System.out.println("Enter valid no of toppings(0, 1, 2, 3):");
    continue;
}
else 
    break;
}


while(true){

System.out.println("Enter no. of pizzas you want toppings on:");
  l = s.nextInt();
 

if(l>j)
{
System.out.println("Enter valid no of pizzas:");
continue;
}

else{
break;
}
}

Pizzas p = new Pizzas(i,j,k,l);
p.order();




}

else
 System.exit(0);

}

}

}