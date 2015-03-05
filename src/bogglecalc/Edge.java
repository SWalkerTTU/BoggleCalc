/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogglecalc;

/**
 *
 * @author scott.walker
 */
public class Edge {

    private final byte node1, node2;

    public Edge(byte a, byte b) {
        node1 = a;
        node2 = b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.node1;
        hash = 73 * hash + this.node2;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Edge)) {
            return false;
        }
        Edge e = (Edge) o;
        final byte a = e.getNode1();
        final byte b = e.getNode2();
        return (a == this.node1 && b == this.node2)
                || (b == this.node1 && a == this.node2);
    }

    byte getNode1() {
        return node1;
    }

    byte getNode2() {
        return node2;
    }
}
