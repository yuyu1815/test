package org.jetbrains.jewel.foundation.actionSystem;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\bf\030\0002\0020\001J)\020\002\032\0020\003\"\b\b\000\020\004*\0020\0012\006\020\005\032\0020\0062\b\020\007\032\004\030\001H\004H&¢\006\002\020\bJ*\020\t\032\0020\003\"\b\b\000\020\004*\0020\0012\006\020\005\032\0020\0062\016\020\n\032\n\022\006\022\004\030\001H\0040\013H&¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/actionSystem/DataProviderContext;", "", "set", "", "TValue", "key", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "lazy", "initializer", "Lkotlin/Function0;", "foundation"})
public interface DataProviderContext {
  <TValue> void set(@NotNull String paramString, @Nullable TValue paramTValue);
  
  <TValue> void lazy(@NotNull String paramString, @NotNull Function0<? extends TValue> paramFunction0);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\actionSystem\DataProviderContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */