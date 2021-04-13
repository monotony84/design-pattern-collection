package dp.gof.visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");

        try {
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 100000));
            binDir.add(new File("latex", 20000));
            rootDir.accept(new ListVisitor());

            System.out.println("");
            System.out.println("Making user entries...");
            Directory monotony = new Directory("monotony");
            Directory hanako = new Directory("nanako");
            Directory tomura = new Directory("tomura");
            usrDir.add(monotony);
            usrDir.add(hanako);
            usrDir.add(tomura);

            monotony.add(new File("diary.html", 100));
            monotony.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.html", 500));
            rootDir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
