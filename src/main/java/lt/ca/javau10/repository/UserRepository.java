package lt.ca.javau10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.ca.javau10.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
