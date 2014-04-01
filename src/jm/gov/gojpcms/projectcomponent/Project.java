/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jm.gov.gojpcms.projectcomponent;

import java.util.ArrayList;
import jm.gov.gojpcms.documentcomponent.Document;

/**
 * Project represents a GOJPCMS project
 * @author JCARJ
 */
public class Project {
    
    /**
     * To generate automatic unique IDs for Projects
     */
    private static float nextId = 0;

    /**
     * Project Id
     */
    private float id;
    
    /**
     * Project name
     */
    private String name;
    
    /**
     * Project Description
     */
    private String  description;
    /**
     * Funding Arrangement for the project
     */
    private FundingArrangement fa;
    
    /**
     * Project state
     */
    private ProjectState state;
    
    /**
     * Project Document List
     */
    private ArrayList<Document> projectDocuments;
    
    
    /**
     * Project Geographic Location
     */
    private String projectLocation;
    
    /**
     * Project Funding Type : Capital A or Capital B
     */
    private ProjectType projectFundingType;

    /**
     * Total Cost for the project (Aggregate cost of all sub-projects)
     */
    private float  totalCost;
    /**
     * Project Beneficiaries
     */
    private ProjectBeneficiaries beneficiaries;

    /**
     * Constructor
     * @param name - Project name
     * @param description - Project Description
     * @param projectLocation - Geographic Location
     * @param projectFundingType - Funding Type: Capital A or Capital B
     * @param fa - funding arrangement
     * @param beneficiaries - beneficiaries
     */
    public Project(String name, String description, String projectLocation, ProjectType projectFundingType, FundingArrangement fa, ProjectBeneficiaries beneficiaries) {
        this.id = ++Project.nextId;
        this.name = name;
        this.description = description;
        this.state = ProjectState.INCEPTION;
        this.projectLocation = projectLocation;
        this.projectFundingType = projectFundingType;
        this.beneficiaries = beneficiaries;
        this.fa = fa;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FundingArrangement getFa() {
        return fa;
    }

    public void setFa(FundingArrangement fa) {
        this.fa = fa;
    }

    public ProjectState getState() {
        return state;
    }

    public void setState(ProjectState state) {
        this.state = state;
    }

    public ArrayList<Document> getProjectDocuments() {
        return projectDocuments;
    }

    public void setProjectDocuments(ArrayList<Document> projectDocuments) {
        this.projectDocuments = projectDocuments;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }

    public ProjectType getProjectFundingType() {
        return projectFundingType;
    }

    public void setProjectFundingType(ProjectType projectFundingType) {
        this.projectFundingType = projectFundingType;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public ProjectBeneficiaries getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(ProjectBeneficiaries beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    
   
    
}

/**
 * Enum for the different project states
 * @author JCARJ
 */
enum ProjectState {
    INCEPTION, PREPARATION, IMPLEMENTATION, TERMINATION, POSTEVALUATION, CANCELLED
}

/**
 * Enum for project funding type
 * @author JCARJ
 */
enum ProjectType {
    CAPITAL_A, CAPITAL_B
}