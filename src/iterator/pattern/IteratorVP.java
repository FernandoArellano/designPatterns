package iterator.pattern;

import java.util.Iterator;

public class IteratorVP implements Iterator {

    VP[] vps;
    private int location=0;

    public IteratorVP(VP[] vps) {
        this.vps = vps;
    }


    public boolean hasNext() {
        if(location < vps.length && vps[location] != null){
            return true;
        }
        return false;
    }


    public VP next() {
        return vps[location++];
    }
}
