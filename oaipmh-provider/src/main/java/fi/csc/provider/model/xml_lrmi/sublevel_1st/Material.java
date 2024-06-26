package fi.csc.provider.model.xml_lrmi.sublevel_1st;

import fi.csc.provider.model.xml_lrmi.sublevel_1st.sublevel_2nd.Url;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.List;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.NONE)
public class Material {

    @XmlElement(name = "lrmi_fi:name")
    private List<LangValue> displayNames;

    @XmlElement(name = "lrmi_fi:url")
    private String url;

    @XmlElement(name = "lrmi_fi:url")
    private Url pdfUrl;

    @XmlElement(name = "lrmi_fi:position")
    private Integer position;

    @XmlElement(name = "lrmi_fi:format")
    private String format;

    @XmlElement(name = "lrmi_fi:filesize")
    private Integer fileSize;

    @XmlElement(name = "lrmi_fi:inLanguage")
    private String inLanguage;

    public List<LangValue> getDisplayNames() {
        return displayNames;
    }

    public void setDisplayNames(List<LangValue> displayNames) {
        this.displayNames = displayNames;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Url getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(Url pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }
}
