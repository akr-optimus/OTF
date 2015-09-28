package org.otf.rig;

import org.otf.exceptions.*

trait Manageable {
    abstract String hostname()
    abstract Object run(String cmd)
    abstract int runAsDaemon(String cmd)
    abstract Object execute(String cmd)
    abstract void upload(String srcPath, String destPath)
    abstract Object getStatus(int pid)
    abstract Object getStreams()
}

trait Configurable {
    def loadFile(String path) {
        try {
            File f = new File(path)
        }
        catch (FileNotFoundException e) {
            throw new OTFConfigFileMissingException("File " + path + " not found")
        }
        catch (Exception e) {
            throw new OTFException("Error")
        }
    }

    Object getValue(String key) {
    }
        
}
