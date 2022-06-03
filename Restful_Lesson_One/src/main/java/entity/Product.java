package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblCountries")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CountryId")
	private int CountryId;
	
	@Column(name="CountryName")
	private String CountryName;
	
	@Column(name="Position")
	private String Position;
	
	@Column(name = "Area")
	private String Area;
	
	@Column(name = "Population")
	private int Population;

	public Product(int countryId, String countryName, String position, String area, int population) {
		super();
		CountryId = countryId;
		CountryName = countryName;
		Position = position;
		Area = area;
		Population = population;
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
