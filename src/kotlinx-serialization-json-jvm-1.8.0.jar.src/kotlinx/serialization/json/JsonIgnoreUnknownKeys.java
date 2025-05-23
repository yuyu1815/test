package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialInfo;

@Target(allowedTargets = {AnnotationTarget.CLASS})
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\n\n\002\030\002\n\002\020\033\n\000\b\002\030\0002\0020\001B\000¨\006\002"}, d2 = {"Lkotlinx/serialization/json/JsonIgnoreUnknownKeys;", "", "kotlinx-serialization-json"})
@SerialInfo
public @interface JsonIgnoreUnknownKeys {}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonIgnoreUnknownKeys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */