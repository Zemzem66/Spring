package at.fhtw.bif.paperless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//Muss man machen damit die abhaengig funktioniert
@Component
public class ComponentA {

    //Dependecy injection
    @Autowired
    private ComponentB componentB;

    public void demo()
    {
        //Von compent A is abhaning von componentB aber wichtig nur mit dem Interface keine direkte abhaning mit dem ComponentBimpl
        componentB.sayHello();
        componentB.saveOnePerson();
        componentB.printAllPersons();
    }
}
