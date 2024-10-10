package lt.ca.javau10.services.auth;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lt.ca.javau10.dto.SignupRequest;
import lt.ca.javau10.dto.UserDto;
import lt.ca.javau10.enums.UserRole;
import lt.ca.javau10.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

	private final UserRepository userRepository;
	
	@Override 
	public UserDto createCustomer (SignupRequest signupRequest) {
		User user = new User();
		user.setName(signupRequest.getName());
		user.setEmail(signupRequest.getEmail());
		user.setPassword(signupRequest.getPassword());
		user.setUserRole(UserRole.CUSTOMER);
		User createUser = userRepository.save(user);
		UserDto userDto = new UserDto();
		userDto.setId(createdUser.getId());
		return userDto;
	}
}
