package fi.csc.provider.model.xml_lrmi.sublevel_1st.sublevel_2nd;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@SuppressWarnings("unused")
@Getter
@Setter
@XmlAccessorType(XmlAccessType.NONE)
public class GeneralType {

    @XmlValue
    private String value;

}
