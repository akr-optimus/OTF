package org.otf.core;

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
    abstract loadfile(String path)
}
