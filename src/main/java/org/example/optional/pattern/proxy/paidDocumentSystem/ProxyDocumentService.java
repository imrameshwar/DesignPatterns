package org.example.optional.pattern.proxy.paidDocumentSystem;

public class ProxyDocumentService implements DocumentService{
    private RealDocumentService realDocumentService = new RealDocumentService();

    @Override
    public void previewDocument(User user, String documentId) {
        realDocumentService.previewDocument(user, documentId);
    }

    @Override
    public void downloadDocument(User user, String documentId) {
        if (user.isPremium()) {
            realDocumentService.downloadDocument(user, documentId);
        } else {
            System.out.println("Download not available for non-premium users.");
        }
    }

}
