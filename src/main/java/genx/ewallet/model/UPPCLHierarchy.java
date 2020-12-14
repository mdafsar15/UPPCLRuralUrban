package genx.ewallet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity(name="UPPCLHierarchy")
@Table(name="UPPCLHierarchy")
@Data
public class UPPCLHierarchy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	private String discomName;
	private String zoneName;
	private String circleName;
	private String districtName;
	private String divisionName;
	private String ruralDivisionCode;
	private String urbanDivisionCode;
	

	public UPPCLHierarchy() {
	}

	public UPPCLHierarchy(String discomName, String zoneName, String circleName, String districtName,
			String divisionName) {
		super();
		this.discomName = discomName;
		this.zoneName = zoneName;
		this.circleName = circleName;
		this.districtName = districtName;
		this.divisionName = divisionName;
	}


}
