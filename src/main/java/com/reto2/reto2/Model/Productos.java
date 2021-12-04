/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.reto2.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Manager
 */
@Document(collection = "cleaningproducts")

@Data

@NoArgsConstructor

@AllArgsConstructor
public class Productos {
    
@Id
private Integer id;

private String brand;

private String category;

private String name;

private String description;

private double price;

private boolean availability = true;

private int quantity;

private String photography;
    
}
