package com.example.yanolja;

import com.example.yanolja.domain.accomodation.Accomodation;
import com.example.yanolja.domain.user.User;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InitDb {
    private final EntityManager em;

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;

        public void dbInit1() {
            User user = createUser("name", "nick", "asd123", "123",
                    "01012341234", "ysw7939@naver.com");
            em.persist(user);
            Accomodation accomodation;
        }

        private User createUser(String name, String nick, String userId, String password, String phone, String email) {
            User user = new User();
            user.setName(name);
            user.setNickName(nick);
            user.setLoginId(userId);
            user.setPassword(password);
            user.setPhoneNumber(phone);
            user.setEmail(email);
            return user;
        }
    }
}
