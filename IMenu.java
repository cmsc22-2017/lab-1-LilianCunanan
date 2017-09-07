interface IMenu {}

class Soup implements IMenu{
  Details details;
  boolean isVeg;
 
  Soup(Details details,boolean isVeg){
    this.details = details;
  	this.isVeg = isVeg;
  }
}

class Salad implements IMenu{
  Details details;
  boolean isVeg;
  String dressing;
 
  Salad(Details details,boolean isVeg,String dressing){
  	this.details = details;
  	this.isVeg = isVeg;
  	this.dressing = dressing;
  }
}

class Sandwich implements IMenu{
  Details details;
  String bread;
  boolean isPJ;
  boolean isHC;
 
  Sandwich(Details details,String bread,boolean isPJ,boolean isHC){
  	this.details = details;
  	this.bread = bread;
  	this.isPJ = isPJ;
  	this.isHC = isHC;
  }
}

class Details{
  String name;
  int price;
 
  Details(String name,int price){
  	this.name = name;
  	this.price = price;
  }
}

class ExamplesDetails{
	ExamplesDetails(){}
		Details a = new Details("Suho",10);
		Details b = new Details("Sehun",20);
		Details c = new Details("Lay",30);
		Details d = new Details("Chen",40);
		Details e = new Details("DO",50);
		Details f = new Details("Kai",60);
   
		IMenu ab = new Soup(this.a,true);
		IMenu ac = new Soup(this.b,false);
		IMenu ad = new Salad(this.c,true,"Ranch");
		IMenu ae = new Salad(this.d,true,"Mayo");
		IMenu af = new Sandwich(this.e,"French",true,false);
		IMenu ag = new Sandwich(this.f,"Garlic",false,true);
}
