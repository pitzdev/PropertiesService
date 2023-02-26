package com.stayhere.entity;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "category")
public class Category implements Serializable {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long id;
  private String name;
  private String description;

}
