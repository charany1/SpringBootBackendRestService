package com.blogofyogi.SpringBootBackendRestService.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;

    public static void main(String[] args) {
        User user = new User(0L,"Yogeshwar","Dan");

        user.setFirstName("Gyaneshwar");

        System.out.println(user);
    }
}
