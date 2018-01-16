package com.zyzhang.bibi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
//    @Test
//    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
//    }

//    @Test
//    public void testObservable() {
//        System.out.println("---------testObservale----------");
//        // RxJava1的写法,本次使用的是Rxjava2依赖
//        //Observable<Integer> observable = Observable.create(new Observable.Onsubscrible<Integer>(){});
//        //创建一个Observable
//        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
//            @Override
//            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
//                for (int i = 0; i < 5; i++) {
//                    e.onNext(i);
//                }
//                e.onComplete();
//            }
//        });
//
//        //创建一个Observer
//        Observer<Integer> observer = new Observer<Integer>() {
//
//            @Override
//            public void onSubscribe(Disposable d) {
//                System.out.println("---------onSubscribe:" + d);
//            }
//
//            @Override
//            public void onNext(Integer integer) {
//                System.out.println("---------onNext:" + integer);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                System.out.println("---------onError----------");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("---------onComplete----------");
//            }
//        };
//
//        // 建立连接
//        observable.subscribe(observer);
//    }

//    @Test
//    public void testObservable2() {
//        List<String> lists = new ArrayList<String>();
//        for (int i = 0; i < 5; i++) {
//            lists.add("Hello Boy" + i);
//        }
//        Observable observable = Observable.fromIterable((Iterable<String>) lists);
//        //创建一个Observer
//        Observer<String> observer = new Observer<String>() {
//
//            @Override
//            public void onSubscribe(Disposable d) {
//                System.out.println(d);
//            }
//
//            @Override
//            public void onNext(String str) {
//                System.out.println("---------onNext:" + str);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                System.out.println("---------onError----------");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("---------onComplete----------");
//            }
//        };
//        // 建立连接(订阅)
//        observable.subscribe(observer);
//    }

//    @Test
//    public void testObservable3() {
//        List<String> lists = new ArrayList<String>();
//        for (int i = 0; i < 5; i++) {
//            lists.add("Hello Boy" + i);
//        }
//        Observable observable = Observable.just(lists);
//        //创建一个Observer
//        Observer<List<String>> observer = new Observer<List<String>>() {
//
//            @Override
//            public void onSubscribe(Disposable d) {
//                System.out.println("Disposable:" + d);
//            }
//
//            @Override
//            public void onNext(List<String> str) {
//                System.out.println("---------onNext:" + str);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                System.out.println("---------onError----------");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("---------onComplete----------");
//            }
//        };
//        // 建立连接(订阅)
//        observable.subscribe(observer);
//    }

//    @Test
//    public void testObservable4() {
//        List<String> lists = new ArrayList<String>();
//        for (int i = 0; i < 5; i++) {
//            lists.add("Hello Boy" + i);
//        }
//        Observable observable = Observable.fromIterable((Iterable<String>) lists);
//        //创建一个Observer
//        Observer<String> observer = new Observer<String>() {
//
//            @Override
//            public void onSubscribe(Disposable d) {
//                System.out.println("Disposable:" + d);
//            }
//
//            @Override
//            public void onNext(String str) {
//                System.out.println("---------onNext:" + str);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                System.out.println("---------onError----------");
//            }
//
//            @Override
//            public void onComplete() {
//                System.out.println("---------onComplete----------");
//            }
//        };
//
//        Function fun1 = new Function<String, String>() {
//            @Override
//            public String apply(String s) throws Exception {
//                // 这个可以对返回的数据格式进行修改(比如我在每个前面加入"zyzhang")
//                // 一般对服务器端返回结果处理
//                return "zyzhang:" + s;
//            }
//        };
//
//        // 建立连接(订阅)
//        observable.map(fun1).subscribe(observer);
//    }

    @Test
    public void testObservable5() {
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setName("张三" + i);
            List<Course> courses = new ArrayList<Course>();
            for (int j = 0; j < 2; j++) {
                Course course = new Course();
                course.setName("数学" + j);
                courses.add(course);
                student.setCoursesList(courses);
            }
            students.add(student);
        }

        Observable observable = Observable.fromIterable(students);
        //创建一个Observer
        Observer<Course> observer = new Observer<Course>() {

            @Override
            public void onSubscribe(Disposable d) {
                System.out.println(d);
            }

            @Override
            public void onNext(Course course) {
                System.out.println("---------onNext:" + course.getName());
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("---------onError----------");
            }

            @Override
            public void onComplete() {
                System.out.println("---------onComplete----------");
            }
        };

        Function fun1 = new Function<Student, Observable<Course>>() {

            @Override
            public Observable<Course> apply(Student student) throws Exception {
                System.out.println(student.getName());
                return Observable.fromIterable(student.getCoursesList());
            }
        };

        // 建立连接(订阅)
        observable.flatMap(fun1).subscribe(observer);
    }

}