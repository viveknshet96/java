abstract class Box{
	double width,height,depth;


Box(Box ob){
	width=ob.width;
	height=ob.height;
	depth=ob.depth;
}


Box(double w,double h,double d){	
	width=w;
	height=h;
	depth=d;
}



Box(){
	width=height=depth=-1;
}


Box(double len){
	width=height=depth=len;
}


abstract double volume();

}


//first level subclass
class BoxWeight extends Box{
	double weight;


BoxWeight(BoxWeight ob){
	super(ob);
	weight=ob.weight;
}

BoxWeight(double w, double h,double d,double m){
	super(w,h,d);
	weight=m;
}


BoxWeight(){
	super();
	weight=-1;
}

//con cube
BoxWeight(double len,double m){
	super(len);
	weight=m;
}

//override method

double volume(){
	return width*height*depth;
}
}


final class Shipment extends BoxWeight{
	double cost;
	
	Shipment(Shipment ob){
	super(ob);
	cost=ob.cost;
    }
	
	Shipment(double w,double h, double d,double m,double c){
	super(w,h,d,m);
	cost=c;
    }
	Shipment(){
	super();
	cost=-1;
    }
	Shipment(double len,double m,double c){
	super(len,m);
	cost=c;
	}

	double volume(){
		return width*height*depth;

	}

	final void displayCost(){
		System.out.println("shippingcost:$"+cost);
	}

}

public class DemoShipment{
	public static void main(String args[]){
		Shipment shipment1 = new Shipment(10,20,15,10,3.14);
	
	double vol;
	vol=shipment1.volume();
	System.out.println("volume is: "+vol);
	System.out.println("weight of shipment: "+shipment1.weight);
	shipment1.displayCost();
  
	System.out.println();

	Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
	vol=shipment2.volume();
	System.out.println("volume is: "+vol);
	System.out.println("weight of shipment: "+shipment2.weight);
	shipment2.displayCost();
	}
}

	
