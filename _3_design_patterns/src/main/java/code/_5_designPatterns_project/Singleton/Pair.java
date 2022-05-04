package code._5_designPatterns_project.Singleton;

public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getKey() {
        return this.first;
    }

    public S getValue() {
        return this.second;
    }
}

