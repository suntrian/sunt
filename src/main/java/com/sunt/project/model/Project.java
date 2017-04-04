package com.sunt.project.model;

import com.sunt.product.model.Product;
import com.sunt.product.model.ProductVersion;
import com.sunt.user.model.Department;
import com.sunt.user.model.User;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by suntrian on 17-4-2.
 */
public class Project implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String summary;
    private String description;
    private ProjectType type;
    private Date planStartDate;
    private Date planFinishDate;
    private boolean hasAttach;
    private User creator;
    private User manager;
    private ProjectStatus status;
    private Set<Department> relateDepartments;
    private Date actualStartDate;
    private Date actualFinishDate;
    private Product product;
    private ProductVersion productVersion;

    public Project(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public Date getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    public Date getPlanFinishDate() {
        return planFinishDate;
    }

    public void setPlanFinishDate(Date planFinishDate) {
        this.planFinishDate = planFinishDate;
    }

    public boolean isHasAttach() {
        return hasAttach;
    }

    public void setHasAttach(boolean hasAttach) {
        this.hasAttach = hasAttach;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public Set<Department> getRelateDepartments() {
        return relateDepartments;
    }

    public void setRelateDepartments(Set<Department> relateDepartments) {
        this.relateDepartments = relateDepartments;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualFinishDate() {
        return actualFinishDate;
    }

    public void setActualFinishDate(Date actualFinishDate) {
        this.actualFinishDate = actualFinishDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductVersion getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(ProductVersion productVersion) {
        this.productVersion = productVersion;
    }
}
