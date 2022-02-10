ECONOVATION HEROES Java Racing Game Practice

## 진행 방법
* 자동차 경주 게임에 대한 github 저장소를 기반으로 실습을 진행한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 요구 기능 명세
- [ ] 자동차 대수 입력 받기
  - [ ] 숫자가 아닌 것이 들어올 때 예외 처리
  - [ ] 음수가 들어올 때 예외 처리
  - [ ] 0이 들어올 때 예외 처리
- [ ] 시도할 회수 입력 받기
  - [ ] 숫자가 아닌 것이 들어올 때 예외 처리
  - [ ] 음수가 들어올 때 예외 처리
  - [ ] 0이 들어올 때 예외 처리
- [ ] 게임 진행
  - [ ] 전진 또는 멈춤 여부 판단
  - [ ] 자동차 위치 변경
  - [ ] 실행 결과 출력

## 사전설계
* Controller
  * Game
  
* Domain
  * Car
    * private int position;
    * public Car();
    * public int getPosition();
    * public void move();
  * RacingCars
    * List<Car> Cars;
    * public RacingCars(List<Car> Cars);
    * public List<Car> getCars();
  * MovingStrategy
    * public boolean judge();

* View
  * InputView
  * OutputView
