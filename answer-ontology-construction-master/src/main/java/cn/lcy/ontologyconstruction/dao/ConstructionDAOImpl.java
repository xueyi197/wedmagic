package cn.lcy.ontologyconstruction.dao;

import org.apache.jena.ontology.Individual;

import java.util.List;

public class ConstructionDAOImpl extends ConstructionBaseDAOImpl implements ConstructionDAOI {

    @Override
    public boolean addAreaObjectProperty(Individual individualStart, String relationName, Individual individualEnd) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAreaObjectProperties(Individual individualStart, List<String> relationName, List<Individual> individualEnd) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAcademyProperty(Individual individualStart, String relationName, Individual individualEnd) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addAcademyProperties(Individual individualStart, List<String> relationName, List<Individual> individualEnd) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addCompanyProperty(Individual individualStart,
                                      String relationName, Individual individualEnd) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addCompanyProperties(Individual individualStart,
                                        List<String> relationName, List<Individual> individualEnd) {
        // TODO Auto-generated method stub
        return false;
    }


}