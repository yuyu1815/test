/*    */ package androidx.collection.internal;
/*    */ 
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\b\n\000\n\002\020\007\n\002\b\002\n\002\020\"\n\002\020&\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\b\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\002B\035\b\026\022\024\020\004\032\020\022\006\b\001\022\0028\000\022\004\022\0028\0010\000¢\006\002\020\005B\031\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\030\020\026\032\004\030\0018\0012\006\020\027\032\0028\000H\002¢\006\002\020\030J\035\020\031\032\004\030\0018\0012\006\020\027\032\0028\0002\006\020\032\032\0028\001¢\006\002\020\033J\025\020\034\032\004\030\0018\0012\006\020\027\032\0028\000¢\006\002\020\030R#\020\013\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\r0\f8F¢\006\006\032\004\b\016\020\017R\021\020\020\032\0020\0218F¢\006\006\032\004\b\020\020\022R*\020\023\032\036\022\004\022\0028\000\022\004\022\0028\0010\024j\016\022\004\022\0028\000\022\004\022\0028\001`\025X\004¢\006\002\n\000¨\006\035"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "K", "", "V", "original", "(Landroidx/collection/internal/LruHashMap;)V", "initialCapacity", "", "loadFactor", "", "(IF)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "isEmpty", "", "()Z", "map", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "collection"})
/*    */ public final class LruHashMap<K, V>
/*    */ {
/*    */   @NotNull
/*    */   private final LinkedHashMap<K, V> map;
/*    */   
/*    */   public LruHashMap(@NotNull LruHashMap original) {
/*    */     this(0, 0.0F, 3, null);
/*    */     for (Map.Entry entry : original.getEntries()) {
/*    */       Object key = entry.getKey(), value = entry.getValue();
/*    */       put((K)key, (V)value);
/*    */     } 
/*    */   }
/*    */   
/*    */   public LruHashMap(int initialCapacity, float loadFactor) {
/* 35 */     this.map = new LinkedHashMap<>(initialCapacity, loadFactor, true);
/*    */   } public final boolean isEmpty() {
/* 37 */     return this.map.isEmpty(); } @NotNull
/* 38 */   public final Set<Map.Entry<K, V>> getEntries() { Intrinsics.checkNotNullExpressionValue(this.map.entrySet(), "map.entries"); return this.map.entrySet(); }
/*    */   @Nullable
/* 40 */   public final V get(@NotNull Object key) { Intrinsics.checkNotNullParameter(key, "key"); return this.map.get(key); }
/*    */   @Nullable
/* 42 */   public final V put(@NotNull Object key, @NotNull Object value) { Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); return this.map.put((K)key, (V)value); } @Nullable
/*    */   public final V remove(@NotNull Object key) {
/* 44 */     Intrinsics.checkNotNullParameter(key, "key"); return this.map.remove(key);
/*    */   }
/*    */   
/*    */   public LruHashMap() {
/*    */     this(0, 0.0F, 3, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\internal\LruHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */