package me.kqlqk.todo_list.service;

import me.kqlqk.todo_list.models.User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;

@Component
public interface UserService{
    User getByEmail(String email);
    User getByLogin(String login);
    boolean existsByEmail(String email);
    boolean existsByLogin(String login);

    void add(User user);
    void autoLogin(String loginObj, String password);
    boolean canAutoLogin(String loginObj, String password);
    void convertOAuth2UserToUserAndSave(OAuth2User oAuth2User);
    User getByLoginObj(String loginObj);
    String getCurrentEmail();
    User getCurrentUser();
    void update(User user);
    boolean passwordsMatches(String decodedPassword, User userToCheck);
}
