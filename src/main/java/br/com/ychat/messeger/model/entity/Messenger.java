package br.com.ychat.messeger.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.Date;

@Data
@Builder
@Table(schema = "messager")
public class Messenger {

    @PrimaryKey
    private Long id;

    private Integer idUser;

    private String content;

    private Date createAt;

}
