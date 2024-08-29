package ru.a148ru.examples.solid.dip;

public class Mammal {
    MakingNoise speaker;

    public Mammal(MakingNoise sp){
        this.speaker = sp;
    }

    public String makeNoise(){
        return this.speaker.makeNoise();
    }
}
