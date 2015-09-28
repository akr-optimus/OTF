package org.otf.core;

abstract class Config {
    def config

}

abstract class ConfigReader {
    def config

    abstract readConfig(String path)
    abstract readConfig(InputStream i)
}

class XMLConfigReader extends ConfigReader {
    def readConfig(String path) {
    }

    def readConfig(InputStream i) {
    }
}
