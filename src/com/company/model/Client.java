package com.company.model;

public class Client {
    private int _id;
    private String _name;
    private String _lastName;

    public Client(int id, String name, String lastName){
        this._id = id;
        this._name = name;
        this._lastName = lastName;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }
}
