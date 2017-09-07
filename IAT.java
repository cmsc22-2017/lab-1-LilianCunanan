interface IAT {}

class Unknown implements IAT{
	Unknown(){}
}

class Human implements IAT{
	String name;
	IAT mom;
	IAT dad;
	
	Human(String name,IAT mom,IAT dad){
		this.name = name;
		this.mom = mom;
		this.dad = dad;
	}
}

class ExamplesAncestors{
	ExamplesAncestors(){}
	
	IAT unknown = new Unknown();
	IAT catalina = new Human("Catalina",this.unknown,this.unknown);
	IAT pedro = new Human("Pedro",this.unknown,this.unknown);
	IAT magdalena = new Human("Magdalena",this.unknown,this.unknown);
	IAT jose = new Human("Jose",this.unknown,this.unknown);
	
	IAT marilyn = new Human("Marilyn",this.catalina,this.pedro);
	IAT carlos = new Human("Carlos",this.magdalena,this.jose);
	IAT lily = new Human("Lily",this.marilyn,this.carlos);
	
}