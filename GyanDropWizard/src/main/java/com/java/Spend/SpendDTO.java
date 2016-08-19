package com.java.Spend;



import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class SpendDTO {
	private String name;
	private String percent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public SpendDTO(String name, String percent) {
		super();
		this.name = name;
		this.percent = percent;
	}
	
	
	

}
