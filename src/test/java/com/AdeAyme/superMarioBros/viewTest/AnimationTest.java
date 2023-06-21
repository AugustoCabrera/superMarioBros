package com.AdeAyme.superMarioBros.viewTest;
import com.AdeAyme.superMarioBros.view.Animation;
import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.*;
public class AnimationTest {
    @Test
    public void animateTest(){
        BufferedImage[] leftFrames = new BufferedImage[3], rightFrames = new BufferedImage[3];
        for(int i=0; i<3; i++){
            BufferedImage image= new BufferedImage(10,10,1);
            leftFrames[i]=image;
            BufferedImage image2= new BufferedImage(10,10,1);
            rightFrames[i]=image2;
        }
        Animation animation = new Animation(leftFrames, rightFrames);
        assertSame(animation.animate(2,true),rightFrames[1]);
        assertSame(animation.animate(1, false), leftFrames[2]);
    }

}
