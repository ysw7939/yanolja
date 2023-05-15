package com.example.yanolja.service;

import com.example.yanolja.domain.user.User;
import com.example.yanolja.repository.UserRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class) //내가 위에 작성한 것과 동일하게 동작하게 한다
@SpringBootTest
@Transactional
class UserServiceTest {

  @Autowired UserRepository userRepository;
  @Autowired UserService userService;

  @Autowired
  EntityManager em;

 @Test
 public void 회원가입() throws Exception {
	 //given
     User user = new User();
     user.setName("name");
     user.setNickName("nick");
     user.setEmail("ysw7939@naver.com");
     user.setPhoneNumber("01063207939");
     user.setPassword("pass");
     user.setLoginId("id");

	 //when
     Long id = userService.join(user);

	 //then
     em.flush();
     assertEquals(user, userRepository.findById(id));
 }
}