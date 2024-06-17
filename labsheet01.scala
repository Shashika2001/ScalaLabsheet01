//Q1
def Area(r: Double): Double = math.Pi*r*r;

//Q2
def TempInFahrenheit(C: Double):Double = C*1.8000+32.00;

//Q3
def VolumeOfSphere(r:Double):Double =(4/3)*math.Pi*r*r*r;

//Q4
//Total cover price of books
def BookPrice(x:Int):Double=x*24.95;

//discount by bookstore
def Discount(amount:Double):Double=amount*0.4;

//shipping cost
def shipCharge(x:Int):Double=3 + (x-50)*0.75;

//total cost
def TotalCost(x:Int):Double=BookPrice(x)-Discount(BookPrice(x))+shipCharge(x);

//Q5
//DEP-:Distance by Easy Pace
//DT-:Distance by tempo
def TotalRunningTime(DEP:Double,DT:Double):Double=DEP*8+DT*7;

