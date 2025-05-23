package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Target;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerialInfo;
import org.jetbrains.annotations.NotNull;

@Target(allowedTargets = {AnnotationTarget.PROPERTY})
@ExperimentalSerializationApi
@Retention(RetentionPolicy.RUNTIME)
@Target({})
@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\033\n\000\n\002\020\021\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\024\022\022\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004R\027\020\002\032\n\022\006\b\001\022\0020\0040\003¢\006\006\032\004\b\002\020\005¨\006\006"}, d2 = {"Lkotlinx/serialization/json/JsonNames;", "", "names", "", "", "()[Ljava/lang/String;", "kotlinx-serialization-json"})
@SerialInfo
public @interface JsonNames {
  String[] names();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonNames.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */