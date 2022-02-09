ECONOVATION HEROES Java Racing Game Practice

## 진행 방법
* 자동차 경주 게임에 대한 github 저장소를 기반으로 실습을 진행한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

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
    * public RacingCars();
    * public void add(Car car);
    * public List<Car> getCars();
  * MovingStrategy
    * public boolean judge();

* View
  * InputView
  * OutputView
