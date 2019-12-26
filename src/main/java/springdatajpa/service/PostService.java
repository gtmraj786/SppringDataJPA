package springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springdatajpa.repository.PostRepository;
import springdatajpa.pojos.Post;

import java.util.List;



@Service
public class PostService {
    @Autowired
     private PostRepository repo;

    public List<Post> listAll()
    {
        return ((List<Post>)repo.findAll());
    }
   public void save(Post post)
   {
       repo.save(post);
   }
   public Post get(Long id)
   {
       return repo.findById(id).get();
   }

    public void delete(Long id) {
        repo.deleteById(id);
    }


}
