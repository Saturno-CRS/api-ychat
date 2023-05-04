package br.com.ychat.messeger.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.Date;


@Data
@Builder
@Table(schema = "user")
public class User {


    @PrimaryKey
    private Long id;
    private String firstName;

    private String lastName;

    private String login;

    private String email;

    private Date createAt;

}
