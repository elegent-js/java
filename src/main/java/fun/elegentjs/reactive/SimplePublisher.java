package fun.elegentjs.reactive;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class SimplePublisher {

    public static void main(String[] args) {
        // 发布者
        var publisher = new SubmissionPublisher<String>();

        // 订阅者
        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("Received: " + item);
                this.subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done");
            }
        };

        // 订阅
        publisher.subscribe(subscriber);

        // 发布数据项
        publisher.submit("Hello");
        publisher.submit("World");

        publisher.close();
    }
}
