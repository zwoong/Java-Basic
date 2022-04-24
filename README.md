# java 

### class
```
동일한 속성과 행위를 수행하는 객체의 집합
객체 : 필드, 메소드
```

<br>

### 접근 제어자
```
접근 제어자를 통해 변수, 메소드, 생성자에 대한 접근 권한을 지정할 수 있다.
종류는 public, private, protected, default가 존재한다. 
```
<img width="876" alt="접근제어자" src="https://user-images.githubusercontent.com/99054659/164952723-526a1bbb-cd3b-4c8c-9927-e354984cdbcd.png">

<br>

### static
```
static - class method
no static - instance method
```

static은 클래스에 고정된 멤버로서 클래스 로더가 클래스를 로딩하면 메모리에 할당 시켜준다. <br><br>
사용이유 : 전역적으로 쉽게 재사용하는 멤버나 잘 변하지 않는 변수, 메소드들에 주로 사용된다. <br>
만들어 놓고 클래스 호출, 객체 생성을 따로 할 필요없이 바로바로 사용할 수 있기 떄문에 사용성이 좋다. <br>
하지만 static은 메모리 자원을 할당해놓고 사용하는 것이기 떄문에 너무 많이 사용한다면 메모리를 많이 차지하게 되어 프로그램이 무거워질 수 있다.

