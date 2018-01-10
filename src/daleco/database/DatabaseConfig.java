package daleco.database;

public class DatabaseConfig {
	private final String user;
	private final String password;
	private final String host;
	private final String name;
	private final String type;

	public DatabaseConfig(String user, String password, String host, String name, String type) {
		this.user = user;
		this.password = password;
		this.host = host;
		this.name = name;
		this.type = type;
	}

	public String GetHost() {
		return this.host;
	}

	public String GetName() {
		return this.name;
	}

	public String GetType() {
		return this.type;
	}

	public String GetUser() {
		return this.user;
	}
	
	public String GetPassword() {
		return this.password;
	}
	
}
