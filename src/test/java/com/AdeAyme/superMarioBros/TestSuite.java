package com.AdeAyme.superMarioBros;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        com.AdeAyme.superMarioBros.modelTest.BricksTest.class,
        com.AdeAyme.superMarioBros.modelTest.CoinTest.class,
        com.AdeAyme.superMarioBros.modelTest.FireFlowerTest.class,
        com.AdeAyme.superMarioBros.modelTest.MarioTest.class,
        com.AdeAyme.superMarioBros.modelTest.SuperMushroomTest.class,
        com.AdeAyme.superMarioBros.modelTest.GoombaTest.class,
        com.AdeAyme.superMarioBros.modelTest.KoopaTroopaTest.class,
        com.AdeAyme.superMarioBros.modelTest.FireballTest.class,
        com.AdeAyme.superMarioBros.modelTest.MarioFireTest.class,
        com.AdeAyme.superMarioBros.modelTest.MarioNormalTest.class,
        com.AdeAyme.superMarioBros.modelTest.MarioSuperTest.class,
        com.AdeAyme.superMarioBros.modelTest.OneUpMushroomTest.class,
        com.AdeAyme.superMarioBros.modelTest.EndFlagTest.class,
        com.AdeAyme.superMarioBros.modelTest.BoostItemTest.class,
        com.AdeAyme.superMarioBros.modelTest.GameObjectTest.class,
        com.AdeAyme.superMarioBros.modelTest.MapTest.class,
        com.AdeAyme.superMarioBros.viewTest.AnimationTest.class,
        com.AdeAyme.superMarioBros.viewTest.UIManagerTest.class,
        com.AdeAyme.superMarioBros.viewTest.MapSelectionItemTest.class,
        com.AdeAyme.superMarioBros.viewTest.MapSelectionTest.class
})
public class TestSuite {
}
