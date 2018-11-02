package backoffice;

import javax.json.bind.annotation.JsonbProperty;

public class Payment{ 
 
    @JsonbProperty
    private String name; 
 
    public Payment() {} 
 
    public Payment (String name) { 
      this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
 
} 
