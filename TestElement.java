class TestElement{

	public static void main(String[] args)
	{
	Element hydrogen=new Element("hydrogen","h",1.008,1,1);
	Element helium=new Element("Helium","He",4.0026,1,18);
	Element lithium=new Element("lithium","li",6.94,2,1);
	Element berlium=new Element("berlium","Be",9.0122,2,2);
	Element[] chemicals=new Element[4];
	
	chemicals[0]=hydrogen;
	chemicals[1]=helium;
	chemicals[2]=lithium;
	chemicals[3]=berlium;
	
	/*double totalweight=hydrogen.getweight()+helium.getweight()+
	lithium.getweight()+berlium.getweight();
	*/
	double totalweight=0.0;
	for (int i=0;i<chemicals.length;i++){
		totalweight += chemicals[i].getweight();
	}
	
	double averageweight=totalweight/4;
	System.out.printf("Average atomic weight: %.3f\n",averageweight);
	
	}
}