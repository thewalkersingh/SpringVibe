package com.horizon.springvibe.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
//import org.hibernate.annotations.Polymorphism;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// @PrimaryKeyJoinColumn(name = "video_id")
/* using custom name for id, diff from the inherited id col of parent class, only works with JOINED strategy */
//@DiscriminatorValue("Video") // --> only need for SINGLE_TABLE strategy
//@Polymorphism(type = PolymorphismType.EXPLICIT) // deprecated
public class Video extends Resource {
	
	private int length;
	
}