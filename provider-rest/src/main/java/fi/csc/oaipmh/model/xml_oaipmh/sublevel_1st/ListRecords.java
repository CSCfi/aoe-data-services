package fi.csc.oaipmh.model.xml_oaipmh.sublevel_1st;

import fi.csc.oaipmh.model.xml_oaipmh.sublevel_1st.sublevel_2nd.Record;
import fi.csc.oaipmh.model.xml_oaipmh.sublevel_1st.sublevel_2nd.ResumptionToken;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.NONE)
@XmlSeeAlso({Record.class, ResumptionToken.class})
@XmlType(propOrder = {"records", "resumptionToken"})
@XmlRootElement(name = "ListRecords")
public class ListRecords {

    @XmlElement(name = "record")
    private List<Record> records;

    @XmlElement(name = "resumptionToken")
    private ResumptionToken resumptionToken;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public ResumptionToken getResumptionToken() {
        return resumptionToken;
    }

    public void setResumptionToken(ResumptionToken resumptionToken) {
        this.resumptionToken = resumptionToken;
    }
}
