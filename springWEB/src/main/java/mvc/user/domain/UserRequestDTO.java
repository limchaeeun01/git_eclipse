package mvc.user.domain;

public class UserRequestDTO {
	private String id;
	private String pwd;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserRequestDTO [id=").append(id).append(", pwd=").append(pwd).append("]");
		return builder.toString();
	}
	
	public UserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequestDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
