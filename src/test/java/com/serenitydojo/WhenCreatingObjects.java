package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {

        // to pass the variables a constructor should be created
        Dog fido = new Dog("fido","Bone",5);
        //getmethods should be created on the main class

        Assert.assertEquals(fido.getName(), "fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());

    }
}
