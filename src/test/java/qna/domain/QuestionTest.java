package qna.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qna.CannotDeleteException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class QuestionTest {

  public static final Question Q1 = new Question("title1", "contents1").writeBy(UserTest.JAVAJIGI);
  public static final Question Q2 = new Question("title2", "contents2").writeBy(UserTest.SANJIGI);

  @Test
  @DisplayName("[Question] 삭제할 권한이 없는 경우 예외 발생")
  void has_owner_test() {
    assertThatThrownBy(() -> Q1.hasDeleteOwner(UserTest.SANJIGI))
        .isInstanceOf(CannotDeleteException.class);
  }

  @Test
  @DisplayName("[Question] 작성자 일치 여부 확인 테스트")
  void is_owner_test() {
    assertThat(Q1.isOwner(UserTest.JAVAJIGI)).isTrue();
    assertThat(Q1.isOwner(UserTest.SANJIGI)).isFalse();
  }
}
