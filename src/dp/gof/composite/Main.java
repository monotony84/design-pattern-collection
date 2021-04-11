package dp.gof.composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tempDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tempDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        System.out.println("");
        System.out.println("Making user entries...");
        Directory yuya =  new Directory("yuya");
        Directory hanako = new Directory("nanako");
        Directory tomura = new Directory("tomura");
        usrDir.add(yuya);
        usrDir.add(hanako);
        usrDir.add(tomura);
        yuya.add(new File("diary.html", 100));
        yuya.add(new File("Composite.java", 200));
        hanako.add(new File("memo.text", 300));
        tomura.add(new File("gema.doc", 400));
        tomura.add(new File("junk.mail", 500));
        rootDir.printList();

    }
}
