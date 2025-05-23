package io.lettuce.core.output;

import static java.lang.Double.*;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

import io.lettuce.core.GeoCoordinates;
import io.lettuce.core.Value;
import io.lettuce.core.codec.RedisCodec;
import io.lettuce.core.internal.LettuceAssert;

/**
 * A list output that creates a list with {@link GeoCoordinates} {@link Value}s.
 *
 * @author Mark Paluch
 */
public class GeoCoordinatesValueListOutput<K, V> extends CommandOutput<K, V, List<Value<GeoCoordinates>>>
        implements StreamingOutput<Value<GeoCoordinates>> {

    boolean hasX;

    private Double x;

    private boolean initialized;

    private Subscriber<Value<GeoCoordinates>> subscriber;

    public GeoCoordinatesValueListOutput(RedisCodec<K, V> codec) {
        super(codec, Collections.emptyList());
        setSubscriber(ListSubscriber.instance());
    }

    @Override
    public void set(ByteBuffer bytes) {

        if (bytes == null) {
            subscriber.onNext(output, Value.empty());
            return;
        }

        double value = parseDouble(decodeAscii(bytes));
        set(value);
    }

    @Override
    public void set(double number) {

        if (!hasX) {
            x = number;
            hasX = true;
            return;
        }

        subscriber.onNext(output, Value.fromNullable(new GeoCoordinates(x, number)));
        x = null;
        hasX = false;
    }

    @Override
    public void multi(int count) {

        if (!initialized) {
            output = OutputFactory.newList(count / 2);
            initialized = true;
        }

        if (count == -1) {
            subscriber.onNext(output, Value.empty());
        }
    }

    @Override
    public void setSubscriber(Subscriber<Value<GeoCoordinates>> subscriber) {
        LettuceAssert.notNull(subscriber, "Subscriber must not be null");
        this.subscriber = subscriber;
    }

    @Override
    public Subscriber<Value<GeoCoordinates>> getSubscriber() {
        return subscriber;
    }

}
