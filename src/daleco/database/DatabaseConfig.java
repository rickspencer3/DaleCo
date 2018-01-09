package daleco.database;

public class DatabaseConfig {
	private final String user;
	private final String password;
	private final String host;
	private final String databaseName;

	public DatabaseConfig(String user, String password, String host, String databaseName) {
		this.user = user;
		this.password = password;
		this.host = host;
		this.databaseName = databaseName;
	}

	public String GetHost() {
		return this.host;
	}

	public String GetDatabaseName() {
		return this.databaseName;
	}

	public String GetUser() {
		return this.user;
	}
	
	public String GetPassword() {
		return this.password;
	}
	
}
