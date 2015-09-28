package org.otf.exceptions;

class OTFException extends Exception {
    String message
    String fileName
    String lineNo

    OTFException(String msg, String source, String line) {
        super (msg + source + line)
    }

    OTFException(String msg) {
        super(msg)
    }
}

class OTFNoAddressException extends OTFException {
    OTFNoAddressException(String msg) {
        super(msg)
    }
}

class OTFConfigFileMissingException extends OTFException {
    OTFConfigFileMissingException(String msg) {
        super(msg)
    }
}
