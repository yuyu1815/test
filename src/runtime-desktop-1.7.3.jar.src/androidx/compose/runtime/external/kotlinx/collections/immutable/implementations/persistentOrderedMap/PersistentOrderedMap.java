/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;
/*     */ 
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.collections.AbstractMap;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020&\n\002\b\n\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\020\"\n\002\b\005\n\002\020$\n\002\b\004\b\000\030\000 3*\004\b\000\020\001*\004\b\001\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004:\0013B3\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\006\022\030\020\b\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\n0\t¢\006\002\020\013J\024\020 \032\016\022\004\022\0028\000\022\004\022\0028\0010!H\026J\024\020\"\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\026J\025\020#\032\0020$2\006\020%\032\0028\000H\026¢\006\002\020&J\032\020'\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0160\rH\002J\030\020(\032\004\030\0018\0012\006\020%\032\0028\000H\002¢\006\002\020)J\032\020\017\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0160*H\001J)\020+\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020%\032\0028\0002\006\020,\032\0028\001H\026¢\006\002\020-J*\020.\032\016\022\004\022\0028\000\022\004\022\0028\0010\0042\024\020/\032\020\022\006\b\001\022\0028\000\022\004\022\0028\00100H\026J!\0201\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020%\032\0028\000H\026¢\006\002\0202J)\0201\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020%\032\0028\0002\006\020,\032\0028\001H\026¢\006\002\020-R&\020\f\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0160\r8VX\004¢\006\006\032\004\b\017\020\020R\026\020\005\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\021\020\022R&\020\b\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\n0\tX\004¢\006\b\n\000\032\004\b\023\020\024R\032\020\025\032\b\022\004\022\0028\0000\r8VX\004¢\006\006\032\004\b\026\020\020R\026\020\007\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\027\020\022R\024\020\030\032\0020\0318VX\004¢\006\006\032\004\b\032\020\033R\032\020\034\032\b\022\004\022\0028\0010\0358VX\004¢\006\006\032\004\b\036\020\037¨\0064"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "firstKey", "", "lastKey", "hashMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getFirstKey$runtime", "()Ljava/lang/Object;", "getHashMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "keys", "getKeys", "getLastKey$runtime", "size", "", "getSize", "()I", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "clear", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "createEntries", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "putAll", "m", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "Companion", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nPersistentOrderedMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,135:1\n53#2:136\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedMap.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap\n*L\n119#1:136\n*E\n"})
/*     */ public final class PersistentOrderedMap<K, V>
/*     */   extends AbstractMap<K, V>
/*     */   implements PersistentMap<K, V>
/*     */ {
/*     */   @Nullable
/*     */   public final Object getFirstKey$runtime() {
/*  30 */     return this.firstKey; } @Nullable
/*  31 */   public final Object getLastKey$runtime() { return this.lastKey; } @NotNull
/*  32 */   public final PersistentHashMap<K, LinkedValue<V>> getHashMap$runtime() { return this.hashMap; } public PersistentOrderedMap(@Nullable Object firstKey, @Nullable Object lastKey, @NotNull PersistentHashMap<K, LinkedValue<V>> hashMap) { this.firstKey = firstKey; this.lastKey = lastKey; this.hashMap = hashMap; }
/*     */   
/*     */   public int getSize() {
/*  35 */     return this.hashMap.size();
/*     */   }
/*     */   @NotNull
/*     */   public ImmutableSet<K> getKeys() {
/*  39 */     return new PersistentOrderedMapKeys<>(this);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ImmutableCollection<V> getValues() {
/*  44 */     return new PersistentOrderedMapValues<>(this);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ImmutableSet<Map.Entry<K, V>> getEntries() {
/*  49 */     return createEntries();
/*     */   }
/*     */   
/*     */   private final ImmutableSet<Map.Entry<K, V>> createEntries() {
/*  53 */     return (ImmutableSet)new PersistentOrderedMapEntries<>(this);
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   @NotNull
/*     */   public final Set<Map.Entry<K, V>> getEntries() {
/*  59 */     return (Set<Map.Entry<K, V>>)createEntries();
/*     */   }
/*     */   
/*  62 */   public boolean containsKey(Object key) { return this.hashMap.containsKey(key); } @Nullable
/*     */   public V get(Object key) {
/*  64 */     (LinkedValue<V>)this.hashMap.get(key); return ((LinkedValue<V>)this.hashMap.get(key) != null) ? ((LinkedValue<V>)this.hashMap.get(key)).getValue() : null;
/*     */   } @NotNull
/*     */   public PersistentOrderedMap<K, V> put(Object key, Object value) {
/*  67 */     if (isEmpty()) {
/*  68 */       PersistentHashMap<K, LinkedValue<V>> persistentHashMap = this.hashMap.put(key, new LinkedValue(value));
/*  69 */       return new PersistentOrderedMap(key, key, persistentHashMap);
/*     */     } 
/*     */     
/*  72 */     LinkedValue<Object> links = (LinkedValue)this.hashMap.get(key);
/*  73 */     if (links != null) {
/*  74 */       if (links.getValue() == value) {
/*  75 */         return this;
/*     */       }
/*  77 */       PersistentHashMap<K, LinkedValue<V>> persistentHashMap = this.hashMap.put(key, links.withValue(value));
/*  78 */       return new PersistentOrderedMap(this.firstKey, this.lastKey, persistentHashMap);
/*     */     } 
/*     */ 
/*     */     
/*  82 */     Object lastKey = this.lastKey;
/*  83 */     Intrinsics.checkNotNull(this.hashMap.get(lastKey)); LinkedValue lastLinks = (LinkedValue)this.hashMap.get(lastKey);
/*     */     
/*  85 */     PersistentHashMap<K, LinkedValue<V>> newMap = this.hashMap
/*  86 */       .put(lastKey, lastLinks.withNext(key))
/*  87 */       .put(key, new LinkedValue(value, lastKey));
/*  88 */     return new PersistentOrderedMap(this.firstKey, key, newMap);
/*     */   } @NotNull
/*     */   public PersistentOrderedMap<K, V> remove(Object key) {
/*     */     LinkedValue links;
/*  92 */     if ((LinkedValue)this.hashMap.get(key) == null) { (LinkedValue)this.hashMap.get(key); return this; }
/*     */     
/*  94 */     PersistentHashMap<K, LinkedValue<V>> newMap = this.hashMap.remove(key);
/*  95 */     if (links.getHasPrevious()) {
/*  96 */       Intrinsics.checkNotNull(((Map)newMap).get(links.getPrevious())); LinkedValue previousLinks = (LinkedValue)((Map)newMap).get(links.getPrevious());
/*     */ 
/*     */       
/*  99 */       newMap = newMap.put(links.getPrevious(), previousLinks.withNext(links.getNext()));
/*     */     } 
/* 101 */     if (links.getHasNext()) {
/* 102 */       Intrinsics.checkNotNull(((Map)newMap).get(links.getNext())); LinkedValue nextLinks = (LinkedValue)((Map)newMap).get(links.getNext());
/*     */ 
/*     */       
/* 105 */       newMap = newMap.put(links.getNext(), nextLinks.withPrevious(links.getPrevious()));
/*     */     } 
/*     */     
/* 108 */     Object newFirstKey = !links.getHasPrevious() ? links.getNext() : this.firstKey;
/* 109 */     Object newLastKey = !links.getHasNext() ? links.getPrevious() : this.lastKey;
/* 110 */     return new PersistentOrderedMap(newFirstKey, newLastKey, newMap);
/*     */   } @NotNull
/*     */   public PersistentOrderedMap<K, V> remove(Object key, Object value) {
/*     */     LinkedValue links;
/* 114 */     if ((LinkedValue)this.hashMap.get(key) == null) { (LinkedValue)this.hashMap.get(key); return this; }
/* 115 */      return Intrinsics.areEqual(links.getValue(), value) ? remove((K)key) : this;
/*     */   }
/*     */   @NotNull
/*     */   public PersistentMap<K, V> putAll(@NotNull Map m) {
/* 119 */     Intrinsics.checkNotNullParameter(m, "m"); PersistentMap $this$mutate$iv = this; int $i$f$mutate = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     Intrinsics.checkNotNull($this$mutate$iv, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>"); PersistentMap.Builder builder = $this$mutate$iv.builder(); Map it = (Map)builder; int $i$a$-mutate-PersistentOrderedMap$putAll$1 = 0; it.putAll(m); return builder.build();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PersistentMap<K, V> clear() {
/*     */     return Companion.emptyOf$runtime();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public PersistentMap.Builder<K, V> builder() {
/*     */     return new PersistentOrderedMapBuilder<>(this);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J%\020\006\032\016\022\004\022\002H\007\022\004\022\002H\b0\004\"\004\b\002\020\007\"\004\b\003\020\bH\000¢\006\002\b\tR\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "", "emptyOf", "K", "V", "emptyOf$runtime", "runtime"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final <K, V> PersistentOrderedMap<K, V> emptyOf$runtime() {
/*     */       Intrinsics.checkNotNull(PersistentOrderedMap.EMPTY, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion.emptyOf>");
/*     */       return PersistentOrderedMap.EMPTY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final Object firstKey;
/*     */   @Nullable
/*     */   private final Object lastKey;
/*     */   @NotNull
/*     */   private final PersistentHashMap<K, LinkedValue<V>> hashMap;
/*     */   public static final int $stable = 8;
/*     */   @NotNull
/*     */   private static final PersistentOrderedMap EMPTY = new PersistentOrderedMap(EndOfChain.INSTANCE, EndOfChain.INSTANCE, PersistentHashMap.Companion.emptyOf$runtime());
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\persistentOrderedMap\PersistentOrderedMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */