package fi.csc.oaipmh.service;

import fi.csc.oaipmh.model.response.AoeMetadata;
import fi.csc.oaipmh.model.xml_lrmi.LrmiMetadata;

import java.util.List;

public interface RequestService {

    List<LrmiMetadata> getMetadata();
    List<AoeMetadata> getAoeMetadata();

}
