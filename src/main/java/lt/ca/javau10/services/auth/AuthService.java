package lt.ca.javau10.services.auth;

import lt.ca.javau10.dto.SignupRequest;
import lt.ca.javau10.dto.UserDto;

public interface AuthService {
 
	UserDto createCustomer(SignupRequest signupRequest);
}
