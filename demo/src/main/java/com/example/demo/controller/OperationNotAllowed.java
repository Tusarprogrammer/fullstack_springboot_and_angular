package com.example.demo.controller;

public class OperationNotAllowed extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 8045423433933233047L;

    public OperationNotAllowed(String message) {
        super(message);
    }

}
