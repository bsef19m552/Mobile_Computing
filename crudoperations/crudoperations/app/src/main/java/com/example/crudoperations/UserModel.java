package com.example.crudoperations;
public class UserModel {
    String id = "";
    String name ="";
    String email = "";
    String created_at= "";

    public UserModel() {
    }

    public UserModel(String id, String name, String email, String created_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.created_at = created_at;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}

