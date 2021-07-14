package br.com.supera.game.store.models;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Product {

   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   public long id;

   @NotEmpty
   public String name;

   @NotNull
   public BigDecimal price;

   @NotNull
   public short score;

   @NotNull
   public String image;



   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public BigDecimal getPrice() {
      return price;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   public short getScore() {
      return score;
   }

   public void setScore(short score) {
      this.score = score;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }

}