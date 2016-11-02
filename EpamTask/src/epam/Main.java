package epam;

public class Main {
	
    public static void main(String[] args){
    	
      Bouquet b1 = new Bouquet();
      Bouquet b2 = new Bouquet();
      Flower f1 = new Flower("A","GREEN",1,31);
      Flower f2 = new Flower("B","BLUE",2,32);
      Flower f3 = new Flower("C","WHITE",3,33);
      Flower f4 = new Flower("D","BLACK",4,35);
      Flower f5 = new Flower("A","ZZZ",5,36);
      Flower f6 = new Flower("C","EEE",6,37);
      Flower f7 = new Flower("K","BLACK",4,35);
      Flower f8 = new Flower("V","RED",5,36);
      Flower f9 = new Flower("B","BROWN",6,37);

      b1.getFlowers().add(f1);
      b1.getFlowers().add(f2);
      b1.getFlowers().add(f3);
      b1.getFlowers().add(f4);
      b1.getFlowers().add(f5);
      b1.getFlowers().add(f6);
      b1.getFlowers().add(f7);
      b1.getFlowers().add(f8);
      b1.getFlowers().add(f9);

      b2.getFlowers().add(f2);
      b2.getFlowers().add(f8);
      b2.getFlowers().add(f5);
      
 
      b2.searchByName("B");
      b2.searchByName("C");
      b2.searchByObject(f4);
      b2.searchByObject(f8);
      System.out.println();
      
      b1.searchByName("A");
      b1.searchByName("O");
      b1.searchByObject(f1);      
    }
}
