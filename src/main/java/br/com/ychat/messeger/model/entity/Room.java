package br.com.ychat.messeger.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.Date;
import java.util.List;


@Data
@Builder
@Table(schema = "room")
public class Room {


    @PrimaryKey
    private Long id;

    private Date createAt;


}
