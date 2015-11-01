import org.specs2.mutable.Specification

class JarvisSpecs extends Specification{

  "The Jarvis" should{
    "sayHell to " in {
      Jarvis sayHelloTo "abc" mustEqual "Hello abc"
    }

    "echo back" in {
      Jarvis echosBack "blah" mustEqual "blah"
    }

    "greet morning in morning time" in {
      Jarvis.greetsInMorning mustEqual "Good morning Sire!!"
    }
  }
}