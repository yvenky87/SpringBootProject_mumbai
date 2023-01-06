package deloitte.spring.SpringProjectWeb.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import deloitte.spring.SpringProjectWeb.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
