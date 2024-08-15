package org.javaacademy.module1.lesson6.homework3.phonefabric;

public class Components {
    private int camera; // Камера
    private int processor; // Процессор
    private int processor2; // Процессор
    private int corpusLength; // Корпус длинна
    private int corpusWidth; // Корпус ширина
    private int corpusThickness;  // Корпус толщина

    public Components() {
    }

    public Components(int camera, int processor, int corpusLength,
                      int corpusWidth, int corpusThickness) {
        this.camera = camera;
        this.processor = processor;
        this.corpusLength = corpusLength;
        this.corpusWidth = corpusWidth;
        this.corpusThickness = corpusThickness;
    }

    public Components(int camera, int processor, int processor2, int corpusLength,
                                            int corpusWidth, int corpusThickness) {
        this.camera = camera;
        this.processor = processor;
        this.processor2 = processor2;
        this.corpusLength = corpusLength;
        this.corpusWidth = corpusWidth;
        this.corpusThickness = corpusThickness;
    }

    public int getCamera() {
        return camera;
    }

    public int getProcessor() {
        return processor;
    }

    public int getProcessor2() {
        return processor2;
    }

    public int getCorpusLength() {
        return corpusLength;
    }

    public int getCorpusWidth() {
        return corpusWidth;
    }

    public int getCorpusThickness() {
        return corpusThickness;
    }
}
