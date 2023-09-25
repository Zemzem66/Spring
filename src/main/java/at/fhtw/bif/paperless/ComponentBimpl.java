package at.fhtw.bif.paperless;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// Damit ich es im ComponentA benutzen kann
@Component
@Slf4j  // DAMIT ES WIE ANDER GELOGGT WIRD
public class ComponentBimpl implements ComponentB
{
    @Autowired
    private PersonRepository personRepository;
    @Override
    public void sayHello()
    {
        // DAMIT ES WIE ANDERE GELOGGT WIRD
        log.info("Say Hello");
    }

    @Override
    public void saveOnePerson() {
        PersonEntity person= PersonEntity.builder().name("Mustafa").build();
        personRepository.save(person); // so einfach geht es
    }

    @Override
    public void printAllPersons() {
        personRepository.findAll().forEach(personEntity -> log.info(personEntity.toString()));
    }


}