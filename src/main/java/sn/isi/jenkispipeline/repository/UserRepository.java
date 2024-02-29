package sn.isi.jenkispipeline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.jenkispipeline.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
