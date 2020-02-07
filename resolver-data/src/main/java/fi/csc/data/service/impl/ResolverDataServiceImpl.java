package fi.csc.data.service.impl;

import fi.csc.data.repository.EducationalMaterialRepository;
import fi.csc.data.entity.Identifier;
import fi.csc.data.service.ResolverDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResolverDataServiceImpl implements ResolverDataService {

    private EducationalMaterialRepository educationalMaterialRepository;

    @Autowired
    public void setIdentifierStreamRepository(EducationalMaterialRepository educationalMaterialRepository) {
        this.educationalMaterialRepository = educationalMaterialRepository;
    }

    @Override
    @Transactional
    public List<Identifier> getMetadataIdentifiers() {
        return this.educationalMaterialRepository.loadIdentifiers().collect(Collectors.toList());
    }
}
