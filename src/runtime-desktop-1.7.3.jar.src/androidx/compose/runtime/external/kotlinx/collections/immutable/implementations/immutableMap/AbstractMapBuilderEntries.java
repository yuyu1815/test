/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.AbstractMutableSet;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\020&\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\006\b \030\000*\024\b\000\020\001*\016\022\004\022\002H\003\022\004\022\002H\0040\002*\004\b\001\020\003*\004\b\002\020\0042\b\022\004\022\002H\0010\005B\005¢\006\002\020\006J\026\020\007\032\0020\b2\006\020\t\032\0028\000H\002¢\006\002\020\nJ\034\020\013\032\0020\b2\022\020\t\032\016\022\004\022\0028\001\022\004\022\0028\0020\002H&J\023\020\f\032\0020\b2\006\020\t\032\0028\000¢\006\002\020\nJ\034\020\r\032\0020\b2\022\020\t\032\016\022\004\022\0028\001\022\004\022\0028\0020\002H&¨\006\016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/AbstractMapBuilderEntries;", "E", "", "K", "V", "Lkotlin/collections/AbstractMutableSet;", "()V", "contains", "", "element", "(Ljava/util/Map$Entry;)Z", "containsEntry", "remove", "removeEntry", "runtime"})
/*    */ @StabilityInferred(parameters = 8)
/*    */ public abstract class AbstractMapBuilderEntries<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
/*    */   public final boolean contains(@NotNull Map.Entry<? extends K, ? extends V> element) {
/* 13 */     Intrinsics.checkNotNullParameter(element, "element"); if (!((element instanceof Object) ? element : null instanceof Map.Entry)) return false; 
/* 14 */     return containsEntry(element);
/*    */   }
/*    */ 
/*    */   
/*    */   public static final int $stable;
/*    */   
/*    */   public final boolean remove(@NotNull Map.Entry<? extends K, ? extends V> element) {
/* 21 */     Intrinsics.checkNotNullParameter(element, "element"); if (!((element instanceof Object) ? element : null instanceof Map.Entry)) return false; 
/* 22 */     return removeEntry(element);
/*    */   }
/*    */   
/*    */   public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> paramEntry);
/*    */   
/*    */   public abstract boolean removeEntry(@NotNull Map.Entry<? extends K, ? extends V> paramEntry);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\AbstractMapBuilderEntries.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */