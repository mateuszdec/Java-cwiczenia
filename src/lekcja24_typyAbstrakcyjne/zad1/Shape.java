package lekcja24_typyAbstrakcyjne.zad1;

interface Shape {
    int RECTANGLE = 1;
    int CIRCLE = 2;
    int TRIANGLE = 3;

    double PI = 3.14;


    double calculateArea();
    double calculatePerimeter();
}