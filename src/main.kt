fun main(){
   // Assignment 6: Inheritance
  //  1.Create a class Car with the following attributes: make, model, color, capacity.
  //  It has these functions:
   // -carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
   // number of people is within its capacity else it prints out “Over capacity
   // by $x people” where x is the number of people exceeding its capacity
   // (3 points)
   // -identity() : Prints out the color, make and modelin the following
   // format e.g:  “I am a white subaru legacy”(1 point)
  //  -calculateParkingFees(hours: Int) : Calculates andreturns the
   // parking fees by multiplying the hours by 20(1 point)
   // 2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
   // calculates and returns the maximum amount of fare that can be collected per
   // trip.(2 points)
   // The bus’calculateParkingFees method returns the productof hours and
           // the capacity of the bus(3 points)
    //Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
   // and call each of the functions on the objects.
   var toyota= Car("Toyota","prado","pink",5)
    toyota.carry(6)
   toyota.carry(4)
   toyota.identity()
   println(toyota.calculatepackingFees(5))

   var miniBus = Bus("Jumiabus","suuba","white",56)
   println(miniBus.mixedTripleFare(50.0))

   println(miniBus.calculatepackingFees(2))



}

 open class Car(var make:String,var model:String,var Color:String,var capacity:Int){
   fun carry(people: Int){
      var x= people-capacity
      if (people<=capacity){
         println("carrying $people passengers")
      }
      else {
         println("overcapacity by $x people")
      }
   }
   fun identity(){
     println("I am a $Color $make $model")
   }

   open fun calculatepackingFees(hours: Int):Int{
      var Fees= hours*20
      return Fees
   }

}
class Bus( make:String, model:String, Color:String, capacity:Int):Car(make,model,Color,capacity){
   fun mixedTripleFare(Fare:Double):Double{
      var Farebus=Fare*capacity
      return Farebus

   }

   override fun calculatepackingFees(hours: Int): Int {
      var w= hours*capacity
      return w
   }
}
