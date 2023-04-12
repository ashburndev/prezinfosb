package ashburncode.prezinfosb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ashburncode.prezinfosb.model.Election;
import ashburncode.prezinfosb.model.President;
import ashburncode.prezinfosb.model.Term;
import ashburncode.prezinfosb.repository.PresidentRepository;

@SpringBootApplication
public class PrezinfosbApplication {

  public static void main(String[] args) {
    SpringApplication.run(PrezinfosbApplication.class, args);
  }

  // https://en.wikipedia.org/wiki/List_of_presidents_of_the_United_States
  // https://en.wikipedia.org/wiki/1980_United_States_presidential_election
  // November 4, 1980 43,903,230 50.75% 489 86,509,678 100% 538
  // https://en.wikipedia.org/wiki/1984_United_States_presidential_election
  // November 6, 1984 54,455,472 58.77% 525 92,653,233 100% 538

  // @Bean
  // public ApplicationRunner configure(PresidentRepository presidentRepository) {
  //   return env -> {
  //     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
  //     presidentRepository.save(new President("George", "", "Washington", "Unaffiliated"));
  //     presidentRepository.save(new President("John", "", "Adams", "Federalist"));
  //     presidentRepository.save(new President("Thomas", "", "Jefferson", "Democratic-Republican"));
  //     presidentRepository.save(new President("Abraham", "", "Lincoln", "Republican"));
  //     presidentRepository.save(new President("Theodore", "", "Roosevelt", "Republican"));
  //     presidentRepository.save(new President("William", "Howard", "Taft", "Republican"));
  //     presidentRepository.save(new President("Woodrow", "", "Wilson", "Democratic"));
  //     presidentRepository.save(new President("Warren", "G.", "Harding", "Republican"));
  //     presidentRepository.save(new President("Calvin", "", "Coolidge", "Republican"));
  //     presidentRepository.save(new President("Herbert", "", "Hoover", "Republican"));
  //     presidentRepository.save(new President("Franklin", "D.", "Roosevelt", "Democratic"));
  //     presidentRepository.save(new President("Harry", "S.", "Truman", "Democratic"));
  //     presidentRepository.save(new President("Dwight", "D.", "Eisenhower", "Republican"));
  //     presidentRepository.save(new President("John", "F.", "Kennedy", "Democratic"));
  //     presidentRepository.save(new President("Lyndon", "B.", "Johnson", "Democratic"));
  //     presidentRepository.save(new President("Richard", "", "Nixon", "Republican"));
  //     presidentRepository.save(new President("Gerald", "", "Ford", "Republican"));
  //     presidentRepository.save(new President("Jimmy", "", "Carter", "Democratic"));

  //     // presidentRepository.save(new President("Ronald", "", "Reagan", "Republican"));
  //     President president = new President("Ronald", "", "Reagan", "Republican");
  //     president.setElections(new ArrayList<Election>()); 
  //     president.setTerms(new ArrayList<Term>());
  //     // president.getElections().add(new Election(new Date(), false, 489, 43903230L, 538, 86509678L));
  //     // president.getElections().add(new Election(new Date(), true,  525, 54455472L, 538, 92653233L));
  //     // Election election1 = new Election(new Date(), false, 489, 43903230L, 538, 86509678L).setPresident(president);
  //     // Election election2 = new Election(new Date(), true, 525, 54455472L, 538, 92653233L).setPresident(president);
  //     Election election1 = new Election(sdf.parse("1980-11-04"), false, 489, 43903230L, 538, 86509678L);
  //     Election election2 = new Election(sdf.parse("1984-11-06"), true,  525, 54455472L, 538, 92653233L);
  //     election1.setPresident(president);
  //     election2.setPresident(president);
  //     president.getElections().add(election1);
  //     president.getElections().add(election2);
  //     Term term1 = new Term(sdf.parse("1981-01-20"),sdf.parse("1985-01-20"));
  //     Term term2 = new Term(sdf.parse("1985-01-20"),sdf.parse("1989-01-20"));
  //     term1.setPresident(president);
  //     term2.setPresident(president);
  //     president.getTerms().add(term1);
  //     president.getTerms().add(term2);
  //     presidentRepository.save(president);

  //     presidentRepository.save(new President("George", "H. W.", "Bush", "Republican"));
  //     presidentRepository.save(new President("Bill", "", "Clinton", "Democratic"));
  //     presidentRepository.save(new President("George", "W.", "Bush", "Republican"));
  //     presidentRepository.save(new President("Barack", "", "Obama", "Democratic"));
  //     presidentRepository.save(new President("Donald", "", "Trump", "Republican"));
  //     presidentRepository.save(new President("Joe", "", "Biden", "Democratic"));
  //   };
  // }

  // Abraham Lincoln
  // Theodore Roosevelt
  // William Howard Taft
  // Woodrow Wilson
  // Warren G. Harding
  // Calvin Coolidge
  // Herbert Hoover
  // Franklin D. Roosevelt
  // Harry S. Truman
  // Dwight D. Eisenhower
  // John F. Kennedy
  // Lyndon B. Johnson

}
