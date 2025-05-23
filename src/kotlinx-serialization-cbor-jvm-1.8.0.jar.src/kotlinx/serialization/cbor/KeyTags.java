package kotlinx.serialization.cbor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialInfo;
import kotlinx.serialization.cbor.internal.SuppressAnimalSniffer;

@Target(allowedTargets = {AnnotationTarget.PROPERTY})
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@Target({})
@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\f\022\n\020\002\032\0020\003\"\0020\004R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\005¨\006\006"}, d2 = {"Lkotlinx/serialization/cbor/KeyTags;", "", "tags", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "()[J", "kotlinx-serialization-cbor"})
@SerialInfo
@SuppressAnimalSniffer
public @interface KeyTags {
  long[] tags();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\KeyTags.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */