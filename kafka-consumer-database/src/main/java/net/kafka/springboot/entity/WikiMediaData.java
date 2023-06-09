package net.kafka.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WikiMediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //    @Lob//Used this annotation since the wikimedia data is too large
//    @Column(columnDefinition = "CLOB")
    @Column(columnDefinition = "TEXT", length = 10000)
    private String wikiEventData;

}
