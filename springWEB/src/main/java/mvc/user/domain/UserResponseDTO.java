package mvc.user.domain;

public class UserResponseDTO {
	private String id;
	private String pwd;
	private String name;
	
	
	public UserResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponseDTO(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserResponseDTO [id=").append(id).append(", pwd=").append(pwd).append(", name=").append(name)
				.append("]");
		return builder.toString();
	}
	


}
