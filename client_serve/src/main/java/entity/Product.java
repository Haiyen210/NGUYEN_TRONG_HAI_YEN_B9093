package entity;

public class Product {
	private int CountryId;
	private String CountryName;
	private String Position;
	private String Area;
	private int Population;

	public Product(String CountryName, String Position, String Area, int Population) {
		super();
		this.CountryName = CountryName;
		this.Position = Position;
		this.Area = Area;
		this.Population = Population;
	}

	public Product(int CountryId, String CountryName,String Position, String Area, int Population) {
		super();
		this.CountryId = CountryId;
		this.CountryName = CountryName;
		this.Position = Position;
		this.Area = Area;
		this.Population = Population;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCountryId() {
		return CountryId;
	}

	public void setCountryId(int countryId) {
		CountryId = countryId;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public int getPopulation() {
		return Population;
	}

	public void setPopulation(int population) {
		Population = population;
	}

	

}
