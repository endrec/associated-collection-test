package example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRestAssociatedCollectionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestAssociatedCollectionTestApplication.class, args);
    }

    @Bean
    CommandLineRunner init(final CollectorRepository collectorRepository, final ArtifactRepository artifactRepository) {

        return new CommandLineRunner() {

            @Override
            public void run(String... arg0) throws Exception {
                collectorRepository.save(new Collector().name("Ann"));
                collectorRepository.save(new Collector().name("Bob"));
                collectorRepository.save(new Collector().name("Cleo"));

                artifactRepository.save(new Artifact().title("Ugly sculpture"));
                artifactRepository.save(new Artifact().title("Very expensive painting"));
                artifactRepository.save(new Artifact().title("No one knows"));
            }

        };

    }
}
