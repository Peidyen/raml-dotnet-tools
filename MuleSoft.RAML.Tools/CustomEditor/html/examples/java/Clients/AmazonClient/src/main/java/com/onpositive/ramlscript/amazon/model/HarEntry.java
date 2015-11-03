package com.onpositive.ramlscript.amazon.model;

import javax.xml.bind.annotation.XmlElement;

public class HarEntry {

    @XmlElement(name="response")
    public HarEntryResponse response;


    @XmlElement(name="request")
    public HarEntryRequest request;

}