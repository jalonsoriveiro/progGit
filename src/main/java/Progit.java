import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class Progit {

    public static void main (String [ ] args) throws IOException {

        //GitHub github = GitHub.connect();
        GitHub github = new GitHubBuilder().withPassword("jalonsoriveiro", "").build();

        GHRepository repo = github.createRepository(
                "new-repository","this is my new repository",
                "https://github.com/jalonsoriveiro/",true/*public*/);
       // repo.addCollaborators(github.getUser("jalonsoriveiro"),github.getUser("rtyler"));


    }


}
