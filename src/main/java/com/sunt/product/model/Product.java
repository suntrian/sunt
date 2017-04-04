package com.sunt.product.model;

import com.sunt.user.model.User;

import java.io.Serializable;

/**
 * Created by suntrian on 17-4-2.
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String summary;
    private String description;
    private User creator;
    private User manager;

}
