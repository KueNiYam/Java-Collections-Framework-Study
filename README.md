# Java Collections Framework(JCF) Study

## Introduction

JCF(Java Collections Framework) 정리

## Java Collections Framework(JCF)

Java에서 컬렉션이란(Collection)이란 데이터의 집합, 그룹을 의미하며

JCF(Java Collections Framework)는 이러한 데이터, 자료구조인 컬렉션과 이를 구현하는 클래스를 정의하는 인터페이스를 제공한다.

다음은 Java 컬렉션 프레임워크의 상속 구조를 나타낸다.

 - Collections
    - List
        - LinkedList
        - Stack
        - Vector
        - ArrayList
    - Set
        - HashSet
        - SortedSet - TreeSet
 - Map
    - HashTable
    - HashMap
    - SortedMap - TreeMap
    
Collection 인터페이스는 List, Set, Queue로 크게 3가지 상위 인터페이스로 분류할 수 있다.

그리고 여기에 Map의 경우 Collection 인터페이스를 상속받고 있지 않지만 Collection으로 분류된다.

## Collection 인터페이스의 특징

 - Set
    > 순서를 유지하지 않는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
    - HashSet
    - TreeSet
 - List
    > 순서가 있는 데이터의 집합으로 데이터의 중복을 허용한다.
    - LinkedList
    - Vector
    - ArrayList
 - Queue
    > List와 유사.
    - LinkedList
    - PriorityQueue
 - Map
    > 키(Key), 값(Value)의 쌍으로 이루어진 데이터의 집합으로, 순서는 유지되지 않으며 키(Key)의 중복을 허용하지 않으나 값(Value)의 중복은 허용한다.
    - HashTable
    - HashMap
    - TreeMap

1. List 인터페이스
    > 요소들의 순서를 저장하여 색인(Index)를 사용하여 특정 위치에 요소를 삽입하거나 접근할 수 있으며 중복 요소를 허용한다.
     - ArrayList
        - 상당히 빠르고  크기를 마음대로 조절할 수 있는 배열
        - 단방향 포인터 구조로 자료에 대한 순차적인 접근에 강점이 있음
     - Vector
        - 과거에 대용량 처리를 위해 사용했으며, 내부에서 자동으로 동기화처리가 일어나 비교적 성능이 좋지 않고 무거워 잘 쓰이지 않음
        - ArrayList의 구현 버전
     - LinkedList
        - 양방향 포인터 구조로 데이터의 삽입, 삭제가 빈번할 경우 데이터의 위치 정보만 수정하면 되기에 빠른 성능을 보장
        - 스택, 큐, 양방향 큐 등을 만들기 위한 용도로 쓰임    
    
2. Set 인터페이스
    > 집합을 정의하며 요소의 중복을 허용하지 않는다.
     - HashSet
        - 가장 빠른 임의 접근 속도
        - 순서를 예측할 수 없음
     - LinkedHashSet
        - 추가된 순서, 또는 가장 최근에 접근한 순서대로 접근 가능
     - TreeSet
        - 정렬된 순서대로 보관하며 정렬 방법을 지정할 수 있음

3. Map 인터페이스
    > Key와 Value의 쌍으로 연관지어 저장하는 객체
     - HashMap
        - Map 인터페이스를 구현하기 위해 해시테이블을 사용한 클래스
        - 중복을 허용하지 않고 순서를 보장하지 않음
        - 키와 값으로 null이 허용
     - HashTable
        - HashMap 보다는 느리지만 동기화가 지원
        - 키와 값으로 null이 허용되지 않음
     - TreeMap
        - 이진검색트리의 형태로 키와 값이 쌍으로 이루어진 데이터를 저장
        - 정렬된 순서로 키/값 쌍을 저장하므로 빠른 검색이 가능
        - 저장시 정렬(오름차순)을 하기 때문에 저장 시간이 다소 오래 걸림
     - LinkedHashMap
        - 기본적으로 HashMap을 상속받아 HashMap과 매우 흡사
        - Map에 있는 엔트리들의 연결리스트를 유지하므로 입력한 순서대로 반복 가능






















