package pojo;

public  abstract class Human extends Animal {
    public void eat() {
        System.out.println("我喜欢吃海鲜！");
    }

    public void sleep() {
        System.out.println("我喜欢陪着波多野结衣碎觉觉!");
    }

    public void makesound() {
        System.out.println("志玲姐姐，大清早别吵我睡觉!");
    }

    public abstract void playBasketBall();

    public abstract void playGame();
}
