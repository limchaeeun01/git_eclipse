package mvc.user.dao;

import mvc.user.domain.UserRequestDTO;
import mvc.user.domain.UserResponseDTO;

public class UserDao {
	
	public UserResponseDTO loginRow(UserRequestDTO params) {
		System.out.println("debug >>> user dao loginRow");
		UserResponseDTO response = new UserResponseDTO("lim", "lim", "채니");
		
		return response;
	}

}
