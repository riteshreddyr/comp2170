/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jm.gov.projectcomponent;

/**
 *
 * @author RiteshReddy
 */
public class TechnicalAssitanceProject extends Project{
    private Consultant consultant;
    private TermsOfReference tof;

    public TechnicalAssitanceProject(String name, String description, String projectLocation, ProjectType projectFundingType, FundingArrangement fa, ProjectBeneficiaries beneficiaries) {
        super(name, description, projectLocation, projectFundingType, fa, beneficiaries);
    }
    
    
}