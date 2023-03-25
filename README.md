# 야놀자 서비스 분석

# 기능

## 상품 플랫폼

- 숙박 정보를 사용자에게 제공하는 기능

## 고객 플랫폼

- 회원가입 , 로그인, 인증

## 주문 플랫폼

- 예약

# 도메인

## 상품 도메인

### 숙박업소 - Accomdation

- 이름
- 위치
- 업소 유형 (몇성급 호텔, 모텔, 팬션 …)
- 전화번호
- 안내
- 정책 (프론트 운영시간)
- 언어 지원
- 판매자 정보
- 위도
- 경도

**테마 (주차가능, OTT, 와이파이…) N:N 관계**

**사진**

### 객실 - Room

숙박업소와 N:1 관계

- 기본정보
- 예약공지
- 체크인 시간
- 체크아웃 시간
- 가격
- 대실 - 이용시간
- 대실 가격

**객실 특성 (금연객실 , 기준인원/최대인원 , 더블침대, 싱글침대) N:N 관계**

**사진**

### 후기 - Review

- 작성자 이름
- 별점
- 작성 날짜
- 내용
- 판매자 답변
- 판매자 답변 날짜

**사진**

## 고객 도메인

### 유저 - User

- 이름
- 닉네임
- 포인트
- 아이디
- 비밀번호
- 휴대폰 번호
- 이메일

### 예약 - Reservation

객실 fk

유저 fk

- 예약자 이름
- 예약자 번호
- 방문수단 (도보, 차량)
- 결제금액
- 예약일시
- 체크인
- 체크아웃

# ERD
![image](https://user-images.githubusercontent.com/91578199/227523048-03ee1175-36a5-4853-9bea-3c84ea2dd801.png)


