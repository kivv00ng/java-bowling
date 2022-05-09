package qna.domain;

import java.util.ArrayList;
import java.util.List;

public class DeleteHistories {

    private final List<DeleteHistory> deleteHistories = new ArrayList<>();

    public DeleteHistories() {
    }

    public boolean contains(DeleteHistory deleteHistory) {
        return deleteHistories.contains(deleteHistory);
    }

    public void add(DeleteHistory deleteHistory) {
        deleteHistories.add(deleteHistory);
    }

    public void addAll(DeleteHistories deleteHistories) {
        this.deleteHistories.addAll(deleteHistories.getDeleteHistories());
    }

    public List<DeleteHistory> getDeleteHistories() {
        return new ArrayList<>(deleteHistories);
    }
}
