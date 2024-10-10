package lt.ca.javau10.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lt.ca.javau10.dto.SignupRequest;
import lt.ca.javau10.dto.UserDto;
import lt.ca.javau10.services.auth.AuthService;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
	public class AuthController {
	
	private final AuthService authService ;
	
	@PostMapping("/signup")
	
	public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest){
		UserDto createdCustomerDto = authService.createCustomer(signupRequest);
		if (createdCustomerDto == null) {
			return new ResponseEntity<>("Customer not created, Come again later", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);
	}
}
