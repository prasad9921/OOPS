import java.util.Scanner;
class MethodOverload{

int add(int x, int y){
return x+y;
}

double add(double x, double y){
return x+y;
}

double add(int x, double y){
return x+y;
}

int add(double x, int y){
return (int)x+y;
}


String add(String x, String y){
return x+y;
}

}

