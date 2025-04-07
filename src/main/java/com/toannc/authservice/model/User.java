package com.toannc.authservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @Column(unique = true, nullable = false)
    private String username;

    //    @Column(nullable = false)
    private String password;

    //    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;
}
