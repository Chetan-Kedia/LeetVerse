// File: SubDemo.java
package pack2;

import pack1.Demoo;

public class SubDemoo extends Demoo {

    public void access() {
        System.out.println(a); // ✔ public
        System.out.println(b); // ✔ protected (via inheritance)
        // System.out.println(c); // ❌ default
        // System.out.println(d); // ❌ private
    }
}