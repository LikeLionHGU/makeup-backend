package com.makeup.dto;

import com.makeup.controller.Form.SignInForm;
import com.makeup.controller.Form.SignUpForm;
import com.makeup.domain.Member;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private Long memberId;

    private String username;
    private String password;
    private String birthYear;
    private Boolean gender;

    private int age;
    private int numOfFolling;
    private int numOfFollower;

    // Form에서
    public static MemberDto from(SignUpForm signUpForm) {
        return MemberDto.builder()
                .username(signUpForm.getUsername())
                .password(signUpForm.getPassword())
                .birthYear(signUpForm.getBirthYear())
                .gender(signUpForm.getGender())
                .build();
    }

    public static MemberDto from(SignInForm signInForm) {
        return MemberDto.builder()
                .username(signInForm.getUsername())
                .password(signInForm.getPassword())
                .build();
    }

}
