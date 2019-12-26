package springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import springdatajpa.service.PostService;
import springdatajpa.pojos.Post;

import java.util.List;
import java.util.Map;

@Controller
public class PostController {
    @Autowired
    private PostService service;

    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("index");
        List<Post> listPost = service.listAll();
        mv.addObject("listPost", listPost);
        return mv;

    }

    @RequestMapping("/new")
    public String newPostForm(Map<String, Object> model) {
        model.put("post", new Post());
        return "newPost";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePost(@ModelAttribute("post") Post post) {
        service.save(post);
        return "redirect:/";
    }

    @RequestMapping("/edit")
    public ModelAndView editPostForm(@RequestParam long id) {

        ModelAndView mv = new ModelAndView("editPost");
        Post post = service.get(id);
        mv.addObject("post", post);
        return mv;
    }

    @RequestMapping("/delete")
    public String deleteCustomer(@RequestParam long id) {
        service.delete(id);
        return "redirect:/";
    }

    @RequestMapping("/deleteConfirm")
    public ModelAndView deleteConfirm(@RequestParam long id) {

        ModelAndView mv = new ModelAndView("deleteConfirm");
        Post post = service.get(id);
       // System.out.println(post.getId() + " " + post.getContent());
        mv.addObject("post", post);
        return mv;


    }

}