class Person {
  String name;
  int age;
  String gender;
  Address address;
  
 public Person(String name,int age,String gender,Address address){
  // TODO Auto-generated constructor stub
  this.name = name;
  this.age = age;
  this.gender = gender;
  this.address = address;
 }
}

class Address {
  String city;
  String state;
  
 public Address(String state,String city){
  // TODO Auto-generated constructor stub
  this.city = city;
  this.state = state;
 }
}

class ExamplesAddress{
  ExamplesAddress(){}

  Address e = new Address("Boston","MA");
  Address f = new Address("Warwick","RI");
  Address g = new Address("Nashua","NH");

  Person a = new Person("Tim",20,"M",this.f);
  Person b = new Person("Pat",19,"F",this.e);
  Person c = new Person("Kim",17,"F",this.e);
  Person d = new Person("Dan",22,"M",this.g);
 
}
