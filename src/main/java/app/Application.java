package app;

import picocli.CommandLine;

@CommandLine.Command(name = "try-graalvm", subcommands = {
    WithMixinStdHelpCommand.class
})
public class Application {
    @CommandLine.Option(names = {"-h",
        "--help"}, usageHelp = true, description = "Show this usage and exit")
    boolean showHelp;

    public static void main(String[] args) {
        System.exit(
            new CommandLine(new Application())
                .execute(args)
        );
    }

}
