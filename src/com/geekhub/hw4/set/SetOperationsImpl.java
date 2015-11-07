package com.geekhub.hw4.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by JeT on 02.11.2015.
 */
public class SetOperationsImpl implements SetOperations {

    public SetOperationsImpl() {
    }

    @Override
    public boolean equals(Set a, Set b) {
        return a.containsAll((Set) b);
    }

    @Override
    public Set union(Set a, Set b) {
        if(b.size()>0){
           a.addAll(b);
        }
        return a;
    }

    @Override
    public Set subtract(Set a, Set b) {
        for (Object object : b){
            if (a.contains(object)){
                a.remove(b);
            }
        }
        return a;
    }

    @Override
    public Set intersect(Set a, Set b) {
        Set intersectSets = new TreeSet();
        for (Object object:b){
            if (a.contains(object)){
                intersectSets.add(object);
            }
        }
        for (Object object:a){
            if (b.contains(object)){
                intersectSets.add(object);
            }
        }
        return intersectSets;
    }

    @Override
    public Set symmetricSubtract(Set a, Set b) {
        Set symmetricSubSet = new TreeSet();
        symmetricSubSet.addAll(subtract(a,b));
        symmetricSubSet.addAll(subtract(b,a));
        return symmetricSubSet;
    }
}
