package spring.service;

import java.util.List;

import spring.model.WebDocument;

public interface WebDocumentServiceIF {
	  WebDocument findById(int id);
	  
	    List<WebDocument> findAll();
	     
	    List<WebDocument> findAllByUserId(int id);
	     
	    void saveDocument(WebDocument document);
	     
	    void deleteById(int id);
}
