실전코딩 6조 5주차 과제 -전화요금 고지서 요금출력 프로그램

Input : 플랜(Gold : G, Silver: S) / 통화량 / 라인개수
Output : 사용 요금($)
fork된 gitrepo를 clone해서 PC로 가져옵니다.

Clone한 gitrepo를 MavenProject로 Configure합니다.

C드라이브에 자신의 git폴더안에 teamNo.6_week4폴더 안에 bill 경로를 복사합니다. (ex .. C:\Users\park\git\teamNo.6_week4\bill)

명령 프롬포트(CMD창)에서 위 경로로 이동해줍니다. (cd C:\Users\park\git\teamNo.6_week4\bill)

위 경로에서 [mvn clean package] 명령어를 입력합니다.

위 명령어가 정상 실행이 된다면 C드라이브에 myproject라는 폴더가 생성됬을것입니다. 그 경로로 이동해줍니다. (cd C:\myproject)

위 경로에서 [java -jar app.jar] 명령어를 입력합니다.

처음에는 plan을 입력해야 합니다 (Silver: S or Gold : G, 무조건 대문자로 입력을 하셔야 합니다.)

다음은 통화량을 입력을 합니다. (ex.. 234)

마지막으로 회선 수를 입력을 합니다. (ex.. 4)

그 후 결과화면이 나오게 됩니다.

Jenkins workspace 설정
sonar.ProjectKey=[사용자설정] sonar.ProjectName=[사용자설정] sonar.ProjectVersion=0.0.1 sonar.Sources=src
