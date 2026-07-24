void main(){

    IO.println(calculateArea(Integer.parseInt(IO.readln())));
    int a = Integer.parseInt(IO.readln());
    int b = Integer.parseInt(IO.readln());
    IO.println(calculateArea(a,b));
    IO.println(calculateArea(Float.parseFloat(IO.readln())));
    
}

String calculateArea(int x){
    return "Area of the Square :"+(x*x);
}
String calculateArea(int x, int y){
    return "Area of the Rectangle :"+(x*y);
}
String calculateArea(float x){
    return String.format("Area of the Circle is %.2f",(x*x*3.14));
} 
