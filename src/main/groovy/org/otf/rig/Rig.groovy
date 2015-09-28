package org.otf.rig;

import org.otf.core.*;
import org.otf.exceptions.*;

abstract class AbstractRig {
    List<Node> nodes
    abstract void initialise()
    
}

class Rig {
    def config
    List<Node> nodes
    Node dut

    Rig(Config cfg) {
        nodes = new ArrayList<Node>()
        cfg.get('nodes').each { n ->
            Node node
            String type = n['type'].toLowerCase()
            switch (type) {
            case 'linux':
            node = new LinuxNode(n)
            break
            case 'window':
            node = new WindowsNode(n)
            break
            case 'bsd':
            node = new BSDNode(n)
            break
            case 'solaris':
            break
            node = new SolarisNode(n)
            break
            default:
            node = new LinuxNode(n)
            nodes.add(node)
            }
        }
        dut = new DUTNode(cfg.get('dut'))
        instance.setConfig(cfg)
    }

    Rig() {
        cfg = [:]
    }

    def setConfig(Config cfg) {
        config = cfg
    }
}
