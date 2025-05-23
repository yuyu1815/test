package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InheritableSerialInfo;
import org.jetbrains.annotations.NotNull;

@Target(allowedTargets = {AnnotationTarget.CLASS})
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\b\022\006\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2 = {"Lkotlinx/serialization/json/JsonClassDiscriminator;", "", "discriminator", "", "()Ljava/lang/String;", "kotlinx-serialization-json"})
@InheritableSerialInfo
public @interface JsonClassDiscriminator {
  String discriminator();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonClassDiscriminator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */