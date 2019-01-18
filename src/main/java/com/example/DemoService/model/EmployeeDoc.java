package com.example.DemoService.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeDoc {
    @Id
   private String id;
    private String name;
    private String address;


    public EmployeeDoc() {
    }

public EmployeeDoc(String id,String name,String address){
    this.id=id;
    this.name=name;
    this.address=address;
}
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
         return "ID:"+this.id+","+ "Name;"+this.name +","+this.address;
    }
}
