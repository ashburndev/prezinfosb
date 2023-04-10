package ashburncode.prezinfosb;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ashburncode.prezinfosb.model.President;
import ashburncode.prezinfosb.repository.PresidentRepository;

@SpringBootApplication
public class PrezinfosbApplication {

  public static void main(String[] args) {
    SpringApplication.run(PrezinfosbApplication.class, args);
  }

  // https://en.wikipedia.org/wiki/List_of_presidents_of_the_United_States
  @Bean
  public ApplicationRunner configure(PresidentRepository presidentRepository) {
    return env -> {
      President president = new President("George", "", "Washington", "Unaffiliated");
      presidentRepository.save(president);
      presidentRepository.save(new President("John", "", "Adams", "Federalist"));
      presidentRepository.save(new President("Thomas", "", "Jefferson", "Democratic-Republican"));
      presidentRepository.save(new President("Richard", "", "Nixon", "Republican"));
      presidentRepository.save(new President("Gerald", "", "Ford", "Republican"));
      presidentRepository.save(new President("Jimmy", "", "Carter", "Democratic"));
      presidentRepository.save(new President("Ronald", "", "Reagan", "Republican"));
      presidentRepository.save(new President("George", "H. W.", "Bush", "Republican"));
      presidentRepository.save(new President("Bill", "", "Clinton", "Democratic"));
      presidentRepository.save(new President("George", "W.", "Bush", "Republican"));
      presidentRepository.save(new President("Barack", "", "Obama", "Democratic"));
      presidentRepository.save(new President("Donald", "", "Trump", "Republican"));
      presidentRepository.save(new President("Joe", "", "Biden", "Democratic"));
    };
  }

}
