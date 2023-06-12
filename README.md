# kotlin-racingcar 구현 기능 명세

 1. 입력 클래스 설정 및 구현
    - [x] 자동차 이름을 받아오는 기능 구현. 적절한 이름, 그리고 이름이 5개 이상인 경우에 대한 예외처리 필요
    - [x] 시도할 횟수 구현. 0번 이상으로 구현. MAX를 설정할지에 대한 논의 필요
 2. 출력 클래스 설정 및 구현
    - [x] 각 자동차의 진행상황을 출력해 줘야함. 해당 부분에서 표현방식이 변경이 될 수 있는 부분에 대한 고려 필요
    - [x] 우승자에 대해 계산해주는 로직 필요함.
 3. Main 함수 구현
    - [x] 입력을 받아오고 출력을 진행. 받아온 자동차 갯수만큼의 이름을 구현해야함
 4. 요구사항 명세에 맞는 리팩토링 진행
    - [x] 들여쓰기 2 넘지 않도록 구현
    - [x] 함수 이름 15라인 넘지 않도록 구현
 5. 단위 테스트 구현
    - [ ] 자동차 random이 구현 범위내에 들어오는지 체크