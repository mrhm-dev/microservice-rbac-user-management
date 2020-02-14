package com.giassi.microservice.demo2.rest.users.entities;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
@ToString
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name="id")
    private Long id;

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="surname", nullable = false)
    private String surname;

    @Enumerated
    @Column(columnDefinition = "tinyint")
    private Gender gender;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Contact contact;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;

    @Column(name="enabled")
    private boolean enabled;

    @Column(name="note")
    private String note;

    @Basic
    private java.time.LocalDateTime creationDt;

    @Basic
    private java.time.LocalDateTime updatedDt;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="role_id")
    private Role role;

}