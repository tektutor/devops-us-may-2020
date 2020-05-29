package org.tektutor;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Goal will greet with message Hello.
 *
 * @goal hello 
 * 
 * @phase validate 
*/
public class MyMojo
    extends AbstractMojo
{
    public void execute()
        throws MojoExecutionException
    {
		System.out.println ("Hello TekTutor Custom Plugin!");
    }
}
