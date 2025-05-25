package org.example.optional.pattern.proxy.paidDocumentSystem;

public class UserClient {
    public static void main(String[] args) {
        User premiumUser = new User("Alice", true);
        User regularUser = new User("Bob", false);

        DocumentService documentService = new ProxyDocumentService();

        // Premium user can preview and download documents
        documentService.previewDocument(premiumUser, "doc123");
        documentService.downloadDocument(premiumUser, "doc123");

        // Regular user can only preview documents
        documentService.previewDocument(regularUser, "doc456");
        // The following line would throw an exception if uncommented
        documentService.downloadDocument(regularUser, "doc456");
    }
}
