package course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import course.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
