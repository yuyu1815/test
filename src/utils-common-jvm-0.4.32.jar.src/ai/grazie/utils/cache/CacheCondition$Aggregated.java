/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\020\"\n\000\n\002\020$\n\002\b\002\030\000*\004\b\002\020\001*\004\b\003\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003B\037\022\030\020\004\032\024\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0030\005¢\006\002\020\006J0\020\007\032\b\022\004\022\0028\0020\b2\022\020\t\032\016\022\004\022\0028\002\022\004\022\0028\0030\n2\f\020\013\032\b\022\004\022\0028\0020\bH\026R \020\004\032\024\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0030\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/cache/CacheCondition$Aggregated;", "Key", "Value", "Lai/grazie/utils/cache/CacheCondition;", "conditions", "", "(Ljava/util/List;)V", "toFilterOut", "", "data", "", "previous", "utils-common"})
/*    */ public final class Aggregated<Key, Value>
/*    */   implements CacheCondition<Key, Value>
/*    */ {
/*    */   @NotNull
/*    */   private final List<CacheCondition<Key, Value>> conditions;
/*    */   
/*    */   public Aggregated(@NotNull List<CacheCondition<Key, Value>> conditions) {
/* 26 */     this.conditions = conditions; } @NotNull
/*    */   public Set<Key> toFilterOut(@NotNull Map data, @NotNull Set previous) {
/* 28 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(previous, "previous"); Set<Key> current = CollectionsKt.toMutableSet(previous);
/* 29 */     for (CacheCondition<Key, Value> condition : this.conditions) {
/* 30 */       current.addAll(condition.toFilterOut(data, current));
/*    */     }
/* 32 */     return current;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheCondition$Aggregated.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */