package br.com.supera.game.store.models;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Product {

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

}