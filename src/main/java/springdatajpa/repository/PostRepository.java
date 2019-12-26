package springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import springdatajpa.pojos.Post;

public interface PostRepository extends CrudRepository<Post,Long>
{
}
