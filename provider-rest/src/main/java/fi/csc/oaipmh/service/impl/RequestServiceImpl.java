package fi.csc.oaipmh.service.impl;

import fi.csc.oaipmh.model.request.MetadataRequest;
import fi.csc.oaipmh.model.response.AoeMetadata;
import fi.csc.oaipmh.model.xml_lrmi.LrmiMetadata;
import fi.csc.oaipmh.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private Environment env;
    private RestTemplate restTemplate;

    @Autowired
    public RequestServiceImpl(Environment env, RestTemplate restTemplate) {
        this.env = env;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<LrmiMetadata> getMetadata() {
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);

        MetadataRequest metadataRequest = new MetadataRequest();
        metadataRequest.setDateMin(now.minusYears(1));
        metadataRequest.setDateMax(now);
        metadataRequest.setMaterialPerPage(Long.parseLong(env.getProperty("aoe.request.per-page", "100")));
        metadataRequest.setPageNumber(0L);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<MetadataRequest> request = new HttpEntity<>(metadataRequest, headers);

        ResponseEntity<List<LrmiMetadata>> lrmiResponse = restTemplate.exchange(env.getProperty("aoe.request.url"),
                HttpMethod.POST, request, new ParameterizedTypeReference<>(){});

        return lrmiResponse.getBody();
    }

    @Override
    public List<AoeMetadata> getAoeMetadata() {
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);

        MetadataRequest metadataRequest = new MetadataRequest();
        metadataRequest.setDateMin(now.minusYears(1));
        metadataRequest.setDateMax(now);
        metadataRequest.setMaterialPerPage(Long.parseLong(env.getProperty("aoe.request.per-page", "100")));
        metadataRequest.setPageNumber(0L);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<MetadataRequest> request = new HttpEntity<>(metadataRequest, headers);

        return restTemplate.exchange(env.getProperty("aoe.request.url"),
            HttpMethod.POST, request, new ParameterizedTypeReference<List<AoeMetadata>>(){}).getBody();
    }
}