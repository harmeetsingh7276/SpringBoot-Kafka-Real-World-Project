package net.kafka.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recent_change")
@Getter
@Setter
public class WikiMediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob//Used this annotation since the wikimedia data is too large
    private String wikiEventData;

}
