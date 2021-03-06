package gov.samhsa.c2s.documentvalidator.service.dto;

import javax.validation.constraints.NotNull;
import java.util.Optional;

public class ValidationRequestDto {

    @NotNull
    private byte[] document;
    private Optional<String> documentEncoding = Optional.empty();

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

    public Optional<String> getDocumentEncoding() {
        return documentEncoding;
    }

    public void setDocumentEncoding(String documentEncoding) {
        this.documentEncoding = Optional.of(documentEncoding);
    }
}
