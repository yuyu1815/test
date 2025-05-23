package androidx.compose.runtime.snapshots;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Retention(AnnotationRetention.BINARY)
@Target(allowedTargets = {AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER})
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\002\b\002\b\002\030\0002\0020\001B\b\022\006\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2 = {"Landroidx/compose/runtime/snapshots/AutoboxingStateValueProperty;", "", "preferredPropertyName", "", "()Ljava/lang/String;", "runtime"})
public @interface AutoboxingStateValueProperty {
  String preferredPropertyName();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\AutoboxingStateValueProperty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */