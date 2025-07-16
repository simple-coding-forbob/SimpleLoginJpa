package com.simplecoding.simpledms.auth.service;

import com.simplecoding.simpledms.auth.dto.MemberDto;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Log4j2
@SpringBootTest
@EnableJpaAuditing
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    void save() {
//		1) 테스트 조건: Dept(dno,dname,loc)
        MemberDto memberDto=new MemberDto();
        memberDto.setEmail("forbob3@naver.com");
        memberDto.setPassword("forbob");
        memberDto.setName("홍길동");
        memberDto.setCodeName("ROLE_ADMIN");
//		2) 실제 메소드실행
        memberService.save(memberDto);
//		3) 검증(확인): 로그 , DB 확인, assert~ (DB확인)
    }
}