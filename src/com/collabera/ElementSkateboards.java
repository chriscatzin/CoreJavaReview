package com.collabera;

public class ElementSkateboards extends skateboard{

    private String color;
    private String shape;
    private int cost;

    public ElementSkateboards(String name, int size, String wheels, String trucks, String bearings, String color, String shape, int cost) {
        super(name, size, wheels, trucks, bearings);
        this.color = color;
        this.shape = shape;
        this.cost = cost;
    }
}
