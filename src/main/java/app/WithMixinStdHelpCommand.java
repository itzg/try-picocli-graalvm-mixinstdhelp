package app;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "with-mixin-std-help", mixinStandardHelpOptions = true)
public class WithMixinStdHelpCommand implements Callable<Integer> {

    @Option(names = "--project")
    String project;

    @Option(names = "--version")
    String version;

    @Override
    public Integer call() throws Exception {
        System.out.printf("Args: project=%s, version=%s", project, version);

        return CommandLine.ExitCode.OK;
    }
}
