package com.project.penbox;


import com.project.penbox.objects.Pen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PenBoxTest {
@Test
    public void checkTotalBluePenInBox(){
    PenBox penbox=new PenBox();
    penbox.add(new Pen("blue","Sketch"));
    penbox.add(new Pen("red","Sketch"));
    Assert.assertEquals(1,penbox.getPensWithGivenColor("blue"));
}
}