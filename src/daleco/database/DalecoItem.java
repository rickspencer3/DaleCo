package daleco.database;

public class DalecoItem {
    private Integer id;
    private String description;
    
    public Integer getId() {
    		return this.id;
    }
    public void setId(Integer id) {
    		this.id = id;
    }
    public String getDescription() {
    		return this.description;
    }
    public void setDescription(String description) {
    		this.description = description;
    }
    public String toString() {
    		return "id: " + this.id.toString() + " : description: " + this.description;
    }

}
