package org.example.optional.pattern.proxy.paidDocumentSystem;

public class RealDocumentService implements DocumentService{
    @Override
    public void previewDocument(User user, String documentId) {
        System.out.println("Previewing document " + documentId + " for user " + user.getName());
    }

    @Override
    public void downloadDocument(User user, String documentId) {
        System.out.println("Downloading document " + documentId + " for premium user " + user.getName());
    }
}
