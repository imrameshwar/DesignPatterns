package org.example.optional.pattern.proxy.paidDocumentSystem;

public interface DocumentService {
    void previewDocument(User user, String documentId);
    void downloadDocument(User user, String documentId);
}
