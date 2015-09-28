package org.otf.rig;

import org.otf.core.*;
import org.otf.exceptions.*;

abstract class Node {
    List<String> hostnames
    List<String> ipv4_addr
    List<String> ipv6_addr
    def OS
    Boolean agent_running
    abstract void initialise()
    
    String getIPv4Address() {
        if (!ipv4_addr.size()) {
            throw new OTFNoAddressException("This node does not have any addresses")
        } else {
            return ipv4_addr.getAt(0)
        }
    }

    List<String> getIPv4Addresses() {
        if (!ipv4_addr.size()) {
            throw new OTFNoAddressException("This node does not have any IPv4 addresses")
        } else {
            return ipv4_addr
        }
    }
    
    List<String> getIPv6Addresses() {
        if (!ipv6_addr.size()) {
            throw new OTFNoAddressException("This node does not have any IPv4 addresses")
        } else {
            return ipv6_addr
        }
    }
    
}

class LinuxNode extends Node {
    LinuxNode(def hostnames, def ipv4_addrs, def ipv6_addrs) {
        hostnames = hostnames
        ipv4_addr = ipv4_addrs
        ipv6_addr = ipv6_addrs
        OS = "LINUX"
    }

    LinuxNode(Config cfg) {
        hostnames = cfg.getHostNames()
        ipv4_addr = cfg.getIPv4Addr()
        ipv6_addr = cfg.getIPv6Addr()
    }

    void initialise() {
    }
}

class BSDNode extends Node {
    void initialise() {
    }

}

class SolarisNode extends Node {
    void initialise() {
    }

}

class WindowsNode extends Node {
    void initialise() {
    }

}

class DUTNode extends Node {
    void initialise() {
    }

}
