package epam;

public class Flower {

	private String name;
	private String color;
	private int length;
	private int freshness;
	
	public Flower(){
		
	}
	
	public Flower(String name, String color, int length, int freshness) {
		super();
		this.name = name;
		this.color = color;
		this.length = length;
		this.freshness = freshness;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getFreshness() {
		return freshness;
	}
	
	public void setFreshness(int freshness) {
		this.freshness = freshness;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (freshness != other.freshness)
			return false;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Flower [Назва=" + name + ", Колір=" + color + ", Довжина стебла=" + length + ", Свіжість=" + freshness +"години"+ "]";
	}
	
	
	
	
	
	
}
