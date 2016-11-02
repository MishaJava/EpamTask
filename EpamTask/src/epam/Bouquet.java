package epam;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
	
	private List<Flower> flowers = new ArrayList<>();
	
	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}
	
	public void searchByName(String name){
		List<Flower> list = new ArrayList<>();
		for(Flower f : this.flowers){
			if(f.getName().equals(name)){
				list.add(f);
			}
		}
		this.getFlowersFromBouquet(list);
	}
	
	public void searchByObject(Flower flower){
		List<Flower> list = new ArrayList<>();
		for(Flower f : this.flowers){
			if(f.equals(flower)){
				list.add(f);
			}
		  }
		this.getFlowersFromBouquet(list);
	}
	
	private void getFlowersFromBouquet(List<Flower> list){
		if(list.size()>0){
			for(Flower flower : list){
				System.out.println(flower.toString());
			}
		}else{
			System.out.println("Букет не містить такої квітки");
		}
	}
	
}
