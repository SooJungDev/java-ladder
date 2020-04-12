package nextstep.ladder.domain;

import java.util.Collections;
import java.util.List;

public class Results {
    private List<Result> results;

    public Results(List<Result> results) {
        this.results = Collections.unmodifiableList(results);
    }

    public List<Result> getResults() {
        return results;
    }
}
