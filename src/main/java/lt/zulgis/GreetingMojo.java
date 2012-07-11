package lt.zulgis;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.File;

/**
 * Says "Hi" to the user.
 * @goal sayhi
 */
public class GreetingMojo extends AbstractMojo {

    /**
     * @parameter default-value="${project.build.directory}"
     */
    private File outputDirectory;

    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info( "Hello, world." + outputDirectory);
    }
}
