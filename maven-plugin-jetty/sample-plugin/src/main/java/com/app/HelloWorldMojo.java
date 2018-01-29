package com.app;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * This goal will say a message.
 * 
 * @goal hello-world
 */
public class HelloWorldMojo extends AbstractMojo {

	public void execute() throws MojoExecutionException {

		getLog().info("Hi there!!!");
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
	}
}
