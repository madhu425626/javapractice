void main(){
    byte a = Byte.parseByte(IO.readln());
    IO.println("Byte value: "+a);

    short b = Short.parseShort(IO.readln());
    IO.println("Short value: "+b);

    int d = Integer.parseInt(IO.readln());
    IO.println("Int value: "+d);

    long c = Long.parseLong(IO.readln());
    IO.println("Long value: "+c);

    float e = Float.parseFloat(IO.readln());
    IO.println("Float value: "+e);

    double f = Double.parseDouble(IO.readln());
    IO.println("Double value: "+f);

    char g = IO.readln().charAt(0);
    IO.println("Char value: "+g);

    boolean h = Boolean.parseBoolean(IO.readln());
    IO.println("Boolean value: "+h);

    String value = IO.readln();
    IO.println("String value: "+value);
}
