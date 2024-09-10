/*Задача 3.
Создать приложение, которое преобразует введенное пользователем натуральное число
из 10-ичной системы в двоичную.*/
fun main(){
    println("Введите число в 10-тичной системе счисления")
    var sys:Double?= readln() as? Double
    if(sys == null) print("Введено некорректное значение")
    var num:Double=0.0
    var count=0
    var per:Double
    sys?.let{ while(sys>0){
        per= sys%2
        sys/=2
        num += per * Math.pow(10.0, count.toDouble())
        count++
    }
        print("Число в 2-ичной системе счисления: ${num.toInt()}")
    }

}