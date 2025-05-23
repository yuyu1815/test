/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.ConcurrentHashMap;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020%\n\002\b\003\n\002\020\b\n\000\032(\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\0020\005H\000¨\006\006"}, d2 = {"createMapForCache", "", "K", "V", "initialCapacity", "", "kotlinx-serialization-json"})
/*    */ public final class CreateMapForCacheKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <K, V> Map<K, V> createMapForCache(int initialCapacity) {
/* 15 */     return new ConcurrentHashMap<>(initialCapacity);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\CreateMapForCacheKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */