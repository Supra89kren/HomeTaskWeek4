package com.geekhub.hw4.set;

import java.util.Objects;
import java.util.Set;

/**
 * Created by JeT on 02.11.2015.
 */
public class SetExample implements SetOperations {
    @Override
    public boolean equals(Set a, Set b) {
        return a.containsAll((Set) b);
    }

    @Override
    public Set union(Set a, Set b) {
        if(b.size()>0){
            for (Object obj:b){
                a.add(b);
            }
        }
        return a;
    }

    @Override
    public Set subtract(Set a, Set b) {
        return null;
    }

    @Override
    public Set intersect(Set a, Set b) {
        return null;
    }

    @Override
    public Set symmetricSubtract(Set a, Set b) {
        return null;
    }
}
