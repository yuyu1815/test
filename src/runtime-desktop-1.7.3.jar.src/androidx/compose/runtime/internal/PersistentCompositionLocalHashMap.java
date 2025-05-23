/*    */ package androidx.compose.runtime.internal;
/*    */ 
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.runtime.CompositionLocalMapKt;
/*    */ import androidx.compose.runtime.PersistentCompositionLocalMap;
/*    */ import androidx.compose.runtime.ValueHolder;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\020&\n\002\b\003\n\002\030\002\n\002\b\t\b\000\030\000 \0312\036\022\f\022\n\022\006\022\004\030\0010\0030\002\022\f\022\n\022\006\022\004\030\0010\0030\0040\0012\0020\005:\002\030\031B1\022\"\020\006\032\036\022\f\022\n\022\006\022\004\030\0010\0030\002\022\f\022\n\022\006\022\004\030\0010\0030\0040\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\b\020\020\032\0020\021H\026J\"\020\022\032\002H\023\"\004\b\000\020\0232\f\020\024\032\b\022\004\022\002H\0230\002H\002¢\006\002\020\025J(\020\026\032\0020\0052\016\020\024\032\n\022\006\022\004\030\0010\0030\0022\016\020\027\032\n\022\006\022\004\030\0010\0030\004H\026R6\020\013\032$\022 \022\036\022\f\022\n\022\006\022\004\030\0010\0030\002\022\f\022\n\022\006\022\004\030\0010\0030\0040\r0\f8VX\004¢\006\006\032\004\b\016\020\017¨\006\032"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "builder", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "get", "T", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "putValue", "value", "Builder", "Companion", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class PersistentCompositionLocalHashMap
/*    */   extends PersistentHashMap<CompositionLocal<Object>, ValueHolder<Object>>
/*    */   implements PersistentCompositionLocalMap
/*    */ {
/*    */   public PersistentCompositionLocalHashMap(@NotNull TrieNode node, int size) {
/* 33 */     super(node, size);
/*    */   }
/*    */   @NotNull
/*    */   public ImmutableSet<Map.Entry<CompositionLocal<Object>, ValueHolder<Object>>> getEntries() {
/* 37 */     return super.getEntries();
/*    */   } public <T> T get(@NotNull CompositionLocal key) {
/* 39 */     Intrinsics.checkNotNullParameter(key, "key"); return (T)CompositionLocalMapKt.read(this, key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentCompositionLocalMap putValue(@NotNull CompositionLocal key, @NotNull ValueHolder value) {
/*    */     TrieNode.ModificationResult newNodeResult;
/* 45 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); if (getNode$runtime().put(key.hashCode(), key, value, 0) == null) { getNode$runtime().put(key.hashCode(), key, value, 0); return this; }
/* 46 */      return new PersistentCompositionLocalHashMap(
/* 47 */         newNodeResult.getNode(), 
/* 48 */         size() + newNodeResult.getSizeDelta());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Builder builder() {
/* 53 */     return new Builder(this); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\007\030\0002\036\022\f\022\n\022\006\022\004\030\0010\0030\002\022\f\022\n\022\006\022\004\030\0010\0030\0040\0012\0020\005B\r\022\006\020\006\032\0020\007¢\006\002\020\bJ\b\020\f\032\0020\007H\026R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\b¨\006\r"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "map", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "(Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;)V", "getMap$runtime", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "setMap$runtime", "build", "runtime"})
/*    */   @StabilityInferred(parameters = 0)
/*    */   public static final class Builder extends PersistentHashMapBuilder<CompositionLocal<Object>, ValueHolder<Object>> implements PersistentCompositionLocalMap.Builder { @NotNull
/*    */     private PersistentCompositionLocalHashMap map; @NotNull
/* 57 */     public final PersistentCompositionLocalHashMap getMap$runtime() { return this.map; } public static final int $stable = 8; public final void setMap$runtime(@NotNull PersistentCompositionLocalHashMap <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.map = <set-?>; } public Builder(@NotNull PersistentCompositionLocalHashMap map) {
/* 58 */       super(map);
/*    */       this.map = map;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public PersistentCompositionLocalHashMap build() {
/* 64 */       setOwnership(new MutabilityOwnership());
/* 65 */       this.map = (getNode$runtime() == this.map.getNode$runtime()) ? this.map : new PersistentCompositionLocalHashMap(getNode$runtime(), size());
/*    */       
/* 67 */       return this.map;
/*    */     } }
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\027\020\003\032\0020\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;", "", "()V", "Empty", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty$annotations", "getEmpty", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "runtime"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/* 73 */     public final PersistentCompositionLocalHashMap getEmpty() { return PersistentCompositionLocalHashMap.Empty; } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable; @NotNull private static final PersistentCompositionLocalHashMap Empty = new PersistentCompositionLocalHashMap(
/* 74 */       TrieNode.Companion.getEMPTY$runtime(), 
/* 75 */       0);
/*    */   
/*    */   static {
/*    */     Intrinsics.checkNotNull(TrieNode.Companion.getEMPTY$runtime(), "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\PersistentCompositionLocalHashMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */