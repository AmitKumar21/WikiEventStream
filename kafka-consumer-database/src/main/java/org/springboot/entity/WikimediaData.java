package org.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.*;

import org.hibernate.annotations.ColumnDefault;
@Entity
@Table(name = "wikimedia")
@Getter
@Setter
public class WikimediaData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Event_Id")
    @ColumnDefault("null")
    private Integer eventid;
    @Column
    @ColumnDefault("null")
    private String wikititle;
    @Lob
    @ColumnDefault("null")
    private String schemadata;
 
   
 
    @Column
    @ColumnDefault("null")
    private String server_url;
	
    
}