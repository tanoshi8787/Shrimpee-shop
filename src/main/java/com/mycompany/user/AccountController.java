package com.mycompany.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Service
public class AccountController {
    @Autowired
    private AccountService service;

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<Account> listAccount = service.listAll();
        model.addAttribute("listAccount", listAccount);
        return "users";
    }

    @GetMapping("/users/login")
    public String showNewFrom(Model model) {
        model.addAttribute("account", new Account());
        
        model.addAttribute("pageTitle", "Add New Book");
        return "user_login";
    }

    @PostMapping("/users/save1")
    public String saveUser(Account user, RedirectAttributes ra) {
        service.save(user);
        ra.addFlashAttribute("message", "The user has been saved successfully.");
        return "redirect:/users";
    }

    /**
     * Immplementation of updated and delete
     */

//    @GetMapping("/users/edit/{id}")
//    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
//        try {
//            User user = service.get(id);
//            model.addAttribute("user", user);
//            model.addAttribute("pageTitle", "Edit Book (ID: " + id + ")");
//
//            return "user_from";
//        } catch (UserNotFoundException e) {
//            ra.addFlashAttribute("message", e.getMessage());
//            return "redirect:/users";
//        }
//    }
//
//    @GetMapping("/users/delete/{id}")
//    public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ra) {
//        try {public interface UserRepository extends CrudRepository<User, Integer> {
//            service.delete(id);
//            ra.addFlashAttribute("message", "The user id" + id + "has been deleted");
//        } catch (UserNotFoundException e) {
//            ra.addFlashAttribute("message", e.getMessage());
//        }
//        return "redirect:/users";
//
//    }
}
